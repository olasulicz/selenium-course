public class Tablice {

    public static void main(String[] args) {

        String[] winterMonths = new String[3];
        winterMonths[0] = "grudzień";
        winterMonths[1] = "styczeń";
        winterMonths[2] = "luty";

        System.out.println(winterMonths[0]);

        int[] lottoNumbers = new int[]{1, 2, 3, 4, 5, 6};
        System.out.println(lottoNumbers[0]);
        System.out.println(lottoNumbers[1]);
        System.out.println(lottoNumbers[2]);

        System.out.println(lottoNumbers.length);

        for (int i = 0; i < lottoNumbers.length; i++) {
        System.out.println(lottoNumbers[i]);
        }
    }
}
