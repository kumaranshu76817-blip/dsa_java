public class string_02_buil {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("anshu");
        System.out.println(sb);

        // char at index 0
        System.out.println(sb.charAt(0));

        // set cahr at inde 0
        sb.insert(0, 'p');
        System.out.println(sb);

        // delete the extra 'n'
        sb.delete(0, 1);
        System.out.println(sb);

        // last me add kar dena
        sb.append(" k");
        sb.append("u");
        sb.append("m");
        sb.append("a");
        sb.append("r");
        System.out.println(sb);

        // length of string builder
        System.out.println(sb.length());

        //reverse a string
        for(int i=0; i<sb.length()/2; i++){
            int front =i;
            int back = sb.length() - 1 - i;
            char frontchar = sb.charAt(front);
            char backchar = sb.charAt(back);
            sb.setCharAt(front, backchar);
            sb.setCharAt(back, frontchar);

        }
        System.out.println(sb);
    }

}
