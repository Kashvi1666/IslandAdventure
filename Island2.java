import java.util.*;

public class Island2{
   private int numDays;
   private int dailyMethods; 
	private int numFood;
	private int numWater;
	private int wood; 
   private String name; 
   
   public Island2(String playerName, int days, int daily){
      name = playerName; 
      numFood = (int)(Math.random()*15)+5; 
      numWater = (int)(Math.random()*15)+5; 
      wood = (int)(Math.random()*15)+5; 
      numDays = days;
      dailyMethods = daily;
   }
     
   public String wildAnimals(){
      System.out.println("Oh no! Wild animals are chasing you! If you have enough food, you will live. Play rock, paper, scissors to win 5 food.");
      Scanner myObj = new Scanner(System.in);
      System.out.println("Shoot: ");
      String playerChoice = myObj.nextLine();
	      
      ArrayList<String> computerOptions = new ArrayList<String>();
      computerOptions.add("rock");
      computerOptions.add("paper");
      computerOptions.add("scissor");
         
      String computerChoice = computerOptions.get((int)Math.random()*3); 
         
      if (playerChoice.compareTo(computerChoice) == 0){
          System.out.println("You tied!");
      }
      if (playerChoice.equals("rock") && computerChoice.equals("paper")){
	  System.out.println("You lost! You have died... You did not have enough food for energy to run from the wild animals.");
      }
      if (playerChoice.equals("rock") && computerChoice.equals("scissor")){
	  System.out.println("You win!");
	  numFood += 5;
      }
      if (playerChoice.equals("paper") && computerChoice.equals("rock")){
	  System.out.println("You win!");
	  numFood += 5;
      }
      if (playerChoice.equals("paper") && computerChoice.equals("scissor")){
	  System.out.println("You lost! You have died... You did not have enough food for energy to run from the wild animals.");
      }
      if (playerChoice.equals("scissor") && computerChoice.equals("rock")){
	  System.out.println("You lost! You have died... You did not have enough food for energy to run from the wild animals.");
      }
      if (playerChoice.equals("scissor") && computerChoice.equals("paper")){
	  System.out.println("You win!");
          numFood += 5;
      }
         
      if (healthCheck() == false){ 
         return "You died. Thanks for playing!";
      }
	      
      else{
         numFood = 0;
         return "You survived! You had enough food to give you energy to run away. Unfortunately, you are out of food, complete more challenges to resupply!";    
      }
   }
    
   //gains wood, guess word game (ex: le_o_ is lemon)
   public String jungleHike(){ 
	   //random array of words
	   ArrayList<String> guessingWords = new ArrayList<String>();
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
   
         String wordToGuess;
	      int x = (int)(Math.random() * 9);
         int x = x * 2;  
          
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
 	      	
         if (userInput.equals(wordToGuess)){
 	         System.out.println("Good job! You got it right! You get more food, water and wood!");
 	      	numFood += 10;
 	      	numWater += 10;
 	      	wood += 10;
 	      }
         else{
 		      System.out.print("Wrong. You lost food water and wood resources");
 		      numFood -=10;
 		     	numWater-=10;
 		     	wood-=10;
 		   }
      }
         
	    //random selection 
	    //random index remove letters (take lenth of word, randomly selected index for 3 letters and then replace with _)
	    //save the changed word in a new variable 
	    //random selection 
	    //random index remove letters (take lenth of word, randomly selected index for 3 letters and then replace with _)
	    //save the changed word in a new variable 
	    //print out, make them guess using string.equals in a for loop for three times 
	    //remove word from array so its not repeated  

   public String poisonBerries(){ 
      System.out.println("Sorry! You have accidentally consumed toxic berries."); 
      System.out.println("Play this trivia and get 4 out of 6 questions right to get the antidote, or else lose food and water!");
      int points = 0; 
         
      //question one
      System.out.println("Question 1: where do monkeys live? ");
      System.out.println("a) trees");
      System.out.println("b) inside houses");
      System.out.println("c) ground level");
      System.out.println("d) nests");
      String answer = myObj.nextLine();
      if (answer.equals("a")){
          System.out.println("True! Next question"); 
          points++; 
      }		    
      else {
	  System.out.println("False! Sorry. Next question.");
      }		    
      
      //question two
      System.out.println("Question 2: what color tree frog is most dangerous?");
      System.out.println("a) green");
      System.out.println("b) black and yellow");
      System.out.println("c) orange spotted");
      System.out.println("d) purple patched");	    
      String answer = myObj.nextLine();
      if (answer.equals("c")){
	System.out.println("True! Next question."); 
	points++;
      }		    
      else{
	System.out.println("False! Sorry. Next question.");
      }		    
      //question three
      System.out.println("Question 3: which plant is best for fevers?");
      System.out.println("a) lemon leaves");
      System.out.println("b) elderflower");
      System.out.println("c) red ivy");
      System.out.println("d) grass");	    
      String answer = myObj.nextLine();
	   if (answer.equals("a")){
		   System.out.println("True! Next question."); 
		   points++;
	   }		    
      else{
		   System.out.println("False! Sorry. Next question.");
	   }		    
      
      //question four
      System.out.println("Question 4: which edible fish is found close to shore?");
	   System.out.println("a) rockfish");
      System.out.println("b) salmon");
	   System.out.println("c) orange roughy");
      System.out.println("d) rainbow trout");    
	   String answer = myObj.nextLine();
	   if (answer.equals("a")){
		   System.out.println("True! Next question."); 
		   points++;
	   }		    
      else {
		   System.out.println("False! Sorry. Next question.");
	   }		    
	   
      //question five
      System.out.println("Question 5: what should you do if you see a snake?");
	   System.out.println("a) run backwards");
      System.out.println("b) stand still");
	   System.out.println("c) eat it");
      System.out.println("d) step on it");	    
	   String answer = myObj.nextLine();
	   if (answer.equals("b")){
		   System.out.println("True! Next question"); 
		   points++;
	   }
      else{
		   System.out.println("False! Sorry. Next question.");
	   }
	   
      //question six
      System.out.println("Question 6: where is treasure usually hidden?");
	   System.out.println("a) on the beach");
      System.out.println("b) underneath the island");
	   System.out.println("c) in a cave");
      System.out.println("d) this island does not have treasure so the question is not applicable");		    
	   String answer = myObj.nextLine();
	   if (answer.equals("d")){
		   System.out.println("True! Good work!"); 
		   points++;
	   }		    
      else {
		   System.out.println("False! Sorry.");
	   }
      
	   if (points >= 4){
		   return "You passed! Congrats!";
	   }
	   else{
		   return "You failed. Sorry."; 
		   numFood -= 3; 
		   numWater -= 3; 
	   }
   }   
   		    
   public String findWater(int guess){
      //in the dayTracker method, at the end of the day check water resources. call this method if user is low
      System.out.println("You are running low on water! Play this number guessing game to replenish.");
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
      
      if ((numWater <= 0) || (numFood <= 0)){
		   return "You ran out of resources, you died.";
	   }
   }  
		    
   public String findFood(int guess){
	   System.out.println("You are running low on food! Play this number guessing game to replenish.");
	   System.out.println("You have three guesses, pick any letter between a-k (abcdefghijk)");
	   String alphabet[] = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k"}; 
   } 
		    				       
   public static boolean healthCheck(){
	   if ((numWater <= 0) || (numFood <= 0)){
		return false;
	   }
	return true; 
   }   
}
