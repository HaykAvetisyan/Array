package ArrayUtil;

public class ArrayUtil {
    public static void main(String[] args) {
        int[] array = {-14, -1, -55, -3, -5, -6, -7, -9, -8};

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

        System.out.println("-----------------");
        int max = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i] > max ) {
                max = array[i];
            }
        }
        System.out.println("ամենամեծ էլեմենտը " + max);


        System.out.println("------------------");

        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        System.out.println("ամենափոքր էլեմենտը" + min);

        System.out.println("------------------");

        int countOfEven = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                System.out.println(array[i]);
                countOfEven++;
            }
        }
        System.out.println("զույգերի քանակը " + countOfEven);

        System.out.println("------------------");

        int countOfOdd = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                System.out.println(array[i]);
                countOfOdd++;
            }
        }
        System.out.println("կենտերի քանակը " + countOfOdd);

        System.out.println("------------------");

        int sum = 0;
        double mean;
        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];
        }
        mean = (double) sum / array.length;
        System.out.println("միջին թվաբանականը " + mean);
        System.out.println("էլեմենտների գումարը " + sum);

        System.out.println("------------------");


    }
}
