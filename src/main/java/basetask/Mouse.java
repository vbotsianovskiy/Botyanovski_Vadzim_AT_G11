package main.java.basetask;

public class Mouse {
    private String name;
    private int age;

    public Mouse(String полёвка, int i) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void printMouseDetails() {
        System.out.println("Я мышь, меня зовут " + this.name + " и мне " + this.age + " лет");
    }
}


