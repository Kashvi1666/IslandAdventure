
public class Island extends Player(){
  private int days;
  public Island{
    
    public String wildAnimals(){
      System.out.println("oh no! wild animals are chasing you. if you have enough food, you will live.")
      if (food < 5){
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
      //add scanner later to finish this
    } 
    
    public String daily(){
	    if numDays = 20{
		    System.out.println(“A rescue boat has come!”);
	    }
	    if numDays != 20{
		    numDays++;
		  }
	    return numDays;
    }                  
	  
	 
	  
	  public String buildShelter(){
	   if (wood >= 20){
	   	System.out.print("You have built a shelter");
		wood =-20;
	   }
		
	    else{
		numWater =-30;
		numFood =-30;
	    }	  
	   }
	  
	  
	  
	  }
	  
	  
	  
	  
	public String getResources(){
		System.out.print("It is the " + numDays + "day. You have " + numFood + " resources and " + numWater + " water resources. Do you have a blanket? " + blanket + " Do you have a knife " + knife + " You have " + wood + " resources."); 

	public int getNumDays(){
		return numDays;
	  }

	public int getnumFood(){
		return numFood;
	}

	public int getNumWater(){
		return numWater;
	}

	public boolean getBlanket(){
		return blanket;
	}

	public boolean getKnife(){
		return knife;
	}

	public boolean getWood(){
		return wood;
	}

  }   
}
