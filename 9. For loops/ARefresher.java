import java.util.Scanner;

public class ARefresher{
	
	public static void main(String[] args){
		
		Scanner name = new Scanner(System.in);
		System.out.println("Please enter your name");
		String person = name.next();
		
		if (person.equals("Mitchell")){
			for(int i = 0;  i< 5 ; i++){
				System.out.println("Mitchell");
			}
		}else{
			for (int i = 0; i < 10; i++){
				System.out.println(person);
			}
		}
	
	
	
	}
}