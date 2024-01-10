import java.util.Scanner;

public class App {
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) throws Exception {
        
        System.out.println("Todos os estados listados: ");
        for(EstadosBrasil x: EstadosBrasil.values()){
            System.out.println(x.getName() + " - " + x.getSigla());
        }
        
        System.out.print("\nDigite o nome de um estado: ");
        String nome = scan.nextLine().toUpperCase();

        String nome_Formatado = nome.replace(" ", "_");

        try {
            EstadosBrasil eb = EstadosBrasil.valueOf(nome_Formatado);

            System.out.print("\nEstado Selecionado: ");
            System.out.println(eb.getName() + " - " + eb.getSigla());

        } catch (Exception e) {
            System.err.println("\nNome inválido ou Estado não listado!");
        }
        

        scan.close();
    }

}
