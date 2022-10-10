import java.util.Scanner;

public class Dealership {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int availableCars = 10000;
        int creditScoreMinimum = 660;
        int carPurchaseMax = 30000;

        System.out.println("\n╔═━──━▒ Welcome to the Java Dealership ▒━──━═╗\n");
        System.out.println("╰┈➤ Select option 'a' to buy a car");
        System.out.println("╰┈➤ Select option 'b' to sell a car");
        String userAnswer = scan.next();

        switch (userAnswer) {
            case "a":
                System.out.println("\nOkay you want to buy a car, whats your budget?");
                int userBudget = scan.nextInt();
                if (userBudget >= availableCars) {
                    System.out.println("Great, we have a Fiat Punto available for a budget of " + userBudget + "!");

                    System.out.println("\nDo you have a drivers license?");
                    String userLicense = scan.next();

                    System.out.println("\nDo you have car insurance?");
                    String userInsurance = scan.next();

                    System.out.println("\nWhat is your credit score?");
                    int userCreditScore = scan.nextInt();

                    if (userLicense.equals("yes") && userInsurance.equals("yes") && userCreditScore >= creditScoreMinimum) {
                        System.out.println("\nSold, pleasure doing business!");
                    } else {
                        System.out.println("\nSorry unfortunately you do not qualify to buy a car.");
                    }
                } else {
                    System.out.println("Ah okay, go next door we don't sell that cheap cars here.");
                }
                break;
            case "b":
                System.out.println("Okay so you want to sell your car!");

                System.out.println("\nWhat is the value of your car?");
                int userCarValue = scan.nextInt();

                System.out.println("\nWhat is your selling price?");
                int userSellingPrice = scan.nextInt();

                if (userCarValue > userSellingPrice && userSellingPrice < carPurchaseMax) {
                    System.out.println("\nWe will buy your car, pleasure doing business with you!");
                } else {
                    System.out.println("\nSorry, we are not interested.");
                }
                break;
            default:
                System.out.println("Invalid option");
        }
        scan.close();
    }
}
