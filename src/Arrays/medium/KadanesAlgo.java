package Arrays.medium;

public class KadanesAlgo {
    static void main() {
        int[] arr={2,3,5,-2,7,-4};
        kadanesalgo(arr);
        System.out.println(kadanesalgo(arr));
    }

    private static int kadanesalgo(int[] arr) {
        int maxsum=0;
        for (int i = 0; i < arr.length; i++) {
            int csum=0;
            for (int j = i; j < arr.length; j++) {
                csum+=arr[j];
               maxsum=Math.max(maxsum,csum);
            }
        }
        return maxsum;
    }

    private static int kadanesalgo1(int[] arr){
        int maxsum=arr[0];
        int currentSum=arr[0];

        for (int i = 1; i <arr.length ; i++) {
            currentSum=Math.max(arr[i],currentSum+arr[i]);
            maxsum=Math.max(maxsum,currentSum);
        }
        return maxsum;
    }
}
