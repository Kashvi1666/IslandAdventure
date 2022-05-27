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
  
    //gains wood, guess word game (ex: le_o_ is lemon)
    public String jungleHike(){ 
	    //random array of words
	    ArrayList<Type> guessingWords = new ArrayList<Type>();
	    	guessingWords.add("s_n_");
	    	guessingWords.add("sand");
	    	guessingWords.add("_m_re_la");
	    	guessingWords.add("umbrella");
	    	guessingWords.add("pa_ay_");
	    	guessingWords.add("papaya");
	    	guessingWords.add("tr_e");
	    	guessingWords.add("tree");
	    	guessingWords.add("b_a_h");
	    	guessingWords.add("beach");
		
	    	int x = (int)(Math.random() * 9);
		x = 2*x;
}
	    String wordToGuess;
	    if (x == 1){ 
		    wordToGuess = array[2];
	     }
	    if (x == 3){ 
		    wordToGuess = array[4];
	     }
	    if (x == 5){ 
		    wordToGuess = array[6];
	     }
	    if (x == 7){ 
		    wordToGuess = array[8];
	     }
	    if (x == 9){ 
		    wordToGuess = array[10];
	     }
	
		Scanner myObj = new Scanner(System.in);  // Create a Scanner object
    		System.out.print(array[x]);

    		String userInput = myObj.nextLine(); 
		if (userinput == wordToGuess){
			System.out.println("good job! you got it right! you get more food, water and wood!");
			food +=10;
			water+=10;
			wood+=10;
		}
    		else{
			System.out.print("wrong. you lost food water and wood resources");
			food -=10;
			water-=10;
			wood-=10;
		}
		
		
		
	    //random selection 
	    //random index remove letters (take lenth of word, randomly selected index for 3 letters and then replace with _)
	    //save the changed word in a new variable 
	    //random selection 
	    //random index remove letters (take lenth of word, randomly selected index for 3 letters and then replace with _)
	    //save the changed word in a new variable 
	    //print out, make them guess using string.equals in a for loop for three times 
	    //remove word from array so its not repeated
    } 

    public String poisonBerries(){ 
	    System.out.println("sorry! u have accidentally consumed toxic berries."); 
	    System.out.println("play this trivia (get 4/6 questions right) to get the antidote, or else lose food and water!");
            int points; 

      //question one
	    System.out.println("question 1: where do monkeys live? ");
	    System.out.println("a) trees")
            System.out.println("b) inside houses")
	    System.out.println("c) ground level")
            System.out.println("d) nests")
	    String answer = myObj.nextLine()
	    if (answer.equals("a")){
		    System.out.println("true! next question"); 
		    points++; 
            else {
		    System.out.println("false! sorry. next question");
      //question two
	    System.out.println("question 2: what color tree frog is most dangerous?")
	    System.out.println("a) green")
            System.out.println("b) black and yellow")
	    System.out.println("c) orange spotted")
            System.out.println("d) purple patched")		    
	    String answer = myObj.nextLine()
	    if (answer.equals("c")){
		    System.out.println("true! next question"); 
		    points++;
            else {
		    System.out.println("false! sorry. next question");
       //question three
            System.out.println("question 3: which plant is best for fevers?")
	    System.out.println("a) lemon leaves")
            System.out.println("b) elderflower")
	    System.out.println("c) red ivy")
            System.out.println("d) grass")		    
	    String answer = myObj.nextLine()
	    if (answer.equals("a")){
		    System.out.println("true! next question"); 
		    points++;
            else {
		    System.out.println("false! sorry. next question");
        //question four
            System.out.println("question 4: which edible fish is found close to shore?")
	    System.out.println("a) rockfish")
            System.out.println("b) salmon")
	    System.out.println("c) orange roughy")
            System.out.println("d) rainbow trout")		    
	    String answer = myObj.nextLine()
	    if (answer.equals("a")){
		    System.out.println("true! next question"); 
		    points++;
            else {
		    System.out.println("false! sorry. next question");
	//question five
            System.out.println("question 5: what should you do if you see a snake?")
	    System.out.println("a) run backwards")
            System.out.println("b) stand still")
	    System.out.println("c) eat it")
            System.out.println("d) step on it")		    
	    String answer = myObj.nextLine()
	    if (answer.equals("b")){
		    System.out.println("true! next question"); 
		    points++;
            else {
		    System.out.println("false! sorry. next question");
	//question six
            System.out.println("question 6: where is treasure usually hidden?")
	    System.out.println("a) on the beach")
            System.out.println("b) underneath the island")
	    System.out.println("c) in a cave")
            System.out.println("d) this island does not have treasure so the question is not applicable")		    
	    String answer = myObj.nextLine()
	    if (answer.equals("d")){
		    System.out.println("true! next question"); 
		    points++;
            else {
		    System.out.println("false! sorry.");

	    if (points >= 4){
		    return "you passed! congrats!";
	    }
	    else{
		    return "you failed. sorry."; 
		    food -= 3; 
		    water -= 3; 
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
		    
    public String findFood(int guess){
	    System.out.println("You are running low on food! Play this number guessing game to replenish.");
	    System.out.println("You have three guesses, pick any letter between a-k (abcdefghijk)");
	    String alphabet[] = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k"}; 
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
