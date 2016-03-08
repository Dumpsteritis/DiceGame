public class Rules extends Game
{	
	Roll dicetotal = new Roll();
	int total = dicetotal.dicetotal;  
	
	public int penalty(int total)
	{
		int dicetotal = 0;
		int penalty = 0;
		
		if (dicetotal <= 10)
		{
			penalty = 1;
		}
		else if (dicetotal <=20)
		{
			penalty = 2;
		}
		else if (dicetotal <=30)
		{
			penalty = 3;
		}
		else if (dicetotal <=40)
		{
			penalty = 4;
		}
		else if (dicetotal <=50)
		{
			penalty = 5;
		}
		else if (dicetotal <=60)
		{
			penalty = 6;
		}		
		return penalty;
	}
	
	public void lose()
	{
		int money = 0;
		int tolerance = 0;
		
		if (money + tolerance < 20)
		{
			System.out.println("You've spent and drank too much. You lose! Good luck explaining your conition to your wife!");
		}
		else if (money <= 3)
		{
			System.out.println("You can't afford to buy another drink. You lose!");
		}
		else if (tolerance <= 7)
		{
			System.out.println("You've drank too much. You lose!");
		}
	}
}
