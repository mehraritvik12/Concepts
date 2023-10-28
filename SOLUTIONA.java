import java.util.Scanner;
public class SOLUTIONA{
	
	public static int sum(int[] arr) {
		//Your code goes here
        int sum = 0;
        int len = arr.length;
        
        for (int i = 0; i<len; i++){
            int num = arr[i];
            sum+=num;
            
        }
        return sum;
	}

}