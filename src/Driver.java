import java.util.Scanner;

public class Driver {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        CoffeeMachine coffeeMachine = new CoffeeMachine(400, 540, 120, 550, 9);
        boolean isProgramRunning = true;


        while (isProgramRunning) {

            System.out.println("Write action (buy, fill, take, remaining, exit): ");
            MainMenu menu = MainMenu.valueOf(scanner.nextLine().toUpperCase());

            switch (menu) {
                case BUY:
                    buy(scanner, coffeeMachine);
                    break;
                case FILL:
                    fill(scanner, coffeeMachine);
                    break;
                case TAKE:
                    take(coffeeMachine);
                    break;
                case REMAINING:
                    coffeeMachine.printStatus();
                    break;
                case EXIT:
                    isProgramRunning = false;
                    break;
                default:
                    System.out.println("Please enter the correct keywords");
                    break;
            }
        }
    }

    public static void buy(Scanner scanner, CoffeeMachine coffeeMachine) {
        System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu:");
        switch (scanner.nextLine()) {
            case "1":
                if (coffeeMachine.getWater() >= 250 && coffeeMachine.getBeans() >= 16 && coffeeMachine.getCup() >= 1) {
                    System.out.println("I have enough resources, making you a coffee!");
                    coffeeMachine.setWater(coffeeMachine.getWater() - 250);
                    coffeeMachine.setBeans(coffeeMachine.getBeans() - 16);
                    coffeeMachine.setCup(coffeeMachine.getCup() - 1);
                    coffeeMachine.setMoney(coffeeMachine.getMoney() + 4);
                } else if (coffeeMachine.getWater() < 250) {
                    System.out.println("Sorry, not enough water!");
                } else if (coffeeMachine.getBeans() < 16) {
                    System.out.println("Sorry, not enough beans!");
                } else if (coffeeMachine.getCup() < 1) {
                    System.out.println("Sorry, not enough cups!");
                }
                break;
            case "2":
                if (coffeeMachine.getWater() >= 350 && coffeeMachine.getMilk() >= 75 && coffeeMachine.getBeans() >= 20
                        && coffeeMachine.getCup() >= 1) {
                    coffeeMachine.setWater(coffeeMachine.getWater() - 350);
                    coffeeMachine.setMilk(coffeeMachine.getMilk() - 75);
                    coffeeMachine.setBeans(coffeeMachine.getBeans() - 20);
                    coffeeMachine.setCup(coffeeMachine.getCup() - 1);
                    coffeeMachine.setMoney(coffeeMachine.getMoney() + 7);
                } else if (coffeeMachine.getWater() < 350) {
                    System.out.println("Sorry, not enough water!");
                } else if (coffeeMachine.getBeans() < 20) {
                    System.out.println("Sorry, not enough beans!");
                } else if (coffeeMachine.getCup() < 1) {
                    System.out.println("Sorry, not enough cups!");
                } else if (coffeeMachine.getMilk() < 75) {
                    System.out.println("Sorry, not enough milk!");
                }
                break;
            case "3":
                if (coffeeMachine.getWater() >= 200 && coffeeMachine.getMilk() >= 100 && coffeeMachine.getBeans() >= 12
                        && coffeeMachine.getCup() >= 1) {
                    coffeeMachine.setWater(coffeeMachine.getWater() - 200);
                    coffeeMachine.setMilk(coffeeMachine.getMilk() - 100);
                    coffeeMachine.setBeans(coffeeMachine.getBeans() - 12);
                    coffeeMachine.setCup(coffeeMachine.getCup() - 1);
                    coffeeMachine.setMoney(coffeeMachine.getMoney() + 6);
                } else if (coffeeMachine.getWater() < 200) {
                    System.out.println("Sorry, not enough water!");
                } else if (coffeeMachine.getBeans() < 12) {
                    System.out.println("Sorry, not enough beans!");
                } else if (coffeeMachine.getCup() < 1) {
                    System.out.println("Sorry, not enough cups!");
                } else if (coffeeMachine.getMilk() < 100) {
                    System.out.println("Sorry, not enough milk!");
                }
                break;
            case "back":
                break;
            default:
                System.out.println("Please enter the correct keywords");
                break;

        }
    }

    public static void fill(Scanner scanner, CoffeeMachine coffeeMachine) {
        System.out.println("Write how many ml of water do you want to add:  ");
        coffeeMachine.setWater(coffeeMachine.getWater() + Integer.parseInt(scanner.nextLine()));

        System.out.println("Write how many ml of milk tdo you want to add: ");
        coffeeMachine.setMilk(coffeeMachine.getMilk() + Integer.parseInt(scanner.nextLine()));

        System.out.println("Write how many grams of coffee beans do you want to add: ");
        coffeeMachine.setBeans(coffeeMachine.getBeans() + Integer.parseInt(scanner.nextLine()));

        System.out.println("Write how many disposable cups of coffee do you want to add: ");
        coffeeMachine.setCup(coffeeMachine.getCup() + Integer.parseInt(scanner.nextLine()));
    }

    public static void take(CoffeeMachine coffeeMachine) {
        System.out.println("I gave you $" + coffeeMachine.getMoney());
        coffeeMachine.setMoney(0);
    }

}
