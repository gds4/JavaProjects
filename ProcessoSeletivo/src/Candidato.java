import java.util.concurrent.ThreadLocalRandom;

public class Candidato {
    String name;
    double Pretensao_Salario = getSalario();

    public double getSalario(){
        return ThreadLocalRandom.current().nextDouble(1500, 2500);
    }
}
