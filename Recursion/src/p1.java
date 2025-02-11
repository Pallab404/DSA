// print your name n times using recursion

import java.util.Scanner;

public class p1 {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of n : ");
        int n = sc.nextInt();
        int i =1;
        printName(i,n);
    }
    static void printName(int i,int n){
        if (i>n) return;
        System.out.println("Pallab");
        printName(i+1, n);
    }
}