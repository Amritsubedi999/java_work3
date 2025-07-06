class Animal {
    public void walk() {
        System.out.println("This animal walks.");
    }
}
class Dog extends Animal {
    public void leg() {
        System.out.println("Dog has 4 legs.");
    }
}
class Parrot extends Animal {
    public void leg1() {
        System.out.println("Parrot has 2 legs.");
    }
}
public class HierarchicalInheritance {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.leg();
        d.walk();
        Parrot p = new Parrot();
        p.leg1();
        p.walk();
    }
}
