import java.io.*;
import java.util.*;


class Student implements Comparable<Student>{
    int id;
    String name;
    String branch;
    public Student(int id, String name, String branch) {
        this.id = id;
        this.name = name;
        this.branch = branch;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getBranch() {
        return branch;
    }
    public void setBranch(String branch) {
        this.branch = branch;
    }

    public int compareTo(Student s)
	{
		return this.id - s.id;
	}

    
}

class NameCompare implements Comparator<Student>{

  

    @Override
    public int compare(Student s1, Student s2) {
        // TODO Auto-generated method stub
       return s1.getName().compareTo(s2.getName());
    }


}



class IdAndName implements Comparator<Student>{

  

    @Override
    public int compare(Student s1, Student s2) {
        // TODO Auto-generated method stub
        if(s1.getId()==s2.getId()){

           return s1.getName().compareTo(s2.getName());

        }
        else{
            return s1.id - s2.id;
        }


       
    }


}



public class CustomSortArrayList {

    public static void main(String[] args) {
        
        ArrayList<Student> studentList= new ArrayList<>();
        studentList.add(new Student(2,"prasad","computer science"));
          studentList.add(new Student(1,"sai","computer science"));
       studentList.add(new Student(1,"sai","electronics"));
      
        studentList.add(new Student(1,"hari","computer science"));
       
        studentList.add(new Student(3,"sai","computer science"));
        
        System.out.println("Sorting by ids:");
        Collections.sort(studentList);

        for(Student st: studentList){
            System.out.println(st.getName()+ "" +st.getId());
        }

        NameCompare nameCompare = new NameCompare();

        System.out.println("Sorting by names");
        Collections.sort(studentList,nameCompare);


        for(Student st: studentList){
            System.out.println(st.getName()+ "" +st.getId());
        }

        IdAndName idandName = new IdAndName();
        System.out.println("Sorting by Id then name");
        Collections.sort(studentList,idandName);
        for(Student st: studentList){
            System.out.println(st.getName()+ "" +st.getId()+" " + st.getBranch());
        }
        // System.out.println(studentList);

    }


    
}
