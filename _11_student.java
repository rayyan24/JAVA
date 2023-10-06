//import java.util.Scanner;
/**
 * Student
 */
abstract class Student  {
    int id,grade,age;
    String name,address;
    Student(){
        id=grade=age=0;
        name=address="NONE";
    }
    Student(String name,String address,int id,int grade,int age){
        this.name=name;
        this.address=address;
        this.id=id;
        this.grade=grade;
        this.age=age;
    }
    abstract boolean isPassed();
    void show(){
        System.out.println(name);
        System.out.println(address);
        System.out.println(id);
        System.out.println(grade);
        System.out.println(age);
        if (isPassed()) {
            System.out.println("Passed");
        }
        else{
            System.out.println("Not Passed");
        }
    }    
}
class Graduate extends Student {
    Graduate(){
        super();
    }
    Graduate(String name,String address,int id,int grade,int age){
        super(name,address,id,grade,age);
    }
    boolean isPassed() 
    {
        if(grade>=0 && grade<=100)
        {
            if (grade>70) 
            {
                return true;
            }
            return false;
        }
        else{
            System.out.println("Enter a grade between 0 and 100");
        }
        return false;
    }
}
class UnderGraduate extends Student {
    UnderGraduate(){
        super();
    }
    UnderGraduate(String name,String address,int id,int grade,int age){
        super(name,address,id,grade,age);
    }
    boolean isPassed() 
    {
        if(grade>=0 && grade<=100)
        {
            if (grade>80) 
            {
                return true;
            }
            return false;
        }
        else{
            System.out.println("Enter a grade between 0 and 100");
        }
        return false;
    }
}
public class _11_student
{
     public static void main(String[] args)
    {
        Graduate g1=new Graduate("Rayyan","Daryaganj",1,90,20);
        g1.show();
    }
}