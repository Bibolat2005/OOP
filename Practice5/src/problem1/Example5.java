package problem1;

import java.util.*;

public class Example5 {
    public static void main(String[] args) {
        double leftOperand, result = 0, rightOperand;
        String leftString, operator, rightString;
        StringTokenizer tokenizer;
        Scanner in = new Scanner(System.in);

        while (true) {
            System.out.print("Enter the operations: ");
            String input = in.nextLine();

            if (input.equals("exit")) {
                break;
            }

            tokenizer = new StringTokenizer(input, "+-*/", true);

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
                        //in.close();
                        continue;
                        //return;
                    }
                }

                System.out.println("Result: " + result);
            } catch (NoSuchElementException nsee) {
                System.out.println("Invalid syntax");
            } catch (NumberFormatException nfe) {
                System.out.println("One or more operands are not numbers");
            }
        }

        in.close();
    }
}
