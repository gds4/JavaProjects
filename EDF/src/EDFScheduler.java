import java.util.ArrayList;
import java.util.List;

public class EDFScheduler {

    public List<String> schedule(List<Task> tasks){
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
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        return schedule;
    }

}