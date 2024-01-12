import equipamentos.Multifuncional.Mult;
import equipamentos.digitalizar.Generica;
import equipamentos.imprimir.HP;
import equipamentos.scannear.IBMscan;

public class App {
    public static void main(String[] args) throws Exception {
        Mult multFunc = new Mult();
        IBMscan scannerIBM = new IBMscan();
        Generica Gdigit = new Generica(); 
        HP Hp = new HP();

        multFunc.Imprimir();
        multFunc.Digitalizar();
        multFunc.Scannear();
        System.out.print("\n");

        scannerIBM.Scannear();
        System.out.print("\n");

        Hp.Imprimir();
        System.out.print("\n");

        Gdigit.Digitalizar();
        System.out.print("\n");

    }
}
