public class Student {

    public String name;
    public String surname;
    public String nick;
    public String email;
    public int indeksNumber;

    public void introduceYourself() {
        System.out.println("My name is " + name + surname);
    }

    public void login() {
        System.out.println("I'm logging in " + nick);
    }

    public void giveIndeksNumber() {
        System.out.println("My indeks number is " + indeksNumber);
    }

    public void giveEmail() {
        System.out.println("My email is " + email);
    }
}
