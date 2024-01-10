public class Carro extends Veiculo {

    public Carro(String modelo, String placa) {
        this.setPlaca(placa);
        this.setModelo(modelo);
    }

    public void Start() {
        confereCombustivel();
        confereCambio();

        System.out.println("Carro Ligado!");
    }
    
    private void confereCambio() {
        System.out.println("Cambio Conferido");
    }
}
