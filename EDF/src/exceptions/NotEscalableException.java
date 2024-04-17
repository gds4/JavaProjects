package exceptions;

public class NotEscalableException extends Exception {

    public NotEscalableException() {
        super("Conjunto de Tarefas Não Escalonáveis pelo EDF!");
    }
}