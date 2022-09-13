package identifieres.second;

import identifieres.first.Parent;

public class Child extends Parent {

    //klasa potomna w tej innej paczce nie ma dostępu do
    // pol/metod private i do pol/metod domyslnych czyli bez identyfikatora

    public void testIdentifier() {
        System.out.println(first);
        //System.out.println(second);
        System.out.println(third);
        //System.out.println(fourth); // pole prywatne
        firstMethod();
        //secondMethod();
        thirdMethod();
        //fourthMethod(); // metoda prywatna
    }
}
