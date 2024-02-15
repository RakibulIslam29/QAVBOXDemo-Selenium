package rakibul;
import java.util.Scanner;
public class ConditionString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner MyScanner = new Scanner(System.in);
		
		System.out.println("Enter 1st name: ");
		String name1 = MyScanner.nextLine();
		System.out.println("Enter 2nd name: ");
		String name2 = MyScanner.nextLine();	
		
		// Equals method 
//		if(name1.equals(name2)) {
//			System.out.println(name1+" Number is Geter then "+name2);
//		}
//		else if (number1==number2){
//			System.out.println(number1+" Number is equal to "+number2);
//		}	
//		else {
//			
//			System.out.println("Something went wrong...!");
//			
//			
//			}
		
		// equalsIgnoreCase method
//		if(name1.equalsIgnoreCase(name2)) {
//			System.out.println(name1+" Number is Geter then "+name2);
//		}
////		else if (number1==number2){
////			System.out.println(number1+" Number is equal to "+number2);
////			}
//		else {
//			
//			System.out.println("Something went wrong...!");
//				
//		}
		
		// Contains methos (String er jonne)
		if(name1.contains(name2)) {
			System.out.println(name1+" Number is equal "+name2);
		}
//		else if (number1==number2){
//			System.out.println(number1+" Number is equal to "+number2);
//			}
		else {
			
			System.out.println("Something went wrong...!");
				
		}
	}
}

