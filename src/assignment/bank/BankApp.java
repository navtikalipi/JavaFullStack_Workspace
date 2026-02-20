package assignment.bank;

import java.util.Scanner;

public class BankApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        User user = new User("Navlipi", "navlipi@mail.com", "9876543210", "1234");
        Account account = new Account(1000);

        System.out.println("Welcome to MyBank");

        //Login System
        System.out.print("Enter password to login: ");
        String inputPass = sc.nextLine();

        if (!user.login(inputPass)) {
            System.out.println("Invalid password. Exiting.");
            return;
        }

        System.out.println("Login successful!");

        int choice;

        do {
            System.out.println("\nPlease select the option");
            System.out.println("1. Deposit");
            System.out.println("2. Withdrawal");
            System.out.println("3. Check balance");
            System.out.println("4. Edit profile");
            System.out.println("5. Change password");
            System.out.println("6. Show Profile");
            System.out.println("7. Exit");

            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter deposit amount: ");
                    double depositAmount = sc.nextDouble();
                    account.deposit(depositAmount);
                    break;

                case 2:
                    System.out.print("Enter withdrawal amount: ");
                    double withdrawAmount = sc.nextDouble();
                    try {
                        account.withdraw(withdrawAmount);
                    } catch (LowBalanceException e) {
                        System.out.println("Error: " + e.getMessage());
                    }
                    break;

                case 3:
                    account.checkBalance();
                    break;

                case 4:
                    sc.nextLine(); // clear buffer
                    System.out.print("Enter new name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter new email: ");
                    String email = sc.nextLine();
                    System.out.print("Enter new phone: ");
                    String phone = sc.nextLine();
                    user.editProfile(name, email, phone);
                    break;

                case 5:
                    sc.nextLine();
                    System.out.print("Enter old password: ");
                    String oldPass = sc.nextLine();
                    System.out.print("Enter new password: ");
                    String newPass = sc.nextLine();
                    user.changePassword(oldPass, newPass);
                    break;

                case 6:
                    user.showProfile();
                    break;

                case 7:
                    System.out.println("Thank you for banking with us.");
                    break;

                default:
                    System.out.println("Invalid choice.");
            }

        } while (choice != 7);

        sc.close();
    }
}
