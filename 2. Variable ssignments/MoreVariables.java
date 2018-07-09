public class MoreVariables
{	public static void main(String[] args)
	{	String Name, Eyes, Teeth, Hair;
		double Age, Height, Weight, Height_in_cm, Weight_in_kg;
		
		Name = "Siva Prasad";
		Age = 26 ; //not a lie
		Height = 74 ; //inches
		Height_in_cm = Height * 2.54 ;
		Weight = 180; //pounds
		Weight_in_kg = Weight * 0.453592 ;
		Eyes = "Brown";
		Teeth = "White";
		Hair = "Brown";
		
		System.out.println( "Let's talk about " + Name + ".");
		System.out.println( " He is " + Height + " inches or " + Height_in_cm + " cm tall.");
		System.out.println( "He's " + Weight + " pounds or " + Weight_in_kg + " kilos heavy.");
		System.out.println( "Actually thats not too heavy.");
		System.out.println( "He has got " + Eyes + " eyes and " + Hair + " hair.");
		System.out.println( "His teeth are usually " + Teeth + " depending upon the coffee.");
		System.out.println( " If I add " + Age + ", " + Height + ", and " + Weight + " I get " + ( Age + Height + Weight )+ ".");
	}
}