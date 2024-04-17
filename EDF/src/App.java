import java.util.ArrayList;
import java.util.List;

// class Task {
//     String name;
//     int arrivalTime;
//     int deadline;
//     int executionTime;
//     int remainingTime;

//     public Task(String name, int arrivalTime, int deadline, int executionTime) {
//         this.name = name;
//         this.arrivalTime = arrivalTime;
//         this.deadline = deadline;
//         this.executionTime = executionTime;
//         this.remainingTime = executionTime;
//     }
// }

// public class EDFScheduler {

//     public static List<String> edfScheduler(List<Task> tasks) {
//         List<String> schedule = new ArrayList<>();
//         int currentTime = 0;

//         while (!tasks.isEmpty()) {
//             List<Task> readyTasks = new ArrayList<>();
//             for (Task task : tasks) {
//                 if (task.arrivalTime <= currentTime) {
//                     readyTasks.add(task);
//                 }
//             }
//             if (readyTasks.isEmpty()) {
//                 currentTime++;
//                 continue;
//             }

//             Task selectedTask = readyTasks.get(0);
//             for (Task task : readyTasks) {
//                 if (task.deadline < selectedTask.deadline) {
//                     selectedTask = task;
//                 }
//             }
//             selectedTask.remainingTime--;
//             schedule.add("Time: " + currentTime + ", Task: " + selectedTask.name);

//             if (selectedTask.remainingTime == 0) {
//                 tasks.remove(selectedTask);
//             }

//             currentTime++;

//             // Adicionando um atraso de 1 segundo
//             try {
//                 Thread.sleep(1000);
//             } catch (InterruptedException e) {
//                 e.printStackTrace();
//             }
//         }

//         return schedule;
//     }

public class App{
    public static void main(String[] args) {
        EDFScheduler scheduler = new EDFScheduler();

        List<Task> tasks = new ArrayList<>();
        tasks.add(new Task("T1", 0, 5, 2));
        tasks.add(new Task("T2", 0, 9, 3));
        tasks.add(new Task("T3", 1, 4, 2));
        
        List<String> schedule = scheduler.schedule(tasks);
        System.out.println("Schedule:");
        for (String entry : schedule) {
            System.out.println(entry);
        }
    }
}