import classes.MyClass;

public class App {
    public static void main(String[] args) throws Exception {
        MyClass me = new MyClass("Deivison", 19);

        System.out.println(me.getName());
        System.out.println(me.getAge());
        me.setAge(20);;
        
        me.howIAm();
    }
}
