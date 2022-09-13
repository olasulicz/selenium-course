package exceptions;

import java.util.Scanner;

public class ExceptionsCheck {

    public static void main(String[] args) throws InvalidAgeException {

        Scanner scanner = new Scanner(System.in);
        System.out.println("How old are you?");
        int age = scanner.nextInt();
        if(age<=0){
            throw new InvalidAgeException("Your age is not valid");
        }
        if(age >= 18) {
            System.out.println("You are an adult!");
        } else {
            System.out.println("You are not an adult!");
        }

    }
}