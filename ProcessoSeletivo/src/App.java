import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;
import java.util.Random;


public class App {
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) throws Exception {
        List<Candidato> candidatos = new ArrayList<>();
        int option;

        boolean sair = true;
        while(sair)
        {
            option = menu();

            switch(option)
            {
                case 0:
                    sair = false;
                    continue;

                case 1:
                    Candidato aux = new Candidato();

                    System.out.print("Nome do Candidato: ");
                    aux.name = scan.next();
                    scan.nextLine();

                    candidatos.add(aux);
                    continue;

                case 2:
                    candidatos = filtrar_por_salario (candidatos);
                    continue;

                case 3:
                    Analise_Salario(candidatos);
                    continue;

                case 4:
                    showCandidatos(candidatos);
                    continue;

                case 5:
                    ligar_candidato(candidatos);
                    continue;
                
                default:
                    System.out.println("Valor Inválido!\n");
                    continue;

            }
        }
        scan.close();
    }

    // CASE 2
    static List<Candidato> filtrar_por_salario (List<Candidato> All_List){
        List<Candidato> nova_lista = new ArrayList<>();
        double Salario_Pretendido = 2000.00;

        int ctrl=0;
   
        for (Candidato candidato : All_List){

            if(ctrl >= 5) break;

            else if(candidato.Pretensao_Salario < Salario_Pretendido){
                nova_lista.add(candidato);
                ctrl++;
            }
        }


        return nova_lista;
    }

    // CASE 3
    static void Analise_Salario(List<Candidato> candidatos){
        double Salario_Vaga = 2000.00;

        for(Candidato candidato: candidatos){
            if(Salario_Vaga > candidato.Pretensao_Salario)
                System.out.printf("Ligar para Candidato %s.\n", candidato.name);

            else if(Salario_Vaga == candidato.Pretensao_Salario)
                System.out.printf("Ligar para Candidato %s com Contra Proposta.\n", candidato.name);

            else
                System.out.print("Aguardando resultado dos demais candidatos.\n");
        }

    }

    // CASE 4
    static void showCandidatos(List<Candidato> All_Candidatos){
        for(Candidato i : All_Candidatos){
            System.out.println("\nNome: " + i.name + "\nPretensão: R$ " + i.Pretensao_Salario);
        }
    }

    // CASE 5
    static void ligar_candidato(List<Candidato> All_candidatos){

        for(Candidato x : All_candidatos){

            System.out.println("Candidato " + x.name);

            boolean resp = false;
            for(int i=0; i<3 && resp!=true; i++){
                resp = call();

                if(resp) System.out.println("Atendeu!\n\n");
                else System.out.println("Não Atendeu!");
            }
        }
    }

    // FUNÇOES AUXILIARES
    static boolean call(){
        return new Random().nextInt(3)==1;
    }

    static int menu(){

        System.out.println("\n------------------ Menu ------------------");
        System.out.println("0 - sair");
        System.out.println("1 - Cadastrar Candidato");
        System.out.println("2 - Filtrar Por Salário");
        System.out.println("3 - Analisar Pretensão");
        System.out.println("4 - Listar Candidatos");
        System.out.println("5 - Ligar para Candidatos");
        
        System.out.print("\n--> ");
        int option = scan.nextInt();
        scan.nextLine();
        
        System.out.print("\n");
        return option;
    }
}
