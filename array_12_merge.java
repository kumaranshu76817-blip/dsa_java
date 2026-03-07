import java.util.Arrays;

public class array_12_merge {

    public static void main(String[] args) {

        int[][] arr = {{1,3},{2,6},{8,10},{15,18}};

        Arrays.sort(arr, (a,b) -> a[0] - b[0]);

        int start = arr[0][0];
        int end = arr[0][1];

        for(int i=1;i<arr.length;i++){

            if(arr[i][0] <= end){
                end = Math.max(end, arr[i][1]);
            }
            else{
                System.out.println("[" + start + "," + end + "]");
                start = arr[i][0];
                end = arr[i][1];
            }
        }

        System.out.println("[" + start + "," + end + "]");
    }
}