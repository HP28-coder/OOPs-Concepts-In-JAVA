class MultiplyNumbers { 

	// Method with 2 parameter 
	static int Multiply(int a, int b) 
	{ 
		return a * b; 
	} 

	// Method with the same name but 2 double parameter 
	static double Multiply(double a, double b) 
	{ 
		return a * b; 
	} 
} 

class Main { 
	public static void main(String[] args) 
	{ 

		System.out.println(MultiplyNumbers.Multiply(10, 8)); 

		System.out.println(MultiplyNumbers.Multiply(9.3, 3.4)); 
	} 
}

