package Lesson7;

public class App {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Борис", 15);
        Cat cat2 = new Cat("Барсик", 5);
        Plate plate = new Plate(0);


            cat1.info();
            plate.info();

            cat1.eat(plate);

            cat1.info();
            plate.info();

            cat2.info();
            cat2.eat(plate);

            plate.info();
    }
}
