import java.util.Scanner;

import com.MusicTitle;
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

        // myStore.getOpenClosedMessage(myStore.isOpen());
        // myStore.displayHoursOfOperation();
        myStore.DisplayMusicTitles();

        // MusicTitle disc1 = new MusicTitle();
        // disc1.setArtist("Devis");
        // disc1.setTitle("ReallyTried");

        // MusicTitle disc2 = new MusicTitle();
        // disc2.setArtist("Sant");
        // disc2.setTitle("adsaSAds");
        
        // myStore.setTitles(new MusicTitle[]{disc1, disc2});
        myStore.setTitles("Devis", "WannaAJob");
        myStore.setTitles("VASd", "Get READY");
        myStore.DisplayMusicTitles();

        scan.close();
    }
}
