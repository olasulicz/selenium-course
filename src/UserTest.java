public class UserTest {

    public static void main(String[] args) {

//        User user = new User(); //tworzymy nowy obiekt klasy User, nasz konstruktor zostaje wykonany
        User user = new User("Ola", "qwerty");

//        user.username = "Ola";
//        user.password = "qwerty";
        System.out.println(user.username);
        System.out.println(user.password);
        user.sayHello();
    }
}
