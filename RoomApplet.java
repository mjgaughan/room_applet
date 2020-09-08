import java.applet.*;
import java.awt.*;
import java.io.*;
import java.awt.event.*;

public class RoomApplet extends Applet {
    public void paint(Graphics g) {
        g.setColor(Color.orange);
        g.fillRect(200, 100, 500, 500);
    }
}