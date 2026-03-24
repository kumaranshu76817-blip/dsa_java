// **INHERITANCE**
class Shape{
    String color;
    public void area(){
        System.out.println("display area");
    }
}
class Triangle extends Shape{
    public void area(int l, int h){
        System.out.println(1/2*l*h);
    }
}
class Circle extends Shape{
    public void area (int r){
        System.out.println(r*r);
    }
}

class EquilateralTriangle extends Triangle{
    public void area(int l, int h){
        System.out.println(1/2*l*h);
    }
}
public class oops_03_inher {
    public static void main(String[] args) {
        Triangle t1 = new Triangle();
        t1.area(8,9);
    }
}
