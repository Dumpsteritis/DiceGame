import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Player extends Game {

		String Usernames;
	    int money = 100;
	    int tolerance = 100;
	    
	    public Player(String Usernames)
	    { 
	        this.Usernames = Usernames;
	    }

		public int playerEntry(int player, int money, int tolerance)
	    {
	    	Scanner input = new Scanner(System.in);
	    	
	    	List<Player> Players = new ArrayList<Player>();

	    	int length;
	    	length = input.nextInt();

	    	String[] Usernames = new String[length];

	    	for (int counter = 0; counter < length; counter++) 
	    	{
	    	    System.out.println("Enter Username " +(counter + 1));
	    	    Usernames[counter] = input.next();
	    	    Players.add(new Player(Usernames[counter]));
	    	}

	    	System.out.println("Usernames are ");
	    	for (int counter = 0; counter < length; counter++) {
	    	    System.out.println(Usernames[counter]);

	    }
			return length;}}
	
