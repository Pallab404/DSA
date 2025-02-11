
import java.util.Scanner;

public class p1 {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            System.out.print("enter the size of the array : ");
            int n = in.nextInt();
            int[] arr = new int[n];
            System.out.println("enter the array elements : ");
            for (int i = 0; i < n; i++) {
                arr[i] = in.nextInt();
            }
            System.out.println("the maximum element in the array is : "+max(arr, n));
            System.out.println("the minimum element in the array is : "+min(arr, n));
        }
    }
    static int max(int[] arr,int n){
        int max = arr[0];
        for (int i = 0; i < n; i++) {
            if (arr[i]>max) {
                max = arr[i];
            }
        }
        return max;
    }
    static int min(int[] arr,int n){
        int min = arr[0];
        for (int i = 0; i < n; i++) {
            if(arr[i]<min)
                min = arr[i];
        }
        return min;
    }
}
