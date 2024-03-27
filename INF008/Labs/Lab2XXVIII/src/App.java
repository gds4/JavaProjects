import com.ProjetoDePesquisa;
import funcionarios.Pesquisador;
import funcionarios.Coordenador;
import funcionarios.Professor;

public class App {
    public static void main(String[] args) throws Exception {
        Pesquisador chefeDePesquisa = new Coordenador("Sra. Mara Andrade", "000.000.00", null);

        ProjetoDePesquisa PROJETO = new ProjetoDePesquisa(chefeDePesquisa);

        Coordenador coord_1 = new Coordenador("Marcos", "111.111", chefeDePesquisa);
        Professor prof_1 = new Professor("Ana", "222.222", coord_1);
        Professor prof_2 = new Professor("Carlos", "333.333", prof_1);
        Professor coord_2 = new Professor("Maria", "444.444", coord_1);

        PROJETO.inserirPesquisador(coord_1);
        PROJETO.inserirPesquisador(coord_2);
        PROJETO.inserirPesquisador(prof_1);
        PROJETO.inserirPesquisador(prof_2);

        System.out.println(PROJETO.getQtdPesquisadoresAssociados(coord_1));
        System.out.println(prof_1.getQtdPesquisadores());
        System.out.println(prof_1.getValorPago());
        System.out.println(coord_1.getValorPago());
    }

    // 292.5
    // 285.18
}
