package com.geekbrains.backend.test.imgur;

import java.util.Properties;

import com.geekbrains.backend.test.FunctionalTest;
import io.restassured.RestAssured;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.is;

public class ImgurApiFunctionalTest extends FunctionalTest {


    private static Properties properties;
    private static String TOKEN;

    @BeforeAll
    static void beforeAll() throws Exception {
        properties = readProperties();
        RestAssured.baseURI = properties.getProperty("imgur-api-url");
        TOKEN = properties.getProperty("imgur-api-token");
    }

    @Test
    void getAccountBase() {
        String userName = "zdorka8686";
        given()
                .auth()
                .oauth2(TOKEN)
                .log()
                .all()
                .expect()
                .body("data.id", is(157817393))
                .log()
                .all()
                .when()
                .get("account/" + userName);
    }

    @Test
    void updateImageTest() {
        given()
                .header("Authorization", "Client-ID febf0c43a744fb4")
                .formParam("description", "Picture")
                .formParam("title", "new title >>")
                .log()
                .all()
                .expect()
                .statusCode(200)
                .log()
                .all()
                .when()
                .post("image/j3uxNTdA2OrJXH6");
    }

    @Test
    void postImageTest() {
        given()
                .auth()
                .oauth2(TOKEN)
                .multiPart("image", getFileResource("frog.png"))
                .formParam("name", "Picture")
                .formParam("title", "The best picture!")
                .log()
                .all()
                .expect()
                .body("data.size", is(648957))
                .body("data.type", is("image/png"))
                .body("data.name", is("Picture"))
                .body("data.title", is("The best picture!"))
                .log()
                .all()
                .when()
                .post("upload");
    }

    @Test
    void getImageTest() {
        given()
                .auth()
                .oauth2(TOKEN)
                .log()
                .all()
                .expect()
                .body("data.title", is("my frog"))
                .log()
                .all()
                .when()
                .get("image/Mxzxrkm");
    }


    @Test
    void deleteImageTest() {
        given()
                .auth()
                .oauth2(TOKEN)
                .log()
                .all()
                .expect()
                .statusCode(200)
                .log()
                .all()
                .when()
                .delete("image/j3uxNTdA2OrJXH6");
    }

    // TODO: 08.12.2021 Домашка протестировать через RA минимум 5 различных end point-ов
}
