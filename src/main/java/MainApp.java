import java.io.IOException;

/**
 * Created by sam on 14/09/2017.
 */
public class MainApp {
    public static void main(String[] args) {
        //try {
        //    //MouseKeyboardControl.typeString("test");
        //} catch (AWTException e) {
        //    e.printStackTrace();
        //}

        try {
            Files.placeFileOnDesktop();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
