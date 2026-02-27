public class array_07_rotateElement {
    public static void main(String[] args) {
        int [] arr = { 1,2,3,4,5};
        int n = arr.length;
        // store last element
        int last = arr[n-1];
        //shift element to right
        for(int i=n-1; i>0; i--){
            arr[i] = arr[i-1];
        }
        // put last element in first poistion
        arr[0] = last;
        // print the element
        for(int i=0; i<n; i++ ){
            System.out.print(arr[i] + " ");
        }
    }
}
