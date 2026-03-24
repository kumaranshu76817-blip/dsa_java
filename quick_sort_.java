public class quick_sort_ {
    public static int partion(int [] arr, int low, int high){
        int pivot = arr[high];
        int i = low - 1;
        for(int j = low; j<high; j++){
            if(arr[j]<pivot){
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        i++;
        int temp = arr[i];
        arr[i] = arr[high];
        arr[high] = temp;
        return i;
    }

    public static void quicksort(int[] arr, int low, int high) {
        if (low < high) {
            int pivot = partion(arr, low, high);
            quicksort(arr, low, pivot - 1);
            quicksort(arr, pivot + 1, high);
        }
    }
    //time complexity of o(n^2);
    public static void main(String[] args) {
        int arr[] = { 2, 5, 3, 9, 8, 6 };
        int n = arr.length;
        quicksort(arr, 0, n - 1);
        for (int i = 0; i < n ; i++) {
            System.out.print(arr[i]+ " ");
        }
    }
}
