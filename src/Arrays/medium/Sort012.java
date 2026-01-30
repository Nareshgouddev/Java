package Arrays.medium;

import java.util.Arrays;

public class Sort012 {
    static void main() {
        int arr[]={1, 0, 2, 1, 2,0,0};
        Sort1(arr);
        System.out.println(Arrays.toString(arr));
    }
//better approach  tc=O(2n)
    private static void Sort(int[] arr) {
        int cnt0=0;int cnt1=0,cnt2=0;
        for(int i=0;i< arr.length;i++){
            if(arr[i]==0) cnt0++;
            else if(arr[i]==1) cnt1++;
            else cnt2++;
        }
        for(int i=0;i<cnt0;i++){
            arr[i]=0;
        }
        for(int i=cnt0;i<cnt1+cnt0;i++){
            arr[i]=1;
        }
        for (int i = cnt1+cnt0; i <arr.length ; i++) {
            arr[i]=2;
        }
    }
    private static void Sort1(int[] arr){
        int left=0,mid=0;int right= arr.length-1;
        while(mid<=right){
            if(arr[mid]==0){
                Swap(arr,left,mid);
                left++;
                mid++;
            } else if (arr[mid]==1) {
                mid++;
            }
            else{
                Swap(arr,mid,right);
                right--;
            }
        }
    }

    private static void Swap(int[] arr, int mid, int right) {
        int temp=arr[mid];
        arr[mid]=arr[right];
        arr[right]=temp;

    }
}
