public class Basic {
    
public static void main (String [] args) {

    int num1 = 30;
    int num2 = 20;

    System.out.print(sum(num1, num2));
    System.out.print("\n");
    
    String name = "Deivison";
    String last_Name = "Santos";
    String Full_Name = concat_Name(name, last_Name);

    System.out.println(Full_Name);

    System.out.println(name + " " + last_Name);
    System.out.println(String.format("%s %s", name, last_Name));
    System.out.printf("%s %s\n", name, last_Name);


}

public static int sum (int num1, int num2) {
    return num1+num2;
}

public static String concat_Name (String name, String last_Name) {
    return name.concat(" ").concat(last_Name);
}

}
