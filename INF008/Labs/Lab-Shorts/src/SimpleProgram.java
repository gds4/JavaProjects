import java.util.Random;

public class SimpleProgram {
    public static void main(String args[]){
        System.out.println("------------ LAB I ------------");
        Lab1();
        System.out.println("------------ LAB II -----------");
        Lab2();
        System.out.println("---------- LAB III - A --------");
        Lab3_A();
        
    }

    public static void Lab1() {
        System.out.println("oi Mamãe?");
    } 


    public static void Lab2() {
        String hello = "oi";
        
        for(int i=0; i < 5; i++)    System.out.println(hello);
    }

    public static void Lab3_A() {
        int vet[] = new int[5];
        String names[] = {"Ze", "João", "Tonho"};

        Random rand = new Random();

        for(int i=0; i<5; i++){
            vet[i] = rand.nextInt(100);
        }

        for(int i=0; i<5; i++){
            System.out.println(vet[i]);
        }

        for(int i=0; i<names.length; i++){
            System.out.println(names[i]);
        }
    }   
}

// javac -d bin src/SimpleProgram.java
// java -cp bin --enable-preview SimpleProgram