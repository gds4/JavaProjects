package funcionarios;

public class Professor extends Pesquisador {

    public Professor (String name, String cpf, Pesquisador coordenador){
        super(name, cpf, coordenador);
    }

    @Override
    public double getValorPago() {
        return 220.0 + (this.getCoordenador().getValorPago() * (0.3));
    }

    @Override
    public int getQtdPesquisadores() {
        System.out.println("Professores Não Supervisionam");
        return -1;
    }
}
