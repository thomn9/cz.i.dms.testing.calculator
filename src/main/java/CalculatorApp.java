import java.util.Scanner;

public class CalculatorApp {

    public static void main(String[] args) {

        boolean isCalculatorRequired = true;
        Scanner userInput = new Scanner(System.in);
        while (isCalculatorRequired) {
            System.out.println(
                    "Zadejte požadovanou artimetickou operaci:\n" +
                            "+ : pro sčítání \n" +
                            "- : pro odčítání \n" +
                            "* : pro násobení \n" +
                            "/ : pro dělení \n"
            );
            String operator = userInput.nextLine();

            System.out.println("Zadejte první operand (pouze celé číslo):");
            int firstOperand = Integer.parseInt(userInput.nextLine().replace(',', '.'));

            System.out.println("Zadejte druhý operand (pouze celé číslo):");
            int secondOperand = Integer.parseInt(userInput.nextLine().replace(',', '.'));

            switch (operator){
                case "+": printResult(add(firstOperand,secondOperand));
                    break;
                case "-": printResult(subtract(firstOperand,secondOperand));
                    break;
                case "*": printResult(multiply(firstOperand,secondOperand));
                    break;
                case "/": printResult(divide(firstOperand,secondOperand));
                    break;
            }

            System.out.println("Chcete provést další operaci? \n"+
                    "y : ano \n" +
                    "n : ne \n"
            );

            String userDecisionToContinue = userInput.nextLine();
            while (!userDecisionToContinue.equals("n") && !userDecisionToContinue.equals("y")) {
                System.out.println("Já rozumět jen česky, zkuste to znovu\n"+
                        "y : ano \n" +
                        "n : ne \n");
                userDecisionToContinue = userInput.nextLine();
            }

            if (userDecisionToContinue.equals("n")) {
                isCalculatorRequired = false;
                System.out.println("Ukončuji program...");
            }

        }
    }

    private static void printResult (int result) {
        System.err.println(String.format("\nVýsledek je: %s\n", result));
    }

    private static int add (int firstOperand, int secondOperand) {
        return firstOperand + secondOperand;
    }

    private static int subtract(int firstOperand, int secondOperand) {
        return firstOperand - secondOperand;
    }

    private static int multiply (int firstOperand, int secondOperand) {
        return firstOperand * secondOperand;
    }

    private static int divide (int firstOperand, int secondOperand) {
        return firstOperand / secondOperand;
    }

}
