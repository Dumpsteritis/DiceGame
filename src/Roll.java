import java.util.Random;

public class Roll extends Game
{	
	int number4;
	int number6;
	int number8;
	int number10;
	int number12;
	int number20;
	int dicetotal;
	
	public int dicefour()
	{
		Random dicefour = new Random();
		number4 = 1+dicefour.nextInt();			
		return number4;	
	}
	public int dicesix()
	{
		Random dicesix = new Random();
		number6 = 1+dicesix.nextInt(6);			
		return number6;	
	}
	public int diceeight()
	{
		Random diceeight = new Random();
		number8 = 1+diceeight.nextInt(8);			
		return number8;	
	}
	public int diceten()
	{
		Random diceten = new Random();
		number10 = 1+diceten.nextInt(10);			
		return number10;	
	}
	public int dicetwelve()
	{
		Random dicetwelve = new Random();
		number12 = 1+dicetwelve.nextInt(12);			
		return number12;	
	}
	public int dicetwenty()
	{
		Random dicetwenty = new Random();
		number20 = 1+dicetwenty.nextInt(20);			
		return number20;	
	}	
	public int dicetotal()
	{
		dicetotal = (number4 + number6 + number8 + number10 + number12 + number20);
		return dicetotal;
	}
}
