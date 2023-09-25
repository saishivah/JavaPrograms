import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class PrintStringClassMethods {
    public static void main(String[] args) throws ClassNotFoundException {
        // Get the Class object for the String class
        Class<?> stringClass = Class.forName("java.lang.String");

        // Print the name of the class
        System.out.println("Class Name: " + stringClass.getName());

        // Get the declared fields of the class
        Field[] fields = stringClass.getDeclaredFields();

        // Print the names of the fields
        System.out.println("Fields:");
        for (Field field : fields) {
            System.out.println(field.getName());
        }

        // Get the declared methods of the class
        Method[] methods = stringClass.getDeclaredMethods();

        // Print the names of the methods
        System.out.println("Methods:");
        for (Method method : methods) {
            System.out.println(method.getName());
        }
    }
}
