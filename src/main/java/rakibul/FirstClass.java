package rakibul;
import java.util.Scanner;

public class FirstClass {

	public static void main(String[] args) {
		// print method
		System.out.println("Hello");

		//Scan method
		// object -> ClassName objName = new ClassName(Parameter)
		Scanner MyScanner = new Scanner(System.in);
		
		String name = MyScanner.nextLine();
		System.out.println("Enter Your Name");
		int number = MyScanner.nextInt();
		System.out.println();
		
		// formating
		System.out.println("Your Name is: "+name+"\n You got:"+number);
	}

}
