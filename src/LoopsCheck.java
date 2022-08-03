public class LoopsCheck {

    public static void main(String[] args) {

        int numebr = 100;
        for (int i = 1; i <=100; i++){
            if(i % 3 == 0){
                System.out.println(i);
            }
        }

        int[] numbers = new int[]{1,3,5,7,0};

        for (int i = 0; i < (numbers.length/2); i++){
            int temp = numbers[i]; // dla i=0 -> indeks 0 == 1, i=1 -> 3
            numbers[i] = numbers[numbers.length -1 -i]; // nadpisujemy pierwszy element tablicy ostatnią wartością tablicy
            numbers[numbers.length -1 -i] = temp; // 1
        }

        for (int i=0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
    }
}
