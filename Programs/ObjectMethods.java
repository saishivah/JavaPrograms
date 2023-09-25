import java.lang.reflect.Method;

public class ObjectMethods {
    public static void main(String[] args) {
        Student tempStudent = new Student("Hari", 1);
        System.out.println(tempStudent.getClass());
        System.out.println(tempStudent.getName());
        System.out.println(tempStudent.getId());
        System.out.println(tempStudent.hashCode());
        System.out.println(tempStudent.toString());
        System.out.println(Student.class);
        System.out.println(tempStudent.getClass());
         Method m[]=Student.class.getDeclaredMethods();
        //  for (int i = 0; i < m.length; i++)
        //  {
        //    System.out.println(m[i].toString());
        //  }
        
        for(Method i : m){
            System.out.println(i.toString());
        }
        
    }
    
}
class Student{
    private String name;
    private int id;
    Student(String name,int id)
    {
     this.name=name;
     this.id=id;

    }
    public String getName() {
        return name;
    }
    public int getId() {
        return id;
    }
    
   public String toString(){
    return "name:"+name+""+" id:"+id;

   }
}
