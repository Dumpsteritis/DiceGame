
public class Rules extends Game
{	
	Roll roll = new Roll();	
	
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
		
	}
}
