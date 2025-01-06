// ABCDE
// ABCD
// ABC
// AB
// A

import java.util.Scanner;

public class p15 {
     public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner in = new Scanner(System.in);
        System.out.print("enter the value of n : ");
        int n = in.nextInt();

        printStar(n);
    }
    static void printStar(int n){
        for (int i = 0; i <n; i++) {
            for (char ch = 'A'; ch <'A' + n-i; ch++) {
                System.out.print(ch);
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
