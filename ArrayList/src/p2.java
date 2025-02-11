
import java.util.ArrayList;
import java.util.Scanner;

//find min max  


public class p2 {
    public static void main(String[] args) {
       try (Scanner in = new Scanner(System.in)) {
        ArrayList<Integer>arr = new ArrayList<>();
           System.out.println("enter the size of the list : ");
           int n = in.nextInt();
           System.out.println("enter the values of the list : ");
           for (int i = 0; i <n; i++) {
               arr.add(in.nextInt());
           } 
           System.out.println("maximum element in the list is : "+Max(arr, n));
           System.out.println("minimum element in the list is : "+min(arr, n));
    }

    }
    static  int Max(ArrayList<Integer> arr,int n){
        int max = arr.get(0);
        for (int i = 0; i <n; i++) {
            if (arr.get(i)>max) {
                max = arr.get(i);
            }
        }
        return max;
    }
    static int min(ArrayList<Integer>arr,int n){
        int min = arr.get(0);
        for (int i = 0; i < n; i++) {
            if (arr.get(i)<min) {
                min = arr.get(i);
            }
        }
        return min;
    }
}
