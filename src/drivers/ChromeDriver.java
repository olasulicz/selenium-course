package drivers;

import drivers.WebDriver;

public class ChromeDriver implements WebDriver {

    @Override
    public void get() {
        System.out.println("Otwieram przeglądarke Chrome");
    }

    @Override
    public void findElementBy() {
        System.out.println("Znajduję element w przeglądarce Chrome");

    }
}

