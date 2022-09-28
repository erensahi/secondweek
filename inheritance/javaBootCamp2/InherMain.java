package javaBootCamp2;

public class InherMain {

	public static void main(String[] args) {
		Employee employee=new Employee();
		Customer1 customer=new Customer1();
		
		CustomerMenager1 customerMenager=new CustomerMenager1();
		EmployeeMenager employeeMenager=new EmployeeMenager();

		employeeMenager.EmployeeOfMonth();
		customerMenager.Add();

	}

}
