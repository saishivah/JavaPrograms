import java.io.File;
import java.util.Scanner;

class Filereading{
    public static void main( String args[])
    {
        File file =new File("Linkedlist.java");
       try( Scanner sc = new Scanner(file)){
          while(sc.hasNextLine()){
            System.out.println(   sc.nextLine());
         
        }
       }
        catch(Exception ex){
            System.out.println(ex);

        }

       }
       
      

    }
