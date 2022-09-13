public class FinalTest {

    public static void main(String[] args) {
        // pola typu final sa niezmienne, nie da sie nadpisac ich wartosci
        // w klasach potomnych nie mozemy nadpisac metod ktore sa final w klasie pierwotnej
        // nie mozemy dziedziczyc po klasie ktora jest final

        final int x = 2;
        //x =5;

        final Person person = new Person("Tim", 26);
        person.age = 25;

        //person = new Person("Tom", 22);
    }
}
