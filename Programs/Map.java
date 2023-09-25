import java.util.HashMap;

public class Map {

    public static void main(String[] args) {
        HashMap<Integer,String> Map1= new HashMap<Integer,String>();
        HashMap<Character,Integer> Map2= new HashMap<Character,Integer>();

        String String1="Hello";
        String1.charAt(1);

    for(int i=0;i<String1.length();i++)
    {
       Character c= String1.charAt(i);
            if (Map2.containsKey(c)){
                
                Integer count=Map2.get(c)+1;

                Map2.put(c,count);
                
            }
            else{
                Map2.put(c, 1);
            }
        }
        for(Character c: Map2.keySet()){
            System.out.print(c+":");
            System.out.print(Map2.get(c));
            System.out.println();

        }

        
        

        Map1.put(1,"Test");
        Map1.put(2,"Test2");

        for(Integer i:Map1.keySet()){
            System.out.println(Map1.get(i));
        }




    }
    
}
