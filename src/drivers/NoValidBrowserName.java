package drivers;

public class NoValidBrowserName extends Exception{ //lub RunTimeExceptions
    // wtedy nie musimy mowic ze nasza metoda wyrzuca wyjatek, nie wpisujemy throws NoValidBrowserName w WebDriverTest

    public NoValidBrowserName(String message){
        super(message);
    }
}
