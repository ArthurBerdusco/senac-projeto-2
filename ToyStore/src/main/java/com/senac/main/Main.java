package com.senac.main;

import com.senac.login.Login;
import javax.swing.UIManager;


public class Main {

    public static void main(String[] args) {
        try {
            //"javax.swing.plaf.metal.MetalLookAndFeel"  ~~METAL
            //"com.sun.java.swing.plaf.windows.WindowsLookAndFeel" ~~ WINDOWS
            //"javax.swing.plaf.nimbus.NimbusLookAndFeel":  ~~ NIMBUS
            UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
            UIManager.put("Table.focusCellBackground", UIManager.getColor("Table.background"));
            new Login().setVisible(true);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
