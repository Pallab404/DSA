public class RemoveDuplicate {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 4, 4, 4, 5, 5};
        int n = arr.length;
        removeDuplicate(arr, n);
    }    
    public static void removeDuplicate(int[] arr,int n){
        int i =0;
        for(int j=1;j<n;j++){
            if(arr[i]!= arr[j]){
                i++;
                arr[i] = arr[j];
            }
        }
        for(int k=0;k<=i;k++){
            System.out.print(arr[k]+" ");
        }
    }
}
