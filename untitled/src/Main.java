import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int water = 1200;
        int milk = 540;
        int beans = 120;
        int money = 550;
        int cups = 9;
        String action;
        String choice;

        System.out.println("Write action (buy, fill, take, remaining, exit):");

        do{



            action = scanner.nextLine();


            if(action.equals("remaining")){


                System.out.println("The coffee machine has:");
                System.out.println(water + " of water");
                System.out.println(milk +" of milk");
                System.out.println(beans +" of coffee beans");
                System.out.println(cups +" of disposable cups");
                System.out.println(money +" of money");

                System.out.println("Write action (buy, fill, take, remaining, exit):");

                continue;


            }else if(action.equals("buy")){
                do{
                    System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu ");
                    choice = scanner.nextLine();

                    if(choice.equals("1")){

                        if ((water >= 250 && beans >= 16) && cups >=1){
                            System.out.println("I have enough resources, making you a coffee!");
                            water -= 250;
                            beans -= 16;
                            cups -= 1;
                            money +=4;
                        }else if (water < 250){
                            System.out.println("Sorry, not enough water!");
                        }else if (beans < 16) {
                            System.out.println("Sorry, not enough beans!");
                        }else if (cups < 1) {
                            System.out.println("Sorry, not enough cups!");
                        }
                        System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu ");
                        continue;
                    }else if(choice.equals("2")){
                        if ((water >= 350 && milk >= 75) && (beans >= 20 && cups >=1)){
                            System.out.println("I have enough resources, making you a coffee!");
                            water -= 250;
                            beans -= 16;
                            cups -= 1;
                            money +=4;
                        }else if (water < 350){
                            System.out.println("Sorry, not enough water!");
                        }else if (milk < 75){
                            System.out.println("Sorry, not enough water!");
                        }else if (beans < 20) {
                            System.out.println("Sorry, not enough beans!");
                        }else if (cups < 1) {
                            System.out.println("Sorry, not enough cups!");
                        }
                        water -= 350;
                        milk -= 75;
                        beans -= 20;
                        cups -= 1;
                        money +=7;
                        System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu ");
                        continue;
                    }else if(choice.equals("3")) {
                        if ((water >= 200 && milk >= 100) && (beans >= 12 && cups >= 1)) {
                            System.out.println("I have enough resources, making you a coffee!");
                            water -= 250;
                            beans -= 16;
                            cups -= 1;
                            money += 4;
                        } else if (water < 200) {
                            System.out.println("Sorry, not enough water!");
                        } else if (milk < 100) {
                            System.out.println("Sorry, not enough water!");
                        } else if (beans < 12) {
                            System.out.println("Sorry, not enough beans!");
                        } else if (cups < 1) {
                            System.out.println("Sorry, not enough cups!");
                        }
                        water -= 200;
                        milk -= 100;
                        beans -= 12;
                        cups -= 1;
                        money += 6;
                        System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu ");
                        continue;
                    }else if(choice.equals("back")){
                        System.out.println("Write action (buy, fill, take, remaining, exit):");
                        break;
                    }


                }while(scanner.hasNext());

            }else if(action.equals("fill")){
                System.out.println("Write how many ml of water do you want to add:");
                water += scanner.nextInt();

                System.out.println("Write how many ml of milk do you want to add:");
                milk += scanner.nextInt();

                System.out.println("Write how many grams of coffee beans do you want to add:");
                beans += scanner.nextInt();

                System.out.println("Write how many disposable cups of coffee do you want to add: ");
                cups += scanner.nextInt();

                System.out.println("Write action (buy, fill, take, remaining, exit):");

                continue;
            }else if(action.equals("take")){
                System.out.println("I gave you $"+money);
                money -= money;

                System.out.println("Write action (buy, fill, take, remaining, exit):");

                continue;
            }else if(action.equals("exit")) {
                System.out.println("Good Bye");
                scanner.close();
            }


        }while(scanner.hasNext());

        scanner.close();
    }
}
