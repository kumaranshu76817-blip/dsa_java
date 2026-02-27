import java.util.Arrays;

public class array_05_moveNeg {
    public static void movereverse(int [] arr){
        int left = 0;
        int right = arr.length-1;
        while(left<= right){
            if(arr[left] <0 && arr[right]<0){
                left++;
            }
            else if(arr[left]>=0 && arr[right]>=0){
                right--;
            }
            else if(arr[left]>=0 && arr[right]<0){
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
                
            }
            else{
                left++;
                right--;
            }
        }
    }
    public static void main(String[] args) {
        int [] arr = {-1,4,2,-3,1};
        movereverse(arr);
        System.out.println(Arrays.toString(arr));

    }
}
