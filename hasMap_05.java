//intersection of two arrays;

import java.util.HashSet;

public class hasMap_05 {
    
    public static int intersection(int [] arr1, int [] arr2){

        HashSet<Integer> set = new HashSet<>();

        int count = 0;

        for(int i=0; i<arr1.length; i++){
            set.add(arr1[i]);
        }

        for(int j=0; j<arr2.length; j++){
            if(set.contains(arr2[j])){
                count++;
                set.remove(arr2[j]);
            }
        }

        return count; //intersection
    }
    public static void main(String[] args) {
        int arr1[] = {1,2,3,4,3};
        int arr2[] = {1,2,3,6,7};
        

        System.out.println(intersection(arr1, arr2));
    }
}
