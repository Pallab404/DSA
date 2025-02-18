
import java.util.ArrayList;

public class UnionArray {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 2, 3, 4, 4, 4, 5, 5};
        int[] arr2 = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int n1 = arr1.length;
        int n2 = arr2.length;
        unionArray(arr1, arr2, n1, n2);
    }
    public static void unionArray(int[] arr1,int[] arr2, int n1, int n2){
        int i=0;
        int j =0;
        ArrayList<Integer> union = new ArrayList<>();
        while(i<n1 && j<n2){
            if(arr1[i]<= arr2[j])
            {
                if (union.isEmpty() || union.get(union.size()-1) != arr1[i]) {
                    union.add(arr1[i]);
                }
                i++;
            }
            else{
                if (union.isEmpty() || union.get(union.size()-1) != arr2[j]) {
                    union.add(arr2[j]);
                }
                j++; 
            }
        }
        while (i<n1) {
            if (union.isEmpty() || union.get(union.size()-1) != arr1[i]) {
                union.add(arr1[i]);
            }
            i++;
        }
        while (j<n2) {
            if (union.isEmpty() || union.get(union.size()-1) != arr2[j]) {
                union.add(arr2[j]);
            }
            j++; 
        }

        for (int k = 0; k < union.size(); k++) {
            System.out.print(union.get(k) + " ");
        }
    }
}
