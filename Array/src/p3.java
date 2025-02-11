public class p3 {
    public static void main(String[] args) {
        int[] arr ={9,4,3};
        System.out.println("sum of elements is : "+sumOfElements(arr));
    }
    static int sumOfElements(int[] arr){
        int sum =0;
        for (int i = 0; i < arr.length; i++) {
            sum +=arr[i];
        }
        return sum;
    }
}
