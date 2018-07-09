public class ElseAndIf
{	public static void main(String[] args)
	{	
		int people = 30;
		int cars = 40;
		int buses = 15;
		
		if (cars > people){
			System.out.println("We should take the cars");
		} if (cars < people){
			System.out.println("We should not take the cars.");			
		}else {
			System.out.println("We cant decide");
		}
		//if is creating a set of choices to be executed. 
		//The else if points to alternative statements that must be executed if the if statement is not executable
		//Because the condition provided is not true
		if ( buses > cars){
			System.out.println(" Thats too many buses");
		}  if (buses < cars){
			System.out.println(" Maybe we could take the buses");
		}else {
			System.out.println(" We still cant decide.");
		}
		
		if (people > buses){
			System.out.println (" All right, lets just take the buses.");
		}else {
			System.out.println ("Fine, Lets stay home then");
		}
	}
}
//they are not working as a collective set. if else statement is removed
//they are behaving like indiviudal statement and they are getting executed if their conditional is true.