public class AutoTest {

    public static void main(String[] args) {

        Auto mercedesOld = new Auto();
        mercedesOld.marka = "Mercedes"; // marka to pole
        mercedesOld.model = "Klasa S";
        mercedesOld.rokProdukcji = 2021;
        mercedesOld.przebieg = 1000;

        mercedesOld.jedz();
        mercedesOld.hamuj();
        mercedesOld.info();

        Auto audiOld = new Auto();
        audiOld.marka = "Audi";
        audiOld.model = "A5";
        audiOld.rokProdukcji = 2020;
        audiOld.przebieg = 0;

        audiOld.jedz();
        audiOld.hamuj();
        audiOld.info();

        Auto noNameOld = new Auto();

        noNameOld.jedz();
        noNameOld.hamuj();
        noNameOld.info();

        Auto mercedes = new Auto("Mercedes", "Klasa S", 2021, 1000);
        mercedes.jedz();
        Auto audi = new Auto("Audi", "A5", 2020, 0);
        audi.jedz();
        Auto noName = new Auto (null, null, 1,1);
        noName.jedz();


    }
}
