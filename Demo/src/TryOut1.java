class TryOut{
	String str1="x";
	public TryOut() {
		myMethod();
	}
	void myMethod() {
		System.out.println(str1+"");
	}
}
public class TryOut1 extends TryOut {

	String str2="y";
	void myMethod() {
		System.out.println(str2+"");
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TryOut1 s=new TryOut1();
		s.myMethod();
	}

}
