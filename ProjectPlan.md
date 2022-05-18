Noni C

Sylvia L

Parie K

Sophia S

Kashvi S

Stage 1: Proposal

General description:
A game where the player makes choices for the main character in the game, who has just become stranded on an island. The player is shown the amount of resources they have at the beginning (randomly generated). There are obstacles on the island, and you can gain or lose resources as you try to survive the game. If you survive for 2 weeks, the safety boat will arrive.

The player will face many obsticles on the island, such as finding food/water, making shelter, extreme temperatures, being chased by wild animals. These obsticles will be created by different methods in the Island.java class.

Methods include:

- Player Class
   - BuildCharacter (player constructor)
   - TrackResource (keeps track of all the player's resources: food (int), water (int), clothes (int), wood (int), blanket (boolean), knife (boolean)) 
   		- food and water are initially randomized 
      
- Island Class
   - All obstacle methods (after each succesfully completed one: add food +2)
   		- MakeShelter
   		- WildAnimals (checks if food resources are < 5, if yes, then they die (unable to run away fast enough). if food >= 5, then all food is lost but game continues)
   		- TempCheck (not sure on this one) 
    	- FindWater (guessing num game to gain water)
   		- BuildShelter (checks wood, if there is a sufficient amount no resources will be lost. if there isn't you will continue to lose some)
   - DayTracker 
     	- three options: (1) timer (end day at certain time with ten second warming), (2) randomized obstacles (after certain randomized amount of obstacles in a day, day ends), (3) set obstacles (after same daily amount of obstacles, day ends) 
     	- update the resources (food -5, water -3) based on BuildShelter method
  
edits required: 

Temp Method: if random temp is above 110*, and wearing extra layer of clothes, you will lose 10 water resources; if random temp is below 32*, and wearing no exta layers, you will lose 10 water and 10 food resources.
