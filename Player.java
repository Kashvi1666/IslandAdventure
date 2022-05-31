import java.util.*; 

public class Player { 
	private int numFood;
	private int numWater;
	private boolean blanket;
	private boolean knife; 
	private int wood; 
  private String name; 
   
  public Player(String playerName){
      name = playerName; 
      numFood = (int)(Math.random()*15)+5; 
      numWater = (int)(Math.random()*15)+5; 
      blanket = true; 
      knife = true; 
      wood = (int)(Math.random()*15)+5; 
   }
} 
