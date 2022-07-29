import java.util.HashMap;

public class Maps {

    public static void main(String[] args) {

        HashMap<String, Integer> empIds = new HashMap<>();

        empIds.put("John", 12345);
        empIds.put("Anna", 54321);
        empIds.put("Bob", 56789);
        empIds.put("Janice", 98765);

        System.out.println(empIds);

        System.out.println(empIds.get("Anna"));

        System.out.println(empIds.containsKey("Carl"));

        System.out.println(empIds.containsValue(12345));

        empIds.put("John", 99876);
        System.out.println(empIds);

        empIds.replace("Caren", 77777);

        empIds.putIfAbsent("Steve", 22222);
        System.out.println(empIds);
    }
}
