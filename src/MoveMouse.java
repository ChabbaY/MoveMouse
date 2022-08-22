import java.awt.*;

public class MoveMouse {
    public static void main(String[] args) {
        try {
            Robot rob = new Robot();

            while (true) {
                Point mouse = MouseInfo.getPointerInfo().getLocation();
                rob.mouseMove((int)mouse.getX() + 10, (int)mouse.getY());
                rob.delay(10000);

                mouse = MouseInfo.getPointerInfo().getLocation();
                rob.mouseMove((int)mouse.getX() - 10, (int)mouse.getY());
                rob.delay(10000);
            }
        } catch (AWTException e) {
            e.printStackTrace();
        }
    }
}