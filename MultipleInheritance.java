interface Dog{
    default void walk() {
        System.out.println("The dog walks");
    }
}
interface Cat{
    default void sleep() {
        System.out.println("The cat sleeps");
    }
}
class Parrot implements Dog, Cat {
    @Override
    public void walk() {
        System.out.println("The parrot walks.");
    }

    @Override
    public void sleep() {
        System.out.println("The parrot sleeps.");
    }
}
public class MultipleInheritance{
    public static void main(String[] args) {
        Parrot p = new Parrot();
        p.walk();
        p.sleep();
    }
}
