import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

public class Dragpanel extends JPanel {
    ImageIcon imgIcon = new ImageIcon("C:\\kcs.png");
    final int WIDTH = imgIcon.getIconWidth();
    final int HEIGHT = imgIcon.getIconHeight();
    Point imageCorner;
    Point prevPt;
    Dragpanel(){
        imageCorner = new Point(0,0);
        ClickListener clickListener = new ClickListener();
        DragListener dragListener = new DragListener();
        this.addMouseListener(clickListener);
        this.addMouseMotionListener(dragListener);
    }

    public void paintComponent(Graphics g){
        super.paintComponent(g);
        imgIcon.paintIcon(this,g,(int)imageCorner.getX(),(int)imageCorner.getY());
    }
    private class ClickListener extends MouseAdapter{
        public void mousePressed(MouseEvent e){
            prevPt = e.getPoint();
        }
    }
    private class DragListener extends MouseMotionAdapter{
        public void mouseDragged(MouseEvent e){
               Point currentPt = e.getPoint();
               imageCorner.translate((int)(currentPt.getX()-prevPt.getX()),(int)(currentPt.getY()-prevPt.getY()));
               prevPt = currentPt;
               repaint();
        }
    }
}
