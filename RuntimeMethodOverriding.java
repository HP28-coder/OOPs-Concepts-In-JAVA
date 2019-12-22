class Parent { 

	void Print() 
	{ 
		System.out.println("parent class"); 
	} 
} 

class child1 extends Parent { 

	void Print() 
	{ 
		System.out.println("subclass1"); 
	} 
} 

class child2 extends Parent { 

	void Print() 
	{ 
		System.out.println("subclass2"); 
	} 
} 

class TestingPolymorphism { 
	public static void main(String[] args) 
	{ 

		Parent a; 

		a = new child1(); 
		a.Print(); 

		a = new child2(); 
		a.Print(); 
	} 
}
