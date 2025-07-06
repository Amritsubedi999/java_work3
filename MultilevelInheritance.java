class Dog {
    public void eat() {
        System.out.println("The dog eats food.");
    }
}
class Cat extends Dog {
    public void walk() {
        System.out.println("The cat walks.");
    }
}
class Parrot extends Cat {
    public void sleep() {
        System.out.println("The parrot sleeps.");
    }
}
public class MultilevelInheritance {
    public static void main(String[] args) {
        Parrot p = new Parrot();
        p.eat();   
        p.walk();  
        p.sleep();  
    }
}
