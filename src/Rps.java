import java.util.Scanner;

public class Rps {
    public static void main(String[] args) {
        String userResp = "";
        String playerBmove;
        String playerAmove;
        Scanner scanner = new Scanner(System.in);
        boolean done = false;
        do {
            System.out.println("Game Starting.....");
            do {
                //start game
                System.out.println("Player A whats is your move? [R/P/S]");
                playerAmove = scanner.nextLine();
            } while ((!playerAmove.equalsIgnoreCase("R")) && !(playerAmove.equalsIgnoreCase("P")) && !(playerAmove.equalsIgnoreCase("S")));

            do {
                System.out.println("Player B what is your move? [R/P/S]");
                playerBmove = scanner.nextLine();
            } while ((!playerBmove.equalsIgnoreCase("R")) && !(playerBmove.equalsIgnoreCase("P")) && !(playerBmove.equalsIgnoreCase("S")));
            if (playerAmove.equalsIgnoreCase("R")) {
                if (playerBmove.equalsIgnoreCase("R")) {
                    System.out.println("It's a tie");
                } else if (playerBmove.equalsIgnoreCase("P")) {
                    System.out.println("Player B wins");
                } else if (playerBmove.equalsIgnoreCase("S")) {
                    System.out.println("Player A wins");
                }
            } else if (playerAmove.equalsIgnoreCase("S")) {
                if (playerBmove.equalsIgnoreCase("s")) {
                    System.out.println("It's a Tie");
                } else if (playerBmove.equalsIgnoreCase("R")) {
                    System.out.println("Player B Wins");
                } else if (playerBmove.equalsIgnoreCase("P")) {
                    System.out.println("Player A wins");
                }
            } else if (playerAmove.equalsIgnoreCase("P")) {
                if (playerBmove.equalsIgnoreCase("P")) {
                    System.out.println("Its a Tie");
                } else if (playerBmove.equalsIgnoreCase("R")) {
                    System.out.println("Player A wins");
                } else if (playerBmove.equalsIgnoreCase("S")) {
                    System.out.println("Player B wins");
                }


            }
            System.out.println(" Do you want to play again?");
            userResp = scanner.nextLine();
            if (userResp.equalsIgnoreCase("n")) {//When comparing string don't use == that is for numbers
                done = true;
            }continue;
        } while (!done);
    }
}
