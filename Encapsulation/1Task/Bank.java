public class Bank{
    public static void main(String[] args) {
        BankAccount accountA = new BankAccount(1, "ayush", 5000);
        BankAccount accountB = new BankAccount(2, "devansh");

        System.out.printf("\naccountA name = %s, number = %d, balance = %d\n", accountA.getHolderName(), accountA.getAccountNumber(), accountA.getBalance());
        System.out.printf("\naccountB name = %s, number = %d, balance = %d\n", accountB.getHolderName(), accountB.getAccountNumber(), accountB.getBalance());

        accountA.deposit(0);
        accountA.deposit(-500);

        accountA.deposit(1000);

        System.out.printf("\naccountA balance = %d\n",accountA.getBalance());

        accountA.withdraw(0);
        accountA.withdraw(-500);

        accountA.withdraw(500);
        System.out.printf("\naccountA balance = %d\n",accountA.getBalance());
        accountA.withdraw(6000);
    }
}