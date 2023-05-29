package javapractice;

public class ExcutionClass extends VoidParametarized  {
	
 public void getPayment() {
	 int pay=200;
	 System.out.println(pay);
 }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ExcutionClass obj = new ExcutionClass();
		obj.getEmployeesalary(null, 0);
        obj.getPayment();
        obj.myReturn(null, 0, 0);
	}

}
