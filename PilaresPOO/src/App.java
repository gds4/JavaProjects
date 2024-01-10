public class App {
    public static void main(String[] args) throws Exception {
        Carro MyCar = new Carro("Audi TT", "ASD123");
        Moto MyMoto = new Moto("Kawasaki", "QWE321");

        System.out.println("Meu Carro");
        System.out.println("Modelo: " + MyCar.getModelo());
        System.out.println("Placa: " + MyCar.getPlaca());

        System.out.println("\nMinha Moto");
        System.out.println("Modelo: " + MyMoto.getModelo());
        System.out.println("Placa: " + MyMoto.getPlaca());

        System.out.println("\nLigando carro:");
        MyCar.Start();

        System.out.println("\nLigando moto:");
        MyMoto.Start();
    }
}
