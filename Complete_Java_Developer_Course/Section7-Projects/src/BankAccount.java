public class BankAccount {

    private String owner;
    private int balance;

    public BankAccount(String owner) {
        this.owner = owner;
        this.balance = 0;
    }

    public BankAccount(String owner, int balance) {
        this.owner = owner;
        if (balance >= 0) {
            this.balance = balance;
        } else {
            System.out.println("You can't have negative balance.");
            this.balance = 0;
        }
    }

    public String getOwner() {
        return owner;
    }

    public int getBalance() {
        return balance;
    }

    public void deposit(int amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("New balance: " + balance);
        } else {
            System.out.println("You can't deposit negative balance.");
        }
    }

    public void withdraw(int amount) {
        if (amount > 0) {
            if (balance - amount < 0) {
                System.out.println("You can't withdraw more than your balance.");
            } else {
                balance -= amount;
                System.out.println("New balance: " + balance);
            }
        } else {
            System.out.println("You can't withdraw negative balance.");
        }
    }
}