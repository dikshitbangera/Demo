import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Scanner;
import java.util.TreeSet;

class demo1{
	
	public void m1() throws Exception{
		System.out.println("marriage");
	}
	

	

//Integer[] arr= {1,10,3,6,8};
//Arrays.sort(arr,Collections.reverseOrder());
//System.out.println(" "+Arrays.toString(arr));
//
//
//ArrayList<String> fruits=new ArrayList<String>();
//fruits.add("Lemon");
//fruits.add("Apple");
//fruits.add("Watermelon");
//
//Collections.sort(fruits);
//
//for(String s: fruits) {
//	
//	System.out.println(s);
//}
//
//HashMap<Integer,String> map=new HashMap<Integer,String>();
//map.put(1, "Dikshit");
//map.put(2, "Puneet");
//map.put(3, "Shyamala");
//map.put(4, "Shyamala");
////map.replace(3, "Anand");
////map.replace(key, value)
//System.out.println(map);
//
//LinkedHashSet<String> list =new LinkedHashSet<String>();
//list.add("Anand");
//list.add("Shyamala");
//list.add("Dikshit");
//list.add("Dikshit");
//System.out.println(list);
//
//HashSet<String> set=new HashSet<String>();
//set.add("Anand");
//set.add("puneet");
//set.add("Shyamala");
//set.add("dikshit");
//set.add("dikshit");
//System.out.println(set);
//
//TreeSet<String> tree=new TreeSet<String>();
//tree.add("Dikshit");
//tree.add("akash");
//tree.add("Dongre");
//tree.add("vikas");
//tree.add("Anoop");
//tree.add("Anoop");
//System.out.println(tree.last());
//System.out.println(tree);
//}
}

class demo extends demo1 {
	public void m1() throws Exception{
		
		System.out.println("no marriage");
	}
	public static void main(String args[]) throws Exception {
		String s="Dikshit";
		String temp="";
		for(int i=s.length()-1;i>=0;i--) {
			Character c=s.charAt(i);
			temp=temp+c;
			
		}
		System.out.println(temp);
		//System.out.println("Enter the Factorial number: ");
		
//		Scanner sc=new Scanner(System.in);
//		int n=sc.nextInt();
		
	    int n=5;
		int fact=1;
		for(int i=1;i<=n;i++) {
			fact=fact*i;
		}
		System.out.println(fact);
		
		int num=727;
		int rem=0;
		int sum=0;
		int temp1=num;
		while(temp1>0) {
			rem=temp1%10;
			sum=(sum*10)+rem;
			temp1=temp1/10;
		}
		System.out.println(sum);
		if(sum==num) {
			System.out.println("the number is factorial");
		}
		else {
			System.out.println("the number is not factorial");
		}
		
		for(int i=1;i<=10;i++) {
			System.out.println("");
			for(int j=1;j<=i;j++) {
				System.out.print(" "+j);
				
			}
		}
		
		for(int k=10;k>0;k--) {
			System.out.println("");
			for(int l=k;l>0;l--) {
				System.out.print(" "+l);
			}
		}
	}
	
}

