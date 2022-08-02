import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj pierwszą liczbę: ");
        int firstNumber = scanner.nextInt();
        System.out.println("Podaj drugę liczę: ");
        int secondNumber = scanner.nextInt();

        int addition = firstNumber + secondNumber;
        int subtraction = firstNumber - secondNumber;
        int multiplication = firstNumber * secondNumber;
        int division = firstNumber/secondNumber;
        int mod = secondNumber%firstNumber;

        System.out.println("Sum of those numbers is: " + addition);
        System.out.println("Subtraction of those numbers is: " + subtraction);
        System.out.println("Multiplication of those numbers is: " + multiplication);
        System.out.println("Division of those numbers is: " + division);
        System.out.println("Modulo of those numbers is: " + mod);
    }

}