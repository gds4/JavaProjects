package classes;

public class MyClass {
    private String name;
    private int age;

    public MyClass(String name, int age){
        this.name = name;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void howIAm(){
        System.out.println("My name is " + this.name + " and i'm " + this.age + " years old");
    }
} 