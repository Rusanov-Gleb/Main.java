package Lesson6;

public class Cat extends Animal implements Run {
    public static int count = 0;

    public Cat(String name, int age, String color) {
        setName(name);
        setAge(age);
        setColor(color);
        Animal.sayHymn();
    }

    public void makeSound() {
        System.out.println("ћ€у");
    }

    public void praiseForFood() {
        System.out.println(getName() + " очень громко орет");
    }

    @Override
    public void run(int distance) {
        if (distance < 200) {
            System.out.println(getName() + " пробежал " + distance + " метров.");
        }
        else {
            System.out.println(getName() + " не смог");
        }

    }
}
