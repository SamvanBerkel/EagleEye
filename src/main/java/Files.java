import java.io.File;
import java.io.IOException;

/**
 * Created by sam on 14/09/2017.
 */
public class Files {


    public static String getUserPath() {
        String home = System.getProperty("user.home");
        return home;
    }

    public static void placeFileInStartup() throws IOException {
        String homeString = System.getProperty("user.home");
        String startupPath = homeString + "/AppData/Roaming/Microsoft/Windows/Start Menu/Programs/Startup/hi.txt";

        File f = new File(startupPath);
        f.createNewFile();
    }

    public static void placeFileOnDesktop() throws IOException {
        String homeString = System.getProperty("user.home");
        String startupPath = homeString + "/Desktop/hi.txt";

        File f = new File(startupPath);
        f.createNewFile();
    }


}
