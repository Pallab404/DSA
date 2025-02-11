// print your name n times using recursion

public class basic1 {
    static int n =0;
    public static void main(String[] args) {
        printName();
    }
    static void printName(){
        if( n==5) return;

        System.out.println("Pallab");
        n++;
        printName();
    }
}
