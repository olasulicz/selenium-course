public class WhileLoop {

    public static void main(String[] args) {

//        int number = 21;
//        while (number < 20) { // pętla zostaje przerwana jak warunek w srodku bedzie false
//            System.out.println("Moja wartość to: " + number + " i jestem mniejsza od 20");
//            number++; //bez tego bylaby pętla nieskończona
//        }

        int numer = 21;
        do {
            System.out.println("Moja wartość to: " + numer + " i jestem mniejsza od 20");
            numer++; // najpierw wykonuje blok kodu a poźniej sprawdza warunek, dlatego program zwroci
        } while (numer < 20); // "Moja wartość to: 21 i jestem mniejsza od 20"
    }
}
