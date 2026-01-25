package Arrays.easy;

import java.util.Arrays;

public class RemoveDuplicates {
    static void main() {
        int[] arr={0, 0, 3, 3, 5, 6};
        Remove(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void Remove(int[] arr) {
        int left = 0;
        int right = 1;
        while (right < arr.length) {
            if (arr[left] != arr[right]) {
                left++;
                arr[left] = arr[right];
            }
            right++;
        }
    }
}
