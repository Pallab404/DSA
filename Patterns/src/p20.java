// *        *
// **      **
// ***    ***
// ****  ****
// **********
// ****  ****
// ***    ***
// **      **
// *        *

import java.util.Scanner;

public class p20 {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner in = new Scanner(System.in);
        System.out.print("enter the value of n : ");
        int n = in.nextInt();

        printStar(n);
    }
    static void printStar(int n){
        int inis =8;
        for(int i=1; i<=n; i++){
            // starts
            for (int j = 1; j <=i; j++) {
                System.out.print("*");
            }
            //space
            for (int k = 0; k <inis; k++) {
                System.out.print(" ");
            }
            // starts
            for (int j = 1; j <=i; j++) {
                System.out.print("*");
            }
            System.out.println();
            inis-=2;
        }
        inis =2;
        for(int i=1; i<=n-1; i++){
            // starts
            for (int j = 1; j <=n-i; j++) {
                System.out.print("*");
            }
            //space
            for (int k = 0; k <inis; k++) {
                System.out.print(" ");
            }
            // starts
            for (int j = 1; j <=n-i; j++) {
                System.out.print("*");
            }
            System.out.println();
            inis+=2;
        }
    }
}
