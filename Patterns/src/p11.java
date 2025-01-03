import java.util.Scanner;

public class p11 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("enter the value of n : ");
        int n = in.nextInt();

        printStar(n);
    }
    static void printStar(int n ){
        int start;
        for (int i = 0; i < n; i++) {
            if(i%2==0) 
                start = 0;
            else
                start =1;
            for (int j = 0; j <=i; j++) {
                System.out.print(start);
                start = 1-start;
            }
            System.out.println();
        }
    }
}
