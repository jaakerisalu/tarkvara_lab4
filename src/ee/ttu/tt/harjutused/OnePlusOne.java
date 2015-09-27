package ee.ttu.tt.harjutused;

import java.util.Arrays;

public class OnePlusOne
{
    public static int onePlusOne() {
        return 1 + 1;
    }

    public static int factorial(int n) {
        if(n <= 1) return 1;
        else return n * factorial(n - 1);
    }

    public static int sum(int[] array) {
        int sum = 0;
        for (int item : array) {
            if (item % 2 == 0 && item >= 0) sum += item;
        }
        return sum;
    }

    public static int[] sort(int[] array) {
        if (array.length == 0 || array.length == 1) return array;
        Arrays.sort(array);
        return array;
    }
}
