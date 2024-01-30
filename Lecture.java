 class Employee {

int employeeId;
int salary;
String dept;

Employee(int empid, int sal, String d) {

employeeId=empid;
salary=sal;
dept =d;
}
public static void main(String[] args) {

Employee rafi = new Employee (101,3000, "Testing");

Employee mohm = new Employee (102,5000, "Engineering");

System.out.println(rafi.employeeId+" Salary "+rafi.salary+" Dept "+rafi.dept);

System.out.println(mohm.employeeId+" Salary "+mohm.salary+" Dept "+mohm.dept);
}
}
