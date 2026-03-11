public class recursion_10_premu {

    public static void printPrem(String str, String premutation){
        if(str.length() == 0){
            System.out.println(premutation);
            return;
        }
        for(int i=0; i<str.length(); i++){
            char currchar = str.charAt(i);
            String newString = str.substring(0,i) + str.substring(i+1);
            printPrem(newString, premutation+currchar);
        }
    }
    public static void main(String[] args) {
        String str = "abc";
        printPrem(str, "");
    }
}