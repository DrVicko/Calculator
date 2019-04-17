package Calculator;
import java.util.Scanner; 

public class RandomCalculator {

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in); 
		int selection = -1; 
		int broj1 = (int) (Math.random() * 10); 
		int broj2 = (int) (Math.random() * 10); 
		int rezultat = 0; int tacanRezultat = 0; 
		Calculations cal = new Calculations ();
		
		while (selection != 0)
		{
			System.out.println("Enter: \n1. To start random calculator quiz \n2. To exit calculator");
			selection = input.nextInt(); 
			if (selection == 1)
			{
				int random = (int) ((Math.random() * 6) + 1);
				if (random == 1)
				{
					System.out.println("Oblast sabiranje! \nKoliko je " + broj1 + " + " + broj2);
					rezultat = input.nextInt(); 
					tacanRezultat = cal.sabiranje(broj1, broj2);
					while (rezultat >= 0)
					{
						if (rezultat == tacanRezultat)
						{
							System.out.println("Cestitamo pogodili ste :)");
							break; 
						}
						else
						{
							System.out.println("Netacan rezultat, unesite tacan rezultat: ");
							rezultat = input.nextInt(); 
						}	
					}
				}
				else if (random == 2)
				{
					if (broj1 > broj2)
					{
						System.out.println("Oblast oduzimanje! \nKoliko je " + broj1 + " - " + broj2);
						rezultat = input.nextInt();
						tacanRezultat = cal.oduzimanje(broj1, broj2);
						while (rezultat >= 0)
						{
							if (rezultat == tacanRezultat)
							{
								System.out.println("Cestitamo pogodili ste :)");
								break; 
							}
							else
							{
								System.out.println("Netacan rezultat, unesite tacan rezultat: ");
								rezultat = input.nextInt(); 
							}	
						}
					}
					else if (broj1 < broj2)
					{
						int temp = broj1; broj1 = broj2; broj2 = temp;
						System.out.println("Oblast oduzimanje! \nKoliko je " + broj1 + " - " + broj2);
						rezultat = input.nextInt();
						tacanRezultat = cal.oduzimanje(broj1, broj2);
						while (rezultat >= 0)
						{
							if (rezultat == tacanRezultat)
							{
								System.out.println("Cestitamo pogodili ste :)");
								break; 
							}
							else
							{
								System.out.println("Netacan rezultat, unesite tacan rezultat: ");
								rezultat = input.nextInt(); 
							}	
						}
					}
				}
				else if (random == 3)
				{
					System.out.println("Oblast mnozenje! \nKoliko je " + broj1 + " * " + broj2);
					rezultat = input.nextInt(); 
					tacanRezultat = cal.mnozenje(broj1, broj2);
					while (rezultat >= 0)
					{
						if (rezultat == tacanRezultat)
						{
							System.out.println("Cestitamo pogodili ste :)");
							break; 
						}
						else
						{
							System.out.println("Netacan rezultat, unesite tacan rezultat: ");
							rezultat = input.nextInt(); 
						}	
					}
				}
				else if (random == 4)
				{
					if (broj1 > broj2)
					{
						System.out.println("Oblast dijeljenje! \nKoliko je " + broj1 + " / " + broj2);
						rezultat = input.nextInt();
						tacanRezultat = cal.dijeljenje(broj1, broj2);
						while (rezultat >= 0)
						{
							if (rezultat == tacanRezultat)
							{
								System.out.println("Cestitamo pogodili ste :)");
								break; 
							}
							else
							{
								System.out.println("Netacan rezultat, unesite tacan rezultat: ");
								rezultat = input.nextInt(); 
							}	
						}
					}
					else if (broj1 < broj2)
					{
						int temp = broj1; broj1 = broj2; broj2 = temp;
						System.out.println("Oblast dijeljenje! \nKoliko je " + broj1 + " / " + broj2);
						rezultat = input.nextInt();
						tacanRezultat = cal.dijeljenje(broj1, broj2);
						while (rezultat >= 0)
						{
							if (rezultat == tacanRezultat)
							{
								System.out.println("Cestitamo pogodili ste :)");
								break; 
							}
							else
							{
								System.out.println("Netacan rezultat, unesite tacan rezultat: ");
								rezultat = input.nextInt(); 
							}	
						}
					}
				}
				else if (random == 5)
				{
					System.out.println("Oblast korjenovanje! \nKoliko je korijen broja " + broj1);
					rezultat = input.nextInt(); 
					tacanRezultat = cal.korjenovanje(broj1);
					while (rezultat >= 0)
					{
						if (rezultat == tacanRezultat)
						{
							System.out.println("Cestitamo pogodili ste :)");
							break; 
						}
						else
						{
							System.out.println("Netacan rezultat, unesite tacan rezultat: ");
							rezultat = input.nextInt(); 
						}	
					}
				}
				else if (random == 6)
				{
					System.out.println("Oblast kvadratiranje! \nKoliko je " + broj1 + " na kvadrat " + broj2);
					rezultat = input.nextInt(); 
					tacanRezultat = cal.kvadratiranje(broj1, broj2);
					while (rezultat >= 0)
					{
						if (rezultat == tacanRezultat)
						{
							System.out.println("Cestitamo pogodili ste :)");
							break; 
						}
						else
						{
							System.out.println("Netacan rezultat, unesite tacan rezultat: ");
							rezultat = input.nextInt(); 
						}	
					}
				}
			}
			else if (selection == 2)
			{
				break; 
			}
		}
	}
}
