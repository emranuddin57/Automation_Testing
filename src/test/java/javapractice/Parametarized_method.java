package javapractice;

public class Parametarized_method {
	
	public String  myReturn(String name,  int emran, int fahim) {
	int total= emran + fahim;
	return name+total;	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Parametarized_method objcalculation = new Parametarized_method();
		
		System.out.println(objcalculation.myReturn("total value = ", 5000, 7000));
		
	
		
	}

}
