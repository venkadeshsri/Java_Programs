package java_programs;

public class Class_emp_exa1 {

	public static void main(String[] args) {
		
		Class_emp_exa emp =new Class_emp_exa();
		emp.empid = 1005;
		emp.ename = "venkat";
		emp.job = "IT";
		emp.salary = 100000;
		
		emp.display();
		String s = emp.method_return();
		System.out.println(s);

	}

}
