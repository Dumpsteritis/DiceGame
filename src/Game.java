import java.util.Scanner;

public class Game extends Player
{	
	Roll roll = new Roll();
		
	Scanner keyboard = new Scanner(System.in);
	
	int playerNumber;
	int humanPlayerNumber;
	int AIPlayerNumber;
	boolean loseGame=false;
	int playersum;

	public void Explanation ()
	{
		System.out.println("Welcome to the drinking game!");
		System.out.println("Each player starts with 100 points");
		System.out.println("Each dice roll determines how points are deducted from the players total");
		System.out.println("Points can be deducted based on how many drinks the player has drank or purchased");
		System.out.println("Drinking a shot deducts 10 points from the players total");
		System.out.println("Drinking a beer deducts 8 points from the players total");
		System.out.println("Buying a shot deducts 5 points from the players total");
		System.out.println("Buying a beer deducts 4 points from the players total");
		System.out.println("Any player who has less than 20 points loses");
		System.out.println("The last player who has 20 or more points wins!");
	}
	
	
	public int humanPlayerNumber ()
	{
		System.out.println("Enter the number of Human Players");
		System.out.print("> ");
		Scanner playerInput = new Scanner(System.in);
		humanPlayerNumber = playerInput.nextInt();
		
		return humanPlayerNumber;			
	}
	
	public int AIPlayerNumber ()
	{
		System.out.println("Enter the number of AI Players");
		System.out.print("> ");
		Scanner playerInput = new Scanner(System.in);
		AIPlayerNumber = playerInput.nextInt();
		
		return AIPlayerNumber;	
	}
	
	public int SumofPlayers ()
	{
		int playersum;
		playersum = (humanPlayerNumber + AIPlayerNumber);
		System.out.println("Number of total players is: ");
		System.out.print("> ");
		System.out.print(playersum);
		return playersum;	
	}
	
	public void playerNumber()
	{
		playerNumber= (humanPlayerNumber+AIPlayerNumber);
		for (int i=1; i<playerNumber; i++);
	}

	public void Start()
	{
		String go;
		
		System.out.println(" ");
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
