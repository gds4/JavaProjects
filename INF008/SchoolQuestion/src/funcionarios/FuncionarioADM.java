package funcionarios;

public class FuncionarioADM extends Funcionario {
    private String departamento;

    public FuncionarioADM (String nome, double salarioBase, int idade, String departamento){
        super(nome, salarioBase, idade);
        this.departamento = departamento;
    }

    @Override
    public String toString() {
        return "Nome: " + getNome() +
            "\n Idade: " + getIdade() +
            "\n Salário: " + getSalario() +
            "\n Departamento: " + getDepartamento();
    }


    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }
    public String getDepartamento() {
        return departamento;
    }
}
