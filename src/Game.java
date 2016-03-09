import java.util.Scanner;

public class Game
{	
	
	public void Start()
	{
		String go = null;
		
		Roll roll = new Roll();
		
		System.out.println("Ready to roll the dice? (Yes/No)");
		System.out.print("> ");

		if (go.equalsIgnoreCase("Yes"))
		{
			roll.roll();
		}
		else
		{
			System.out.println("Unless you type in 'Yes', we're not going anywhere.");
		}
	}
}
