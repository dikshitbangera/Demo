
public class StaticBlock {
	
	static int speed=90;

	
	void run() {
		final int speed=400;
		System.out.println(speed);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StaticBlock c=new StaticBlock();
		c.run();
	}

}
