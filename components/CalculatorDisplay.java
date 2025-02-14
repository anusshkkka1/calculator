package components;

import javax.swing.*;
import java.awt.*;

public class CalculatorDisplay extends JTextField {
    
    public CalculatorDisplay() {
        super("0");
        setupDisplay();
    }
    
    private void setupDisplay() {
        setEditable(false);
        setHorizontalAlignment(JTextField.RIGHT);
        setFont(new Font("Arial", Font.PLAIN, 24));
        setBackground(new Color(230, 230, 230));
    }
    
    public void updateDisplay(String value) {
        setText(value);
    }
    
    public String getDisplayValue() {
        return getText();
    }
} 