public class recursion_06_ {
    public static void moveAllx(String str, int idx, int count, String newsString){
        if(idx == str.length()){
            for(int i=0; i<count; i++){
                newsString += 'x';
                
            }
            System.out.println(newsString);
            return;
        }
        char currchar = str.charAt(idx);
        if(currchar == 'x'){
            count++;
            moveAllx(str, idx+1, count, newsString);
        }
        else{
            newsString += currchar;
            moveAllx(str, idx+1, count, newsString);
        }
    }
    //time complexity 0(2n)
    public static void main(String[] args) {
        String str = "axbcxxd";
        moveAllx(str, 0, 0, "");
    }
}
