import java.util.Scanner;

public class p13 {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner in = new Scanner(System.in);
        System.out.print("enter the value of n : ");
        int n = in.nextInt();

        printStar(n);
    }
    static void printStar(int n){
        int num =1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <=i; j++) {
                System.out.print(num);
                num +=1;
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
