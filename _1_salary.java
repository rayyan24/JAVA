import java.util.Scanner;
public class _1_salary
{
     public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);
        float salary=-1;
        // Take Only Positive Input
        while(!(salary>0))
        {
            System.out.print("Enter Salary: ");
            salary=input.nextInt();
        }
        if(salary<20000){
            System.out.println("Not A Valid Salary");
        }    
        else if (salary>=20000&&salary<30000) {
            System.out.println("Salary="+salary);
            System.out.println("HRA = 1000");
            System.out.println("Provident Fund="+(salary*0.05));
            System.out.println("Bonus="+(salary*0.05));
        }
        else if (salary>=30000&&salary<40000) {
            System.out.println("Salary="+salary);
            System.out.println("HRA = 2000");
            System.out.println("Provident Fund="+(salary*0.1));
            System.out.println("Bonus="+(salary*0.15));
        }
        else if (salary>=40000&&salary<50000) {
            System.out.println("Salary="+salary);
            System.out.println("HRA = 3000");
            System.out.println("Provident Fund ="+(salary*0.12));
            System.out.println("Bonus= "+(salary*0.25));
        }
        else if (salary>=50000) {
            System.out.println("Salary="+salary);
            System.out.println("HRA = "+(salary*0.1));
            System.out.println("Provident Fund ="+(salary*0.15));
            System.out.println("Bonus= "+(salary*0.35));
        }
        input.close();
    }
}