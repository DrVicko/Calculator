package Calculator;
import java.util.Scanner; 

public class RunCalculator {

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in); 
		int broj1; int broj2; 
		
		Calculations calculations = new Calculations ();
		int selection = -1;
		
		
		while (selection != 0)
		{
			System.out.println("\nOdaberite: \n1. Za opciju sabiranja dva broja \n2. Za opciju oduzimanja dva broja \n3. Za opciju mnozenja dva broja"
				+ "\n4. Za opciju dijeljenja dva broja \n5. Za opciju korijenovanja broja \n6. Za opciju kvadrata broja"
				+ "\n0. Za izlaz iz programa");
		    selection = input.nextInt(); 
			
		    if (selection == 1)
			{
				System.out.println("Unesite prvi broj: ");
				broj1 = input.nextInt(); 
				System.out.println("Unesite drugi broj: ");
				broj2 = input.nextInt(); 
				int rezultat = calculations.sabiranje(broj1, broj2); 
				System.out.println(broj1 + " + " + broj2 + " iznosi " + rezultat);
			}
			else if (selection == 2)
			{
				System.out.println("Unesite prvi broj: ");
				broj1 = input.nextInt(); 
				System.out.println("Unesite drugi broj: ");
				broj2 = input.nextInt(); 
				int rezultat = calculations.oduzimanje(broj1, broj2); 
				System.out.println(broj1 + " - " + broj2 + " iznosi " + rezultat);
			}
			else if (selection == 3)
			{
				System.out.println("Unesite prvi broj: ");
				broj1 = input.nextInt(); 
				System.out.println("Unesite drugi broj: ");
				broj2 = input.nextInt(); 
				int rezultat = calculations.mnozenje(broj1, broj2); 
				System.out.println(broj1 + " * " + broj2 + " iznosi " + rezultat);
			}
			else if (selection == 4)
			{
				System.out.println("Unesite prvi broj: ");
				broj1 = input.nextInt(); 
				System.out.println("Unesite drugi broj: ");
				broj2 = input.nextInt(); 
				int rezultat = calculations.dijeljenje(broj1, broj2); 
				System.out.println(broj1 + " + " + broj2 + " iznosi " + rezultat);
			}
			else if (selection == 5)
			{
				System.out.println("Unesite zeljeni broj: ");
				broj1 = input.nextInt(); 
				int rezultat = calculations.korjenovanje(broj1); 
				System.out.println("Korijen broja " + broj1 +  " iznosi " + rezultat);
			}
			else if (selection == 6)
			{
				System.out.println("Unesite zeljeni broj: ");
				broj1 = input.nextInt(); 
				System.out.println("Unesite kvadrat za navedeni broj: ");
				broj2 = input.nextInt(); 
				int rezultat = calculations.kvadratiranje(broj1, broj2); 
				System.out.println(broj2 + " kvadrat broja " + broj1 + " iznosi " + rezultat);
			}
			else if (selection == 0)
			{
				break; 
			}
		}
		input.close();

	}

}
