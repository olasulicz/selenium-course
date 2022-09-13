package drivers;

import drivers.WebDriver;

public class FireFoxDriver implements WebDriver {

    @Override
    public void get() {
        System.out.println("Otwieram przeglądarke Firefox");
    }

    @Override
    public void findElementBy() {
        System.out.println("Znajduję element w przeglądarce Firefox");
    }
}