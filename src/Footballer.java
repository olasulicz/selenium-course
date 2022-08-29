public class Footballer extends Person {

    public String footballClub;

    public Footballer(String name, int age, String footballClub) {
        super(name, age); //wywoluje konstruktor klasy nadrzednej
        System.out.println("Jestem w konstruktorze Footballer");
        this.footballClub = footballClub;
    }

    public void playFootball(){
        System.out.println("I'm playing football for " + footballClub);
    }

    public void eat(){ //method overriding
        System.out.println("I like healthy food!");
    }
    public void sayHello(){
        System.out.println("Hello my name is " + name);
        System.out.println("I am " + age);
    }
}
