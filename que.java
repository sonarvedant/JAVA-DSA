import java.util.Scanner;
public class que {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int x = sc.nextInt();
        System.out.print("Enter second number: ");
        int y = sc.nextInt();

        Calculator calc = new Calculator();
        System.out.println("\n--- Output ---");
        System.out.println("Addition: " + calc.add(x, y));
        System.out.println("Subtraction: " + calc.subtract(x, y));
        System.out.println("Multiplication: " + calc.multiply(x, y));
        System.out.println("Division: " + calc.divide(x, y));
    }
}
class Calculator {
    int add(int a, int b) {
        return a + b;
    }
    int subtract(int a, int b) {
        return a - b;
    }
    int multiply(int a, int b) {
        return a * b;
    }
    int divide(int a, int b) {
        return a / b;
    }
}