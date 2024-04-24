import enums.TaskStats;

public class Task {
    String name;
    int arrivalTime;
    int deadline;
    int period;
    int executionTime;
    int remainingTime;
    int initialPeriodTime;
    TaskStats STATS;

    public Task(String name, int arrivalTime, int deadline, int executionTime) {
        this.name = name;
        this.arrivalTime = arrivalTime;
        this.deadline = deadline;
        this.period = deadline;
        this.initialPeriodTime = arrivalTime;
        this.executionTime = executionTime;
        this.remainingTime = executionTime;
        this.STATS = TaskStats.CREATED;
    }
}