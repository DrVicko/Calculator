package Calculator;

public class Calculations 
{
	Calculator calculator = new Calculator (); 
	
	public int sabiranje (int broj1, int broj2)
	{
		return broj1 + broj2; 
	}
	
	public int oduzimanje (int broj1, int broj2)
	{
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
