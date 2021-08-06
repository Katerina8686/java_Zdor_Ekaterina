package HomeWorkApp.java_Zdor_Ekaterina.git.Lesson07.parts;

import HomeWorkApp.java_Zdor_Ekaterina.git.Lesson07.Robot;

import java.util.Random;

/**
 * Created by Aleksandr Gladkov [Anticisco]
 * Date: 02.08.2021
 */

public abstract class RobotPart {

    private Random random = new Random();
    protected boolean isIntact;
    protected int structureHealth;
    protected String nameParts;
    protected int robotLevel;
    protected Robot robot;

    public RobotPart(Robot robot, String nameParts) {
        this.robot = robot;
        this.isIntact = true;
        this.structureHealth = 100;
        this.nameParts = nameParts;
    }

    public void getDamage(int value) {
        this.structureHealth -= value;
        System.out.println(robot.getName() + " > " + this.nameParts + " get damage " + value + " point(s)");
        this.isIntact = false;
    }

    public boolean getStatusPart()  {
        return this.structureHealth > 0;
    }

    protected int generateRandomBorder(int min, int max) {
        return min + random.nextInt(max - min + 1);
    }

    protected int generateRandomValue(int max) {
        return random.nextInt(max);
    }

    public String getNameParts() {
        return nameParts;
    }

    public void restore() {
        if(!this.isIntact) {
            this.structureHealth = 100;
            System.out.println(this.nameParts + " was damaged, restored ");
        } else {
            System.out.println(this.nameParts + " is healthy ");
        }
    }
}
