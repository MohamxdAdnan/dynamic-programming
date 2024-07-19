public class LargestSum {
    public static void main(String[] args) {
        int arr[]={5, 4, -1, 7, 8};
        int largestSum=0;


        for (int i = 0; i < arr.length; i++) {
            int sum=arr[i];
            for (int k = i+1; k < arr.length; k++) {
                sum=sum+arr[k];
                if(sum>largestSum)
                    largestSum=sum;
            }
        }
        System.out.println(largestSum);
    }
}
