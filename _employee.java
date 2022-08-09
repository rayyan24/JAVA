public class _employee
{
    int code,basic_salary;
    String name,department;
    _employee()
    {
        code=0;
        basic_salary=0;
        name="";
        department="";
    }
    _employee(String name,int code,int basic_salary,String department)
    {
        this.name=name;
        this.code=code;
        this.basic_salary=basic_salary;
        this.department=department;
    }
    int calBonus()
    {
        if(basic_salary<20000)
        {
            return 0;
        }
        return 2000;
    }
    void show()
    {
        System.out.println("Employee Name is "+name);
        System.out.println("Employee Code is "+code);
        System.out.println("Employee Basic Salary is "+basic_salary);
        System.out.println("Employee Salary After Bonus is "+(basic_salary+calBonus()));
        System.out.println("Employee Department is "+department);
        System.out.println();
    }
     public static void main(String[] args)
    {
        _employee e1=new _employee();
        e1.show();
        _employee e2=new _employee("Rayyan",1,15000,"VSIT");
        e2.show();
        _employee e3=new _employee("Rayyan",2,25000,"VSIT");
        e3.show();
    }
}