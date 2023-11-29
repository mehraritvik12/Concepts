package a_ArrayList;
import java.util.ArrayList;
public class a_Intro {

	public static void main(String[] args) {
		
		//ClassName objName = new ClassName();
		ArrayList<Integer> list = new ArrayList<>();
		ArrayList<String> list2 = new ArrayList<>();
		ArrayList<Boolean> list3 = new ArrayList<>();
		
		
		
		
//Add Element - O(1)
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		
	//  	list.add(1,9);    // 1 element ki jgha 9 dal diya and  O(n)  Time complexity
		
		System.out.println(list);
		
		
//Get Operation - O(1)
		int element = list.get(2);
		System.out.println(element);
		


//Delete - O(n)
		list.remove(2);
		System.out.println(list);
		
		
//Set Element at Index  - O(n)
		list.set(2, 10);                 // 2 element i.e 3ki jgha 10
		System.out.println(list);
		
		
//Contains   - O(n)
		
		System.out.println(list.contains(2));
		System.out.println(list.contains(12));
	}

}
