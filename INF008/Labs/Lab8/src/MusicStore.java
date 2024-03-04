import java.util.Scanner;
import com.Store;

public class MusicStore {
    public static void main(String[] args) throws Exception {
        Store myStore = new Store();

        Scanner scan = new Scanner(System.in);

        // System.out.println("Open Time: ");
        // float openTime = scan.nextFloat();

        // System.out.println("Close Time: ");
        // float closeTime = scan.nextFloat();
        
        // System.out.println("Open Message: ");
        // String openMsg = scan.next();

        // System.out.println("Close Message: ");
        // String closeMsg = scan.next();

        // myStore.setOpenTime(openTime);
        // myStore.setCloseTime(closeTime);

        // myStore.setOpenMenssage(openMsg);
        // myStore.setCloseMenssage(closeMsg);

        myStore.getOpenClosedMessage(myStore.isOpen());
        myStore.displayHoursOfOperation();

        scan.close();
    }
}
