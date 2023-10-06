class EmployeeAdvanced {

  int code, basic_salary;
  String name, department;

  EmployeeAdvanced() {
    code = 0;
    basic_salary = 0;
    name = "";
    department = "";
  }

  EmployeeAdvanced(String name, int code, int basic_salary, String department) {
    try {
      if (name.getClass().getSimpleName() == "Integer") {
        throw new Exception();
      }
    } catch (Exception e) {}
    this.name = name;
    this.code = code;
    this.basic_salary = basic_salary;
    this.department = department;
  }

  void show() {
    System.out.println("Employee Name is " + name);
    System.out.println("Employee Code is " + code);
    System.out.println("Employee Basic Salary is " + basic_salary);
    System.out.println("Employee Department is " + department);
    System.out.println();
  }
}

public class _10_employeException {

  public static void main(String[] args) {
    EmployeeAdvanced e1 = new EmployeeAdvanced("123", 12, 20, "nsjasns");
    e1.show();
  }
}
