import javax.swing.*;
import java.awt.*;

public class CalVue extends JFrame {
    public Bouton b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14,b15,b16;
    public JTextField text;
    public CalControleur controleur;
    public CalModele modele;
    public CalVue(CalModele modele){
        this.modele = modele;
        controleur = new CalControleur(this,modele);
        setSize(400,240);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel panel1 = new JPanel();
        JPanel panel2 = new JPanel();

        panel1.setPreferredSize(new Dimension(400,200));
        panel1.setBackground(Color.WHITE);
        panel1.setLayout(new GridLayout(4,4,2,2));
        //------------Buttons-------------//
        b1 = new Bouton("1");
        b2 = new Bouton("2");
        b3 = new Bouton("3");
        b4 = new Bouton("C");
        b5 = new Bouton("4");
        b6 = new Bouton("5");
        b7 = new Bouton("6");
        b8 = new Bouton("+");
        b9 = new Bouton("7");
        b10 = new Bouton("8");
        b11 = new Bouton("9");
        b12 = new Bouton("-");
        b13 = new Bouton("0");
        b14 = new Bouton("X");
        b15 = new Bouton("/");
        b16 = new Bouton("=");

        //--------------Adding-Action-Listener------------//
        b1.addActionListener(controleur);
        b2.addActionListener(controleur);
        b3.addActionListener(controleur);
        b4.addActionListener(controleur);
        b5.addActionListener(controleur);
        b6.addActionListener(controleur);
        b7.addActionListener(controleur);
        b8.addActionListener(controleur);
        b9.addActionListener(controleur);
        b10.addActionListener(controleur);
        b11.addActionListener(controleur);
        b12.addActionListener(controleur);
        b13.addActionListener(controleur);
        b14.addActionListener(controleur);
        b15.addActionListener(controleur);
        b16.addActionListener(controleur);

        //------L'ajout-des-boutons-------//
        panel1.add(b1);
        panel1.add(b2);
        panel1.add(b3);
        panel1.add(b4);
        panel1.add(b5);
        panel1.add(b6);
        panel1.add(b7);
        panel1.add(b8);
        panel1.add(b9);
        panel1.add(b10);
        panel1.add(b11);
        panel1.add(b12);
        panel1.add(b13);
        panel1.add(b14);
        panel1.add(b15);
        panel1.add(b16);


        panel2.setPreferredSize(new Dimension(400,40));
        panel2.setBackground(Color.green);
        panel2.setLayout(new GridLayout(1,1));
        text = new JTextField();
        text.setEditable(false);
        text.setPreferredSize(new Dimension(400,40));
        text.setFont(new Font("fvd",Font.BOLD,15));
        text.setForeground(Color.BLACK);
        panel2.add(text);
        add(panel2,BorderLayout.NORTH);
        add(panel1, BorderLayout.CENTER);
        setVisible(true);
    }
}
