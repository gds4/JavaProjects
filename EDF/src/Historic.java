import java.util.ArrayList;


public class Historic {
    private ArrayList<Integer> pre_emptions = new ArrayList<Integer>();
    private ArrayList<Integer> startRunning = new ArrayList<Integer>();
    private int finishAt;

    public int getFinishAt() {
        return finishAt;
    }
    public void setFinishAt(int finishAt) {
        this.finishAt = finishAt;
    }

    public void addPre_emptions(int pre_emptionTime) {
        this.pre_emptions.add(pre_emptionTime);
    }

    public void addStartRunning(int startRunningTime) {
        this.startRunning.add(startRunningTime);
    }
}