package Arrays.easy;

import java.util.Arrays;

public class RotateByK {
    static void main() {
        int[] arr={1,2,3,4,5,6,7};
        int k=3;
        RotatebyKLeft(arr,k);
        System.out.println(Arrays.toString(arr));
    }
    private static void RotatebyKright(int[] arr, int k) {
        int[] temp=new int[k];
        int n=arr.length;
        k=k%n;
        if(k==0) return;

        Reverse(arr,0,n-1);
        Reverse(arr,0,k-1);
        Reverse(arr,k,n-1);

    }
    private static void RotatebyKLeft(int[] arr,int k) {
        int n=arr.length;
        k=k%n;
        if(k==0) return;

        Reverse(arr,0,k-1);
        Reverse(arr,k,n-1);
        Reverse(arr,0,n-1);
    }

    private static void Reverse(int[] arr, int i, int n) {
        while(i<n){
            int temp=arr[i];
            arr[i]=arr[n];
            arr[n]=temp;
            i++;
            n--;
        }
    }

}
