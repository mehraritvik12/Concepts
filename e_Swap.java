package a_ArrayList;

import java.util.ArrayList;

public class e_Swap {
	public static void Swap(ArrayList<Integer> list5,int a,int b) {
		int temp = list5.get(a);
		list5.set(a,list5.get(b));
		list5.set(b,temp);
	}

	public static void main(String[] args) {
		ArrayList<Integer> list5 = new ArrayList<>();

		list5.add(2);
		list5.add(5);
		list5.add(9);
		list5.add(8);
		list5.add(6);
		
		
		int a=1; 
		int b=3;
System.out.println(list5);
		Swap(list5,a,b);
		System.out.println(list5);
	}

}
