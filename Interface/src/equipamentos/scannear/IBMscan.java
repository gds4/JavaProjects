package equipamentos.scannear;

public class IBMscan implements Scan {
    
    private String modelo = "IBM";

    public void Scannear(){
        ChecarTinta();
        System.out.println(modelo + " scaneando...");
    }

    private void ChecarTinta(){
        System.out.println("Tinta Cheia");
    }

}
