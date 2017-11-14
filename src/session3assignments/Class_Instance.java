package session3assignments; //Package declaration

public class Class_Instance //This class differentiates between instance variables and class variables, and also shows the scope of each.
{ 
	static int classVar = 9; //Declaration of class variable or static data member whose scope is limited to class
	int instanceVar = 108; //Declaration of instance variable or non-static data member whose scope is limited to objects of a class
	
	public static void main(String[] args) //This is the main method which accepts command line arguments and returns no value
	{
		Class_Instance object1 = new Class_Instance(); //First object reference of class created
		Class_Instance object2 = new Class_Instance(); //Second object reference of class created

		System.out.println("Class variable accessed in a static way is: " +Class_Instance.classVar); //Value of static data member is printed using class name
		System.out.println("Error occurs when class (or static) variable is accessed through object reference although it prints the output."); //Class variables are stored in class memory and it's scope limits to class
		System.out.println(); //Control goes to next line
		
		System.out.println("Instance variable accessed through first object reference is: " +object1.instanceVar); //Value of instance variable is printed through first object
		System.out.println("Compile time error occurs when access of instance (or non-static) variable is attempted through class name."); //Instance variables are stored in object memory and it's scope limits to objects
		System.out.println(); //Control goes to next line
		
		System.out.println("Instance variable accessed through second object reference is: " +object2.instanceVar); //Value of instance variable is printed through second object
		System.out.println(); //Control goes to next line
		
		Class_Instance.classVar = 900; //Making changes to class variable in a static way
		object1.instanceVar = 1008; //Making changes to instance variable through first object reference
		
		System.out.println("Changed value of Instance variable accessed through first object reference is: " +object1.instanceVar); //Prints new value of instance variable through first object
		System.out.println("Value of Instance variable in second object which remains unchanged even after changing it's value in first object is: " +object2.instanceVar); //Shows how each object maintains it's own copy of instance variables
		System.out.println(); //Control goes to next line
		
		System.out.println("Changed value of class variable accessed in a static way is: "+Class_Instance.classVar); //Shows how class variables are common to all objects of a class
	
	} //Main method closed
	
} //Class closed
