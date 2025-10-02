

public class BankAccountDemo {

    public static void main(String[] args) {

        BankAccount account1 = new BankAccount("Andrei Vlad");
        BankAccount account2 = new BankAccount("Bogdan Kocsis", 5000);
        BankAccount account3 = new BankAccount("David Alex", 250);
        BankAccount account4 = new BankAccount("Cristina Voicu", -15);

        System.out.println(account1.getOwner());
        System.out.println(account1.getBalance());
        account1.deposit(2300);
        System.out.println();

        System.out.println(account2.getOwner());
        System.out.println(account2.getBalance());
        account2.withdraw(350);
        System.out.println();

        System.out.println(account3.getOwner());
        System.out.println(account3.getBalance());
        account3.deposit(-15);
        account3.withdraw(-20);
        account3.withdraw(50000);
        account3.deposit(250);
        account3.withdraw(20);
        System.out.println();

        System.out.println(account4.getOwner());
        System.out.println(account4.getBalance());
        account4.deposit(150);
        System.out.println();

    }
}