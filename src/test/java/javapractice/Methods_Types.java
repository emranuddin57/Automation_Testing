package javapractice;

public class Methods_Types {
	
	
	// void method
	
	public void getEmployee(){
		String name="Emran " ;
		int salary=10000;
		int bonus=3000;
		int total=salary+bonus;
		System.out.println(name+total);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Methods_Types obj = new Methods_Types() ;
		obj.getEmployee();
		 
	
	}

}
