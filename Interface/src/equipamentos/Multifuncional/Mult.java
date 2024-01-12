package equipamentos.Multifuncional;

import equipamentos.digitalizar.Digitalizadora;
import equipamentos.imprimir.Impressora;
import equipamentos.scannear.Scan;

public class Mult implements Digitalizadora, Scan, Impressora{

    private String modelo = "Multifuncional";

    public String getModelo() {
        return modelo;
    }

    public void Imprimir(){
        ChecarCartucho();
        System.out.println(modelo + " Imprimindo...");
    }

    private void ChecarCartucho(){
        System.out.println("Cartucho Cheio!");
    }

    public void Scannear(){
        ChecarTinta();
        System.out.println(modelo + " scaneando...");
    }

    private void ChecarTinta(){
        System.out.println("Tinta Cheia");
    }

    public void Digitalizar(){
        ChecarTextos();
        System.out.println(modelo + " Digitalizando...");
    }
    
    private void ChecarTextos(){
        System.out.println("Textos verificados!");
    }
    
}
