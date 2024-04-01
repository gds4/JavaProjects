package rh;
import java.util.ArrayList;

public class Chefe extends Pessoa{
    private ArrayList<Pessoa> subordinados = new ArrayList<Pessoa>(); 

    public Chefe(String name, int age, Pessoa superior) {
        super(name, age, superior);
    }


    public void addSubordinado(Pessoa toAdd) {
        subordinados.add(toAdd);
    }

    @Override
    public ArrayList<Pessoa> getListaEmpregadosAssociados() {
        ArrayList<Pessoa> employeersList = new ArrayList<Pessoa>();

        for(int i=0; i<this.subordinados.size(); i++){
            if(this.subordinados.get(i) instanceof Empregado)
                employeersList.add(subordinados.get(i));
            else
                employeersList.addAll( subordinados.get(i).getListaEmpregadosAssociados());
        }

        return employeersList;
    }

    @Override
    public ArrayList<Pessoa> getListaSubordinadosDiretos () {
        return this.subordinados;
    }

    @Override
    public String toString() {
        return "Chefe: nome= " + this.getName() + ", idade= " + this.getAge() + ", superior= " + this.getSuperior();
    }
}
