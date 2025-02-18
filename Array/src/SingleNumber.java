public class SingleNumber {
    public static void main(String[] args) {
        int[] arr = {4,1,2,1,2,4,3};
        int ans = singleNumber(arr);
        System.out.println(ans);
    }
    public static int singleNumber(int[] arr){
        int xor = 0;
        for(int i=0;i<arr.length;i++)
        {
            xor = xor^arr[i];
        }
        return xor;
    }
}
