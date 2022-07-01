package Lesson5;

public class Person {
    private String name;

    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

    private String profession;

    public void setProfession(String profession) {
        this.profession = profession;
    }
    public String getProfession() {
        return profession;
    }

    private String email;
    public void setEmail(String email) {
        this.email = email;
    }
    public String getEmail() {
        return email;
    }

    private int phone;
    public void setPhone(int phone) {
        this.phone = phone;
    }
    public int getPhone() {
        return phone;
    }

    private double salary;
    public void setSalary(double salary) {
        this.salary = salary;
    }
    public double getSalary() {
        return salary;
    }

    private int age;
    public void setAge(int age) {
        this.age = age;
    }
    public int getAge() {
        return age;
    }

    public Person(String name, String profession, String email, int phone, double salary, int age) {
        this.name = name;
        this.profession = profession;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }
    public void print() {
        System.out.println("[" + name + " ," + profession + " ," + email + " ," + phone + " ," + salary + ", " + age + "]");
    }
    public void work() {
        System.out.println(name + " вышел на смену");
    }
    public void hardWork() {
        System.out.println(name + " перевыполнил план");
    }
}
