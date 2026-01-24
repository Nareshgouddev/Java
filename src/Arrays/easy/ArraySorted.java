package Arrays.easy;

public class ArraySorted {
    static void main() {
        int[] arr={9,6,1,1,1,};
        boolean ans=sorted(arr);
        System.out.println(ans);
    }

    private static boolean sorted(int[] nums) {

                int count = 0;
                int n = nums.length;
                for(int i = 0; i < n-1; i++) {
                    if(nums[i] > nums[i+1]) {
                        count++;
                    }
                }
                return count <= 1;
    }
}
