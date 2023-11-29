package a_ArrayList;

import java.util.ArrayList;

public class k_Pairsum_pointers {

	public static boolean PairSum(ArrayList<Integer> array,int target) {
		int lp =0;
		int rp= array.size()-1;
		
		while(lp!=rp) {
			//case1
			
			
			if(array.get(rp)+array.get(lp)==target) {
				return true;
			}
			
			//case2
			
			if((array.get(rp)+array.get(lp))<target) {
			lp++;
			}
			else {
				
				rp--;
			}
			
		}
		return false;
			
			
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
