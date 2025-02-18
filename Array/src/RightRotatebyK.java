public class RightRotatebyK {
    public static void main(String[] args) {
        int[] arr ={1,2,3,4,5};
        int n = arr.length;
        int k = 2;
        RotateRight(arr,n,k);
    }

    public static void RotateRight(int[] arr,int n,int k){
        k = k%n;
        
        int[] temp = new int[k];
        for(int i=0;i<k;i++){
            temp[i] = arr[i+n-k];
        } 
        

        // shifting element to right
        for(int i=n-k-1;i>=0;i--){
            arr[i+k] = arr[i];
        }

        // copy the element from temp to original array
        for(int i=0;i<k;i++){
            arr[i] = temp[i];
        }

        System.out.println("Array after right rotation by "+k+" is:");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+"\t");
        }


    }
       
}
