// A
// A B
// A B C 
// A B C D
// A B C D E

import java.util.Scanner;

public class p14 {

    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner in = new Scanner(System.in);
        System.out.print("enter the value of n : ");
        int n = in.nextInt();

        printStar(n);
        printStar2(n);
    }
    static void printStar(int n){
        for (int i = 0; i <n; i++) {
            int ch = 65;
            for (int j = 0; j <=i; j++) {
                System.out.print(((char)ch));
                System.out.print(" ");
                ch+=1;
            }
            System.out.println();
        }
    }

    static void printStar2(int n){
        for (int i = 0; i <n; i++) {
            for(char ch ='A' ; ch<= 'A'+i ;ch++){
                System.out.print(ch);
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}