package Calculator;
import java.util.Scanner; 

public class RandomCalculator {

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in); 
		int selection = -1; 
		int number1 = (int) (Math.random() * 10); 
		int number2 = (int) (Math.random() * 10); 
		
		while (selection != 0)
		{
			System.out.println("Enter: \n1. To start random calculator quiz \n2. To exit calculator");
			selection = input.nextInt(); 
			if (selection == 1)
			{
				
			}
		}
		

	}

}
