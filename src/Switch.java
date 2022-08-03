public class Switch {

    public static void main(String[] args) {

        String danie = "Łosoś";

        switch (danie) {
            case "Pizza":
                System.out.println("Cena to 22 zl");
                break;
            case "Łosoś":
                System.out.println("Cena to 30 zł");
                break;
            default:
                System.out.println("Brak dania w karcie");
        }
    }
}
