
public class Rules extends Game
{    
    Roll roll = new Roll();    
 
    int penaltysum;
    
    public int penalty(int sum){
    	

        if (sum <0 && sum<= 10) {
        	return buyShotAndBeer();
        } else if (sum >=11 && sum<= 20) {
            return drinkShot();
        } else if (sum >=21 && sum<= 30) {
            return buyBeer();
        } else if (sum >=31 && sum<= 40) {
            return buyShot();
        } else if (sum >=41 && sum<= 50) {
            return drinkBeer();
        } else if (sum >=51 && sum<= 60) {
            return drinkShotAndBeer();
            
        }
		return penaltysum;
        
    }
}