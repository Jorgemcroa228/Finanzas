import java.util.Scanner;

public class Finances extends App {

    double balance;
    int money;
    String[] menbers = {"juan", "juliana", "sara"};
    public Finances(double balance, int money) {
        this.balance = balance;
        this.money = money;
    }

    @Override
    public Double calculateFinances() {
        int option;
        Scanner scanner = new Scanner(System.in);


        Jorge :while (true) {
            System.out.println("Family finance system");
            System.out.println("Choose what do you want to search :  \n  1: Person. \n  2: Sign out.");
            option = scanner.nextInt();

            switch (option) {
                case 1:
                    System.out.println("choose the person : ");
                    System.out.println(menbers[0] + " like 1");
                    System.out.println(menbers[1] + " like 2");
                    System.out.println(menbers[2] + " like 3");

                    int personOption = scanner.nextInt();

                    if (personOption >= 1 && personOption <= menbers.length) {
                        String chosenPerson = menbers[personOption - 1];

                        System.out.println("Choose what you don:   \n 1: save money \n 2: check balance \n 3: sign out.");

                        int actionOption = scanner.nextInt();

                        switch (actionOption) {
                            case 1:
                                System.out.println("enter amount to save :");

                                int amount = scanner.nextInt();
                                money += amount;

                                System.out.println(chosenPerson + " saved " + amount + " total money : " + money);

                                System.out.println("1: check balance \n2: sign out.");

                                int actionToBalance = scanner.nextInt();

                                switch (actionToBalance) {
                                    case 1:
                                        System.out.println(chosenPerson + " has balance : " + balance);

                                        System.out.println("1: to exit. \n2: any comman to return to the main manu.");

                                        int actionExit = scanner.nextInt();

                                        switch (actionExit) {
                                            case 1:
                                                System.out.println("You left the program.");
                                                break Jorge;
                                        
                                            default:
                                                
                                                break;
                                        }
                                        break;
                                    case 2:
                                        System.out.println("You left the program.");
                                    break Jorge;
            
                                    default:
                                        System.out.println("Invalid action.");
                                        break;
                                }

                                break;
                            case 2:
                                System.out.println(chosenPerson + " has balance : " + balance);

                                break;
                            case 3:
                                System.out.println("You left the program.");

                                break Jorge;
                        
                            default:
                                System.out.println("Invalid option.");
                                break;
                        }
                    }

                    break;
                    
                case 2:
                    System.out.println("You left the program.");
                    break Jorge;

                default:
                    System.out.println("Invalid option."); 
                    break Jorge;
            }
            
        } return balance;
    }
}