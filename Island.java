java.util.*;

public class Island extends Player(){
  private int numDays;
  private int dailyMethods; 
  public Island{
    
    public String wildAnimals(){
      Scanner myObj = new Scanner(System.in);
      System.out.println("Shoot: ");
      String playerChoice = myObj.nextLine();
	 
      System.out.println("Oh no! Wild animals are chasing you! If you have enough food, you will live.");
      if (numFood < 5){
	return "You do not have enough food for energy to run from the wild animals.";
	return "Play rock, paper, scissors to win 5 food.";
	
	// SYLVIA IS CREATING AN ARRAY TO STORE ROCK PAPER AND SCISSOR SO THAT THE CONDITIONALS WORK
	if (playerChoice.compareTo(computerChoice) == 0){
        	System.out.println("You tied!");
	if (playerChoice.equals("rock") && computerChoice.equals("paper")){
		System.out.println("You lost! You have died... You did not have enough food for energy to run from the wild animals.");
	if (playerChoice.equals("rock") && computerChoice.equals("scissor")){
		System.out.println("You win!");
		numFood += 5;
	if (playerChoice.equals("paper") && computerChoice.equals("rock")){
		System.out.println("You win!");
		numFood += 5;
	if (playerChoice.equals("paper") && computerChoice.equals("scissor")){
		System.out.println("You lost! You have died... You did not have enough food for energy to run from the wild animals.");
	if (playerChoice.equals("scissor") && computerChoice.equals("rock")){
		System.out.println("You lost! You have died... You did not have enough food for energy to run from the wild animals.");
	if (playerChoice.equals("scissor") && computerChoice.equals("paper")){
		System.out.println("You win!");
		numFood += 5;
        return "Thanks for playing!";
        health == false; 
      } 
      else {
        return "You survived! You had enough food to give you energy to run away. Unfortunately, you are out of food, complete more challenges to resupply!"; 
        food = 0; 
      }  
    }

    public String findWater(int guess){
      //in the dayTracker method, at the end of the day check water resources. call this method if user is low
      System.out.println("You are running low on water! Play this number guessing game to replenish.")
      System.out.println("You have three guesses, pick any whole number between 1 & 20 inclusive."); 
      int guessNumber = (Math.random()*15)+5; 
      int guess = myObj.nextLine();
      for (int i = 0; i <= 3; i++){
	      if (guessNumber == guess){
		      numWater += 5; 
		      return "Nice job! You guessed right! You have " + numWater + " water.";
	      }
	      else {
		      System.out.println("Guess again."); 
	      } 
      } 
      return "Sorry! You are out of guesses, you currently have " + numWater + " water."; 
      if (numWater <= 0) || (numFood <= 0){
		return "You ran out of resources, you died.";
	        break; 
	    }
    } 
    
    //gains wood, guess word game (ex: le_o_ is lemon)
    public String jungleHike(){ 
	    //random array of words
	    ArrayList<Type> guessingWords = new ArrayList<Type>();
	    	guessingWords.add("sand");
	    	guessingWords.add("umbrella");
	    	guessingWords.add("papaya");
	    	guessingWords.add("tree");
	    	guessingWords.add("beach");
	    int x = Math.random()*5;
	    //random selection 
	    //random index remove letters (take lenth of word, randomly selected index for 3 letters and then replace with _)
	    //save the changed word in a new variable 
	    //print out, make them guess using string.equals in a for loop for three times 
	    //remove word from array so its not repeated
    } 

    //randomly decides obstacles for the day 
    public int chooseObstacles(){
	    
    } 
    
    //checks if game continues, updates day, starts new day 
    public String dayTracker(){
	    
	    //checks life before continuing 
	    healthCheck(); 
	  
	    if (numWater <= 0) || (numFood <= 0){
		return "you ran out of resources, you died.";
	        break; 
	    }
	    //updates resources 
	    numFood = numFood - 2; 
	    numWater = numWater - 2; 
	    
	    //choose methods to run on a day 
	    int obstacleType = ; 
	    
	    
	    
	    //update days until 10 are completed 
	    if numDays = 10 {
		    System.out.println("A rescue boat has come!”);
	    }
	    if numDays != 10 {
		    numDays++;
		  }
	    return "Days left: " + numDays;
				       
	    //water check, runs findWater method 		       
	    if (numWater <= 5) {
		    findWater(); 
	    } 		        		      
    }  
  }   
}
