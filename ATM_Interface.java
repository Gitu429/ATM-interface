class ATM_interface{
    public static void main(String[] args) {
        BankAccount account= new BankAccount(10000);
        ATM atm= new ATM(account);
        atm.run();
    }
 }