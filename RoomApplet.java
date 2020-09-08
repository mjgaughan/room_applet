import java.applet.*;
import java.awt.*;
import java.io.*;
import java.awt.event.*;

public class RoomApplet extends Applet implements ActionListener {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    public void init() {
        layout1 = new Button("Layout 1");
        add(layout1);
        layout1.addActionListener(this);

        layout2 = new Button("Layout 2");
        add(layout2);
        layout2.addActionListener(this);

        layout3 = new Button("Layout 3");
        add(layout3);
        layout3.addActionListener(this);

        layout4 = new Button("Layout 4");
        add(layout4);
        layout4.addActionListener(this);
    }

    public void paint(Graphics g) {
        g.setColor(Color.orange);
        g.fillRect(200, 100, 500, 500);
    }

    Button layout1, layout2, layout3, layout4;

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == layout1)
            System.out.println("Layout 1 chosen");
        if (e.getSource() == layout2)
            System.out.println("Layout 2 chosen");
        if (e.getSource() == layout3)
            System.out.println("Layout 3 chosen");
        if (e.getSource() == layout4)
            System.out.println("Layout 4 chosen");
    }
}