package a_ArrayList;
import java.util.ArrayList;
public class b_sizeOFArrayList {

	public static void main(String[] args) {
		
		
		ArrayList<Integer> list4 = new ArrayList<>();

		list4.add(1);
		list4.add(2);
		list4.add(3);
		list4.add(4);
		list4.add(5);

		
		System.out.println(list4.size());
	
	
	for(int i=0;i<list4.size();i++) {
		System.out.print(list4.get(i)+ " ");
	}
	System.out.println();
}
}