public class SingleTonExample {
    private SingleTonExample() {
        System.out.println("In a private constructor");
    }
    public static SingleTonExample getObject() {
        // we can call this constructor
        if (ref == null)
            ref = new SingleTonExample();
        return ref;
    }
    private static SingleTonExample ref;
}


class PrivateConstructorDemo {
    public static void main(String args[]) {
        SingleTonExample sObj = SingleTonExample.getObject();
    }
}
