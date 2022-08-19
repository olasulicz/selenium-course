public class Metody {

    public void policzWynik() {
        System.out.println("Zaraz policze wynik");
        int result = 0;
        for (int i = 0; i < 100; i++) {
            result = result + i;
        }
        System.out.println("Rezultat to: " + result);
    }

    public int pobierzWynik() {
        int result = 0;
        for (int i = 0; i < 100; i++) {
            result = result + i;
        }
        return result;
    }

    public int pobierzWynikParam(int number) {
        System.out.println("Number ma wartość: " + number);
        int result = 0;
        for (int i = 0; i < number; i++) {
            result = result + i;
        }
        return result;
    }

    public int add(int firstNumber, int secondNumber) {
        return firstNumber+secondNumber;
    }
}

