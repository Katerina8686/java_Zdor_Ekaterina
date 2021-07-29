package HomeWorkApp.java_Zdor_Ekaterina.git.employee;

//1. Создать класс "Сотрудник" с полями: ФИО, должность, email, телефон, зарплата, возраст.

public class employee {

    public employee(String fio, int zarplata, String dolzhnost, String telefon, int vozrast, String pochta) {
        this.name = fio;
        this.salary = zarplata;
        this.age = vozrast;
        this.email = pochta;
        this.phone = telefon;
        this.position = dolzhnost;
    }

    private String name;
    private String position;
    private String email;
    private String phone;
    private int salary;
    private int age;

    public void info() {
        System.out.println("Имя пользователя: " + name+ "; Должность: " + position + "; Возраст: " + age);
    }


    public static void main(String[] args) {
        //2. Конструктор класса должен заполнять эти поля при создании объекта.
        employee accountant = new employee("ivan ivanovich ivanov", 100000, "accountant",
                "89261002234", 20, "email@mail.com");
        employee secretary = new employee("Svetlana Sergeevna Ivanova", 100000, "secretary",
                "89261002234", 30, "email@mail.com");
        employee lower = new employee("Olya", 100000, "lower",
                "89261002234", 40, "email@mail.com");
        employee cleaner = new employee("Leyla", 100000, "cleaner",
                "89261002234", 50, "email@mail.com");
        employee director = new employee("Viktor Pronin", 100000, "director",
                "89261002234", 60, "email@mail.com");

        employee[] e = new employee[]{accountant, secretary, lower, cleaner, director};

        for(int i = 0; i<e.length; i++) {
            if(e[i].age > 40)
                e[i].info();
        }
    }
}


