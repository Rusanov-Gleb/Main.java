package Lesson6;

public class Duck extends Animal implements Flyable, Swim {
    public Duck(String name, int age, String color){
        setName(name);
        setAge(age);
        setColor(color);
        Animal.sayHymn();
    }

    public void makeSound(){
        System.out.println("√а-га");
    }

    @Override
    public void fly(int distance) {

    }
    public void swim(int distance) {

    }
}
