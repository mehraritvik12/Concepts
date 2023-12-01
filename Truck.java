package vehicle_temp;

import Vehicle.vehicle;

public class Truck extends vehicle{
	int maxLoadingCapacity;
	public void print() {
		
		System.out.println("Truck capacity:  " + maxLoadingCapacity);
		
		System.out.println("Truck colour :" + colour);
	
	     System.out.println("Truck speed :" + getMaxSpeed());


	}

}
