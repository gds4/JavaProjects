import java.util.ArrayList;
import java.util.List;

import exceptions.NotEscalableException;

public class EDFScheduler {
    private int currentTime;

    public List<String> schedule(List<Task> tasks) throws NotEscalableException{

        // Calcula se o conjunto de tarefa é escalonável pelo EDF
        if(!isPossible(tasks))
            throw new NotEscalableException();

        // ArrayList<Historic> tasksTimeline = new ArrayList<Historic>();

        List<String> schedule = new ArrayList<>();
        List<Task> readyTasks = new ArrayList<>();
        this.currentTime = 0;

        while (!tasks.isEmpty()) {

            // Seleciona as tarefas com base no tempo de chegada 
            readyTasks = inQueue(tasks, readyTasks); 
            
            // Caso não tenha nenhuma tarefa para executar
            if (readyTasks.isEmpty()) {
                schedule.add("Time: " + this.currentTime + ", Task: ");
                this.currentTime++;

                continue;
            }
            
            // Busca a tarefa a ser executada seguindo as especificações do EDF
            Task selectedTask = toExecute(readyTasks);

            selectedTask.remainingTime--;
            schedule.add("Time: " + this.currentTime + ", Task: " + selectedTask.name);

            // Verifica se a tarefa finalizou
            if (isTaskCompleted(selectedTask)) 
                tasks.remove(selectedTask);

            // Limpa a lista de prontos
            clearReadyQueue(readyTasks);
                
            this.currentTime++;
        }

        return schedule;
    }

    private List<Task> inQueue(List<Task> tasks, List<Task> queue) {
        for (Task task : tasks) {
            if (task.arrivalTime <= this.currentTime) {
                queue.add(task);
            }
        }

        return queue;
    }

    private void clearReadyQueue(List<Task> queue){
        queue.clear();
    }

    private Task toExecute(List<Task> readyTasks){
        Task selectedTask = readyTasks.get(0);

        for (Task task : readyTasks) {
            if (task.deadline < selectedTask.deadline) {
                selectedTask = task;
            }
        }

        return selectedTask;
    }

    private boolean isTaskCompleted(Task selectedTask){
        return selectedTask.remainingTime == 0;
    }

    private boolean isPossible(List<Task> tasks) {
        double U = 0.0;

        for(Task x: tasks) 
            U += (x.executionTime/(double)x.deadline);
        

        System.out.println("Utilização Total do Processador: " + U);

        if(U > 1) return false;

        return true;
    }       
    // U = (executionTime_1/deadline_1) + (executionTime_2/deadline_2)...
}