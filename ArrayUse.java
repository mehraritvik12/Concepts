
public class ArrayUse {

	public static void main(String[] args) {
		int n = 10;
		int arr[] = new int[n];
//arr[0] = 15;
		//arr[10]=1; (not valid for n=10 as it starts from 0
		
System.out.println(arr[0]);
System.out.println(arr[5]);

char chArray[] = new char[11]; //(all char elements are inititlise empty)
chArray[0] = 'a';

double dArray[]= new double [12];//(all double are initalised as 0.0)
dArray[0] = 1.2;
System.out.println(chArray[0]);
System.out.println(dArray[0]);
}
	}
//boolean arr[] = new boolean[5];
//System.out.println(arr[0]);//(Whenever an boolean array is created, all elements are initialised to FALSE.)