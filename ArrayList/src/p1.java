
import java.util.ArrayList;
import java.util.Scanner;

public class p1 {
    public static void main(String[] args) {
        ArrayList<Integer> integerList = new ArrayList<>();
        Scanner in = new Scanner(System.in);
        System.out.println("enter the sixe of the list : ");
        int n = in.nextInt();
        System.out.println("enter the array elements :");
        for (int i = 0; i < n; i++) {
            integerList.add(in.nextInt());
        }
        System.out.println("array list elements are : ");
        for(int i : integerList){
            System.out.print(i+"\t");
            in.close();
        }
    }
}
