public class ReadOnly {

    private String name = "Ola";

    public String getName(){
        // return name + "jest ok";
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    //wygenerowanie automatyczne command + n
}
