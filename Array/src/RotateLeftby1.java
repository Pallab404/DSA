public class RotateLeftby1 {
    public static void main(String[] args) {
        int[] arr ={1,2,3,4,5};
        int n = arr.length;
        rotateLeft(arr,n);
    }
    public static void rotateLeft(int[] arr,int n){
        int temp = arr[0];
        for(int i=1;i<n-1;i++){
            arr[i-1] = arr[i];
        }
        arr[n-1] = temp;

        System.out.println("array after rotating left by 1 : ");

        for (int i = 0; i <n; i++) {
            System.out.print(arr[i]+"\t");
        }
    }
}
