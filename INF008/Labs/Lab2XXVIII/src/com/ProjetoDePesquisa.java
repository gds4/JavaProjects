package com;
import java.util.ArrayList;
// import exceptions.PesquisadorNaoListadoException;
import funcionarios.Pesquisador;

public class ProjetoDePesquisa {
    private Pesquisador pesquisadorChefe;
    private ArrayList<Pesquisador> cadastrados= new ArrayList<Pesquisador>();

    public ProjetoDePesquisa(Pesquisador chefe){
        this.pesquisadorChefe = chefe;
    }

    public void inserirPesquisador(Pesquisador toAdd) {
        this.cadastrados.add(toAdd);
    }

    public int getQtdPesquisadoresAssociados(Pesquisador pesquisador) {
        
        for(Pesquisador x : this.cadastrados){
            if(x.getCpf().equals(pesquisador.getCpf()))
                return x.getQtdPesquisadores();
        }

        System.out.println("Pesquisador Não Encontrado Na Lista de Cadastrados!");
        return -1;
    }


// ------------- Get and Set -------------------

    public ArrayList<Pesquisador> getCadastrados() {
        return cadastrados;
    }
    public Pesquisador getPesquisadorChefe() {
        return pesquisadorChefe;
    }public void setPesquisadorChefe(Pesquisador pesquisadorChefe) {
        this.pesquisadorChefe = pesquisadorChefe;
    }
}