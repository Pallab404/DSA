
import java.util.ArrayList;
import java.util.Scanner;

public class p3 {
    public static void main(String[] args) {
        try(Scanner in = new Scanner(System.in)){
            ArrayList<Integer> arr = new ArrayList<>();
            System.out.println("enter the size of the list : ");
            int n = in.nextInt();
            System.out.println("enter the list elements : ");
            for (int i = 0; i < n; i++) {
                arr.add(in.nextInt());
            }
            System.out.println("sum of the elements are : "+SumOfElements(arr, n));
        }
    }
    static int SumOfElements(ArrayList<Integer> arr,int n){
        int sum =0;
        for (int i = 0; i < n; i++) {
            sum += arr.get(i);
        }
        return sum;
    }
}
