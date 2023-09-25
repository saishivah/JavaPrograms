

 class Something{
     Something(){
        System.out.println("this is something class");


    }
    static class innerSomething{

         void innerSomethingT(){
         System.out.println("this is inner class");
         }
    }
}

public class StaticClassTest {

    public static void main(String[] args) {
        Something.innerSomething sr = new Something.innerSomething();
        sr.innerSomethingT();

        System.out.println("class called");
    }




}
