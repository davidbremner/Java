import java.util.Scanner;

public class Pokerito {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Let's play Pokerito. Hit enter when you're ready.");
        scan.nextLine();
        System.out.println("It's like Poker, but a lot simpler.\n\t• There are two players, you and the computer.\n\t" +
                "• The dealer will give each player one card.\n\t• Then, the dealer will draw five cards (the river)\n\t" +
                "• The player with the most river matches wins!\n\t• If the matches are equal, everyone's a winner!");

        System.out.println("Ready? Hit enter if you are.");
        scan.nextLine();
        String user = randomCard();
        String computer = randomCard();
        System.out.println("Here's your card:\n" + user);
        System.out.println("Here's the computer's card:\n" + computer);

        System.out.println("Now, the dealer will draw five cards. Press enter to continue.");
        int compMatch = 0;
        int userMatch = 0;
        for (int i = 0; i < 5; i++) {
            scan.nextLine();
            System.out.println("Card: " + (i + 1));
            String card = randomCard();
            System.out.print(card);
            if (card.equals(user)) {
                userMatch++;
            } else if (card.equals(computer)) {
                compMatch++;
            }
        }
        System.out.println("\nYour number of matches: " + userMatch);
        System.out.println("Computer number of matches: " + compMatch);
        if (userMatch > compMatch) {
            System.out.println("\nYou win!!");
        } else if (userMatch < compMatch) {
            System.out.println("\nUnfortuntely you were beaten by a computer...");
        } else {
            System.out.println("\nDraw!");
        }
        scan.close();
    }

    /**
     * function name: randomCard
     * @return (string)
     * Inside the function:
     *      1. Gets a random number between 1 and 13.
     *      2. Returns a card that matches the random number.
     */
    public static String randomCard() {
        int fetchCard = (int)(Math.random() * 13 + 1);
        switch (fetchCard) {
            case 1:
                return "   _____\n"+
                        "  |A _  |\n"+
                        "  | ( ) |\n"+
                        "  |(_'_)|\n"+
                        "  |  |  |\n"+
                        "  |____V|\n";
            case 2:
                return "   _____\n"+
                        "  |2    |\n"+
                        "  |  ♣  |\n"+
                        "  |     |\n"+
                        "  |  ♣  |\n"+
                        "  |____Z|\n";
            case 3:
                return "   _____\n" +
                        "  |3    |\n"+
                        "  | ♣ ♣ |\n"+
                        "  |     |\n"+
                        "  |  ♣  |\n"+
                        "  |____E|\n";
            case 4:
                return "   _____\n" +
                        "  |4    |\n"+
                        "  | ♣ ♣ |\n"+
                        "  |     |\n"+
                        "  | ♣ ♣ |\n"+
                        "  |____h|\n";
            case 5:
                return "   _____ \n" +
                        "  |5    |\n" +
                        "  | ♣ ♣ |\n" +
                        "  |  ♣  |\n" +
                        "  | ♣ ♣ |\n" +
                        "  |____5|\n";
            case 6:
                return "   _____ \n" +
                        "  |6    |\n" +
                        "  | ♣ ♣ |\n" +
                        "  | ♣ ♣ |\n" +
                        "  | ♣ ♣ |\n" +
                        "  |____6|\n";
            case 7:
                return "   _____ \n" +
                        "  |7    |\n" +
                        "  | ♣ ♣ |\n" +
                        "  |♣ ♣ ♣|\n" +
                        "  | ♣ ♣ |\n" +
                        "  |____7|\n";
            case 8:
                return "   _____ \n" +
                        "  |8    |\n" +
                        "  |♣ ♣ ♣|\n" +
                        "  | ♣ ♣ |\n" +
                        "  |♣ ♣ ♣|\n" +
                        "  |____8|\n";
            case 9:
                return "   _____ \n" +
                        "  |9    |\n" +
                        "  |♣ ♣ ♣|\n" +
                        "  |♣ ♣ ♣|\n" +
                        "  |♣ ♣ ♣|\n" +
                        "  |____9|\n";
            case 10:
                return "   _____ \n" +
                        "  |10  ♣|\n" +
                        "  |♣ ♣ ♣|\n" +
                        "  |♣ ♣ ♣|\n" +
                        "  |♣ ♣ ♣|\n" +
                        "  |___10|\n";
            case 11:
                return "   _____\n" +
                        "  |J ♣ ♣|\n"+
                        "  |♣ ♣ ♣|\n"+
                        "  |♣ ♣ ♣|\n"+
                        "  |♣ ♣ ♣|\n"+
                        "  |____J|\n";
            case 12:
                return "   _____\n" +
                        "  |Q   ♣|\n"+
                        "  | ♚ ♚ |\n"+
                        "  |♚ ♚ ♚|\n"+
                        "  | ♚ ♚ |\n"+
                        "  |____Q|\n";
            case 13:
                return "   _____\n" +
                        "  |K   ♣|\n"+
                        "  | ♛ ♛ |\n"+
                        "  |♛ ♛ ♛|\n"+
                        "  | ♛ ♛ |\n"+
                        "  |____K|\n";
            default: return "N/A"; //will never trigger.
        }
    }
}
