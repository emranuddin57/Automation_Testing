package javapractice;

public class VoidStaticMethod {
	
     public void getSalary()	{
    	 
    	 int cash=200;
    	 int doller=300;
    	 String name="total = ";
    	 int total=cash+doller;
    	 System.out.println(name+total);
     }
	
	public int getSalary1() {
		int cash1=201;
		int doller1=301;
		return cash1+doller1;
		
		
		
		
		
		
		
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		VoidStaticMethod obj = new VoidStaticMethod ();
	
		obj.getSalary();
		
		obj.getSalary1();
		System.out.println(obj.getSalary1());
		
	}

}
