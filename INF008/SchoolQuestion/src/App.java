import funcionarios.Professor;
import funcionarios.FuncionarioADM;

public class App {
    public static void main(String[] args) throws Exception {
        Professor professor_1 = new Professor("Adalberto", 3200.20, 37, "Pedagogia");
        FuncionarioADM adm_1 = new FuncionarioADM("Cletin", 4000.10, 50, "Falta e Cobra");

        System.out.println(professor_1.toString());
        System.out.println(adm_1.toString());
    }
}
