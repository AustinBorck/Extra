import java.util.Scanner;
import java.util.Random;

public class DungeonGame {
  public static void main(String[] args){

Scanner in = new Scanner(System.in);
Random rand = new Random();


//enemy
String[] enemies = {"Slime", "Zombie", "Monster"};
int maxEnemyHealth = 100;
int enemyAttack = 25;

//player
int health = 100;
int attackDamage = 50;
int healingPotions = 5;
int potionHealing = 25;
int potionDrop = 50; //percent

boolean running = true;

System.out.println("Welcome warrior!");

GAME:
while(running) {
  System.out.println("---------------------------------------");

  int enemyHealth = rand.nextInt(maxEnemyHealth);
  String enemy = enemies[rand.nextInt(enemies.length)];
  System.out.println("\t# " + enemy + " has appeared! #\n");

while (enemyHealth > 0) {
  System.out.println("\tYour HP: " + health);
  System.out.println("\t" + enemy + "'s HP: " + enemyHealth);
  System.out.println("\n\tWhat would you like to do?");
  System.out.println("\t1. Attack");
  System.out.println("\t2. Drink Health Potion");
  System.out.println("\t3. Run!");

  String input = in.nextLine();

if(input.equals("1")) {
  int damageDealt = rand.nextInt(attackDamage);
  int damageTaken = rand.nextInt(enemyAttack);

  enemyHealth -= damageDealt;
  health -= damageTaken;

  System.out.println("\t> You strike the " + enemy + " for " + damageDealt + " damage.");
  System.out.println("\t> You recieved " + damageTaken + " damage.");

  if(health < 1){
    System.out.println("\t> You have died.");
    break;
  }
}//if end

else if(input.equals("2")){
  if(healingPotions > 0) {
    health += potionHealing;
    healingPotions--;
    System.out.println("\t> You drank a health potion, healing yourself for " + potionHealing + "." +
    "\n\t>You now have " + health + " HP" + "\n\t> You now have " + healingPotions + " healing potions left.");

  }
  else {
    System.out.println("You have no health potions left.");
  }
}//elseifend

else if(input.equals("3")) {
  System.out.println("\tYou have chosen to run!");
  continue GAME;
}
else {
  System.out.println("\t Invalid command.");
}

  }


if(health < 1) {
  System.out.println("Thank you for playing.");
  break;
}
System.out.println("---------------------------------------");
System.out.println("# " + enemy + " was killed! # ");
System.out.println("# You have " + health + " HP left. #");

if(rand.nextInt(100) < potionDrop) {
  healingPotions++;
  System.out.println("# The " + enemy + " dropped a healing potion! #");
  System.out.println("# You now have " + healingPotions + " health potion(s). #");
}
System.out.println("---------------------------------------");
System.out.println("What would you like to do now?");
System.out.println("1. Continue fighting");
System.out.println("2. Go home");

String input = in.nextLine();

while(!input.equals("1") && !input.equals("2")) {
  System.out.println("Invalid command.");
  input = in.nextLine();
}

if(input.equals("1")) {
  System.out.println("You continue on your adventure.");
}

else if(input.equals("2")) {
  System.out.println("You return home.");
  break;
}




}//while end
System.out.println("#####################");
System.out.println("Thanks for playing!");
System.out.println("#####################");

  }//end main
}//end class
