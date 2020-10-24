import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        CoffeeMachine coffeeMachine = new CoffeeMachine();
        TeaMachine teaMachine = new TeaMachine();


        String action;
        String choice;

        System.out.println("Write action (buy, fill, take, remaining, exit):");

        do {


            action = scanner.nextLine();


            if ("remaining".equalsIgnoreCase(action)) {

                coffeeMachine.showWater();
                coffeeMachine.showBeans();
                coffeeMachine.showMilk();
                coffeeMachine.showBlackTea();
                coffeeMachine.showGreenTea();
                coffeeMachine.showCups();
                coffeeMachine.showMoneyAmount();

                System.out.println("Write action (buy, fill, take, remaining, exit):");

                //continue;


            } else if ("buy".equalsIgnoreCase(action)) {
                System.out.printf("What do you want to buy?%n 1 - espresso,%n 2 - latte,%n 3 - cappuccino,%n 4 - black tea,%n 5 - green tea,%n 6 - bavarian tea,%n back - to main menu ");
                do {

                    choice = scanner.nextLine();

                    if ("1".equalsIgnoreCase(choice)) {

                        if (coffeeMachine.canIMakeEspresso()){
                            System.out.println("I have enough resources, making you a coffee!");
                            System.out.println("  ( (");
                            System.out.println("    ) )");
                            System.out.println("  _______ ");
                            System.out.println(" |       |]");
                            System.out.println(" \\       / ");
                            System.out.println("  '-----'");
                            coffeeMachine.makeEspresso();
                        } else if (coffeeMachine.getStorage().getWaterAmount() < Recipes.ESPRESSO.waterAmount) {
                            System.out.println("Sorry, not enough water!");
                        } else if (coffeeMachine.getStorage().getMilkAmount() < Recipes.ESPRESSO.milkAmount) {
                            System.out.println("Sorry, not enough milk!");
                        } else if (coffeeMachine.getStorage().getBeansAmount() < Recipes.ESPRESSO.beansAmount) {
                            System.out.println("Sorry, not enough beans!");
                        } else if (coffeeMachine.getStorage().getCupsAmount() < 1) {
                            System.out.println("Sorry, not enough cups!");
                        }
                        System.out.printf("What do you want to buy?%n 1 - espresso,%n 2 - latte,%n 3 - cappuccino,%n 4 - black tea,%n 5 - green tea,%n 6 - bavarian tea,%n back - to main menu ");
                        //continue;
                    } else if ("2".equalsIgnoreCase(choice)) {

                        if (coffeeMachine.canIMakeLatte()){
                            System.out.println("I have enough resources, making you a coffee!");
                            System.out.println("  ( (");
                            System.out.println("    ) )");
                            System.out.println("  _______ ");
                            System.out.println(" |       |]");
                            System.out.println(" \\       / ");
                            System.out.println("  '-----'");
                            coffeeMachine.makeLatte();
                        } else if (coffeeMachine.getStorage().getWaterAmount() < Recipes.LATTE.waterAmount) {
                            System.out.println("Sorry, not enough water!");
                        } else if (coffeeMachine.getStorage().getMilkAmount() < Recipes.LATTE.milkAmount) {
                            System.out.println("Sorry, not enough milk!");
                        } else if (coffeeMachine.getStorage().getBeansAmount() < Recipes.LATTE.beansAmount) {
                            System.out.println("Sorry, not enough beans!");
                        } else if (coffeeMachine.getStorage().getCupsAmount() < 1) {
                            System.out.println("Sorry, not enough cups!");
                        }
                        System.out.printf("What do you want to buy?%n 1 - espresso,%n 2 - latte,%n 3 - cappuccino,%n 4 - black tea,%n 5 - green tea,%n 6 - bavarian tea,%n back - to main menu ");
                        //continue;
                    } else if ("3".equalsIgnoreCase(choice)) {

                        if (coffeeMachine.canIMakeCappucino()){
                            System.out.println("I have enough resources, making you a coffee!");
                            System.out.println("  ( (");
                            System.out.println("    ) )");
                            System.out.println("  _______ ");
                            System.out.println(" |       |]");
                            System.out.println(" \\       / ");
                            System.out.println("  '-----'");


                            coffeeMachine.makeCappucino();
                        } else if (coffeeMachine.getStorage().getWaterAmount() < Recipes.CAPPUCCINO.waterAmount) {
                            System.out.println("Sorry, not enough water!");
                        } else if (coffeeMachine.getStorage().getMilkAmount() < Recipes.CAPPUCCINO.milkAmount) {
                            System.out.println("Sorry, not enough milk!");
                        } else if (coffeeMachine.getStorage().getBeansAmount() < Recipes.CAPPUCCINO.beansAmount) {
                            System.out.println("Sorry, not enough beans!");
                        } else if (coffeeMachine.getStorage().getCupsAmount() < 1) {
                            System.out.println("Sorry, not enough cups!");
                        }
                        System.out.printf("What do you want to buy?%n 1 - espresso,%n 2 - latte,%n 3 - cappuccino,%n 4 - black tea,%n 5 - green tea,%n 6 - bavarian tea,%n back - to main menu ");
                        //continue;

                    } else if ("4".equalsIgnoreCase(choice)) {

                        if (teaMachine.canIMakeBlackTea()){
                            System.out.println("I have enough resources, making you a black tea!");
                            System.out.println("  ( (");
                            System.out.println("    ) )");
                            System.out.println("  _______ ");
                            System.out.println(" |       |]");
                            System.out.println(" \\       / ");
                            System.out.println("  '-----'");
                            teaMachine.makeBlackTea();
                        } else if (coffeeMachine.getStorage().getWaterAmount() < Recipes.BLACK_TEA.waterAmount) {
                            System.out.println("Sorry, not enough water!");
                        } else if (coffeeMachine.getStorage().getMilkAmount() < Recipes.BLACK_TEA.milkAmount) {
                            System.out.println("Sorry, not enough milk!");
                        } else if (coffeeMachine.getStorage().getBeansAmount() < Recipes.BLACK_TEA.beansAmount) {
                            System.out.println("Sorry, not enough beans!");
                        } else if (coffeeMachine.getStorage().getCupsAmount() < 1) {
                            System.out.println("Sorry, not enough cups!");
                        }
                        System.out.printf("What do you want to buy?%n 1 - espresso,%n 2 - latte,%n 3 - cappuccino,%n 4 - black tea,%n 5 - green tea,%n 6 - bavarian tea,%n back - to main menu ");
                        //continue;

                    } else if ("5".equalsIgnoreCase(choice)) {

                        if (teaMachine.canIMakeGreenTea()){
                            System.out.println("I have enough resources, making you a green tea!");
                            System.out.println("  ( (");
                            System.out.println("    ) )");
                            System.out.println("  _______ ");
                            System.out.println(" |       |]");
                            System.out.println(" \\       / ");
                            System.out.println("  '-----'");
                            teaMachine.makeGreenTea();
                        } else if (coffeeMachine.getStorage().getWaterAmount() < Recipes.GREEN_TEA.waterAmount) {
                            System.out.println("Sorry, not enough water!");
                        } else if (coffeeMachine.getStorage().getMilkAmount() < Recipes.GREEN_TEA.milkAmount) {
                            System.out.println("Sorry, not enough milk!");
                        } else if (coffeeMachine.getStorage().getBeansAmount() < Recipes.GREEN_TEA.beansAmount) {
                            System.out.println("Sorry, not enough beans!");
                        } else if (coffeeMachine.getStorage().getCupsAmount() < 1) {
                            System.out.println("Sorry, not enough cups!");
                        }
                        System.out.printf("What do you want to buy?%n 1 - espresso,%n 2 - latte,%n 3 - cappuccino,%n 4 - black tea,%n 5 - green tea,%n 6 - bavarian tea,%n back - to main menu ");
                        //continue;

                    } else if ("6".equalsIgnoreCase(choice)) {

                        if (teaMachine.canIMakeBavarianTea()){
                            System.out.println("I have enough resources, making you a bavarian tea!");
                            System.out.println("  ( (");
                            System.out.println("    ) )");
                            System.out.println("  _______ ");
                            System.out.println(" |       |]");
                            System.out.println(" \\       / ");
                            System.out.println("  '-----'");
                            teaMachine.makeBavarianTea();
                        } else if (coffeeMachine.getStorage().getWaterAmount() < Recipes.BAVARIAN_TEA.waterAmount) {
                            System.out.println("Sorry, not enough water!");
                        } else if (coffeeMachine.getStorage().getMilkAmount() < Recipes.BAVARIAN_TEA.milkAmount) {
                            System.out.println("Sorry, not enough milk!");
                        } else if (coffeeMachine.getStorage().getBeansAmount() < Recipes.GREEN_TEA.beansAmount) {
                            System.out.println("Sorry, not enough beans!");
                        } else if (coffeeMachine.getStorage().getCupsAmount() < 1) {
                            System.out.println("Sorry, not enough cups!");
                        }
                        System.out.printf("What do you want to buy?%n 1 - espresso,%n 2 - latte,%n 3 - cappuccino,%n 4 - black tea,%n 5 - green tea,%n 6 - bavarian tea,%n back - to main menu ");
                        //continue;

                    } else if ("back".equalsIgnoreCase(choice)) {
                        System.out.print("Write action (buy, fill, take, remaining, exit):");
                        break;
                    }


                } while (scanner.hasNext());

            } else if ("fill".equalsIgnoreCase(action)) {
                System.out.println("Write how many ml of water do you want to add:");
                coffeeMachine.refillWater(scanner.nextInt());
                System.out.println("Write how many ml of milk do you want to add:");
                coffeeMachine.refillMilk(scanner.nextInt());
                System.out.println("Write how many grams of coffee beans do you want to add:");
                coffeeMachine.refillBeans(scanner.nextInt());
                System.out.println("Write how many disposable cups of coffee do you want to add: ");
                coffeeMachine.refillCups(scanner.nextInt());
                System.out.println("Write how many green tea leaves do you want to add: ");
                coffeeMachine.refillGreenLeaves(scanner.nextInt());
                System.out.println("Write how many black tea leaves do you want to add: ");
                coffeeMachine.refillBlackLeaves(scanner.nextInt());
                System.out.println("Write how much money do you want to add: ");
                coffeeMachine.refillMoney(scanner.nextInt());
                System.out.println("Write action (buy, fill, take, remaining, exit):");

                //continue;
            } else if ("take".equalsIgnoreCase(action)) {
                System.out.println("I gave you $" + coffeeMachine.getStorage().removeMoney());

                System.out.println("Write action (buy, fill, take, remaining, exit):");

                //continue;
            } else if ("exit".equalsIgnoreCase(action)) {
                System.out.println("Good Bye️");
                System.out.println("   \uD83D\uDE00");
                scanner.close();
            }


        } while (scanner.hasNext());

        scanner.close();
    }
}
