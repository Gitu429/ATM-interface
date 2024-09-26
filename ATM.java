import java.util.Scanner;
public class ATM{
    private  final BankAccount account;
    private final  Scanner amt;
    public ATM(BankAccount account){
        this.account=account;
        this.amt=new Scanner(System.in);
    }
    public  void run(){
        while (true) {
            System.out.println("Welcome to ATM"); 
            System.out.println("1.Withdraw");
            System.out.println("2.Deposit");
            System.out.println("3.Check Balance");
            System.out.println("4.Exit");
            System.out.println("Choose an option from the above(from 1 to 4).");
            int option= amt.nextInt();
            switch(option){
                case 1:
                    withdraw();
                    break;
                case 2:
                    deposit();
                    break;
                case 3:
                    checkBalance();
                    break;
                case 4:
                    System.out.println("We are exiting. Thank you for using the ATM!");
                    break;
                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
    private void withdraw(){
        System.out.println("Enter amount to withdraw:");
        double amount=amt.nextDouble();
        if(amount>account.getBalance()){
            System.out.println("Insufficient balance");
        }
        else{
            account.withdraw(amount);
            System.out.println("Withdrawl Successful.");
        }
    }
    private void deposit(){
        System.out.println("Enter amount to deposit:");
        double amount= amt.nextDouble();
        account.deposit(amount);
        System.out.println("Deposit Successful.");
    }
    private void checkBalance(){
        System.out.println("Your balance is:"+account.getBalance());
    }
}
