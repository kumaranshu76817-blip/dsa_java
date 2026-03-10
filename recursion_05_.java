public class recursion_05_ {
    public static boolean isSorted(int[] arr, int idx){
        if(idx == arr.length-1){
            return true;
        }
        if(arr[idx]< arr[idx+1]){
            // array is sorted till now, check for the rest of the array
            return isSorted(arr, idx+1);
        }
        else if(arr[idx]>arr[idx+1]){
            return false;
        }
        else{
            return true;
        }
    }
    //time complexity is O(n) and space complexity is O(n) because of the recursive stack
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        System.out.println(isSorted(arr, 0));
    }
}
