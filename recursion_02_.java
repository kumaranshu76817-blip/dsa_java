public class recursion_02_ {
    public static void towerOfHanoi(int n, String src, String helper, String dest){
        if(n==1){
            System.out.println("transfer disk" + n+ " from " + src+" to " + dest);
            return;
        }
        towerOfHanoi(n-1, src, dest, helper);
        System.out.println("transfer disk" + n+ " from " + src+" to " + dest);
        towerOfHanoi(n-1, helper, src, dest);
    }
    //time complexity o(2^n)
    public static void main(String[] args) {
        int n = 2;
        towerOfHanoi(n, "s", "h", "d");
    }
}
