package enums;

public enum TaskStats {
    CREATED ("Created"),
    READY ("Ready"),
    START_RUNNING ("Starts Running"),
    RUNNING ("Running"),
    PREEMPTED ("Pre-empted"),
    COMPLETED ("Completed")
    ;

    private String stats;

    private TaskStats(String stats){
        this.stats = stats;
    }
    
    public String getStats() {
        return stats;
    }
    public void setStats(String stats) {
        this.stats = stats;
    }
}
