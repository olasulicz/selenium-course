import drivers.ChromeDriver;
import drivers.FireFoxDriver;
import drivers.WebDriver;

public class ExceptionsExample {

    public static void main(String[] args) {

        int[] numbers = new int[2];
        numbers[0] = 1;
        numbers[1] = 3;


        for(int i = 0; i < numbers.length; i++){
            System.out.println(numbers[i]);
        }

        for(int i = 0; i <= numbers.length; i++){
            System.out.println(numbers[i]); // wyrzuci ArrayIndexOutOfBoundsException
        }

        WebDriver driver = getDriver("firefoxie"); // wyrzuci NullPointerException
        driver.get();
        driver.findElementBy();
        driver.findElementBy();
        driver.findElementBy();
        driver.findElementBy();
    }
    private static WebDriver getDriver(String name) {
        if (name.equals("chrome")) {
            return new ChromeDriver();
        } else if (name.equals("firefox")) {
            return new FireFoxDriver();
        }
        return null;
    }
}
