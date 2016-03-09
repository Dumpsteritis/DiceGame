
public class Rules
{	
	Roll roll = new Roll();	
	
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
	
}
