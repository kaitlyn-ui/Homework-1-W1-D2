//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Arrays;

public class mergeTwoArrays {

    public static int[] merge(int[] array1, int[] array2) {

        int[] tempArray = new int[array1.length + array2.length];
        int i = 0, j = 0, k = 0;


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
        while (j < array1.length) {
            tempArray[i] = array1[j];
            i++;
            j++;
        }

        while (k < array2.length) {
            tempArray[i] = array2[k];
            i++;
            k++;
        }
        return tempArray;
    }
}

