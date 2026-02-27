public class array_04_sort01 {
    public static void main(String[] args) {
        
    
    
        int arr[] = {2,0,1,0,2,1};
        int low = 0;
        int mid = 0;
        int high = arr.length - 1;
        while(mid <= high){
            if(arr[mid] == 0){
            int temp = arr[low];
            arr[low] = arr[mid ];
            arr[mid] = temp;
            low ++;
            mid++;
            }
            else if(arr[mid] == 1){
                mid++;
            }
            else{
                int temp = arr[mid];
                arr[mid] = arr[high];
                arr[high] = temp;
                high--;
            }

        }
        for(int num : arr){
            System.out.print(num+" ");
        }
    }
}
