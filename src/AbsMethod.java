abstract class Superclass {
    public void method1() {
        // Implementation in the superclass
        System.out.println("method 1 in super class");
    }

    public void method2() {
        // Implementation in the superclass
        System.out.println("method 2 in super class");
    }

    public abstract void abstractMethod();
}

class Subclass extends Superclass {
    public void method2() {
        // Overriding the method from the superclass
        // Provides a new implementation specific to the subclass
    }

    public void additionalMethod() {
        // Additional method specific to the subclass
    }

    // The abstract method from the superclass must be implemented in the subclass
    @Override
    public void abstractMethod() {
        // Implementation in the subclass
        System.out.println("abstract method overridden");

    }
}

public class AbsMethod {
    public static void main(String[] args) {
//        Superclass obj1 = new Superclass();
//        obj1.method1();  // Accessing method from the superclass

        Superclass obj2 = new Subclass();
        obj2.method1();  // Accessing method from the superclass
        obj2.method2();  // Accessing overridden method in the subclass
        obj2.abstractMethod();
        // obj2.additionalMethod();  // Not accessible because it's specific to the subclass

        Subclass obj3 = new Subclass();
        obj3.method1();  // Accessing method from the superclass
        obj3.method2();  // Accessing overridden method in the subclass
        obj3.additionalMethod();  // Accessing method specific to the subclass
    }
}
