package javapractice;

public class StaticReturn_Method {

	int pound; // instance variable
	
	static String name;
	
	public static String getMoney(){
		
		name="total salary =  ";
		int fahim=1000;
		int rafi=999;
		int total=fahim+rafi;
		return name+total;
	}
		
		

	
	
	public static void main(String[] args) {
		
		System.out.println(StaticReturn_Method.getMoney());

	}

}
