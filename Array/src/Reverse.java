public class Reverse {
 public static void main(String[] args) {
    char[] s = {'h', 'e', 'l', 'l', 'o'};
    reverseString(s);
    }   
 public static void reverseString(char[] s) {
    int start = 0;
    int end = s.length-1;

    while(start<end){
        char temp = s[start];
        s[start] = s[end];
        s[end] = temp;
        start++;
        end--;
    }
    
    // Print the reversed string
    System.out.println("Reversed string is: ");
    for(int i=0; i<s.length; i++){
        System.out.print(s[i]);
    }
}
}
