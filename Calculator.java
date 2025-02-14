import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import components.*;

public class Calculator extends JFrame {
    private CalculatorDisplay display;
    private CalculatorLogic logic;

    public Calculator() {
        logic = new CalculatorLogic();
        initializeUI();
    }

    private void initializeUI() {
        setTitle("Calculator");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        // Create and add display
        display = new CalculatorDisplay();
        add(display, BorderLayout.NORTH);

        // Create and add button panel
        CalculatorButtonPanel buttonPanel = new CalculatorButtonPanel(
            new NumberListener(),
            new OperatorListener(),
            e -> {
                logic.clear();
                display.updateDisplay("0");
            }
        );
        add(buttonPanel, BorderLayout.CENTER);
        
        // Set window properties
        setSize(300, 400);
        setLocationRelativeTo(null);
    }

    private class NumberListener implements ActionListener {
        public void actionPerformed(ActionEvent event) {
            String digit = event.getActionCommand();
            if (logic.isStart()) {
                display.updateDisplay(digit);
                logic.setStart(false);
            } else {
                display.updateDisplay(display.getDisplayValue() + digit);
            }
        }
    }

    private class OperatorListener implements ActionListener {
        public void actionPerformed(ActionEvent event) {
            if (!logic.isStart()) {
                String result = logic.calculate(display.getDisplayValue());
                display.updateDisplay(result);
                logic.setLastCommand(event.getActionCommand());
                logic.setStart(true);
            }
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            Calculator calc = new Calculator();
            calc.setVisible(true);
        });
    }
} 