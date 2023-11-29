package a_ArrayList;

import java.util.ArrayList;

public class d_Find_Max {

	public static void main(String[] args) {
	
		ArrayList<Integer> list5 = new ArrayList<>();

		list5.add(2);
		list5.add(5);
		list5.add(9);
		list5.add(6);
		list5.add(8);
//O(n)
		int max= Integer.MIN_VALUE;
		for(int i = 0 ; i<list5.size();i++) {
//			if(max<list5.get(i)) {
//			max = list5.get(i);
//			}
			max = Math.max(max,list5.get(i));
		}
		System.out.println("max value = " + max);
	
		
		

	}

}
