import java.util.Arrays;

public class mergeTwoArrays {

    public static int[] merge(int[] array1, int[] array2) {

        //variables
        int[] tempArray = new int[array1.length + array2.length];
        int i = 0, j = 0, k = 0;


        //loop until indexes j,k reaches end of one or both arrays 
        while (j < array1.length && k < array2.length) {
            if (array1[j] < array2[k]) {
                tempArray[i] = array1[j];
                i++;
                j++;
            } else {
                tempArray[i] = array2[k];
                i++;
                k++;
            }
        }

        //cases for dealing with two different length arrays

        //if array1 has leftover elements when first loop ends, add rest of elements to end of array
        while (j < array1.length) {
            tempArray[i] = array1[j];
            i++;
            j++;
        }

        //if array2 has leftover elements when first loop ends, add rest of elements to end of array
        while (k < array2.length) {
            tempArray[i] = array2[k];
            i++;
            k++;
        }
        return tempArray; //return merged, sorted array
    }
}

