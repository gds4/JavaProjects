package funcionarios;

public class Coordenador extends Pesquisador {
    
    
    public Coordenador (String name, String cpf, Pesquisador coordenador){
        super(name, cpf, coordenador);
    }

    @Override
    public double getValorPago() {
        double price = 300.0;

        if(this.getCoordenador() != null)
            for(int i=0; i < getQtdSupervisionados(); i++) 
                price = price - (price * (2.5/100));

        return price;
    }

    @Override
    public int getQtdPesquisadores() {
        int qtd = this.supervisionados.size();

        for(Pesquisador x : this.supervisionados)
            qtd += x.getQtdPesquisadores();
        
        return qtd;
    }
}
