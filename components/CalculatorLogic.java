package components;

public class CalculatorLogic {
    private double result = 0;
    private String lastCommand = "=";
    private boolean start = true;

    public boolean isStart() {
        return start;
    }

    public void setStart(boolean start) {
        this.start = start;
    }

    public String getLastCommand() {
        return lastCommand;
    }

    public void setLastCommand(String command) {
        this.lastCommand = command;
    }

    public void clear() {
        start = true;
        result = 0;
        lastCommand = "=";
    }

    public String calculate(String input) {
        double x = Double.parseDouble(input);
        switch (lastCommand) {
            case "+": result += x; break;
            case "-": result -= x; break;
            case "*": result *= x; break;
            case "/": result /= x; break;
            case "=": result = x; break;
        }
        return String.valueOf(result);
    }
} 