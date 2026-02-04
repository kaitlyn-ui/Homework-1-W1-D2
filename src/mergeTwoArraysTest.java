import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class mergeTwoArraysTest {

    @Test
    void testSortOddEven(){
        //same size array
        int[] array1 = {1,3,5};
        int[] array2 = {2,4,6};

        int[] expected = {1,2,3,4,5,6};
        mergeTwoArrays mergeTwo = new mergeTwoArrays();
        int[] actual = mergeTwo.merge(array1,array2);

        assertArrayEquals(expected, actual, "Should return sorted array");
    }

    @Test
    void testSortLeftBigger(){
        //left array bigger
        int[] array3 = {1,3,4,4,6,8};
        int[] array4 = {5,5,7,9};

        int[] expected = {1,3,4,4,5,5,6,7,8,9};
        mergeTwoArrays mergeTwo = new mergeTwoArrays();
        int[] actual = mergeTwo.merge(array3,array4);

        assertArrayEquals(expected, actual, "Should return sorted array");
    }

    @Test
    void testSortRightBigger(){
        //right array bigger
        int[] array5 = {6,7,8,9};
        int[] array6 = {1,2,3,6,7,8};

        int[] expected = {1,2,3,6,6,7,7,8,8,9};
        mergeTwoArrays mergeTwo = new mergeTwoArrays();
        int[] actual = mergeTwo.merge(array5,array6);

        assertArrayEquals(expected, actual, "Should return sorted array");
    }

    @Test
    void testEmptyArrays(){
        int[] array7 = {};
        int[] array8 = {5,6};

        int[] expected = {5,6};
        mergeTwoArrays mergeTwo = new mergeTwoArrays();
        int[] actual = mergeTwo.merge(array7,array8);

        assertArrayEquals(expected, actual, "Should return sorted array");
    }

}