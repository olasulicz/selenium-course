package animials;

public class Dog extends Animal{
    @Override
    public void sound() {
        sayHello();
        System.out.println("Hau!");
        System.out.println("Number of legs: " + legs);
    }
}
