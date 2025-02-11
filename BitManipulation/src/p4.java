import java.util.Scanner;

public class p4 {
    public static void main(String[] args) {
        try(Scanner in = new Scanner(System.in)){
            System.out.println("enter the value of n : ");
            int n = in.nextInt();

            System.out.println("Number of bit set : "+Integer.bitCount(n));
        }
    }
}
