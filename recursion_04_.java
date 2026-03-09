public class recursion_04_ {
    public static int first = -1;
    public static int last = -1;
    public static void findOccuracnce(String str, int idx,char element){
        if(idx == str.length()){
            System.out.println(first);
            System.out.println(last);
            return;
        }
        char currChar = str.charAt(idx);
        if(currChar == element){
            if(first == -1){
                first = idx;
            }
            else{
                last = idx;
            }
        }
        findOccuracnce(str, idx+1, element);
    }
    public static void main(String[] args) {
        String str = "abbccdeasfaah";
        findOccuracnce(str, 0, 'a');
    }
}
