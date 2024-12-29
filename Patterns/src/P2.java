
// *
// **
// ***
// ****
// *****


import java.util.Scanner;

public class P2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("enter the no of rows : ");
        int a = in.nextInt();

        for (int i = 0; i < a; i++) {
            for (int j = 0; j <=i ; j++) {
                System.out.print("*");
            }
            System.out.println();
            in.close();
        }

    }
}
