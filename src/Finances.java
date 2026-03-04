import java.util.Scanner;

public class Finances extends App {

    double balance;
    String name;
    int money;

    public Finances(double balance, String name, int money) {
        this.balance = balance;
        this.name = name;
        this.money = money;
    }

    @Override
    public Double calculateFinances() {
        int option;
        Scanner scanner = new Scanner(System.in);

        option = scanner.nextInt();

        Jorge :while (true) {
            System.out.println("Family finance system");
            System.out.println("Choose what do you want to search :  \n  1: Person. \n  2: Sign out.");

            switch (option) {
                case 1:
                    
                    break;
                    
                case 2:
                    System.out.println("You left the program.");
                    break;

                default:
                    System.out.println("Invalid option."); 
                    break Jorge;
            }
            
        } 
    }
}