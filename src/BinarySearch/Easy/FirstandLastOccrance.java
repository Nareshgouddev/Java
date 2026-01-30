package BinarySearch.Easy;

import java.util.Arrays;

public class FirstandLastOccrance {
    static void main() {
        int[] arr={1,1,2,2,2,2,3,3,3,4};
        int target=3;
        int[] result={-1,-1};
        result[0]=fandLocc(arr,target,true);
        if(result[0]!=-1){
            result[1]=fandLocc(arr,target,false);
        }
        System.out.println(Arrays.toString(result));
    }

    private static int  fandLocc(int[] arr,int t,boolean f) {
        int ans=-1;
        int left=0;
        int right= arr.length-1;
        while(left<=right){
            int mid=left+(right-left)/2;
            if(arr[mid]<t) left=mid+1;
            else if (arr[mid] >t) right=mid-1;
            else{
                ans=mid;
                if(f){
                    right=mid-1;
                }
                else left=mid+1;
            }
        }
        return ans;
    }
}
