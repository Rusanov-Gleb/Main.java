package Lesson6;

public class Dog extends Animal implements Run, Swim {
    public  static int count = 0;

    public Dog (String name, int age, String color){
        setName(name);
        setAge(age);
        setColor(color);
        Animal.sayHymn();
    }

    public void makeSound() {
        System.out.println("Гав-гав");
    }

    public void praiseForFood() {

        System.out.println(getName() + " громко скулит");
    }
    public void swim(int distance){
        if (distance < 10) {
            System.out.println(getName() + " проплыл " + distance + " метров.");
        }
        else {
            System.out.println(getName() + " не смог доплыть");
        }

    }
    public void run(int distance) {
        if (distance < 500) {
            System.out.println(getName() + " пробежал " + distance + " метров.");
        }
        else {
            System.out.println(getName() + " не смог");
        }
    }

}


