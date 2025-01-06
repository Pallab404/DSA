import java.util.Scanner;

public class p16 {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner in = new Scanner(System.in);
        System.out.print("enter the value of n : ");
        int n = in.nextInt();

        printStar(n);
    }
    static void printStar(int n){
        char ch ='A';
        for (int i = 0; i <n; i++) {
            for (int j = 0; j <=i; j++) {
                System.out.print(ch);
                System.out.print(" ");
            }
            ch +=1;
            System.out.println();
        }
    }
}
