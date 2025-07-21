import java.util.Scanner;

public class BankingProgram {
   static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        double balance = 0;
        boolean isRunning = true;
        int choice;

        while(isRunning) {
            System.out.println("****************");
            System.out.println("BANKING PROGRAM");
            System.out.println("****************");

            System.out.println("1. SHOW BALANCE");
            System.out.println("2. DEPOSIT");
            System.out.println("3. WITHDRAW");
            System.out.println("4. EXIT");

            System.out.println("Enter your choice (1-4)");
            choice = scanner.nextInt();

            switch (choice) {
                case 1 -> showBalance(balance);
                case 2 -> balance += Deposit();
                case 3 -> balance -= withdraw(balance);
                case 4 -> isRunning = false;
                default -> System.out.println("Invalid Choice!");
            }
        }

        System.out.println("***************");
        System.out.println("Have a nice day!");
        System.out.println("***************");

        scanner.close();
    }
    static void showBalance(double balance) {
        System.out.println("***************");
        System.out.printf("$%.2f\n", balance);
    }
    static double Deposit() {

        double amount;
        System.out.println("Enter the amount to Deposit: ");
        amount = scanner.nextDouble();
        if (amount < 0) {
            System.out.println("Amount can't be negative!");
            return 0;
        } else {
            return amount;
        }
    }
    static double withdraw(double balance) {

        double amount;
        System.out.println("Enter amount to Withdraw: ");
        amount = scanner.nextDouble();

        if (amount > balance) {
            System.out.println("INSUFFICIENT FUNDS");
            return 0;
        } else if (amount < 0) {
            System.out.println("Amount can't be negative");
            return 0;
        } else {
            System.out.println("***************");
            return amount;
        }
    }
}
