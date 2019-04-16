package Calculator;
import java.util.Scanner; 

public class RunCalculator {

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in); 
		int broj1, broj2; 
		
		Calculator calculator = new Calculator ();
		
		System.out.println("\nOdaberite: \1. Za opciju sabiranja dva broja \n2. Za opciju oduzimanja dva broja \3. Za opciju mnozenja dva broja"
				+ "\4. Za opciju dijeljenja dva broja \n5. Za opciju korijenovanja broja \n6. Za opciju kvadrata broja");
		int selection = input.nextInt(); 
		
		while (selection != 0)
		{
			if (selection == 1)
			{
				System.out.println("Unesite prvi broj: ");
				broj1 = input.nextInt(); 
				System.out.println("Unesite drugi broj: ");
				broj2 = input.nextInt(); 
				
			}
		}

	}

}
