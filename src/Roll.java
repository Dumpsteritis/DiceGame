import java.util.Random;
import java.math.*;

public class Roll 
{		
	int number;
			
	public int roll()
	{
		
		int dice1=(int)(Math.random()*4+1);
		int dice2=(int)(Math.random()*6+1);
		int dice3=(int)(Math.random()*8+1);
		int dice4=(int)(Math.random()*10+1);
		int dice5=(int)(Math.random()*12+1);
		int dice6=(int)(Math.random()*20+1);
		int sum= dice1 + dice2 + dice3 + dice4 + dice5 + dice6;
		System.out.print("You rolled a ");
		System.out.print(sum);
		return sum;
		
	}
}
