import enums.TaskStats;

public class Task {
    String name;
    int arrivalTime;
    int deadline;
    int executionTime;
    int remainingTime;
    TaskStats STATS;

    public Task(String name, int arrivalTime, int deadline, int executionTime) {
        this.name = name;
        this.arrivalTime = arrivalTime;
        this.deadline = deadline;
        this.executionTime = executionTime;
        this.remainingTime = executionTime;
        this.STATS = TaskStats.CREATED;
    }
}