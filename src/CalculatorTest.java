import java.util.Scanner;

public class CalculatorTest {

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


        System.out.println("Teraz wypisuje metody: ");

        Calculator calculator = new Calculator();

        System.out.println("Sum of those numbers is: " + calculator.addition(2,2));
        System.out.println("Subtraction of those numbers is: " + calculator.subtraction(2,2));
        System.out.println("Multiplication of those numbers is: " + calculator.multiplication(2,2));
        System.out.println("Division of those numbers is: " + calculator.division(2,2));
        System.out.println("Modulo of those numbers is: " + calculator.mod(2,2));
    }

}