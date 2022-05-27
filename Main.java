import java.util.Scanner;
public class Main{
  
  public static void main(String[]args) {
    
    Scanner myObj = new Scanner(System.in);
    System.out.println("Please enter your username: ");
    String username = myObj.nextLine();
    System.out.println("Welcome to our Island Game: " + username);
    System.out.println("In this game, you wil be faced with many obstacles and challenges that you will have to overcome. You will be given a random number of resources and have to make hard descisions to survive. If you live for 10 days, then you win! I wish you luck on your island adventure!");
    System.out.println("Below are the resources you have");
    Island.getResources();
    
    int day = 0;
    while(healthCheck() && day < 10){
      System.out.println("It is day: " + day);
      int count = 1; 
      while(count < 3){
        
        int x = (int) ((Math.random() * 3) + 1);
        if(x = 1){
          wildAnimals();
          count ++;
          if(!healthCheck()){
            System.out.println("You have died! Game Over! :( ");
          }
        }
        if(x = 2){
          jungleHike();
          count ++;
          if(!healthCheck()){
            System.out.println("You have died! Game Over! :( ");
          }
        }
        if(x = 3){
          posionBerries(); 
          count ++;
           if(!healthCheck()){
            System.out.println("You have died! Game Over! :( ");
           }
        }

     }
     if (count = 2){
      day ++; 
      System.out.println("The day has ended");
      numFood = numFood - 2;
      numWater = numWater - 2;

      if (findWater() <= 5){
        findWater();
      }

      
      
     }     
    
    
  }
  
  if(day = 10){
    System.out.println("A rescue boat has come! You have survived");
  }
   
  }
}




