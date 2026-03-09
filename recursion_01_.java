public class recursion_01_ {

    //print number 5 to 1
    
    public static void printNumb(int n){
        if(n==0){
            return ;
        }
        System.out.println(n);
        printNumb(n-1);
    }

    // print sum of first n natural numbers

    public static void printSum(int i, int n, int sum){
        if(i==n){
            sum += i;
            System.out.println(sum);
            return;
        }
        sum+=i;
        printSum(i+1, n, sum);
    }

    // PRINT FCATORIAL OF N
    public static int calcfactorial(int n){
        if(n==1 || n == 0){
            return 1;
        }
        int fact_nm1 = calcfactorial(n-1);
        int fact_n = n* fact_nm1;
        return fact_n;
    }

    //PRINT THE FIBONACCI SEQUENCE TILL NTH TERM*
    public static void printFib(int a, int b, int n){
        if(n==0){
            return;
        }
        int c = a+b;
        System.out.println(c);
        printFib(b, c, n-1);
    }

    //PRINT X^N (STACK HEIGHT = N)
    public static int calcPower(int x, int n){
        if(n==0){ //base case 1
            return 1;
        }
        if(x==0){//bse case 2
            return 0;
        }
        int xPownm1 = calcPower(x, n-1); //kaam
        int xPown = x*xPownm1;
        return xPown;
    }

        //PRINT X^N (STACK HEIGHT = LOGN)
        public static int calcpower2(int x, int n){
            if(n==0){
                return 1;
            }
            if(x==0){
                return 0;
            }
            // if n is even
            if(n%2 == 0){
                return calcpower2(x, n/2) * calcPower(x, n/2);
            }
            else{// n is odd
                return calcPower(x, n/2) * calcPower(x, n/2) *x;
            }
        
    }

    public static void main(String[] args) {
        // int n = 5;
        // printNumb(n);

        // printSum(1, 5, 0);

        // int n = 5;
        // System.out.println(calcfactorial(n));

        // int a = 0, b = 1;
        // System.out.println(a);
        // System.out.println(b);
        // int n = 7;
        // printFib(a, b, n-2);

        // int x = 2, n = 5;
        // int ans = calcPower(x, n);
        // System.out.println(ans);

        int x = 2, n = 5;
        int ans = calcpower2(x, n);
        System.out.println(ans);
    }
}
