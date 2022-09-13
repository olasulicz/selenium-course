public class Truck implements Vehicle{
    @Override
    public void run(int speed) {
        System.out.println("Truck's speed is " + speed);
    }

    @Override
    public void stop() {
        System.out.println("TRUCK STOP!");

    }

    @Override
    public String info() {
        return "Truck";
    }
}
