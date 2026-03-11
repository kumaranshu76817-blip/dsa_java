public class recursion_12_tiles {
    public static int placeTiles(int n, int m){
        if(n == m){
            return 2;
        }
        if(n<=0){
            return 1;
        }
        //vertically
        int way1 = placeTiles(n-m, m);
        //horizatally
        int way2 = placeTiles(n-1, m);
        return way1+way2;
    }
    public static void main(String[] args) {
        int n =4, m =3;
        System.out.println(placeTiles(n, m));
    }
}
