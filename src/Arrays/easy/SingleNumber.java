package Arrays.easy;

import java.util.HashMap;

public class SingleNumber {
    static void main() {
        int[] nums={1,2,4, 3, 1,4};
        int res=Signum(nums);
        System.out.println(res);
    }

    private static int Signum(int[] nums) {
        int Number=0;
        if(nums.length==1){
            return nums[0];
        }
        HashMap<Integer,Integer> map=new HashMap();
        for (int num:nums) {
           map.put(num, map.getOrDefault(num,0)+1);
        }
        for (int k:map.keySet()) {
            if(map.get(k)==1){
                Number=k;
            }
        }
        return Number;
    }
}
