package de.deanomus.GUI.converter;

import de.deanomus.GUI.GUI;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ConverterListener implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource().equals(ConverterPanel.MD5GO)) {
            String input = ConverterPanel.MD5Key.getText();
            if(input.length() != 0) {

            } else {
                noInput();
            }
        }
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
