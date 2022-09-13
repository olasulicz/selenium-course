import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class CheckedExceptions {

    public static void main(String[] args) {
        try {
            System.out.println("Before reading file");
            readFile("/src/sdd.txt");
            System.out.println("Closing file");
        } catch (FileNotFoundException e) { //nie chcemy zeby program sie zatrzymal,
            // tylko chcemy zdefiniowac co zrobic jak wyjatek zostanie wyrzucony
            System.out.println("Wyjatek zostal wyrzucony");
            System.out.println(e.getMessage());
            //throw new RuntimeException(e);
        }

        try {
            System.out.println("Before reading file");
            readFile("/Users/aleksandrasulicz/IdeaProjects/SeleniumCourse/src/test.txt");
            System.out.println("Closing file");
        } catch (FileNotFoundException e) {
            System.out.println("Wyjatek zostal wyrzucony");
            System.out.println(e.getMessage());
        }

        try {
            System.out.println("Before reading file");
            readFile("/Users/aleksandrasulicz/IdeaProjects/SeleniumCourse/src/test.txt");
        } catch (FileNotFoundException e) {
            System.out.println("Wyjatek zostal wyrzucony");
            System.out.println(e.getMessage());
        } finally { // wykonuje sie bezwzgledu na to czy wyjatek zostal wyrzucony czy nie
            System.out.println("Closing file");
        }
    }
    public static void readFile(String path) throws FileNotFoundException {
        FileInputStream fileInputStream = new FileInputStream(path); // wyjatek checked: FileNotFoundException
    }
}
