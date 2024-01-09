public class Cadastro {
    public static void main(String[] args) {
        Client client = new Client("Deivison", 18, "12345-678");

        System.out.println("Nome: "+ client.getName());
        System.out.println("Idade: "+ client.getAge());
        System.out.println("CEP: "+ client.getCep());
    }
}
