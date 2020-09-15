import java.applet.*;
import java.awt.*;
import java.io.*;
import java.awt.event.*;

public class Room extends Applet {
    int width, length, number_of_sides;

    public void init(int wid, int len, int sides) {
        width = wid;
        length = len;
        number_of_sides = sides;
        System.out.println("new room init");
    }

    public void RoomPaint(Graphics g) {
        g.setColor(Color.green);
        if (number_of_sides == 4)
            g.fillRect(75, 75, width, length);
        else {
            if (number_of_sides == 6) {
                g.fillRect(75, 75, 400, 600);
                g.fillRect(480, 75, 300, 500);
                System.out.println("6");
            } else if (number_of_sides == 8) {
                g.fillRect(75, 75, 400, 600);
                g.fillRect(475, 75, 120, 350);
                System.out.println("8");
            }
        }
    }
}