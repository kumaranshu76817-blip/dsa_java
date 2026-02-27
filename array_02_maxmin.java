import java.util.Scanner;

public class array_02_maxmin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of element:");
        int n = sc.nextInt();

        int arr [] = new int[n];
        System.out.println("enter the number of element:");
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        int max = 0;
        int min = 0;
        for(int i=0; i<n; i++){
            if(arr[i]> max){
                max = arr[i];
            }
            if(arr[i]<min){
                min= arr[i];
            }

        }
        System.out.println("maximum is = "+ max);
        System.out.println("minmum is ="+ min);
        sc.close();
    }
}
