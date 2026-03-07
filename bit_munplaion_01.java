import java.util.Scanner;

public class bit_munplaion_01 {
    public static void main(String[] args) {
    // GET BIT
    int n = 5;
    int pos = 2; 
    int bitMask = n<<pos;
    if((bitMask &n) == 0){
        System.out.println("bit was zero");
    }
    else{
        System.out.println("bit was one");
    }



    // SET BIT
    int k = 5;//0101
    int pos1 = 1;
    int bitMask1 = 1<<pos1;
    int newNumber = bitMask1 | n;
    System.out.println(newNumber);


    // CLEAR BIT
    int n2 = 5;
    int pos3 = 2;
    int bitMask2 = 1<<pos3;
    int notBitMask = ~(bitMask2);
    int newNumber2 = notBitMask & n2;
    System.out.println(newNumber2);


    // UPDATE BIT
    Scanner sc = new Scanner(System.in);
    int oper = sc.nextInt();
    int n3 = 5;
    int pos4 = 1;

    int bitMask4 = 1<<pos4;
    if(oper == 1){
        int newNumber3 = bitMask4 | n3;
        System.out.println(newNumber3);
    }
    else{
        int newBitMask = ~(bitMask);
        int newNumber4 = newBitMask & n;
        System.out.println(newNumber4);
    }
    }

}
