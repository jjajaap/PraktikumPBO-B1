public class MBankAccount {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(1000);
        System.out.println("Saldo sebelum transaksi: " + account.getBalance());

        account.deposit(500);
        account.withdraw(200);

        System.out.println("Saldo setelah transaksi: " + account.getBalance());
    }
}
