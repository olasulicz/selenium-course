public class ForLoop {

    public static void main(String[] args) {

        int number = 60;
        for (int i = 0; i <= number; i += 2){
            System.out.println(i);
        }

        for (int j = 0; j < 100; j++){
            if(j % 5 == 0) {
                System.out.println(j);
            }
        }

        for (int sth = 0; sth < 10; sth++) {
            System.out.println("Będę robił pracę domową");
        }
    }
}