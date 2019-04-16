package Calculator;

public class Calculations 
{
	
	public int sabiranje (int broj1, int broj2)
	{
		return broj1 + broj2; 
	}
	
	public int oduzimanje (int broj1, int broj2)
	{
		if (broj1 < broj2)
		{
			System.out.println(broj1 + " broj je manji od " + broj2 + " program ce automatski zamijeniti navedene brojeve"
					+ " Koliko je " + broj2 + " - " + broj1);
			int temp = broj1;
			broj1 = broj2; 
			broj2 = temp; 
		}
		return broj1 - broj2;
	}
	
	public int mnozenje (int broj1, int broj2)
	{
		return broj1 * broj2; 
	}
	
	public int dijeljenje (int broj1, int broj2)
	{
		return broj1 / broj2; 
	}
	
	public int korjenovanje (int broj)
	{
		return (int) Math.sqrt(broj);  
	}
	
	public int kvadratiranje (int broj1, int kvadrat)
	{
		return (int) Math.pow(broj1, kvadrat); 
	}

}
