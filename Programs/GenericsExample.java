//
public class GenericsExample {

    public static void main(String[] args) {
        // Creating a generic class instance with Integer type argument
        Box integerBox = new Box<>();
        integerBox.set(10); // Setting value
        Object intValue = integerBox.get(); // Getting value
        System.out.println("Integer value: " + intValue);

        // Creating a generic class instance with String type argument
        Box<String> stringBox = new Box<>();
        stringBox.set("Hello, Generics!"); // Setting value
        String stringValue = stringBox.get(); // Getting value
        System.out.println("String value: " + stringValue);
    }

    // Generic class
    public static class Box<T> {
        private T value;

        public void set(T value) {
            this.value = value;
        }

        public T get() {
            return value;
        }
    }
}
//
//
//In this example, we have a generic class Box that can hold a value of any type. We create two instances of the Box class, one with Integer type argument and another with String type argument. We set values of different types (an integer and a string) in their respective Box instances and retrieve the values using the get method. Finally, we print the values to the console.
//
//        This program demonstrates the flexibility of generics, allowing us to create reusable code that can work with different types without sacrificing type safety.