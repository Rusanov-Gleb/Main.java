package Lesson6;

public class Main {
    public static void main(String[] args) {
        Cat cat1 = new Cat("������", 3, "�����");
        Cat cat2 = new Cat("������", 5, "������");
        Cat cat3 = new Cat("������", 9, "���������");
        Cat[] cats = {cat1, cat2, cat3};
        for (int i = 1 ; i < cats.length; i++) {
            System.out.println(cats[i].getName());
        }
        Dog dogBob = new Dog("Bob", 9, "�����");

                cat1.run(1000);
                dogBob.swim(3);

    }
}
