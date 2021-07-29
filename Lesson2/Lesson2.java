package HomeWorkApp.java_Zdor_Ekaterina.git.Lesson2;

/** created by Zdor Ekaterina
 */

public class Lesson2 {
    //1 Написать метод, принимающий на вход два целых числа и проверяющий,
    // что их сумма лежит в пределах от 10 до 20 (включительно),
    // если да – вернуть true, в противном случае – false//
    public static void main(String [] args) {
        Lesson2.getNumb(4, 7);
        Lesson2.isMore(-1);
        Lesson2.returnMore(-2);
        Lesson2.printString(4, "string");
    }

    public static boolean getNumb(int a, int b){
        int c = a+b;
        return c <= 20 && c >= 10;
    }


    //2. Написать метод, которому в качестве параметра передается целое число,
    // метод должен напечатать в консоль, положительное ли число передали или отрицательное.
    // Замечание: ноль считаем положительным числом.

    public static void isMore(int a){
       if(a<0)
           System.out.println("less than zero");
       else
           System.out.println("more than zero");
    }


    //3. Написать метод, которому в качестве параметра передается целое число.
    // Метод должен вернуть true, если число отрицательное, и вернуть false если положительное.

    public static boolean returnMore(int a){
        if(a<0)
            return false;

        return true;
    }


    //4. Написать метод, которому в качестве аргументов передается строка и число, метод должен
    // отпечатать в консоль указанную строку, указанное количество раз;

    public static void printString(int a, String g){
        for (int i = 0; i<a; i++) {
            System.out.println(g);
        }
    }

}
