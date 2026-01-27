package Arrays.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Union {
    static void main() {
        int[] arr={1,2,3,4,5,6,7};
        int[] arr2={1,2,9};
        int[] res=union(arr,arr2);
        System.out.println(Arrays.toString(res));
    }
    private static int[] union(int[] nums1, int[] nums2) {
        int left=0,right=0;
        List<Integer> result=new ArrayList<>();
        while(left<nums1.length && right<nums2.length){
            if(nums1[left] <nums2[right]){
                if(result.isEmpty() || result.get(result.size()-1)!=nums1[left]){
                     result.add(nums1[left]);
                }
                left++;

            }
            else if(nums1[left] >nums2[right]){
                if(result.isEmpty() || result.get(result.size()-1)!=nums2[right]){
                    result.add(nums2[right]);
                }
                right++;
            }
            else{
                if(result.isEmpty() || result.get(result.size()-1)!=nums1[left]){
                    result.add(nums1[left]);
                }
                left++;right++;
            }

        }
        while(left<nums1.length){
            if(result.isEmpty()|| result.get(result.size()-1)!=nums1[left])
                result.add(nums1[left]);
            left++;
        }
        while(right<nums2.length){
            if(result.isEmpty()|| result.get(result.size()-1)!=nums1[right])
                result.add(nums2[right]);
            right++;
        }
        int[] newunion=new int[result.size()];
        for (int i = 0; i < result.size(); i++) {
            newunion[i]=result.get(i);
        }
        return newunion;
    }
}
