import java.util.HashSet;

public class recursion_08_subsquence {
    public static void subsquence(String str, int idx, String newString,HashSet<String> set){
        if(idx == str.length()){
            if(set.contains(newString)){
                return;
            }
            else{
                System.out.println(newString);
                set.add(newString);
                return;
            }
        }
        char currChar = str.charAt(idx);
        // to be
        subsquence(str, idx + 1, newString +currChar,set );
        // not to be
        subsquence(str, idx + 1, newString,set);
    }
    //time complexity 0(2^n)
    public static void main(String[] args) {
        String str = "aaa";
        HashSet<String> set = new HashSet<>();
        subsquence(str, 0, "",set);
    }
}
