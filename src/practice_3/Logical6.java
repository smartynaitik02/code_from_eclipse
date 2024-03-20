package practice_3;

import java.util.Arrays;

public class Logical6 {

    public static void main(String[] args) {
        int arr[] = {1, 5, 6, 0, 9, 8, 0, 5};
        int len = arr.length;
        int index_num = 0;
        int new_arr[] = new int[len];

        // Remove zeros and copy non-zero elements to new_arr
        for (int element : arr) {
            if (element != 0) {
                new_arr[index_num] = element;
                index_num++;
            }
        }

        // Reverse the array
        int rev[] = new int[len];
        for (int i = index_num - 1, j = 0; i >= 0; i--, j++) {
            rev[j] = new_arr[i];
        }

        System.out.println(Arrays.toString(rev));

	}

}
