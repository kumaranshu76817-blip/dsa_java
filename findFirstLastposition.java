//finding first and last element of sorted arrays;

public class findFirstLastposition {
    public static int[] searchRange(int [] nums, int target){
        int first = findFirst(nums, target);
        int last = findLast(nums, target);
        return new int[]{first,last};

    }

    public static int findFirst(int []nums, int target){
        int si =0;
        int ei = nums.length -1;
        int result = -1;
        while (si<=ei) {
            int mid = si + (ei - si)/2;
            if(nums[mid] == target){
                result = mid;
                ei = mid -1;

            }
            else if(nums[mid] < target){
                si = mid +1;
            }
            else{
                ei = mid -1;
            }
        }
        return result;
    }

    public static int findLast(int [] nums, int target){
        int si = 0;
        int ei = nums.length -1;
        int result = -1;
        while (si <= ei) {
            int mid = si + (ei - si) / 2;

            if(nums[mid] == target){
                target = mid;
                si = mid + 1;
            }
            else if(nums[mid] < target){
                si = mid + 1;
            }
            else {
                ei = mid -1;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int arr1 [] = {1,2,3,4,5,5,6,7};
        System.out.println(searchRange(arr1, 5));
    }
}
