import java.util.Scanner;
public class MealTip {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double billTotal = 0;

        System.out.println("Waiter: Hi! Will you be ordering food today?");
        String answerFood = scan.next();
        if (answerFood.equals("yes")) {
            billTotal = foodMenu();
        } else if (answerFood.equals("no")) {
            System.out.println("\nWaiter: Okay maybe next time!");
        } else {
            System.out.println("\nWaiter: I have no idea what you are saying, I'll take it as a no.");
        }

        System.out.println("\nWaiter: Will you be ordering drinks today?");
        String answerDrink = scan.next();
        if (answerDrink.equals("yes")) {
            billTotal += drinksMenu();
        } else if (answerDrink.equals("no")) {
            System.out.println("\nWaiter: Okay maybe next time!");
            if (billTotal == 0) {
                System.exit(0);
            }
        } else {
            System.out.println("\nWaiter: I have no idea what you are saying, I'll take it as a no.");
            if (billTotal == 0) {
                System.exit(0);
            }
        }

        System.out.println("\n2 hours later...");

        System.out.println("\nWaiter: Hope everything was nice, here is your bill." +
                "\n\t*** RESTAURANT BREMNER BILL ***" +
                "\n\tTotal: €" + billTotal);

        tipTheWaiter(billTotal);

        scan.close();
    }
    public static double drinksMenu() {
        Scanner scan = new Scanner(System.in);
        /**
         * function to display the drinks menu and request what option they would like.
         * Menu:
         * a: Coca-Cola: €2.50
         * b: beer: €7.50
         * c: cider: €7.50
         * d: wine: €9.50
         */
        double optionA = 2.50;
        double optionB = 7.50;
        double optionC = 7.50;
        double optionD = 9.50;
        double drinksBill = 0;

        System.out.println("\nWaiter: Great! Here is what we have on offer today:");
        System.out.println("\tOption a: Coca-Cola (€2.50)\n\tOption b: Beer (€7.50)\n\t" +
                "Option c: Cider (€7.50)\n\tOption d: Wine (€9.50)");
        System.out.println("\nPlease select a, b, c or d:");
        String answerDrinkOption = scan.next();

        switch (answerDrinkOption) {
            case "a":
                System.out.println("Waiter: Ahh Coke-Cola is a great choice!");
                drinksBill = optionA; break;
            case "b":
                System.out.println("Waiter: Ahh beer is always a good choice!");
                drinksBill = optionB; break;
            case "c":
                System.out.println("Waiter: Ahh cider is pretty good!");
                drinksBill = optionC; break;
            case "d":
                System.out.println("Waiter: Ahh wine, lovely choice.");
                drinksBill = optionD; break;
            default:
                System.out.println("Waiter: I guess you've changed your mind and it's no drinks for you!");
        }
        return drinksBill;
    }
    public static double foodMenu() {
        Scanner scan = new Scanner(System.in);
        /**
         * function to display the food menu and request what option they would like.
         * Menu:
         * a: fish & chips: €4.50
         * b: all day breakfast: €7.50
         * c: burger & chips: €5.50
         * d: pancake bonanza : €9.75
         */
        double optionA = 4.50;
        double optionB = 7.50;
        double optionC = 5.50;
        double optionD = 9.75;
        double foodBill = 0;

        System.out.println("\nWaiter: Great! Here is what we have on offer today:");
        System.out.println("\tOption a: fish & chips (€4.50)\n\tOption b: all day breakfast (€7.50)\n\t" +
                "Option c: burger & chips (€5.50)\n\tOption d: pancake bonanza (€9.75)");
        System.out.println("\nPlease select a, b, c or d:");
        String answerFoodOption = scan.next();

        switch (answerFoodOption) {
            case "a":
                System.out.println("Waiter: Ahh fish & chips is a great choice!");
                foodBill = optionA; break;
            case "b":
                System.out.println("Waiter: Ahh the all day breakfast is a great choice!");
                foodBill = optionB; break;
            case "c":
                System.out.println("Waiter: Ahh burger & chips is a great choice!");
                foodBill = optionC; break;
            case "d":
                System.out.println("Waiter: Ahh the pancake bonanza is a great choice!");
                foodBill = optionD; break;
            default:
                System.out.println("Waiter: I guess you've changed your mind and it's no food for you!");
        }
        return foodBill;
    }


    public static void tipTheWaiter(double total) {
        /**
         * Inside the function:
         * 1. Calculates a tip that's 15 percent of the bill you paid.
         * 2. Prints: your service was wonderful! Please, accept this tip: $<tip>
         */
        double tip = total * 0.15;
        System.out.println("\nYou: Thank you! Your service was wonderful! Please, accept this tip: €" + tip + ".");
    }
}
