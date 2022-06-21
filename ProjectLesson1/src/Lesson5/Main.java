package Lesson5;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {

        Person[] persArray = new Person[5];
        persArray[0] = new Person("Ivanov Ivan", "Director", "1@mail.ru", 8900001,75000, 46);
        persArray[1] = new Person("Ki Rob", "Cleaner", "2@mail.ru", 8900002,25000, 17);
        persArray[2] = new Person("Sidorov Petr", "Engineer", "3@mail.ru", 8900003,95000, 26);
        persArray[3] = new Person("Vi Nikolay", "QA engineer", "4@mail.ru", 8900004,70000, 30);
        persArray[4] = new Person("Si Aleksandr", "Lawyer", "5@mail.ru", 8900005,43000, 61);

        for (int i = 0; i < persArray.length; i ++) {
            if (persArray[i].getAge() > 40) {
                persArray[i].print();
            }
        }
    }
}