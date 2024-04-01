package rh;

import java.util.ArrayList;

public class Empresa {
    private String name;
    private Chefe chefMaior;
    private ArrayList<Chefe> chefes = new ArrayList<Chefe>();
    private ArrayList<Empregado> empregados = new ArrayList<Empregado>();

    public Empresa(String name, Chefe chefMaior) {
        this.name = name;
        this.chefMaior = chefMaior;
    }

    public void addChefe(Chefe toAdd) {
        this.chefes.add(toAdd);
    }
    public void addEmpregado(Empregado toAdd) {
        this.empregados.add(toAdd);
    }


// ---------------- GET AND SET ---------------- 
    public Chefe getChefMaior() {
        return chefMaior;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public ArrayList<Chefe> getChefes() {
        return chefes;
    }
    public ArrayList<Empregado> getEmpregados() {
        return empregados;
    }
}
