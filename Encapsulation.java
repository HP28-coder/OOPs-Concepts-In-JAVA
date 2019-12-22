// Java program to demonstrate encapsulation 
public class Student 
{ 	private String name; 
	private int roll; 
	private int age; 

	public int getAge() 
	{ 
	return age; 
	} 
	public String name() 
	{ 
	return name; 
	} 
	public int getRoll() 
	{ 
	return roll; 
	} 
	public void setAge( int newAge) 
	{ 
	age = newAge; 
	} 

	 
	public void setName(String newName) 
	{ 
	name = newName; 
	} 
	public void setRoll( int newRoll) 
	{ 
	roll = newRoll; 
	} 
}

public class TestingEncapsulation 
{	 
	public static void main (String[] args) 
	{ 
		Student obj = new Student(); 
		
		 
		obj.setName("Harshita"); 
		obj.setAge(16); 
		obj.setRoll(10); 
	 
		System.out.println("Student’s name: " + obj.getName()); 
		System.out.println("Student’s age: " + obj.getAge()); 
		System.out.println("Student’s roll: " + obj.getRoll()); 
		
	} 
}
