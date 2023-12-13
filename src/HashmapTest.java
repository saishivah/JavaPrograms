import java.util.ArrayList;
import java.util.Map;
import java.util.*;

public class HashmapTest {

    public static void main(String[] args) {
        
        Map<Integer, String> mapTest = new HashMap<>();

        mapTest.put(1,"hari");
        mapTest.put(2,null);
        mapTest.put(null,null);
        mapTest.put(null,null);
        System.out.println(mapTest.get(1));
        System.out.println(mapTest);
    }


}
