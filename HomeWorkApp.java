package HomeWorkApp;

public class HomeWorkApp {

    public static void main(String[ ] args){
        HomeWorkApp.printThreeWords();
        HomeWorkApp.checkSumSign();
        HomeWorkApp.printColor();
        HomeWorkApp.compareNumbers();

    }

    public static void printThreeWords (){
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }
    public static void checkSumSign (){
        int a=2;
        int b=3;
        int c=a=b;
        if (c >= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }

    }


//    Создайте метод printColor() в теле которого задайте int переменную value и инициализируйте ее любым значением.
//    Если value меньше 0 (0 включительно), то в консоль метод должен вывести сообщение “Красный”,
//    если лежит в пределах от 0 (0 исключительно) до 100 (100 включительно), то “Желтый”,
//    если больше 100 (100 исключительно) - “Зеленый”
public static void printColor (){
    int value=4;
    if (value <= 0) {
        System.out.println("Красный ");
    } else if (value > 0 && value <= 100) {
        System.out.println("Желтый");
    } else {
        System.out.println("Зеленый");
    }

}

    //Создайте метод compareNumbers(), в теле которого объявите две int переменные a и b,
    //и инициализируйте их любыми значениями, которыми захотите.
   // Если a больше или равно b, то необходимо вывести в консоль сообщение “a >= b”, в противном случае “a < b”;
    public static void compareNumbers (){
        int a=5;
        int b=7;
        if ( a >= b) {
            System.out.println("a >= b ");
        } else   {
            System.out.println("a < b");
        }

    }




}



