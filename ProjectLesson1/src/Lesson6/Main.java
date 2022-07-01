package Lesson6;

public class Main {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Мурзик", 3, "рыжий");
        Cat cat2 = new Cat("Барсик", 5, "черный");
        Cat cat3 = new Cat("Маркиз", 9, "полосатый");
        Cat[] cats = {cat1, cat2, cat3};
        for (int i = 1 ; i < cats.length; i++) {
            System.out.println(cats[i].getName());
        }
        Dog dogBob = new Dog("Bob", 9, "белый");

                cat1.run(1000);
                dogBob.swim(3);

    }
}
