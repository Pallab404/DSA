import java.util.Scanner;



public class p1 {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            try{
                System.out.println("enter a grade beween 0 and 100");
                int grade = in.nextInt();

                if (grade < 0 || grade > 100) {
                    throw new MyException("Grade must be bewtween 0 and 100");
                }
                System.out.println("Grade is " + grade);
            }
            catch(MyException e){
                System.out.println("Error :"+e.getMessage());
            }
            finally{
                System.out.println("finally block is executed...");
            }
        }
    }
}

class MyException extends Exception {
    public MyException(String s) {
        super(s);
    }
}
