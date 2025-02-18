public class ZeroToEnd {
    public static void main(String[] args) {
        int[] arr = {1, 2, 0, 4, 3, 0, 5, 0};
        int n = arr.length;
        zeroToEnd(arr, n);
    }
    public static void zeroToEnd(int[] arr, int n){
        int j =-1;
        for(int i=0;i<n;i++){
            if(arr[i] == 0){
                j=i;
                break;
            }
        }
        for(int i = j+1;i<n;i++){
            if(arr[i]!=0){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++;
            }
        }
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
