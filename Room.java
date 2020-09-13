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
        g.fillRect(150, 150, width, length);
    }
}