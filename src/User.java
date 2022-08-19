public class User {

    public String username;
    public String password;

    public User(){ //jak nie stworzymy konstruktora, to tak bedzie wygladal konstruktor domyslny

    }
    public User(String userename, String password){ //konstruktor
        System.out.println("Hello z konstruktora");
        this.username = userename;
        this.password = password;

    }

    public void sayHello(){
        System.out.println("Hello my name is " + username);
    }
}
