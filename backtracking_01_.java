public class backtracking_01_ {
    public static void printpermutation(String str, String prem, int idx) {
        if (str.length() == 0) {
            System.out.println(prem);
            return;
        }
        for (int i = 0; i < str.length(); i++) {

            char currchar = str.charAt(i);
            String newString = str.substring(0, i) + str.substring(i + 1);
            printpermutation(newString, prem + currchar, idx + 1);
        }
    }
    //time complexity o(n^2)

    public static void main(String[] args) {
        String Str = "abc";
        printpermutation(Str, "", 0);

    }
}
