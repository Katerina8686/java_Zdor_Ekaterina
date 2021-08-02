package HomeWorkApp.java_Zdor_Ekaterina.git.Animals;

public class Animal {
    private static int count = 0;

    protected void begat(int meters) {
        System.out.println("животное пробежало " + meters + " метров");
    }

    protected void plyt(int meters) {
        System.out.println("животное проплыло " + meters + " метров");
    }

    Animal() {
        count++;
        System.out.println("Всего создано животных " + count);
    }
}

class Cat extends Animal{
    private static int count = 0;

    protected Cat() {
        count++;
        System.out.println("Всего создано котов " + count);
    }

    public void begat(int meters) {
        if(meters > 200) {
            System.out.println("Кот не может пробежать " + meters + " метров");
            return;
        }
        System.out.println("Кот бежит... ");
        super.begat(meters);
    }

    public void plyt(int meters) {
        System.out.println("Кот не может плавать ");
    }
}

class Dog extends Animal {
    private static int count = 0;

    protected Dog() {
        count++;
        System.out.println("Всего создано собак " + count);
    }

    public void begat(int meters) {
        if(meters > 500) {
            System.out.println("Собака не может пробежать " + meters + " метров");
            return;
        }
        System.out.println("Собака бежит... ");
        super.begat(meters);
    }

    public void plyt(int meters) {
        if(meters > 10) {
            System.out.println("Собака не может плавать " + meters + " метров");
            return;
        }
        System.out.println("Собака плывёт... ");
        super.plyt(meters);
    }
}

class TestAnimal {

    public static void main(String[] arg)
    {
        Animal c = new Cat();
        Animal d = new Dog();

        c.begat(190);
        c.begat(210);
        c.plyt(5);

        d.begat(490);
        d.begat(510);
        d.plyt(9);
        d.plyt(11);
    }

}


