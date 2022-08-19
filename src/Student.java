public class Student {

    public String name;
    public String surname;
    public String nick;
    public String email;
    public int indeksNumber;
    public static String nazwaUczelni = "UJ";

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

    public static void infoUczelnia() {
        //System.out.println("My name is " + name + surname); - nie moge sie odwolac w metodzie statycznej
        // do pol niestatycznych
        System.out.println("Moja uczelnia to " + nazwaUczelni);
        druga(); //tutaj sie moge odwołać, bo metoda jest statyczna
    }

    public static void druga(){
        System.out.println("Jestem drugą metodą");
    }
}
