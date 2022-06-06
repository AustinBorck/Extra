public class RockPaperSissors{
    public static void main(String[] args) {
    //declare scanner for user input
    java.util.Scanner keyboard = new                 java.util.Scanner(System.in);
      java.util.Random rand = new java.util.Random();

    // Greet the user
    System.out.println("Hello! Would you like to play   rock paper scissors?");
    System.out.println("Type 1 for Yes, 2 for No.");

    //get input from user for if they want to play
    int userChoice = keyboard.nextInt();
    System.out.println(userChoice);


    int playerWins = 0;
    int computerWins = 0;

    while(userChoice == 1){
      System.out.println("Choose! Type 0 for Rock, 1 for Paper, 2   for Sissors");
    int userMove = keyboard.nextInt();
    int computerMove = rand.nextInt(3);

    if(computerMove == 0) {
      System.out.println("The computer chose Rock.");
    } else if(computerMove == 1) {
      System.out.println("The computer chose Paper.");
    } else if(computerMove == 2) {
      System.out.println("The computer chose Sissors.");
    }

    if(userMove == 0 && computerMove == 1){
      System.out.println("The computer won!");
      computerWins = computerWins + 1;
    } else if(userMove == 1 && computerMove == 2) {
      System.out.println("The computer won!");
      computerWins = computerWins + 1;
    } else if(userMove == 2 && computerMove == 0) {
      System.out.println("The computer won!");
      computerWins = computerWins + 1;
    } else if (userMove == computerMove) {
      System.out.println("Nobody wins!");
    } else {
      System.out.println("You win!");
      playerWins = playerWins + 1;
    }


      //Win tracking output
      System.out.println("Player Wins: " + playerWins);
      System.out.println("Computer Wins: " + computerWins);

      System.out.println("Would you like to play again?");
      System.out.println("Type 1 for yes, 2 for no.");
      userChoice = keyboard.nextInt();
    }
      //farewell statement
      System.out.println("Goodbye! Thanks for playing.");








    //closing scanner at end of application
    keyboard.close();
  }
}
