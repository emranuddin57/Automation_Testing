package javapractice;


public class Return_method {
	
	public String myReturn() {
		String name="total = ";
		int mahin= 5000;
		int rafi= 6000;
		int total= mahin+rafi;
		return name + total;
		
		
	}

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Return_method obj = new Return_method();
		System.out.println(obj.myReturn());
		
	}

}
