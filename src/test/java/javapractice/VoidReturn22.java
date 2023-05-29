package javapractice;

public class VoidReturn22 {

	public void getPayment() {
		String name="total value = ";
		double riyal=200.20;
		double pound=300.21;
		double total= riyal+pound;
		System.out.println(name+total);
	}
	
	public String getBounas() {
		String name1="total value = ";	
		int blackmoney=501;
		int whitemoney=701;
		int total1=blackmoney+whitemoney;
		return name1+total1;
		
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		VoidReturn22 obj = new VoidReturn22();
		
		obj.getPayment();
	
		System.out.println(obj.getBounas());
		
		
	}

}
