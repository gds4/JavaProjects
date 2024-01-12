package equipamentos.imprimir;

public class HP implements Impressora{

    private String modelo = "HP";

    public void Imprimir(){
        ChecarCartucho();
        System.out.println(modelo + " Imprimindo...");
    }

    private void ChecarCartucho(){
        System.out.println("Cartucho Cheio!");
    }

    public String getModelo() {
        return modelo;
    }
}
