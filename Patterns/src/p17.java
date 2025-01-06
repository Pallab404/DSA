import java.util.Scanner;

public class p17 {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner in = new Scanner(System.in);
        System.out.print("enter the value of n : ");
        int n = in.nextInt();

        printStar(n);
    }
    static void printStar(int n){
        for (int i = 1; i <=n; i++) {
            char ch = 'A';
            for (int j = 1; j <=n-i; j++) {
                System.out.print("*");
            }

            int breakpoint = (2*i-1)/2;
            for (int k = 1; k <=2*i-1 ; k++) {
                System.out.print(ch);  
                if(k<=breakpoint) ch++;
                else ch--;
            }
            for (int j = 1; j <=n-i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
