import java.util.Random;//Random class in impoerted.

import java.util.*;//Scanner class is imported.

class TechnoHacks_EduTech_Task_3
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);//An object of Scanner class is created.

        System.out.println(" T H E   G A M E   O F   R O C K ,   P A P E R   A N D   S C I S S O R ");

        System.out.println("------------------------------------------------------------------------");
       
        Random random = new Random();//An object of Random class is created.

        String arr[] = {"Rock", "Paper", "Scissors"};//The required possible moves for the game are stored in an array.
        String MoveMadeByComputer = arr[random.nextInt(3)];//Here the move of the Computer is selected randomly.

        int score = 0;//Here we will store the score of the Player while playing the game.

        while(true)//The game will keep on running until and unless the value inside the while condition becomes false. 
        {
            System.out.println("Enter your move: (Rock / Paper / Scissors)? If you want to exit then press 'Exit'. ");
            String MoveMadeByPlayer = sc.next();//Here we will store the move made by the Player(User).

            if(MoveMadeByPlayer.equalsIgnoreCase("Exit"))
            {
                System.out.println("The Game ends...");
                System.out.println("The score made by the player is: " + score);
                System.exit(0);
            }//If the move is "Exit" then the game will end and the program will close after displying the score achieved by the Player.
            else
            {
                System.out.println("Move made by the computer: " + MoveMadeByComputer);//It will display the move made by the Player.

                if(MoveMadeByPlayer.equalsIgnoreCase(MoveMadeByComputer))
                {
                    System.out.println("It is a tie..");
                }//If the move made by the Player and the move made by the Computer are same, the it will say a tie. There is no change in the score of the Player.
                else if(MoveMadeByPlayer.equalsIgnoreCase("Rock"))
                {
                    if(MoveMadeByComputer.equalsIgnoreCase("Paper"))
                    {
                        System.out.println("Player loses, Computer wins...");
                        score -= 1;
                    }//If the player takes Rock and Computer takes Paper, then Player loses and the score of the Player is decreased by 1.  
                    else if(MoveMadeByComputer.equalsIgnoreCase("Scissors"))
                    {
                        System.out.println("Player wins, Computer loses...");
                        score += 1;
                    }//If the player takes Rock and Computer takes Scissors, then Player wins and the score of the Player is increased by 1.
                }
                else if(MoveMadeByPlayer.equalsIgnoreCase("Paper"))
                {
                    if(MoveMadeByComputer.equalsIgnoreCase("Scissors"))
                    {
                        System.out.println("Player loses, Computer wins...");
                        score -= 1;
                    }//If the player takes Paper and Computer takes Scissors, then Player loses and the score of the Player is decreased by 1.
                    else if(MoveMadeByComputer.equalsIgnoreCase("Rock"))
                    {
                        System.out.println("Player wins, Computer loses...");
                        score += 1;
                    }//If the player takes Paper and Computer takes Rock, then Player wins and the score of the Player is increased by 1.
                }
                else if(MoveMadeByPlayer.equalsIgnoreCase("Scissors"))
                {
                    if(MoveMadeByComputer.equalsIgnoreCase("Rock"))
                    {
                        System.out.println("Player loses, Computer wins...");
                        score -= 1;
                    }//If the player takes Scissors and Computer takes Rock, then Player loses and the score of the Player is decreased by 1.
                    else if(MoveMadeByComputer.equalsIgnoreCase("Paper"))
                    {
                        System.out.println("Player wins, Computer loses...");
                        score += 1;
                    }//If the player takes Scissors and Computer takes Paper, then Player wins and the score of the Player is increased by 1.
                }
                else
                {
                    System.out.println("Invalid move...Please try the next move...");
                }//If the Player takes any other move other than Rock, Paper, and Scissors and Exit then it will display an "Invalid Move".
            }
        }
    }
}