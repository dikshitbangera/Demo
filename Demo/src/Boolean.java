
public class Boolean {
	public void m1(int i,float f) {
		System.out.println("int float method");
	}
	public void m1(float f,int i) {
		System.out.println("float int method");
	}
	public static void main(String a[]) {
		Boolean s=new Boolean();
		s.m1(20,20.0f);
		
	}
}
