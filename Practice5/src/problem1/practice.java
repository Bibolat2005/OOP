package problem1;

import java.util.*;

public class practice {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        while (true) {
            System.out.print("Enter an expression (or type 'exit' to quit): ");
            String input = in.nextLine();

            if (input.equalsIgnoreCase("exit")) {
                break; // Exit the loop if the user types 'exit'
            }

            StringTokenizer tokenizer = new StringTokenizer(input, "+-*/", true);
            double leftOperand, result = Double.NaN, rightOperand;
            String leftString, operator, rightString;

            try {
                leftString = tokenizer.nextToken();
                operator = tokenizer.nextToken();
                rightString = tokenizer.nextToken();

                leftOperand = Double.parseDouble(leftString);
                rightOperand = Double.parseDouble(rightString);

                if (operator.equals("+")) {
                    result = leftOperand + rightOperand;
                } else if (operator.equals("-")) {
                    result = leftOperand - rightOperand;
                } else if (operator.equals("*")) {
                    result = leftOperand * rightOperand;
                } else if (operator.equals("/")) {
                    if (rightOperand != 0) {
                        result = leftOperand / rightOperand;
                    } else {
                        System.out.println("Division by zero is not allowed");
                    }
                } else {
                    System.out.println("Invalid operator: " + operator);
                }
            } catch (NoSuchElementException nsee) {
                System.out.println("Invalid syntax");
            } catch (NumberFormatException nfe) {
                System.out.println("One or more operands are not numbers");
            }

            if (!Double.isNaN(result)) {
                System.out.println("Result: " + result);
            }
        }

        in.close();
    }
}
