import java.util.Arrays;

public class SecondLargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {19,18,17,16,15,14};
		Arrays.sort(arr);
		System.out.println(arr);
		int largest=0;
		int secondlargest=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>largest) {
				secondlargest=largest;
				largest=arr[i];
			}
			else {
				secondlargest=largest;
			}
		}
		System.out.println(Arrays.toString(arr));
		System.out.println("The second largest is " +secondlargest);
	}

}
