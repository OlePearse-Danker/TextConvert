package TextConvert;

import javax.swing.*;

public abstract class TextConverter {

    public void process () {
        String eingabe = texteingabe();
        String convertedText = convert(eingabe);
        textausgabe(convertedText);

    }

    public abstract String convert (String eingabe);

    private String texteingabe() {
        String s = "Bitte ihren Text eingeben: ";
        String eingabe = JOptionPane.showInputDialog(s);
        return eingabe;
    }

    private void textausgabe(String s) {

        System.out.println(s);
    }
}
