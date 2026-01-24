package Arrays.easy;

public class SecondLargest {
    static void main() {
        int[] arr={8};
       int result= secLargest(arr);
        System.out.println(result);
    }

    private static int secLargest(int[] arr) {
        if(arr.length<2) return -1;

        int Flar=Integer.MIN_VALUE;
        int Slar=Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>Flar){
                Slar=Flar;
                Flar=arr[i];
            }
            else if(Slar<arr[i] && Flar>arr[i]){
                Slar=arr[i];
            }
        }
        return Slar==Integer.MIN_VALUE ?-1:Slar;
    }
}
