package javapractice;

public class ChildclassMulti extends VoidParametarized  {

	public void getSalary() {
		int salary=500;
		System.out.println(salary);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		VoidParametarized obj = new VoidParametarized ();
		
		obj.getEmployeesalary("masud = ", 25);
	}

}
