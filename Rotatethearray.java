import java.util.Arrays;

public class RotateArrayLeftForLoop {
    
    public static void rotateLeft(int[] arr, int d) {
        int n = arr.length;
        d = d % n; 
        
        
        for (int i = 0; i < d; i++) {
            int first = arr[0];
            
       
            for (int j = 0; j < n - 1; j++) {
                arr[j] = arr[j + 1];
            }

           
            arr[n - 1] = first;
        }
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        rotateLeft(arr1, 2);
        System.out.println(Arrays.toString(arr1));
        int[] arr2 = {2, 4, 6, 8, 10, 12, 14, 16, 18, 20};
        rotateLeft(arr2, 3);
        System.out.println(Arrays.toString(arr2)); 
        
        int[] arr3 = {7, 3, 9, 1};
        rotateLeft(arr3, 9);
        System.out.println(Arrays.toString(arr3)); 
        
        
        
    }
}
