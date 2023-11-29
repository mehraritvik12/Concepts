package a_ArrayList;

import java.util.ArrayList;

public class j_PairSum_BrutForce {
public static ArrayList<Integer> PairSum(ArrayList<Integer> array,int target) {
		
	ArrayList<Integer> num = new ArrayList<>();
	for(int i =0;i<array.size()-1;i++) {
		
		for(int j = i+1; j<array.size();j++) {
			
			if(array.get(i)+array.get(j)==target) {
				num.add(i);
				num.add(j);
				
			}
		}
	}
	return num;
}

	
	
	public static void main(String[] args) {
		
		
		ArrayList<Integer> height = new ArrayList<>();
		
		height.add(1);
		height.add(8);
		height.add(6);
		height.add(2);
		height.add(5);
		height.add(4);
		height.add(8);
		height.add(3);
		height.add(7);
		
		
		System.out.println(PairSum(height,3));
		
		
	
		
		
		
	}


}
