import java.util.Scanner;

public class Rules extends Game
{	
	Roll roll = new Roll();	
	int sum;
	
<<<<<<< HEAD
	public int penalty(int total)
	{
		int penalty = 0;
		
		if (sum <= 10)
		{
			penalty = 1;
			System.out.println("You lost one point");
		}
		else if (sum <=20)
		{
			penalty = 2;
		}
		else if (sum <=30)
		{
			penalty = 3;
		}
		else if (sum <=40)
		{
			penalty = 4;
		}
		else if (sum <=50)
		{
			penalty = 5;
		}
		else if (sum <=60)
		{
			penalty = 6;
		}		
		return penalty;
=======
	public void penalty(int total) {
		int sum;
		
	sum = roll.roll();

		if (sum <= 10) {
			buyBeer();
			buyShot();
		} else if (sum <= 20) {
			drinkShot();
		} else if (sum <= 30) {
			buyBeer();
		} else if (sum <= 40) {
			buyShot();
		} else if (sum <= 50) {
			drinkBeer();
		} else if (sum <= 60) {
			drinkShot();
			drinkBeer();
		}
		
>>>>>>> b03f5a77de50ec2fdcb8e6e52336e0786c3e7445
	}
}
