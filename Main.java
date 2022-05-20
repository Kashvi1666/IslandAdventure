import java.util.Scanner;
public class Main{
  
  public static void main(String[]args) {
    
    Scanner myObj = new Scanner(System.in);
    System.out.println("Please enter your username: ");
    String username = myObj.nextLine();
    System.out.println("Welcome to our Island Game: " + username);
    
  }
}




