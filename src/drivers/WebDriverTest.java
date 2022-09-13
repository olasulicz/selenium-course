package drivers;

public class WebDriverTest {

    public static void main(String[] args) throws NoValidBrowserName {

        WebDriver driver = getDriver("firefoxie");
        driver.get();
        driver.findElementBy();
        driver.findElementBy();
        driver.findElementBy();
        driver.findElementBy();

//        Rozwiązanie bez użycia polimorfizmu:
//        WebDriver firefoxDriver = new FireFoxDriver();
//        firefoxDriver.get();
//        firefoxDriver.findElementBy()
    }

    private static WebDriver getDriver(String name) throws NoValidBrowserName {
        if (name.equals("chrome")) {
            return new ChromeDriver();
        } else if (name.equals("firefox")) {
            return new FireFoxDriver();
        }
        throw new NoValidBrowserName("No valid browser name"); // albo jak usuniemy throws NoValidBrowserName to mozemy
        // uzyc try/catcha, wtedy wyjatek zostanie stlamszony przez te metode i nie przecisnie sie dalej do metody glownej
    }
}