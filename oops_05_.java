abstract class Animal{
    abstract void walk();
    public void eat(){
        System.out.println("eating");
    }
    
}
class Horse extends Animal{
    public void walk(){
        System.out.println("walk on 4 legs");
    }
    Horse(){
        System.out.println("created a horse");
    }
}
class Chicken extends Animal{
    public void walk(){
        System.out.println("walk on 2 legs");
    }
}
public class oops_05_ {
    public static void main(String[] args) {
        Horse horse = new Horse();
        horse.walk();
        horse.eat();

            
        
    }
}
