import java.util.ArrayList;

public class Arraylistoverride<E> extends ArrayList<E> {

    public static void main(String[] args) {

        ArrayList <String> ar = new ArrayList<>();
        ar.add("hari");
        for (String item : ar) {
            System.out.println(item);
        }
    }

@Override
    public  boolean add(E Element) {

        System.out.println("add default overridden");
        return super.add(Element);
    }
}
