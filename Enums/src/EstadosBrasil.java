public enum EstadosBrasil{
    SAO_PAULO ("SP", "São Paulo"),
    BAHIA ("BA", "Bahia"),
    RIO_DE_JANEIRO ("RJ", "Rio de Janeiro"),
    BELO_HORIZONTE ("BH", "Belo Horizonte")
    ;

    private String sigla;
    private String name;

    private EstadosBrasil (String sigla, String name){
        this.name = name;
        this.sigla = sigla;
    }

    public String getName(){
        return name;
    }

    public String getSigla() {
        return sigla;
    }
}