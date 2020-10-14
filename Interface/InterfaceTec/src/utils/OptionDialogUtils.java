/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;

import java.awt.Dimension;
import java.awt.Font;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.plaf.FontUIResource;

/**
 *
 * @author Breno
 */
public class OptionDialogUtils {
    public static int showOptionDialog (String title, String text){
     Object[] options = {"Confirm", "Cancel"};
        UIManager.put("OptionPane.minimumSize", new Dimension(500, 100));
        //UIManager.getDefaults().put("OptionPane.background", new Color(190, 255, 255));
        //UIManager.put("Panel.background", new Color(190, 255, 255));
        UIManager.put("OptionPane.messageFont", new FontUIResource(new Font(
                "Arial", Font.BOLD, 18)));

        return JOptionPane.showOptionDialog(null, text, title, JOptionPane.DEFAULT_OPTION, 
                JOptionPane.QUESTION_MESSAGE, null, options, options[0]);}
}
