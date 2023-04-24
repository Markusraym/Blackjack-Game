
////////////////import org.w3c.dom.ls.LSOutput

import java.util.Scanner;

public class Blackjack {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        P1Random rand = new P1Random(); // Random number generator

        //START
        //Game of Blackjack. Person closest1 to 21 without going over wins!
        int gameCount = 1;
        System.out.println("START GAME #" + gameCount);
        System.out.println(" ");

        boolean blackJackOn = true;
        int yourHand = 0; // Total hand of player
        int menuInput; // Allows for user to input menu options
        int playerCardValue = 5; // rand.nextInt(13) + 1; // Player's card
        int DealerHand = rand.nextInt(11) + 16; // Dealer's card
        int playerWins = 0; // Total number of games player won
        float playerWinsPercent = 0; // Filler variable so I can divide a float and an int variable with decimals
        int dealerWins = 0; // Total number of games Dealer won
        int tieGames = 0; // Total number of games tied
        int totalGames = 0; // Total number of games
        float percentWins;
        //int gameCount = 0;


        System.out.println("Your card is a " + playerCardValue + "!");
        System.out.println("Your hand is: " + (playerCardValue + yourHand));
        System.out.println(" ");
        // Everything above this line prints once
        // This creates and displays the card drawn and your total hand

