
public class StringtoInteger {

	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="21Dihit11Bangera1995";
		String temp="";
		int sum=0;
		for(int i=0;i<s.length();i++) {
			Character ch=s.charAt(i);
			System.out.println(ch);
			if(ch.isDigit(ch)) {
				temp=temp+ch;
				
			}
			else {
				sum=sum+Integer.parseInt(temp);
				temp="0";
				
			}
			
		}
		
		System.out.println("The addition of numbers in String is "+(sum+Integer.parseInt(temp)));
	
		
		

}
}