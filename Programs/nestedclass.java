

class Something{
    Something(){
        System.out.println("this is something class");


    }
    class innerSomething{

        void innerSomethingT(){
            System.out.println("this is inner class");
        }
    }
}

public class PublicClassTest {

    public static void main(String[] args) {
        Something sr = new Something();
        Something.innerSomething inner_s = sr.new innerSomething();
        inner_s.innerSomethingT();

        System.out.println("class called");
    }




}
