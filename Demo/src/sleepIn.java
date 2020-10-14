
public class sleepIn {
	public boolean sleepIn2(boolean weekday, boolean vacation) {
		if(!weekday||vacation) {
		return true;
	}
		return false;
	
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sleepIn s=new sleepIn();
		System.out.println(s.sleepIn2(false, true));
	

	}
}
