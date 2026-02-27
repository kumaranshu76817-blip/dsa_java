import java.util.Arrays;
import java.util.Scanner;

public class array_03_kth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("entere the size of arrays:");
        int n = sc.nextInt();
        int [] arr = new int[n];
        System.out.println("enter the element in the arrays:");
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("enter teh kth element to sorted arrays");
        int k = sc.nextInt();

        Arrays.sort(arr);
        System.out.println("kth maximum is = "+ arr[n-k]);
        System.out.println("kth smallest element is = " + arr[k-1]);
        sc.close();
    }
}
