public class StudentChecker {

    public static void main(String[] args) {

        String uczelnia = Student.nazwaUczelni;
        Student.infoUczelnia();

        Student pierwszyStudent = new Student();
        pierwszyStudent.email = "anna@gmail.com";
        pierwszyStudent.indeksNumber = 1234;
        pierwszyStudent.name = "Anna";
        pierwszyStudent.surname = "Kowalska";
        pierwszyStudent.nick = "AnnaK";
        String uczelniaPierwszegoStudenta = pierwszyStudent.nazwaUczelni;
        pierwszyStudent.infoUczelnia();// wywołanie metody statycznej - nie rekomendowany sposob

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

        Student[] studenci = new Student[3];
        studenci[0] = pierwszyStudent;
        studenci[1] = drugiStudent;
        studenci[2] = trzeciStudent;

        for (int i = 0; i < studenci.length; i++){
            studenci[i].introduceYourself();
            studenci[i].giveIndeksNumber();
            studenci[i].giveEmail();
            studenci[i].login();
        }
    }
}
