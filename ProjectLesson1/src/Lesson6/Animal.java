package Lesson6;

public abstract class Animal {
    private String name;
    private String color;
    private int age;

    public static int count = 0;

    public String getName() {
        return name;
    }

    public void setName (String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {

        this.color = color;
    }

    public int getAge() {

        return age;
    }

    public void setAge(int age) {

        this.age = age;
    }

    public void print() {

        System.out.println("[" + name + ", " + age + ", " + color + "] ");
    }
    static void sayHymn() {

        System.out.println("Hacuna matata");
    }
    public void makeSound() {

        System.out.println("Я что то говорю");
    }
    int distance;
}
