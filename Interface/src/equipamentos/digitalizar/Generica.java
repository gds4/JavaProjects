package equipamentos.digitalizar;

public class Generica implements Digitalizadora {
    public void Digitalizar(){
        ChecarTextos();
        System.out.println(modelo + " Digitalizando...");
    }
    
    private void ChecarTextos(){
        System.out.println("Textos verificados!");
    }
}
