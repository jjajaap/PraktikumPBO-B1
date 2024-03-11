public class BankAccount {
    private double balance;

    public BankAccount(double initialBalance) {
        balance = initialBalance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance = balance + amount;
            System.out.println("Deposit sejumlah " + amount + " berhasil. Saldo saat ini: " + balance);
        } else {
            System.out.println("Proses Deposit gagal.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance = balance - amount;
            System.out.println("Penarikan sejumlah " + amount + " berhasil. Saldo saat ini: " + balance);
        } else {
            System.out.println("Penarikan gagal. Silahkan ulang kembali.");
        }
    }

    public double getBalance() {
        return balance;
    }
}