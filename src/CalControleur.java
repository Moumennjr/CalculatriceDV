import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalControleur implements ActionListener {
    private CalVue vue;
    private CalModele modele;
    public int x,y;

    public CalControleur(CalVue vue,CalModele modele){
        this.vue = vue;
        this.modele = modele;
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        //-----Num-2----//
        if(e.getSource()==vue.b1){
            if(vue.text.getText().equals("+")||vue.text.getText().equals("-")||vue.text.getText().equals("X")||vue.text.getText().equals("/")){
                vue.text.setText("1");
            } else if (!vue.text.getText().isEmpty() && vue.text.getText().charAt(0)=='=') {
                vue.text.setText("1");

            } else {
                vue.text.setText(vue.text.getText() + "1");
            }
        }
        //-----Num-2-----//
        else if(e.getSource()==vue.b2){
            if(vue.text.getText().equals("+")||vue.text.getText().equals("-")||vue.text.getText().equals("X")||vue.text.getText().equals("/")){
                vue.text.setText("2");
            } else if (!vue.text.getText().isEmpty() && vue.text.getText().charAt(0)=='=') {
                vue.text.setText("2");

            } else {
                vue.text.setText(vue.text.getText() + "2");
            }
        }
        //-------Num-3--------//
        else if(e.getSource()==vue.b3){
            if(vue.text.getText().equals("+")||vue.text.getText().equals("-")||vue.text.getText().equals("X")||vue.text.getText().equals("/")){
                vue.text.setText("3");
            } else if (!vue.text.getText().isEmpty() && vue.text.getText().charAt(0)=='=') {
                vue.text.setText("3");

            } else {
                vue.text.setText(vue.text.getText() + "3");
            }
        }
        //-----Bouton-Pour-Vider-TextField-------//
        else if(e.getSource()==vue.b4){
            vue.text.setText("");
            modele.resetTotal();
        }
        //-----Num-4--------//
        else if(e.getSource()==vue.b5){
            if(vue.text.getText().equals("+")||vue.text.getText().equals("-")||vue.text.getText().equals("X")||vue.text.getText().equals("/")){
                vue.text.setText("4");
            } else if (!vue.text.getText().isEmpty() && vue.text.getText().charAt(0)=='=') {
                vue.text.setText("4");

            } else {
                vue.text.setText(vue.text.getText() + "4");
            }
        }
        //-----Num-5--------//
        else if(e.getSource()==vue.b6){
            if(vue.text.getText().equals("+")||vue.text.getText().equals("-")||vue.text.getText().equals("X")||vue.text.getText().equals("/")){
                vue.text.setText("5");
            } else if (!vue.text.getText().isEmpty() && vue.text.getText().charAt(0)=='=') {
                vue.text.setText("5");

            } else {
                vue.text.setText(vue.text.getText() + "5");
            }
        }
        //------Num-6--------//
        else if(e.getSource()==vue.b7) {
            if (vue.text.getText().equals("+") || vue.text.getText().equals("-") || vue.text.getText().equals("X") || vue.text.getText().equals("/")) {
                vue.text.setText("6");
            } else if (!vue.text.getText().isEmpty() && vue.text.getText().charAt(0) == '=') {
                vue.text.setText("6");

            } else {
                vue.text.setText(vue.text.getText() + "6");
            }
        }
        //------Somme-------//
        else if (e.getSource()==vue.b8) {
            if(!vue.text.getText().isEmpty() && vue.text.getText().charAt(0) == '='){
                modele.setOperation(1,0);
                vue.text.setText("+");
            }
            else {
                modele.setOperation(1, Integer.parseInt(vue.text.getText()));
                vue.text.setText("+");
            }
        }
        //----Num-7-----//
        else if(e.getSource()==vue.b9) {
            if (vue.text.getText().equals("+") || vue.text.getText().equals("-") || vue.text.getText().equals("X") || vue.text.getText().equals("/")) {
                vue.text.setText("7");
            } else if (!vue.text.getText().isEmpty() && vue.text.getText().charAt(0) == '=') {
                vue.text.setText("7");

            } else {
                vue.text.setText(vue.text.getText() + "7");
            }
        }
        //------Num-8------//
        else if(e.getSource()==vue.b10) {
            if (vue.text.getText().equals("+") || vue.text.getText().equals("-") || vue.text.getText().equals("X") || vue.text.getText().equals("/")) {
                vue.text.setText("8");
            } else if (!vue.text.getText().isEmpty() && vue.text.getText().charAt(0) == '=') {
                vue.text.setText("8");

            } else {
                vue.text.setText(vue.text.getText() + "8");
            }
        }
        //------Num-9------//
        else if(e.getSource()==vue.b11) {
            if (vue.text.getText().equals("+") || vue.text.getText().equals("-") || vue.text.getText().equals("X") || vue.text.getText().equals("/")) {
                vue.text.setText("9");
            } else if (!vue.text.getText().isEmpty() && vue.text.getText().charAt(0) == '=') {
                vue.text.setText("9");

            } else {
                vue.text.setText(vue.text.getText() + "9");
            }
        }
        //-------Soustraction-------//
        else if (e.getSource()==vue.b12) {
            if(!vue.text.getText().isEmpty() && vue.text.getText().charAt(0) == '='){
                modele.setOperation(2,0);
                vue.text.setText("-");
            }
            else {
                modele.setOperation(2, Integer.parseInt(vue.text.getText()));
                vue.text.setText("-");
            }
        }
        //-------Num-0------//
        else if(e.getSource()==vue.b13) {
            if (vue.text.getText().equals("+") || vue.text.getText().equals("-") || vue.text.getText().equals("X") || vue.text.getText().equals("/")) {
                vue.text.setText("0");
            } else if (!vue.text.getText().isEmpty() && vue.text.getText().charAt(0) == '=') {
                vue.text.setText("0");

            } else {
                vue.text.setText(vue.text.getText() + "0");
            }
        }
        //-----Multi------//
        else if (e.getSource()==vue.b14) {
            if(!vue.text.getText().isEmpty() && vue.text.getText().charAt(0) == '=') {
                modele.setOperation(3, 1);
            }
            else {
                modele.setOperation(3, Integer.parseInt(vue.text.getText()));
                vue.text.setText("X");
            }
            vue.text.setText("X");
        }else if (e.getSource()==vue.b15) {
            if(!vue.text.getText().isEmpty() && vue.text.getText().charAt(0) == '='){
                modele.setOperation(4,1);
                vue.text.setText("/");
            }
            else {
                modele.setOperation(4, Integer.parseInt(vue.text.getText()));
                vue.text.setText("/");
            }
        } else if (e.getSource()==vue.b16) {
            modele.doOeration(Integer.parseInt(vue.text.getText()));
            vue.text.setText("="+modele.getTotal());

        }


    }
}
