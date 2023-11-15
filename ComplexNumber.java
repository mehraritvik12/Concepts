package classes_and_object;

public class ComplexNumber {

	double real , img;
	ComplexNumber (double r , double i ) {
		this.real = r;
		this.img = i;
	}
	public static ComplexNumber sum(ComplexNumber c1, ComplexNumber c2 )
	{ 
		ComplexNumber temp = new ComplexNumber(0,0);
		temp.real = c1.real + c2.real;
		temp.img = c1.img  + c2.img;
		return temp;
	}
	
	
	
	
}