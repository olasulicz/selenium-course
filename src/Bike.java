public class Bike implements Vehicle{

    @Override
    public void run(int speed) {
        System.out.println("Bike's speed is " + speed);
    }

    @Override
    public void stop() {
        System.out.println("BIKE STOP!");
    }

    @Override
    public String info() {
        return "Bike";
    }

    public void refuel(){
        System.out.println("I need to eat!");
    }


}
