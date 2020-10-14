import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class square56 {

	public List<Integer> square561(List<Integer> nums) {
		Integer temp=0;
			  for(int i=0;i<nums.size();i++) {
				  
			  temp=nums.get(i)*nums.get(i);
			  nums.remove(i);
			  nums.add(i, temp+10);
			  temp=0;
			  
		  }
			  for(int j=0;j<nums.size();j++) {
				  Integer rem=nums.get(j)%10;
				 if(rem.equals(5)||rem.equals(6)) {
					 nums.remove(j);
					 
			 }
	}
			 //System.out.println(temp);
		  
		  
		
		return nums;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> nums=new ArrayList<Integer>();
		nums.add(2);
		nums.add(1);
		nums.add(16);
		nums.add(5);
		nums.add(5);
		//System.out.println(nums);
		square56 s=new square56();
		System.out.println(s.square561(nums));
	}

}
