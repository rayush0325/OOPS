class BankAccount{
    private int accountNumber;
    private String holderName;
    private int balance;



    public BankAccount(int accountNumber, String holderName, int balance) {
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = balance;
    }
    //
    public BankAccount(int accountNumber, String holderName) {
        this(accountNumber, holderName, 0); //constructor chaining
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public String getHolderName() {
        return holderName;
    }

    public int getBalance() {
        return balance;
    }

    public void deposit(int amount){
        if(amount <= 0){
            System.out.printf("\namount must be positive\n");
        }
        else{
            balance += amount;
        }
    }

    public void withdraw(int amount){
        if(amount > balance){
            System.out.printf("\ninsufficient balance\n");
        }
        else if (amount <= 0){
            System.out.printf("\namount must be greater than 0\n");
        }
        else{
            balance -= amount;
        }
    }
}