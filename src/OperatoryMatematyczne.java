public class OperatoryMatematyczne {

    public static void main(String[] args) {

        int firstNumber = 4;
        int secondNumber = 6;
        float thirdNumber = 4.0F;

        int addition = firstNumber + secondNumber;
        int subtraction = firstNumber - secondNumber;
        int multiplication = firstNumber * secondNumber;
        int firstDivision = firstNumber/secondNumber;
        float  secondDivision = secondNumber/thirdNumber;
        int mod = secondNumber%firstNumber; // 4 mieści się w 6 - 2

        System.out.println("Dodawanie: " + addition);
        System.out.println("Dzielenie: " + secondDivision);
        System.out.println("Modulo: " + mod);

        firstNumber+=secondNumber; // firstNumber = firstNumber + secondNumber
        System.out.println("Po dodaniu: " + firstNumber);
        firstNumber-=secondNumber; // firstNumber = firstNumber - secondNumber itp. dla kaźdego z operatowów
        System.out.println("Po odejmowaniu: " + firstNumber);
    }
}
