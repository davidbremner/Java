import java.util.Scanner;

public class Bank {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //below requirements for loan approval:
        int savingsMinimum = 10000;
        int creditCardBalance = 5000;
        int workingTime = 2;

        System.out.println("\n▃▅▆█ Royal Bank of Java █▆▅▃\n");
        System.out.println("Are you here to get a mortgage? (yes or no)");
        String mortgage = scan.nextLine();

        if (mortgage.equals("yes")) {
            System.out.println("\nGreat, in one line " +
                    "how much do you have in your savings? " +
                    "And how much do you owe on your credit card?");
            double userSavings = scan.nextDouble();
            double userCreditCard = scan.nextDouble();

            System.out.println("\nHow many years have you worked at your current place of work?");
            int userWorking = scan.nextInt();

            System.out.println("\nWhat is your first name and last name?");
            String userNameFirst = scan.next();
            String userNameLast = scan.next();
            String fullName = userNameFirst + " " + userNameLast;

            System.out.println("\nHere is your information:" +
                    "\n\tName: " + userNameFirst + " " + userNameLast +
                    "\n\tSavings: " + userSavings +
                    "\n\tDebt: " + userCreditCard +
                    "\n\tYears in Current Job: " + userWorking);

            if (userSavings >= savingsMinimum && userCreditCard <= creditCardBalance && userWorking >= workingTime) {
                System.out.println("\nCongratulations " + fullName + ", you have been approved!");
            } else {
                System.out.println("\nSorry, you are not eligible for a mortgage.");
            }

        } else if (mortgage.equals("no")) {
            System.out.println("Okay, have a nice day!");
        } else {
            System.out.println("Hmm please leave, I don't understand. SECURITY!");
        }

        scan.close();
    }
}
