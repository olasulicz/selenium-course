public class PersonTest {

    public static void main(String[] args) {
        MathTeacher teacher = new MathTeacher("Tom", 29, "University");
        teacher.sayHello();
        teacher.teachMath();
        teacher.eat();
        teacher.walk();


        Footballer footballer = new Footballer("Mike", 21, "Manchester");
        footballer.sayHello();
        footballer.playFootball();
        footballer.walk();
        footballer.eat();


    }
}
