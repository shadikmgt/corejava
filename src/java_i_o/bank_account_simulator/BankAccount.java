package src.java_i_o.bank_account_simulator;

public class BankAccount {
    private int accountNumber;
    private String accountName;
    private String accountAddress;
    private double accountBalance;



    public BankAccount(int accountNumber,
                       String accountName,
                       String accountAddress,
                       double accountBalance) {
        this.accountNumber = accountNumber;
        this.accountName = accountName;
        this.accountAddress = accountAddress;
        this.accountBalance = accountBalance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public String getAccountAddress() {
        return accountAddress;
    }

    public void setAccountAddress(String accountAddress) {
        this.accountAddress = accountAddress;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }
}
