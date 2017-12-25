import java.awt.PointerInfo;
import java.awt.MouseInfo;
import java.awt.*;
import java.awt.Robot;
public class GetMousePoint{
    public static void main(String[] args) throws Exception {
		Robot robot = new Robot();
		int i = 0;
        while (true) {
			MouseInfo.getPointerInfo();
			System.out.println(MouseInfo.getPointerInfo().getLocation()+ " iteration: " + i);
			i++;
            try {
			Thread.sleep(1000);
			} catch (InterruptedException e) {
			break;
            }
		}
	}
}