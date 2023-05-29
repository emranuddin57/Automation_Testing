package javapractice;

public class VoidParametarized extends Parametarized_method {

	// static String name;
	// int salary;

	public void getEmployeesalary(String name, int salary) {
		System.out.println(name + salary);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		VoidParametarized obj = new VoidParametarized();
		obj.getEmployeesalary("Emran is = ", 100);

		obj.myReturn("thanks fahim", 10, 20);

	}

}
