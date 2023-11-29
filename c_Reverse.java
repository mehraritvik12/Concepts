package a_ArrayList;

import java.util.ArrayList;

public class c_Reverse {

	public static void main(String[] args) {
		
		
		ArrayList<Integer> list5 = new ArrayList<>();

		list5.add(1);
		list5.add(2);
		list5.add(3);
		list5.add(4);
		list5.add(5);

		
		//rev 
		
		for(int i=list5.size()-1;i>=0;i--) {
			System.out.print(list5.get(i)+ " ");
		}
		System.out.println();

	}

}
