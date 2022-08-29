public class AppChecker {

    public static void main(String[] args) {

        AndroidApp android = new AndroidApp("Calculator");
        android.appInfo();
        android.runAndroidApp();

        IphoneApp iphone = new IphoneApp("Calculator");
        iphone.appInfo();
        iphone.runIphoneApp();
    }
}
