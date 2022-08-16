public class StudentChecker {

    public static void main(String[] args) {

        Student pierwszyStudent = new Student();
        pierwszyStudent.email = "anna@gmail.com";
        pierwszyStudent.indeksNumber = 1234;
        pierwszyStudent.name = "Anna";
        pierwszyStudent.surname = "Kowalska";
        pierwszyStudent.nick = "AnnaK";

        Student drugiStudent = new Student();
        drugiStudent.email = "kasia@gmail.com";
        drugiStudent.indeksNumber = 4321;
        drugiStudent.name = "Katarzyba";
        drugiStudent.surname = "Grzyb";
        drugiStudent.nick = "KasiaG";

        Student trzeciStudent = new Student();
        trzeciStudent.email = "janek@gmail.com";
        trzeciStudent.indeksNumber = 5678;
        trzeciStudent.name = "Jan";
        trzeciStudent.surname = "Kwiatek";
        trzeciStudent.nick = "JanK";

        Student[] Studenci = new Student[3];
        Studenci[0] = pierwszyStudent;
        Studenci[1] = drugiStudent;
        Studenci[2] = trzeciStudent;

        for (int i = 0; i < Studenci.length; i++){
            Studenci[i].introduceYourself();
            Studenci[i].giveIndeksNumber();
            Studenci[i].giveEmail();
            Studenci[i].login();

        }
    }
}
