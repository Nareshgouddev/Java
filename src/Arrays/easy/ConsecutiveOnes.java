package Arrays.easy;

public class ConsecutiveOnes {
    static void main() {
        int[] nums={1,1,0,1,1,1};
        int res=maxCount(nums);
        System.out.println(res);
    }

    private static int maxCount(int[] nums) {
        int count=0;int Rcount=0;int MaxCount=0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]!=0){
                count++;
            }
            else{
                Rcount=count;
                count=0;
            }
            MaxCount=Math.max(MaxCount,Rcount);
        }
        return MaxCount;
    }
}
