import java.util.Scanner;
public class Main{
  
  public static void main(String[]args) {
    
    Scanner myObj = new Scanner(System.in);
    System.out.println("Please enter your username: ");
    String username = myObj.nextLine();
    System.out.println("Welcome to our Island Game: " + username);
    System.out.println("In this game, you wil be faced with many obstacles and challenges that you will have to overcome. You will be given a random number of resources and have to make hard descisions to survive. If you live for 10 days, then you win! I wish you luck on your island adventure!");
    System.out.println("Below are the resources you have);
    Island.getResources();
    
    int count = 1; 
    while(healthCheck()){
      System.out.println("It is day: " + getNumDays());
      while(count < 3){
        
        int x = (int) ((Math.random() * 4) + 1);
        if(x = 1){
          wildAnimals();
          count ++;
        }
        if(x = 2){
          findWater();
          count ++; 
        }
        if(x = 3){
          jungleHike();
          count ++;
        }
        if(x = 4){
          posionBerries(); 
          count ++;
        }

     }
     if (count = 2){
      System.out.println("The day has ended");
      numFood = numFood - 2;
      numWater = numWater - 2;
      System.out.println("you have " +  (10 - getNumDays()) + " left");
      
     }     
    
    
  }
  if(!healthCheck()){
   
  }
}




