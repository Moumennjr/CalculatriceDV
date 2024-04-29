import javax.swing.*;
import java.awt.*;

public class Bouton extends JButton {
    public Bouton(String s){
        super(s);
        setFocusable(false);
        setBackground(new Color(190, 226, 246));
    }
}
