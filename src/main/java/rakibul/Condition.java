package rakibul;
import java.util.Scanner;
public class Condition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner MyScanner = new Scanner(System.in);
		
		System.out.println("Enter 1st Numebr: ");
		int number1 = MyScanner.nextInt();
		System.out.println("Enter 2nd number: ");
		int number2 = MyScanner.nextInt();
		
		if(number1>number2) {
			System.out.println(number1+" Number is Geter then "+number2);
		
		}else if (number1==number2){
			System.out.println(number1+" Number is equal to "+number2);
			
		}else {
			
			System.out.println("Something went wrong...!");
			
			
			}
		}

}
