package funcionarios;

public class Funcionario {
    private String nome;
    private double salarioBase;
    private int idade;


    public Funcionario(String nome, double salarioBase, int idade){
        this.nome = nome;
        this.salarioBase = salarioBase;
        this.idade = idade;
    }

    @Override
    public String toString() {
        return "Nome: " + this.nome +
            "\n Idade: " + this.idade +
            "\n Salário: " + this.salarioBase;
    }

// ------------- SET and GET ----------------
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public int getIdade() {
        return idade;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getNome() {
        return nome;
    }
    public void setSalario(double salario) {
        this.salarioBase = salario;
    }
    public double getSalario() {
        return salarioBase;
    }
}