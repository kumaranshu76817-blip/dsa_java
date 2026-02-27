import java.lang.reflect.Array;
import java.util.Arrays;

public class array_09_getmin {
    public static int getmin(int [] arr, int n, int k){
        Arrays.sort(arr);
        int ans = arr[n-1]-arr[0];
        int smallest = arr[0] + k;
        int largest = arr[n-1]-k;
        int min, max;
         for(int i = 1; i < n; i++) {
            
            if(arr[i] - k < 0)
                continue;
            
            min = Math.min(smallest, arr[i] - k);
            max = Math.max(largest, arr[i-1] + k);
            
            ans = Math.min(ans, max - min);
        }
        
        return ans;
    }
    public static void main(String[] args) {
        int [] arr = {1,2,3,10};
        int k = 4;
        int n = 2;
        System.out.println("the output is ="+ getmin(arr, n, k));
    }
}
