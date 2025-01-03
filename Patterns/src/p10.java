
// *
// **
// ***
// ****
// *****
// ****
// ***
// **
// *

import java.util.Scanner;

public class p10 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("enter the value of n : ");
        int n = in.nextInt();
        printStar(n);
    }

    static void printStar(int n){
        for (int i = 1; i <= 2*n-1; i++) {
            int star = i;
            if (i>n) 
                star = 2*n-i;
            for (int j = 1; j <= star; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
