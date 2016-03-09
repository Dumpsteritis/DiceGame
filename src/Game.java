import java.util.Scanner;

public class Game
{	
	Roll roll = new Roll();
		
	Scanner keyboard = new Scanner(System.in);
	
	public void Start()
	{
		String go;
		
		System.out.println("Ready to roll the dice? (Yes/No)");
		System.out.print("> ");
		go = keyboard.nextLine();

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
