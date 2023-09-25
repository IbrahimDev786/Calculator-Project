import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter the first number of your calculation: ");
        double num1 = scanner.nextDouble();
        System.out.print("\nNext, please enter the operation - addition (+), subtraction(-), multiplication(*) or division(/): ");
        char operator = scanner.next().charAt(0);
        System.out.print("\nLastly, please enter the second number of your calculation: ");
        double num2 = scanner.nextDouble();

        double result = 0.0;

        switch (operator) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '%':
                result = num1 % num2;
                break;
            case '/':
                if (num2 != 0) {
                    result = num1 / num2;
                }else{
                    System.out.println("\nERROR: Number cannot be divisable by 0");
                    return;}
                break;

            default:
                System.out.println("\nERROR: Please type valid numbers and operation.");
                return;
        }

        System.out.println("\nResult: " + result);
    }
}







