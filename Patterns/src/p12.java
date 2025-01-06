// 1         1
// 12       21
// 123     321
// 1234   4321
// 12345 54321

import java.util.Scanner;

public class p12 {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner in = new Scanner(System.in);
        System.out.print("enter the value of n : ");
        int n = in.nextInt();

        printStar(n);
    }

    static void printStar(int n ){
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <=i; j++) {
                System.out.print(j);
            }
            for (int k = 0; k <= 2*n-2*i; k++) {
                System.out.print(" ");
            }
            for (int j = i; j >=1; j--) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}

