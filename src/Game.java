import java.util.Scanner;

public class Game extends Player
{	
	Roll roll = new Roll();
		
	Scanner keyboard = new Scanner(System.in);
	
	int playerNumber;
	int humanPlayerNumber;
	int AIPlayerNumber;
	boolean loseGame=false;
	
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
	
	public int humanPlayerNumber ()
	{
		System.out.println("Enter the number of Human Players");
		System.out.println("> ");
		Scanner playerInput = new Scanner(System.in);
		humanPlayerNumber = playerInput.nextInt();
		
		return humanPlayerNumber;			
	}
	
	public int AIPlayerNumber ()
	{
		System.out.println("Enter the number of AI Players");
		System.out.println("> ");
		Scanner playerInput = new Scanner(System.in);
		AIPlayerNumber = playerInput.nextInt();
		
		return AIPlayerNumber;		
	}
	
	public void playerNumber()
	{
		playerNumber= (humanPlayerNumber+AIPlayerNumber);
		for (int i=1; i<playerNumber.size(); i++);
	}
	
	public int drinkBeer() 
	{
		tolerance -= 8;
		return tolerance;
	}

	public int drinkShot() 
	{
		tolerance -= 10;
		return tolerance;
	}

	public int buyBeer() 
	{
		money -= 4;
		return money;
	}

	public int buyShot() 
	{
		money -= 5;
		return money;
	}

	public void loseGame() 
	{
		if ((money + tolerance) <= 20) 
		{
			loseGame=true;
			System.out.println("You are drunk. Or broke. Or both. Go home");			
		} 
		else if (money <= 3) 
		{
			loseGame=true;
			System.out.println("You are broke. Go home.");
		} 
		else if (tolerance <= 7) 
		{
			loseGame=true;
			System.out.println("Hey drunkie...Go home.");
		}
	}

	public void playerTurn()
	{
		while ((humanPlayerNumber+AIPlayerNumber)>=2)
		{
			playerNumber++;		
		}
	}
}
