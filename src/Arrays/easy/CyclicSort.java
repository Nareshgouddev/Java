package Arrays.easy;


import java.util.Arrays;

public class CyclicSort {
    static void main() {
        int[] arr={2,5,1,4,3};
        Sort(arr);
        System.out.println(Arrays.toString(arr));
    }
    private static void Sort(int[] arr){
        int i=0;
        //why we ae not using for loop beacause i automatically incresing in it but we dont want that
        while (i<arr.length){
            int current=arr[i]-1;
            if(arr[i]!=arr[current]){
                Swap(arr,i,current);
            }
            else i++;
        }
    }

    public static void Swap(int[] arr, int i, int current) {
        int temp=arr[i];
        arr[i]=arr[current];
        arr[current]=temp;
    }
}
