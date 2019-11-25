package de.deanomus.GUI.converter;

import de.deanomus.GUI.GUI;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.security.NoSuchAlgorithmException;

public class ConverterListener implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource().equals(ConverterPanel.MD5GO)) {
            String input = ConverterPanel.MD5Key.getText();
            if(input.length() != 0) {
                finished(Converter.MD5toString(input));
            } else {
                noInput();
            }
        }
    }

    static void finished(String string) {
        JDialog ergebnis = new JDialog();
        ergebnis.setTitle("Finished");
        ergebnis.setSize(300, 100);
        ergebnis.setResizable(false);
        ergebnis.add(new JLabel("Fertig! " + string));
        ergebnis.setModal(true);
        ergebnis.setVisible(true);
    }

    static void noInput() {
        JDialog warn = new JDialog();
        warn.setTitle("Warnung");
        warn.setSize(200, 100);
        warn.setResizable(false);
        warn.add(new JLabel("Keine gültige Eingabe!"));
        warn.setModal(true);
        warn.setVisible(true);
    }
    static void Error() {
        noInput();
    }
}
