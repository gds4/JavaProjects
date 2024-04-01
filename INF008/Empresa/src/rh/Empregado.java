package rh;
import java.util.ArrayList;

public class Empregado extends Pessoa{
    

    public Empregado(String name, int age, Pessoa superior) {
        super(name, age, superior);
    }

    @Override
    public ArrayList<Pessoa> getListaEmpregadosAssociados (){
        System.out.println("Empregadoos Não Tem Subordinados");
        return null;
    }

    @Override
    public ArrayList<Pessoa> getListaSubordinadosDiretos (){
        System.out.println("Empregadoos Não Tem Subordinados");
        return null;
    }

    @Override
    public String toString() {
        return "Empregado: nome= " + this.getName() + ", idade= " + this.getAge() + ", superior= " + this.getSuperior();
    }
}
