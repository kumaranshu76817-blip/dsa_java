class Pen{
    String color;
    String type;

    public void write(){
        System.out.println("writting something");
    }

    public void printColor(){
        System.out.println(this.color);
    }

}

class Student{
    String name;
    int age;

    public void printInfo(){
        System.out.println(this.name);
        System.out.println(this.age);
    }
}
public class oops_01_ {
    public static void main(String[] args) {
        Pen pen1 = new Pen();
        pen1.color = "blue";
        pen1.type = "gel";

        
        Pen pen2 = new Pen();
        pen2.color = "black";
        pen2.type = "ballpint";

        pen1.printColor();
        pen2.printColor();

        Student s1 = new Student();
        s1.name = "anshu";
        s1.age = 18;

        s1.printInfo();
    }
}
