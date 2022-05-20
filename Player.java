//kashvi swami
//may 18, 2022 
//ap cs project 

import java.util.*; 

public class Player { 
   
   private int numDays;
	private int numFood;
	private int numWater;
	private boolean blanket;
	private boolean knife; 
	private boolean wood; 
   private String name; 
   
   public Player(String playerName){
      name = playerName; 
      numFood = (Math.random()*15)+5; 
      numWater = (Math.random()*15)+5; 
      blanket = true; 
      knife = true; 
      wood = (Math.random()*15)+5; 
   }

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
