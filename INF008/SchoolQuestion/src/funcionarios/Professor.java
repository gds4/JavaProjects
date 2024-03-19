package funcionarios;

public class Professor extends Funcionario {
    private String disciplina;

    public Professor(String nome, double salarioBase, int idade, String disciplina){
        super(nome, salarioBase, idade);

        this.disciplina = disciplina;
    }


    @Override
    public String toString() {
        return "Nome: " + getNome() +
            "\n Idade: " + getIdade() +
            "\n Salário: " + getSalario() +
            "\n Disciplina: " + getDisciplina();
    }


    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }
    public String getDisciplina() {
        return disciplina;
    }
}
