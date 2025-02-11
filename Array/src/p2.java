public class p2 {
    public static void main(String[] args) {
        int[] arr = {5,3,1,7,9};
        reverse(arr);
        System.out.println("reverse array is : ");
        for (int i = 0; i < arr.length; i++) {
          System.out.print(arr[i]+"\t");
      }
    }
    static void reverse(int[] arr){
      int start =0;
      int end = arr.length-1;
      while (start<end) {
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;

        start++;
        end--;
      }
    }
}
