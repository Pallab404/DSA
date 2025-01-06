import java.util.Scanner;

public class p18 {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner in = new Scanner(System.in);
        System.out.print("enter the value of n : ");
        int n = in.nextInt();

        printStar(n);
    }
    static void printStar(int n){
        for (int i = 0; i < n; i++) {
            
            for(char ch = (char) ('E'-i) ; ch <='E' ; ch++){
                System.out.print(ch);
            }
            System.out.println();
        }
    }
}
