package a_ArrayList;

import java.util.ArrayList;
import java.util.Collections; 

public class f_Sorting_array {

	public static void main(String[] args) {
		ArrayList<Integer> list5 = new ArrayList<>();

		list5.add(7);
		list5.add(5);
		list5.add(8);
		list5.add(4);
		list5.add(2);

Collections.sort(list5);    //ascending order
System.out.println(list5);

Collections.sort(list5,Collections.reverseOrder());   //  Collections.reverseOrder()  is Comparator - jo function logic define krta hai
System.out.println(list5);
	}

}
