public class App {

    public String name;

    public App (String name){ //insert = command + n
        this.name = name;
    }

    public void appInfo(){
        System.out.println("Running app with name " + name);
    }
}
