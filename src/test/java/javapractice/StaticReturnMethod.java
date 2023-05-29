package javapractice;

public class StaticReturnMethod {

	// Instance variable
	static int cash;
	// static variable
	static String name;

	public static String getSalary() {
		// local variable
		int dollar = 200;
		name = "karim ";
		cash = 201;
		int total = dollar + cash;
        return name + total;

	}

	public static void getPayment() {

		cash = 202;
		name = "masud ";
		int dollar = 201;
		int total = cash + dollar;
		System.out.println(name + total);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StaticReturnMethod obj = new StaticReturnMethod();
		System.out.println(obj.getSalary());
		obj.getPayment();

		
		StaticReturnMethod.getPayment();
		System.out.println(StaticReturnMethod.getSalary());
	}

}
