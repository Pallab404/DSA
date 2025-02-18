public class SortedOrNot {
    public static void main(String[] args) {
        int[] arr = {5, 2, 3, 4, 5};
        System.out.println(isSorted(arr));
    }
    public static boolean isSorted(int[] arr) {
        for(int i=1; i<arr.length; i++){
            if(arr[i]<arr[i-1]){
                return false;
            }
        }
        return true;
    }
}
