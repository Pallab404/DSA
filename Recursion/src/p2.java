import java.util.Scanner;

public class p2 {
    public static void main(String[] args) {
         @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the value of n : ");
        int n = sc.nextInt();
        printN(n);
    }
    static void printN(int n){
        if(n<1) return;
        System.out.println(n);
        printN(n-1);
    }
    
}
