
public class Island extends Player(){
  private int numDays;
  public Island{
    
    public String wildAnimals(){
      System.out.println("oh no! wild animals are chasing you. if you have enough food, you will live.")
      if (numFood < 5){
        return "...you have died, you did not have enough food for energy to run from wild animals";
        health == false; 
      } 
      else {
        return "you survived! you had enough food to give you energy to run away. unfortunately, you are out of food, complete more challenges to resupply!"; 
        food = 0; 
      }  
    }

    public String findWater(int guess){
      //in the dayTracker method, at the end of the day check water resources. call this method if user is low
      System.out.println("you are running low on water! play this number guessing game to get more for tonight.")
      System.out.println("you have three guesses, pick any whole number between 1 & 20"); 
      int guessNumber = (Math.random()*15)+5; 
      int guess = myObj.nextLine();
      for (int i = 0; i <= 3; i++){
	      if (guessNumber == guess){
		      numWater += 5; 
		      return("nice job! u guessed right, you have " + numWater + " water.");
	      }
	      else {
		      System.out.println("guess again"); 
	      } 
      } 
      return "sorry! u are out of guesses. u currently have " + numWater + " water."); 
    } 
    
    public String dayTracker(){
	    healthCheck(); 
	    numFood = numFood - 2; 
	    numWater = numWater - 2; 
	    if numDays = 20 {
		    System.out.println(“A rescue boat has come!”);
	    }
	    if numDays != 20 {
		    numDays++;
		  }
	    return "days left: " + numDays;
	    if (numWater <= 5) {
		    findWater(); 
	    } 
    } 
	  
    public String healthCheck(){
	    if (numWater <= 0) || (numFood <= 0){
		return "you are out of necessary resources, you died."; 
		break;     
	    } 	  
    } 
  }   
}
