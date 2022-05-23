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
    
  }
}




