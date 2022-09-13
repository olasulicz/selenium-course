package animials;

public class Cat extends Animal{
    @Override
    public void sound() {
        sayHello();
        System.out.println("Miau!");
    }
}