        while (blackJackOn) {




            yourHand = playerCardValue + yourHand; // Updates the hand everytime a new card is drawn

            if (yourHand == 21) {
                gameCount = gameCount + 1;
                System.out.println("BLACKJACK! You win!");
                System.out.println(" ");
                System.out.println("START GAME #" + gameCount);
                System.out.println(" ");
                yourHand = 0;
                playerCardValue = rand.nextInt(13) + 1;  // This draws the random card and uses the switch statement below.

                switch (playerCardValue) {
                    case 1:
                        System.out.println("Your card is a ACE!");
                        break;
                    case 2:
                        System.out.println("Your card is a " + playerCardValue + "!");
                        break;
                    case 3:
                        System.out.println("Your card is a " + playerCardValue + "!");
                        break;
                    case 4:
                        System.out.println("Your card is a " + playerCardValue + "!");
                        break;
                    case 5:
                        System.out.println("Your card is a " + playerCardValue + "!");
                        break;
                    case 6:
                        System.out.println("Your card is a " + playerCardValue + "!");
                        break;
                    case 7:
                        System.out.println("Your card is a " + playerCardValue + "!");
                        break;
                    case 8:
                        System.out.println("Your card is a " + playerCardValue + "!");
                        break;
                    case 9:
                        System.out.println("Your card is a " + playerCardValue + "!");
                        break;
                    case 10:
                        System.out.println("Your card is a " + playerCardValue + "!");
                        break;
                    case 11:
                        System.out.println("Your card is a JACK!");
                        playerCardValue = playerCardValue - 1; // This makes it so the card the user gets is worth 10 points, not 11.
                        break;
                    case 12:
                        System.out.println("Your card is a QUEEN!");
                        playerCardValue = playerCardValue - 2; // This makes it so the card the user gets is worth 10 points, not 12.
                        break;
                    case 13:
                        System.out.println("Your card is a KING!");
                        playerCardValue = playerCardValue - 3; // This makes it so the card the user gets is worth 10 points, not 13.
                        break;
                    default:
                        System.out.println("Impossible."); // A player would never see this :)
                }

                yourHand = playerCardValue + yourHand;
                System.out.println("Your hand is: " + yourHand);
                System.out.println(" ");
                //yourHand = 0;   // Resets the player's hand at the end of every game. This shows up throughout the code
                DealerHand = 0; // Resets the Dealer's hand at the end of every game. This shows up throughout the code
                playerWins = playerWins + 1;
                playerWinsPercent = playerWinsPercent +1;
                totalGames = totalGames + 1;
                gameCount = gameCount + 1;
                // The code above checks if the user has got exactly 21. If true, it congratulates/denigrates and restarts the count.
                // It also adds plus one to the respective statistics

            } else if (yourHand > 21) {
                gameCount = gameCount + 1;
                System.out.println("You exceeded 21! You lose.");
                System.out.println(" ");
                System.out.println("START GAME #" + gameCount);
                System.out.println(" ");
                yourHand = 0;
                playerCardValue = rand.nextInt(13) + 1;  // This draws the random card and uses the switch statement below.

                switch (playerCardValue) {
                    case 1:
                        System.out.println("Your card is a ACE!");
                        break;
                    case 2:
                        System.out.println("Your card is a " + playerCardValue + "!");
                        break;
                    case 3:
                        System.out.println("Your card is a " + playerCardValue + "!");
                        break;
                    case 4:
                        System.out.println("Your card is a " + playerCardValue + "!");
                        break;
                    case 5:
                        System.out.println("Your card is a " + playerCardValue + "!");
                        break;
                    case 6:
                        System.out.println("Your card is a " + playerCardValue + "!");
                        break;
                    case 7:
                        System.out.println("Your card is a " + playerCardValue + "!");
                        break;
                    case 8:
                        System.out.println("Your card is a " + playerCardValue + "!");
                        break;
                    case 9:
                        System.out.println("Your card is a " + playerCardValue + "!");
                        break;
                    case 10:
                        System.out.println("Your card is a " + playerCardValue + "!");
                        break;
                    case 11:
                        System.out.println("Your card is a JACK!");
                        playerCardValue = playerCardValue - 1; // This makes it so the card the user gets is worth 10 points, not 11.
                        break;
                    case 12:
                        System.out.println("Your card is a QUEEN!");
                        playerCardValue = playerCardValue - 2; // This makes it so the card the user gets is worth 10 points, not 12.
                        break;
                    case 13:
                        System.out.println("Your card is a KING!");
                        playerCardValue = playerCardValue - 3; // This makes it so the card the user gets is worth 10 points, not 13.
                        break;
                    default:
                        System.out.println("Impossible."); // A player would never see this :)
                }

                yourHand = playerCardValue + yourHand;
                System.out.println("Your hand is: " + yourHand);
                System.out.println(" ");
               // yourHand = 0;
                DealerHand = 0;
                dealerWins = dealerWins + 1;
                totalGames = totalGames + 1;
                gameCount = gameCount + 1;
                // The code above checks if the user has exceeded 21. If true, it congratulates/denigrates and restarts the count.
                // It also adds plus one to the respective statistics
            }

            System.out.println("1. Get another card");
            System.out.println("2. Hold hand");
            System.out.println("3. Print statistics");
            System.out.println("4. Exit");
            System.out.println(" ");
            System.out.print("Choose an option: ");
            menuInput = scanner.nextInt();
            System.out.println(" ");
            // This creates a menu for the user to chose and input from

            // Below is if the user inputs 1 in the menu.
            if (menuInput == 1) {

               playerCardValue = rand.nextInt(13) + 1;  // This draws the random card and uses the switch statement below.

                switch (playerCardValue) {
                    case 1:
                        System.out.println("Your card is a ACE!");
                        break;
                    case 2:
                        System.out.println("Your card is a " + playerCardValue + "!");
                        break;
                    case 3:
                        System.out.println("Your card is a " + playerCardValue + "!");
                        break;
                    case 4:
                        System.out.println("Your card is a " + playerCardValue + "!");
                        break;
                    case 5:
                        System.out.println("Your card is a " + playerCardValue + "!");
                        break;
                    case 6:
                        System.out.println("Your card is a " + playerCardValue + "!");
                        break;
                    case 7:
                        System.out.println("Your card is a " + playerCardValue + "!");
                        break;
                    case 8:
                        System.out.println("Your card is a " + playerCardValue + "!");
                        break;
                    case 9:
                        System.out.println("Your card is a " + playerCardValue + "!");
                        break;
                    case 10:
                        System.out.println("Your card is a " + playerCardValue + "!");
                        break;
                    case 11:
                        System.out.println("Your card is a JACK!");
                        playerCardValue = playerCardValue - 1; // This makes it so the card the user gets is worth 10 points, not 11.
                        break;
                    case 12:
                        System.out.println("Your card is a QUEEN!");
                        playerCardValue = playerCardValue - 2; // This makes it so the card the user gets is worth 10 points, not 12.
                        break;
                    case 13:
                        System.out.println("Your card is a KING!");
                        playerCardValue = playerCardValue - 3; // This makes it so the card the user gets is worth 10 points, not 13.
                        break;
                    default:
                        System.out.println("Impossible."); // A player would never see this :)
                }

                System.out.println("Your hand is: " + (playerCardValue + yourHand));
                System.out.println(" ");
                // After drawing the card, this tells the user what their total hand is. Then it loops back to the menu.

            // Below is if the user inputs 2 in the menu.
            } else if (menuInput == 2) {

                DealerHand = rand.nextInt(11) + 16; //This "draws" the dealer's card count.

                System.out.println("Dealer's hand: " + DealerHand);
                System.out.println("Your hand is: " + yourHand);
                // Above tells you the count for the dealer's hand and your hand. After, the game tells you if you won, tie, or lost.

                // Below's if statement determines whether the dealer won or not. If he does, it prints out "Dealer wins!"
                if ((DealerHand <= 21 && DealerHand > yourHand) || (DealerHand <= 21 && yourHand > 21)) {
                    //gameCount = gameCount + 1;
                    System.out.println(" ");
                    System.out.println("Dealer wins!");
                    System.out.println(" ");
                    System.out.println("START GAME #" + gameCount);
                    System.out.println(" ");
                    yourHand = 0;
                    playerCardValue = rand.nextInt(13) + 1;  // This draws the random card and uses the switch statement below.

                    switch (playerCardValue) {
                        case 1:
                            System.out.println("Your card is a ACE!");
                            break;
                        case 2:
                            System.out.println("Your card is a " + playerCardValue + "!");
                            break;
                        case 3:
                            System.out.println("Your card is a " + playerCardValue + "!");
                            break;
                        case 4:
                            System.out.println("Your card is a " + playerCardValue + "!");
                            break;
                        case 5:
                            System.out.println("Your card is a " + playerCardValue + "!");
                            break;
                        case 6:
                            System.out.println("Your card is a " + playerCardValue + "!");
                            break;
                        case 7:
                            System.out.println("Your card is a " + playerCardValue + "!");
                            break;
                        case 8:
                            System.out.println("Your card is a " + playerCardValue + "!");
                            break;
                        case 9:
                            System.out.println("Your card is a " + playerCardValue + "!");
                            break;
                        case 10:
                            System.out.println("Your card is a " + playerCardValue + "!");
                            break;
                        case 11:
                            System.out.println("Your card is a JACK!");
                            playerCardValue = playerCardValue - 1; // This makes it so the card the user gets is worth 10 points, not 11.
                            break;
                        case 12:
                            System.out.println("Your card is a QUEEN!");
                            playerCardValue = playerCardValue - 2; // This makes it so the card the user gets is worth 10 points, not 12.
                            break;
                        case 13:
                            System.out.println("Your card is a KING!");
                            playerCardValue = playerCardValue - 3; // This makes it so the card the user gets is worth 10 points, not 13.
                            break;
                        default:
                            System.out.println("Impossible."); // A player would never see this :)
                    }

                    yourHand = playerCardValue + yourHand;
                    System.out.println("Your hand is: " + yourHand);
                    System.out.println(" ");
                    //yourHand = 0;
                    DealerHand = 0; // DealerHand, yourHand, and playerCardValue are set back to 0 before the next game loops back and starts.
                    playerCardValue = 0;
                    dealerWins = dealerWins + 1;
                    totalGames = totalGames + 1;
                    // This keeps track of the statistics and adds one to it if this if-statement is true

                // Below's if-statement determines whether the player won or not. If he does, it prints out "You win!"
                } else if ((yourHand <= 21 && yourHand > DealerHand) || (yourHand <= 21 && DealerHand > 21)) {
                    gameCount = gameCount + 1;
                    System.out.println(" ");
                    System.out.println("You win!");
                    System.out.println(" ");
                    System.out.println("START GAME #" + gameCount);
                    System.out.println(" ");
                    yourHand = 0;
                    playerCardValue = rand.nextInt(13) + 1;  // This draws the random card and uses the switch statement below.

                    switch (playerCardValue) {
                        case 1:
                            System.out.println("Your card is a ACE!");
                            break;
                        case 2:
                            System.out.println("Your card is a " + playerCardValue + "!");
                            break;
                        case 3:
                            System.out.println("Your card is a " + playerCardValue + "!");
                            break;
                        case 4:
                            System.out.println("Your card is a " + playerCardValue + "!");
                            break;
                        case 5:
                            System.out.println("Your card is a " + playerCardValue + "!");
                            break;
                        case 6:
                            System.out.println("Your card is a " + playerCardValue + "!");
                            break;
                        case 7:
                            System.out.println("Your card is a " + playerCardValue + "!");
                            break;
                        case 8:
                            System.out.println("Your card is a " + playerCardValue + "!");
                            break;
                        case 9:
                            System.out.println("Your card is a " + playerCardValue + "!");
                            break;
                        case 10:
                            System.out.println("Your card is a " + playerCardValue + "!");
                            break;
                        case 11:
                            System.out.println("Your card is a JACK!");
                            playerCardValue = playerCardValue - 1; // This makes it so the card the user gets is worth 10 points, not 11.
                            break;
                        case 12:
                            System.out.println("Your card is a QUEEN!");
                            playerCardValue = playerCardValue - 2; // This makes it so the card the user gets is worth 10 points, not 12.
                            break;
                        case 13:
                            System.out.println("Your card is a KING!");
                            playerCardValue = playerCardValue - 3; // This makes it so the card the user gets is worth 10 points, not 13.
                            break;
                        default:
                            System.out.println("Impossible."); // A player would never see this :)
                    }

                    yourHand = playerCardValue + yourHand;
                    System.out.println("Your hand is: " + yourHand);
                    System.out.println(" ");
                   // yourHand = 0;
                    DealerHand = 0; // DealerHand, yourHand, and playerCardValue are set back to 0 before the next game loops back and starts.
                    playerCardValue = 0;
                    playerWins = playerWins + 1;
                    playerWinsPercent = playerWinsPercent + 1;
                    totalGames = totalGames + 1;
                    // Statistics tracking. Adds one to the variables if the if-statement is true

                // Below's if-statement determines if the player and dealer tied. If true, it prints out that it is a tie.
                } else if (yourHand == DealerHand) {
                    totalGames = totalGames + 1;
                    System.out.println(" ");
                    System.out.println("It's a tie! No one wins!");
                    System.out.println(" ");
                    System.out.println("START GAME #" + gameCount);
                    System.out.println(" ");
                    yourHand = 0;
                    playerCardValue = rand.nextInt(13) + 1;  // This draws the random card and uses the switch statement below.

                    switch (playerCardValue) {
                        case 1:
                            System.out.println("Your card is a ACE!");
                            break;
                        case 2:
                            System.out.println("Your card is a " + playerCardValue + "!");
                            break;
                        case 3:
                            System.out.println("Your card is a " + playerCardValue + "!");
                            break;
                        case 4:
                            System.out.println("Your card is a " + playerCardValue + "!");
                            break;
                        case 5:
                            System.out.println("Your card is a " + playerCardValue + "!");
                            break;
                        case 6:
                            System.out.println("Your card is a " + playerCardValue + "!");
                            break;
                        case 7:
                            System.out.println("Your card is a " + playerCardValue + "!");
                            break;
                        case 8:
                            System.out.println("Your card is a " + playerCardValue + "!");
                            break;
                        case 9:
                            System.out.println("Your card is a " + playerCardValue + "!");
                            break;
                        case 10:
                            System.out.println("Your card is a " + playerCardValue + "!");
                            break;
                        case 11:
                            System.out.println("Your card is a JACK!");
                            playerCardValue = playerCardValue - 1; // This makes it so the card the user gets is worth 10 points, not 11.
                            break;
                        case 12:
                            System.out.println("Your card is a QUEEN!");
                            playerCardValue = playerCardValue - 2; // This makes it so the card the user gets is worth 10 points, not 12.
                            break;
                        case 13:
                            System.out.println("Your card is a KING!");
                            playerCardValue = playerCardValue - 3; // This makes it so the card the user gets is worth 10 points, not 13.
                            break;
                        default:
                            System.out.println("Impossible."); // A player would never see this :)
                    }

                    yourHand = playerCardValue + yourHand;
                    System.out.println("Your hand is: " + yourHand);
                    System.out.println(" ");
                    //yourHand = 0;
                    DealerHand = 0; // DealerHand, yourHand, and playerCardValue are set back to 0 before the next game loops back and starts.
                    playerCardValue = 0;
                    tieGames = tieGames + 1;
                    gameCount = gameCount + 1;
                     // Statistics tracking. Adds one to the variables if the if-statement is true

                }

            // Below is if the user input a 3 in the menu. This shows all statistics from playing.
            } else if (menuInput == 3) {
                float x = ((playerWinsPercent / totalGames) * 100);
                System.out.println("Number of Player wins: " + playerWins);
                System.out.println("Number of Dealer wins: " + dealerWins);
                System.out.println("Number of tie games: " + tieGames);
                System.out.println("Total # of games played is: " + totalGames);
                System.out.println("Percentage of Player wins: " + (String.format("%.1f", x) + "%")); //This converts a decimal into percentage
                //System.out.println("Percentage of Player wins: " + ((playerWinsPercent / totalGames)*100) + "%"); //This converts a decimal into percentage
                // HOW TO DIVIDE FLOATING POINT AND INT WITHOUT GETTING %60.0004??
                //System.out.println("Percentage of Player wins: " + ((playerWins / totalGames)*100)+"%"); //This converts a decimal into percentage
                System.out.println(" ");



                // This is the workaround for the bug where if you input anything other than 1 through 4 three times, the game has a seizure.
                System.out.println("1. Get another card");
                System.out.println("2. Hold hand");
                System.out.println("3. Print statistics");
                System.out.println("4. Exit");
                System.out.println(" ");
                System.out.print("Choose an option: ");
                int emptyResponse = scanner.nextInt();
                System.out.println(" ");
                break;





            // Below is if the user input a 4 in the menu. This quits the game.
            } else if (menuInput == 4) {
                break;


                // Below is if the user input a value other than 1 through 4 in the main menu.
            } else {

            System.out.println("Invalid input!");
            System.out.println("Please enter an integer value between 1 and 4.");
                System.out.println(" ");





            }


        }
    }
}
