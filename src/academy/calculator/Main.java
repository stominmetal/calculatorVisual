package academy.calculator;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Main class
 * @author izosa
 */
public class Main {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        Double result;
        String condition;
        Double a;
        Double b;
        
        condition = Main.getInput("Въведете операцията която искате да извършите ( + , - , * , / ) :").trim();
        a = Double.parseDouble(Main.getInput("Въведете първото число:").trim());
        b = Double.parseDouble(Main.getInput("Въведете второто число:").trim());
        

        switch(condition){
            case "+" : result = calculator.addition(a, b);
                break;
            case "-" : result = calculator.subtraction(a, b);
                break;
            case "*" : result = calculator.multiplication(a, b);
                break;
            case "/" : result = calculator.division(a, b);
                break;
            default : result = calculator.addition(a, b); 
            System.out.println("-––––––––––––––––––––––––––––––––––––––––––––––––");
            System.out.println("!!! Операцията която искате да изпълните не се подържа !!!");
            System.out.println("    По подразбиране ще бъде извършено събиране.");
                break;
        }
        
        System.out.println("-––––––––––––––––––––––––––––––––––––––––––––––––");
        System.out.println("           –––= Резултата е: " + result + " =---");
        System.out.println("-––––––––––––––––––––––––––––––––––––––––––––––––");

    }
    
    /**
     * Read data from console
     * @param prompt
     * @return 
     */
    private static String getInput(String prompt) {
        BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));

        System.out.print(prompt);
        System.out.flush();

        try {
            return stdin.readLine();
        } catch (Exception e) {
            return "Error: " + e.getMessage();
        }
    }
    
}
