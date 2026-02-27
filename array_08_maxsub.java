public class array_08_maxsub {
    public   static int maxSubArray(int [] num) {
        
        int currentsum = 0;
        int maxsum = num[0];
        for(int i=0; i<num.length; i++){
            currentsum = currentsum + num[i];
            if(currentsum> maxsum){
                maxsum = currentsum;
            }
            if(currentsum <0){
                currentsum = 0;
            }
            
        }
        return maxsum;
    }
    public static void main(String[] args) {
        int [] num = {1,2,3,4 ,-1,-5};
        
        System.out.println("the total sum of this array is:"+ maxSubArray(num));
    }
}
