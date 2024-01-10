public abstract class Veiculo {
    private String modelo;
    private String placa;

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public abstract void Start();

    public void confereCombustivel() {
        System.out.println("Combustivel Conferido");
    }
}
