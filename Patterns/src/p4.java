// 1
// 22
// 333
// 4444
// 55555

import java.util.Scanner;

public class p4 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("enter the value of n : ");
        int n = in.nextInt();

        for (int i = 1; i <=n; i++) {
            for(int j =1 ; j<=i;j++){
                System.out.print(i);
            }
            System.out.println();
            in.close();
        }
    }
}