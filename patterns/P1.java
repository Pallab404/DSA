package DSA.patterns;
import java.util.Scanner;

public class P1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("enter the number of columns : ");
        int a = in.nextInt();
        System.out.println("enter the number of rows : ");
        int b = in.nextInt();

        for(int i=0;i<a;i++){
            for(int j=0;j<b;j++){
                System.out.print("* " );
            }
            System.out.println();
        }
    }
}