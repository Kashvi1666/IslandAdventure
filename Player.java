//kashvi swami
//may 18, 2022 
//ap cs project 

import java.util.*; 

public class Player { 
   
   private int food; 
   private int water; 
   private int wood; 
   private boolean blanket; 
   private boolean knife; 
   private String name; 
   
   public Player(String playerName){
      name = playerName; 
   }
   
   public void trackResources(){
      food = (Math.random()*15)+5; 
      water = (Math.random()*15)+5; 
      blanket = true; 
      knife = true; 
      wood = (Math.random()*15)+5; 
   } 
} 
