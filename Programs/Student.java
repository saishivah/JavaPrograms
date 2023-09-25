import java.util.ArrayList;

class Person{
    private String name;
    public Person(String name){
        this.name = name;
    }
    public void displayPerson() {
        System.out.println("Data of the Person class: ");
        System.out.println("Name: "+this.name);
    }
}
public class Student extends Person {
    public Student(String name){
        super(name);
    }
    public void displayPerson() {
        System.out.println("Data of the Student class: ");
        //        System.out.println("Name: "+super.name);
        super.displayPerson();
    }

    public void printArray(int nums[],int c)
    {
        nums[0]=5;
        c=2;
        System.out.println(c);
        for(int a:nums){
            System.out.print(a);
            System.out.print(',');
        }





    }
    public static void main(String[] args) {
        Student std = new Student("Krishna");
        int c=0;
        int nums[]= {1,2,3,4,5};
        ArrayList <Student> al = new ArrayList<Student>(3);

        std.printArray(nums,c);
        std.displayPerson();
        System.out.println(c);//pass by value
    }
}