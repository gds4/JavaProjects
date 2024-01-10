public class Moto extends Veiculo {

    public Moto(String Modelo, String Placa) {
        this.setModelo(Modelo);
        this.setPlaca(Placa);
    } 

    @Override
    public void Start(){
        confereCombustivel();
        confereNeutro();

        System.out.println("Moto Ligada!");
    }
    
    private void confereNeutro() {
        System.out.println("Neutro Conferido");
    }
}
