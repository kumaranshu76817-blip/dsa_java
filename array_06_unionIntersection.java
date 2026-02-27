import java.lang.reflect.Array;
import java.util.ArrayList;

public class array_06_unionIntersection {

    public static ArrayList<Integer> findUnion(int [] arr1, int [] arr2){
        ArrayList<Integer> union = new ArrayList<>();
        int i=0, j=0;
        while(i<arr1.length && j<arr2.length){
            if(arr1[i]<arr2[j]){
                if(union.size()== 0 || union.get(union.size()-1) != arr1[i])
                    union.add(arr1[i]);
                i++;
            }
            else if(arr1[i]>arr2[j]){
                if(union.size() == 0 || union.get(union.size()-1) != arr2[j])
                    union.add(arr2[j]);
                j++;
            }
            else{
                if(union.size() == 0|| union.get(union.size()-1) != arr1[i])
                    union.add(arr1[i]);
                i++;
                j++;
            }
        }
        while (i<arr1.length) {
            if(union.get(union.size()-1) != arr1[i])
                union.add(arr1[i]);
            i++;
        }
        while (j<arr2.length) {
            if(union.get(union.size()-1) != arr2[j])
                union.add(arr2[j]);
            j++;
        }
        return union;
    }
    public static ArrayList<Integer> findIntersection(int [] arr1, int [] arr2){
        ArrayList<Integer> intersection = new ArrayList<>();
        int i= 0, j=0;
        while (i<arr1.length && j<arr2.length) {
            if(arr1[i]<arr2[j]){
                i++;
            }
            else if(arr1[i]>arr2[j]){
                j++;
            }
            else{
                intersection.add(arr1[i]);
                i++;
                j++;
            }
        }
        return intersection;
    }
    public static void main(String[] args) {
        int [] arr1 = {1,2,3,4};
        int [] arr2 = {2,3,4,5,6,7};
        System.out.println("union is = " + findUnion(arr1, arr2));
        System.out.println("intersection is = "+ findIntersection(arr1, arr2));
    }
    
}