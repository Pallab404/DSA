
import java.util.ArrayList;

public class IntersectionArray {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 2, 3, 4, 4, 4, 5, 5};
        int[] arr2 = {1, 2, 3, 4, 5,5, 6, 7, 8, 9};
        int n1 = arr1.length;
        int n2 = arr2.length;
        intersectionArray(arr1, arr2, n1, n2);
    }    
    public static void intersectionArray(int[] a,int[] b, int n1,int n2){
        int i =0;
        int j =0;
        ArrayList<Integer> in = new ArrayList<>();
        while (i<n1 && j<n2) {
            if (a[i] == b[j]) {
                in.add(a[i]);
                i++;
                j++;
            }
            else{
                if(a[i]<b[j]) i++;

                else j++;
            }
        }
        System.out.println(in);
    }
}
