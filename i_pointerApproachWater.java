package a_ArrayList;

import java.util.ArrayList;

public class i_pointerApproachWater {
	//0(N) time complexity
	
public static int storeWater(ArrayList<Integer> height) {
		
		int maxWater=0;
	    int lp=0;
	    int rp=height.size()-1;
	    
	    while(lp<rp) {
	    	
	    	
   //cal water area
	    	
	    	
	    	int ht= Math.min(height.get(lp),height.get(rp));
	    	int wdth= rp-lp;
	    	int currwater = ht*wdth;
	    	maxWater= Math.max(maxWater, currwater);
	    	
	    	
	//update ptr
	    	
	    	if(height.get(lp)<height.get(rp)) {
	    		lp++;
	    	}
	    	else {
	    		rp--;
	    	}
	    
	    }
	    return maxWater;
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
		
		
		System.out.println(storeWater(height));
		
		
	
		
		
		
	}

}
