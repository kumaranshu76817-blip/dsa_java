import java.util.ArrayList;
import java.util.Arrays;

public class array_11_dupli {
    public static ArrayList<Integer> duplicate(int arr []){
        Arrays.sort(arr);
        ArrayList<Integer> a = new ArrayList<>();
        for(int i=0; i<arr.length-1 ; i++){
            if(arr[i] == arr[i+1]){
                a.add(arr[i]);
            }
        }
        return a ;
        
    }
    public static void main(String[] args) {
        int arr[] = {1,5,3,2,3,5,};
        System.out.println(duplicate(arr));
    }
}
