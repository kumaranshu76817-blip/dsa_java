public class recursion_11_maze {
    public static int countPath(int i, int j, int m, int n){
        if(i == m || j== n){
            return 1;
        }
        if(i == m-1 && j== n-1 ){
            return 0;
        }
        //downward
        int horizontal = countPath(i+1, j, m, n);
        //rightward
        int rightward = countPath(i, j+1, m, n);
        return horizontal + rightward;
    }
    public static void main(String[] args) {
        int m = 3, n = 3;
        System.out.println(countPath(0, 0, m, n) );
    }
}
