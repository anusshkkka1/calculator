package components;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class CalculatorButtonPanel extends JPanel {
    private static final String[] BUTTON_LABELS = {
        "7", "8", "9", "/",
        "4", "5", "6", "*",
        "1", "2", "3", "-",
        "0", ".", "=", "+",
        "C"
    };

    public CalculatorButtonPanel(ActionListener numberListener, 
                               ActionListener operatorListener, 
                               ActionListener clearListener) {
        setupPanel();
        createButtons(numberListener, operatorListener, clearListener);
    }

    private void setupPanel() {
        setLayout(new GridLayout(5, 4, 5, 5));
        setBackground(new Color(240, 240, 240));
    }

    private void createButtons(ActionListener numberListener, 
                             ActionListener operatorListener, 
                             ActionListener clearListener) {
        for (String label : BUTTON_LABELS) {
            JButton button = new JButton(label);
            button.setFont(new Font("Arial", Font.PLAIN, 18));
            
            if (label.matches("[0-9.]")) {
                button.addActionListener(numberListener);
            } else if (label.equals("C")) {
                button.addActionListener(clearListener);
            } else {
                button.addActionListener(operatorListener);
            }
            
            add(button);
        }
    }
} 