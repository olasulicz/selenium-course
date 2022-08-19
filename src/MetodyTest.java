public class MetodyTest {

    public static void main(String[] args) {
        Metody metody = new Metody();
        metody.policzWynik();
        int result = metody.pobierzWynik(); //przypisujemy do zmiennej
        int result2 = result * 2;
        System.out.println("Rezultat przed mnożeniem: " + result);
        System.out.println("Rezultat po mnożeniu: " + result2);
        metody.pobierzWynikParam(2);

        System.out.println(metody.add(2,3));
        int newResult = metody.add(3,3);
        System.out.println(newResult);
    }
}
