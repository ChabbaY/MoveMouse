import java.awt.MouseInfo;
import java.awt.Point;
import java.awt.Robot;

public class MoveMouse {
    public static void main(String[] args) {
        while (true) {
            try {
                Robot rob = new Robot();
                Point mouse = MouseInfo.getPointerInfo().getLocation();
                rob.mouseMove((int)mouse.getX() + 10, (int)mouse.getY());
                rob.delay(10000);
                rob.mouseMove((int)mouse.getX(), (int)mouse.getY());
                rob.delay(10000);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}