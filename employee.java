class Employee{
int emp_id;
String emp_name=Yashu;
public void showEmpDetails(){
System.out.println("emp id" +empid);
System.out.println("emp name" +emp_name);
}
public static void main(String args[]){
Employee employee=new Employee();
employee.showEmpDetails();
}
}