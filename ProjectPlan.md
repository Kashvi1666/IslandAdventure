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
 -> Player Class
   --> BuildCharacter (player constructor)
   --> TrackResource (keeps track of all the player's resources: food (int), water (int), clothes (int), wood (int), blanket (boolean), knife (boolean)) 
      --> food and water are initially randomized 
 -> Island Class
   --> All obstacle methods (after each succesfully completed one: add food +2)
      --> MakeShelter
      --> WildAnimals
      --> TempCheck (not sure on this one) 
      --> FindWater (guessing num game to gain water)
   --> DayTracker 
      --> three options: (1) timer (end day at certain time with ten second warming), (2) randomized obstacles (after certain randomized amount of obstacles in a day, day ends), (3) set obstacles (after same daily amount of obstacles, day ends) 
      --> update the resources (food -5, water -3, 
  


Making shelter: if wood then you make it through the night, else you lose resources

Wild Animals: if have more than 5 food resources player is able to run quickly but they lose all 5 resources, else they die

edits required: 

Temp Method: if random temp is above 110*, and wearing extra layer of clothes, you will lose 10 water resources; if random temp is below 32*, and wearing no exta layers, you will lose 10 water and 10 food resources.
