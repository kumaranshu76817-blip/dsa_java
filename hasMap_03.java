
//majority elemen in java;
import java.util.*;

public class hasMap_03 {
    public static void majorityElemetn(int nums []){
        HashMap<Integer, Integer> map = new HashMap<>();

        int n = nums.length;
        for(int i = 0; i<n; i++){
            if(map.containsKey(nums[i])){ // true
                map.put(nums[i], map.get(nums[i])+1);
            }
            else{
                map.put(nums[i], 1);
            }
        }

        for(int key : map.keySet()){
            if(map.get(key) > n/3){
                System.out.println(key);
            }
        }
    }

    public static void main(String[] args) {
        int nums[] = {1,2,3,1,5,1,2,1};
        majorityElemetn(nums);
    }
}
