public class MaximumSubArray {
    public static void main(String[] args) {
        int[] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int n = arr.length;
        int maxSum = maxSubArraySum(arr, n);
        System.out.println("Maximum sum of subarray is: " + maxSum);
    }

    public static int maxSubArraySum(int[] arr, int n) {
        int max = Integer.MIN_VALUE;
        int sum =0;

        for(int i=0;i<n;i++)
        {
            sum +=arr[i];

            if(sum>max)
                max = sum;
            if(sum<0)
                sum =0;
        }
        return max;
    }
}
