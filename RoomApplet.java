import java.applet.*;
import java.awt.*;
import java.io.*;
import java.awt.event.*;

public class RoomApplet extends Applet implements ActionListener {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    protected int layout;

    public void init() {
        setFont(new Font("Dialog", Font.BOLD, 18));

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

        layout = 0;

    }

    public void paint(Graphics g) {
        if (layout == 0) {
            g.setColor(Color.orange);
            g.fillRect(50, 50, 700, 100);
        } else if (layout == 1) {
            g.setColor(Color.green);
            g.fillRect(50, 50, 700, 100);
        } else if (layout == 2) {
            g.setColor(Color.red);
            g.fillRect(50, 50, 700, 100);
        } else if (layout == 3) {
            g.setColor(Color.blue);
            g.fillRect(50, 50, 700, 100);
        } else {
            g.setColor(Color.black);
            g.fillRect(50, 50, 700, 100);
        }

    }

    Button layout1, layout2, layout3, layout4;

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == layout1) {
            System.out.println("Layout 1 chosen");
            layout = 1;
            repaint();
        }
        if (e.getSource() == layout2) {
            System.out.println("Layout 2 chosen");
            layout = 2;
            repaint();
        }
        if (e.getSource() == layout3) {
            System.out.println("Layout 3 chosen");
            layout = 3;
            repaint();
        }
        if (e.getSource() == layout4) {
            System.out.println("Layout 4 chosen");
            layout = 4;
            repaint();
        }
    }
}