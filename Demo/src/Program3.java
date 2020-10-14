
public class Program3 {
	public void method(int...a) {
		System.out.println(a.length);
	}
	public void method(float[] a) {
		System.out.println(a[5]);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Program3 a=new Program3();
		int[] arr= {10,20,30,40,50};
		a.method(arr);
	}

}
