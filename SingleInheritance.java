class Dog {
    void eat() {
        System.out.println("The dog eats food.");
    }
}
class Cat extends Dog {
    void sleep() {
        System.out.println("The cat sleeps.");
    }
}
public class SingleInheritance{
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.eat();   
        cat.sleep();  
    }
}
