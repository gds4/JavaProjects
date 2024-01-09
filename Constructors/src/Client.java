public class Client {
    private String name;
    private int Age;
    private String cep;

    public Client (String name, int Age, String cep){
        this.name = name;
        this.Age = Age;
        this.cep = cep;
    }
    
    public String getName() {
        return name;
    }
    public int getAge() {
        return Age;
    }
    public String getCep() {
        return cep;
    }
}
