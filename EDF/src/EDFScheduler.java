import java.util.ArrayList;
import java.util.List;

import exceptions.NotEscalableException;

public class EDFScheduler {

    public List<String> schedule(List<Task> tasks) throws NotEscalableException{
        if(!isPossible(tasks))
            throw new NotEscalableException();

        List<String> schedule = new ArrayList<>();
        int currentTime = 0;

        while (!tasks.isEmpty()) {
            List<Task> readyTasks = new ArrayList<>();

            for (Task task : tasks) {
                if (task.arrivalTime <= currentTime) {
                    readyTasks.add(task);
                }
            }

            if (readyTasks.isEmpty()) {
                currentTime++;
                continue;
            }

            Task selectedTask = readyTasks.get(0);
            for (Task task : readyTasks) {
                if (task.deadline < selectedTask.deadline) {
                    selectedTask = task;
                }
            }
            selectedTask.remainingTime--;
            schedule.add("Time: " + currentTime + ", Task: " + selectedTask.name);

            if (selectedTask.remainingTime == 0) 
                tasks.remove(selectedTask);

            currentTime++;

            // Adicionando um atraso de 1 segundo
            // try {
            //     Thread.sleep(1000);
            // } catch (InterruptedException e) {
            //     e.printStackTrace();
            // }
        }

        return schedule;
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