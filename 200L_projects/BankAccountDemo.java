import java.util.Scanner;

public class BankAccountDemo
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        //prompt user for details
        System.out.print("Enter account number: ");
        int acc = input.nextInt();

        System.out.print("Enter name: ");
        input.nextLine();
        String name = input.nextLine();

        System.out.print("Enter initial balance: ");
        double balance = input.nextDouble();

        //create a BankAccount object
        BankAccount bankAccount = new BankAccount(acc, name, balance);

        //prompt user to deposit an amount
        System.out.print("Enter the amount to be deposited: ");
        double deposit;
        deposit = input.nextDouble();

        bankAccount.deposit(deposit); //invoke deposit method to deposit

        //display current balance after deposit
        System.out.println("The new balance is: " + bankAccount.getBalance());

        //prompt user for amount to be withdrawn
        System.out.print("Enter the amount to be withdrawn: ");
        double withdraw;
        withdraw = input.nextDouble();

        bankAccount.withdraw(withdraw); //invoke withdraw method to withdraw

        //display current balance after withdrawal
        System.out.println("The new balance is: " + bankAccount.getBalance());
    }
}

class BankAccount
{
    //instance variable
    private int accountNumber;
    private String customerName;
    private double balance;

    //constructor
    public BankAccount(int acc, String name, double newBalance)
    {
        accountNumber = acc;
        customerName = name;
        balance = newBalance;
    }

    //methods
    public void deposit(double amount)
    {
        balance += amount;
    }

    public void withdraw(double amount)
    {
        if(balance < 0)
            System.out.println("You have insuficient fund");
        else
            balance -= amount;
    }

    public int getAccountNumber()
    {
        return accountNumber;
    }

    public String getCustomerName()
    {
        return customerName;
    }

    public double getBalance()
    {
        return balance;
    }
}