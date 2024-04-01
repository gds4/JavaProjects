package rh;
import java.util.ArrayList;

public abstract class Pessoa {
    private String name;
    private int age;
    private Pessoa superior;

    public Pessoa(String name, int age, Pessoa superior) {
        this.name = name;
        this.age = age;
        this.superior = superior;
    }


    public abstract ArrayList<Pessoa> getListaEmpregadosAssociados ();
    public abstract ArrayList<Pessoa> getListaSubordinadosDiretos ();
    
    public ArrayList<Pessoa> getListaSuperiores () {
        ArrayList<Pessoa> superiores = new ArrayList<Pessoa>();
        Pessoa atual = this.getSuperior();

        while(atual != null){
            superiores.add(atual);
            atual = atual.getSuperior();
        }

        return superiores;
    }

// ---------------- GET AND SET ---------------- 
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Pessoa getSuperior() {
        return superior;
    }
    public void setSuperior(Pessoa superior) {
        this.superior = superior;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
}
