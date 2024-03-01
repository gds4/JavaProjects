import com.Store;

public class MusicStore {
    public static void main(String[] args) throws Exception {
        Store myStore = new Store();

        myStore.getOpenClosedMessage(myStore.isOpen());
        myStore.displayHoursOfOperation();
    }
}
