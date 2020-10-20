package utils;

import javax.swing.*;
import javax.swing.plaf.FontUIResource;
import java.awt.*;

// Set window with 'Confirm' or 'Cancel' dialog box, to verify user actions
public class OptionDialogUtils {
    public static int showOptionDialog(String title, String text) {
        Object[] options = {"Confirm", "Cancel"};
        UIManager.put("OptionPane.minimumSize", new Dimension(500, 100));
        UIManager.put("OptionPane.messageFont", new FontUIResource(new Font(
                "Arial", Font.BOLD, 18)));

        return JOptionPane.showOptionDialog(null, text, title, JOptionPane.DEFAULT_OPTION,
                JOptionPane.QUESTION_MESSAGE, null, options, options[0]);
    }
}
