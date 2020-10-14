
public class Prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numb=13;
		if(primenum(numb)) {
		
			System.out.println("The Number is Prime");
		}
		else {
			System.out.println("the number is not prime");
		}
		
	}
	
	public static boolean primenum(int number) {
		
		
	
	
		for(int i=2;i<number/2;i++) {
			if(number%i==0) {
				return false;
			}
			else {
				return true;
			}
		}
		return true;
	}

}
