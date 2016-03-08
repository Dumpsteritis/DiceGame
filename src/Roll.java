import java.util.Random;

public class Roll extends Game
{	
	public int dicefour()
	{
		int number;	
		Random dicefour = new Random();
		number = 1+dicefour.nextInt(4);			
		return number;	
	}
	public int dicesix()
	{
		int number;	
		Random dicesix = new Random();
		number = 1+dicesix.nextInt(6);			
		return number;	
	}
	public int diceeight()
	{
		int number;	
		Random diceeight = new Random();
		number = 1+diceeight.nextInt(8);			
		return number;	
	}
	public int diceten()
	{
		int number;	
		Random diceten = new Random();
		number = 1+diceten.nextInt(10);			
		return number;	
	}
	public int dicetwelve()
	{
		int number;	
		Random dicetwelve = new Random();
		number = 1+dicetwelve.nextInt(12);			
		return number;	
	}
	public int dicetwenty()
	{
		int number;	
		Random dicetwenty = new Random();
		number = 1+dicetwenty.nextInt(20);			
		return number;	
	}	
}
