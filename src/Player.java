import java.util.Scanner;

public class Player {
	String playerName;
	int money;
	int tolerance;
	int playerNumber;
	int humanPlayerNumber;
	int AIPlayerNumber;
	boolean loseGame=false;
	public Player() {
		money = 100;
		tolerance = 100;
	}
	
	public int humanPlayerNumber (){
		System.out.println("Enter the number of Human Players");
		System.out.println("> ");
		Scanner playerInput = new Scanner(humanPlayerNumber);
		
		return humanPlayerNumber;	
			
		}
	public int AIPlayerNumber (){
		System.out.println("Enter the number of AI Players");
		System.out.println("> ");
		Scanner playerInput = new Scanner(AIPlayerNumber);
		
		return AIPlayerNumber;		
	}
	public void playerNumber(){
		playerNumber= (humanPlayerNumber+AIPlayerNumber);
		for (int i=1; i<playerNumber.size(); i++){
			
		}
	}
	public int drinkBeer() {
		tolerance -= 8;
		return tolerance;
	}

	public int drinkShot() {
		tolerance -= 10;
		return tolerance;
	}

	public int buyBeer() {
		money -= 4;
		return money;
	}

	public int buyShot() {
		money -= 5;
		return money;
	}

	public void loseGame() {
		if ((money + tolerance) <= 20) {
			loseGame=true;
			System.out.println("You are drunk. Or broke. Or both. Go home");			
		} else if (money <= 3) {
			loseGame=true;
			System.out.println("You are broke. Go home.");
		} else if (tolerance <= 7) {
			loseGame=true;
			System.out.println("Hey drunkie...Go home.");
		}
		
		
	}
	public void playerTurn(){
		while ((humanPlayerNumber+AIPlayerNumber)>=2)
		{
			playerNumber++;
			
		}
	}

	
	
}