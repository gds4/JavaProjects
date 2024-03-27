package funcionarios;
import java.util.ArrayList;

public abstract class Pesquisador {
    private String name;
    private String cpf;
    private Pesquisador coordenador;
    protected ArrayList<Pesquisador> supervisionados = new ArrayList<Pesquisador>(); 


    public Pesquisador(String name, String cpf, Pesquisador coordenador){
        this.name = name;
        this.cpf = cpf;
        this.coordenador = coordenador;
    }

    public int getQtdSupervisionados(){
        return this.supervisionados.size();
    }

    public abstract int getQtdPesquisadores();

    public abstract double getValorPago();



// ------------- Get and Set -------------------

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public Pesquisador getCoordenador() {
        return coordenador;
    }
    public void setCoordenador(Pesquisador coordenador) {
        this.coordenador = coordenador;
    }
    public ArrayList<Pesquisador> getSupervisionados() {
        return supervisionados;
    }
} 