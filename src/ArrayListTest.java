import java.util.ArrayList;

public class ArrayListTest {

    public  ArrayListTest(){
        System.out.println("constructor");
    }
    public static void main(String[] args) {

        int c=0;
        ArrayList<String> test = new ArrayList<>();

        java.util.ArrayList<String> al = new java.util.ArrayList<String>(3);
        al.add("hari");
        al.add("sai");
        System.out.println(al.contains("hari"));  //true
        al.remove(0);
        System.out.println(c);//pass by value

        ArrayListTest ar;
        ExtendAl ex= new ExtendAl();

        ArrayList< ExtendAl> EAL_ArrayList= new ArrayList<>();
        ExtendAl eal= new ExtendAl();
        EAL_ArrayList.add(eal);
        EAL_ArrayList.get(0).greet();

    }
}

 class ExtendAl extends ArrayListTest{
    ExtendAl(){
        System.out.println("extended class");
        ArrayListTest ar= new ArrayListTest();
    }
     static String  name="user";
    public static void greet(){
        System.out.println("great");
        System.out.println(name);
    }



}


