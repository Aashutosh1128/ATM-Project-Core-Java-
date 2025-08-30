import java.util.Scanner;

public class ATM {
    float Balance;
    int pin = 1128;

    public void checkPin() {
        System.out.println("Enter your Pin:");
        Scanner sc = new Scanner(System.in);
        int pin = sc.nextInt();
        if (this.pin == pin) {
            menu();
        } else {
            System.out.println("Invalid Pin :");
        }

    }

    public void menu() {
        System.out.println("Enter your Choice");
        System.out.println("1 Check  A/C Balance");
        System.out.println("2 Withdraw  Money");
        System.out.println("3 Deposite Money ");
        System.out.println("4 Exit");
        Scanner sc = new Scanner(System.in);
        int opt = sc.nextInt();

        if (opt == 1) {
            checkBalance();
        } else if (opt == 2) {

            withdrawMoney();
        } else if (opt == 3) {
            depositeMoney();
        } else if (opt == 4) {
            return;
        } else {
            System.out.println("Invalid input ");
        }

    }

    public void checkBalance() {
        System.out.println("Balance :" + Balance);
        menu();
    }

    public void withdrawMoney() {
        System.out.println("Enter Amount to withdraw :");
        Scanner sc = new Scanner(System.in);
        float amount = sc.nextFloat();
        if (amount > Balance) {
            System.out.println("Insufficient Balance ");
        } else {
            Balance = Balance - amount;
            System.out.println("Money Withdrwal Successfully ..");
        }
        menu();
    }

    public void depositeMoney() {
        System.out.println("Deposite Money :");
        Scanner sc = new Scanner(System.in);
        float deposite = sc.nextFloat();
        Balance = Balance + deposite;
        System.out.println("Money deposite successufully ..");
        menu();
    }
}

 class AtmMachine{
    public static void main(String[] args) {

        ATM obj=new ATM();
        obj.checkPin();

    }
}



