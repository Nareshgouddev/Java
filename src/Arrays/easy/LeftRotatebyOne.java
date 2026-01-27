package Arrays.easy;

import java.util.Arrays;

public class LeftRotatebyOne {
    static void main() {
        int[] arr={1, 2, 3, 4, 5};
        leftRotate1(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void leftRotate1(int[] arr) {
        int left=0;
        int temp=arr[left];
        for (int i = 1; i < arr.length; i++) {
            arr[left++]=arr[i];
        }
        arr[arr.length-1]=temp;
    }
}
