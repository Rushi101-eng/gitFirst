class Employee 
{
 int empId = 1234;
 String empName = "Rushi";
 double empSalary = 25000;
 
void getEmployee()
{
	System.out.println("Employee id is " + empId);
	System.out.println("Employee Name is " + empName);
	System.out.println("Employee salary is " + empSalary);
}

public static void main(String[] args) 
{
 Employee obj1 = new Employee();
 Employee obj2 = new Employee();

 obj1.getEmployee();
 System.out.println("===========================");
 obj2.getEmployee();
}
}