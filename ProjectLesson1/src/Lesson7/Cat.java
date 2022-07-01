package Lesson7;

public class Cat {
    private String name;
    private int appetite;

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
    }

    public boolean eat(Plate plate) {
        boolean hunger;
        if (appetite > 0) {
            plate.decriesFood(appetite, this.name);
            appetite -= appetite;
            return true;
        }
        else {
            return false;
        }

    }
    public void info() {
        System.out.println("Голод кота " + name + " [" + appetite + "]");
    }
}
