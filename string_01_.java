public class string_01_ {
    public static void main(String[] args) {
        String firstName = "anshu";
        String lastName ="kumar";
        String fullname = firstName +" "+lastName;
        System.out.println(fullname.length());
        for(int i=0; i<fullname.length(); i++){
            System.out.print(fullname.charAt(i));
        }
        String name1 = "anshu";
        String name2 = "anshu";
        if (name1.compareTo(name2)== 0) {
            System.out.println("\nstring are equal");
        }
        else{
            System.out.println("\nstring are not equal");
        }
        if(new String("anshu") == new String("anshu")){
            System.out.println("string are equal");
        }
        else{
            System.out.println("string are not equal");
        }
        String sentence = "anshukumar";
        String name = sentence.substring(0);
        System.out.println(name);

    }
}
