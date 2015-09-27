package ee.ttu.tt.harjutused;

import static org.junit.Assert.*;

import org.junit.Test;

public class OnePlusOneTest
{
    @Test
    public void testOnePlusOne() {
        assertEquals("Result is different then expected", 2, OnePlusOne.onePlusOne());
    }

    @Test
    public void oneFactorial() {
        assertEquals("Factorial of 1 must be 1", 1, OnePlusOne.factorial(1));
    }

    @Test
    public void twoFactorial() {
        assertEquals("Factorial of 2 must be 2", 2, OnePlusOne.factorial(2));
    }

    @Test
    public void threeFactorial() {
        assertEquals("Factorial of 3 must be 6", 6, OnePlusOne.factorial(3));
    }

    @Test
    public void singleEvenNum() {
        assertEquals("Sum of 2 must be 2", 2, OnePlusOne.sum(new int[] {2}));
    }

    @Test
    public void multipleEvenNum() {
        assertEquals("Sum of 2, 4, 6 must be 12", 12, OnePlusOne.sum(new int[] {2, 4, 6}));
    }

    @Test
    public void ignoreNegativeNum() {
        assertEquals("Sum of -2, 6 must be 6", 6, OnePlusOne.sum(new int[] {-2, 6}));
    }

    @Test
    public void ignoreUnevenNum() {
        assertEquals("Sum of 1, 3, 4 must be 4", 4, OnePlusOne.sum(new int[] {1, 3, 4}));
    }

    @Test
    public void ignoreUnevenAndNegativeNum() {
        assertEquals("Sum of -1, 1, 2, -3, 4 must be 6", 6, OnePlusOne.sum(new int[] {1, 1, 2, -11, 4}));
    }

    @Test
    public void emptyArraySort() {
        assertArrayEquals("Sorted empty array is {}", new int[] {}, OnePlusOne.sort(new int[] {}));
    }

    @Test
    public void singleArraySort() {
        assertArrayEquals("Sorted {0} is {0}", new int[] {0}, OnePlusOne.sort(new int[] {0}));
    }

    @Test
    public void doubleUnsortedArraySort() {
        assertArrayEquals("Unsorted {17, 16} is {16, 17}", new int[] {16, 17}, OnePlusOne.sort(new int[] {17, 16}));
    }

    @Test
    public void doubleSortedArraySort() {
        assertArrayEquals("Sorted {1, 11} is {1, 11}", new int[] {1, 11}, OnePlusOne.sort(new int[] {1, 11}));
    }

    @Test
    public void tripleUnsortedArraySort() {
        assertArrayEquals("Unsorted {111, 1, 11} is {1, 11, 111}", new int[] {1, 11, 111}, OnePlusOne.sort(new int[] {111, 1, 11}));
    }

    @Test
    public void tripleSortedArraySort() {
        assertArrayEquals("Sorted {1,51,123} is {1,51,123}", new int[] {1,51,123}, OnePlusOne.sort(new int[] {1,51,123}));
    }


    @Test
    public void lenghtyUnsortedArraySort() {
        assertArrayEquals("Unsorted {2,6,7,1,5,4,3,9,8} is {1,2,3,4,5,6,7,8,9}", new int[] {1,2,3,4,5,6,7,8,9}, OnePlusOne.sort(new int[] {2,6,7,1,5,4,3,9,8}));
    }
}
