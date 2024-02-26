package types;

import java.util.Random;

public class MyArray {
    int vet[];
    int size;

    public MyArray(int MAX) {
        this.vet = new int[MAX];
        this.size = 0;
    }

    public void setNumber(int number){
        if(size < vet.length){
            vet[size] = number;
            size++;
            System.out.println("Added"); 
        }
        else
            System.out.println("Array already filled!"); 
    }

    public int removeNumber() {
        if(size != 0){
            size--;
            System.out.println("Removed"); 
            return vet[size+1];
        }
        else{
            System.out.println("Array Empty!"); 
            return -1;
        }
    }

    public void fillRandom() {
        Random rand = new Random();

        for(int i=0; i<vet.length; i++)
            vet[i] = rand.nextInt(100);

        size = vet.length;
    }

    public void printArray() {

        if(size != 0){
            for(int i=0; i<vet.length; i++)
               System.out.print(vet[i]+" "); 
               
           System.out.print("\n"); 
        }

        else System.out.println("Array Empty!"); 
    }
}
