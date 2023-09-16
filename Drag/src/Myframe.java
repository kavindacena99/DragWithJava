import javax.swing.*;

public class Myframe extends JFrame {
    Dragpanel dragpanel = new Dragpanel();
    Myframe(){
        this.add(dragpanel);
        this.setTitle("Drag and Drop");
        this.setSize(600, 600);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }
}
