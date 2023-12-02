package src.java_i_o.bank_account_simulator;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class Bank {
    private final List<BankAccount> accounts = new ArrayList<>();

    public List<BankAccount> getAccounts(){
        return accounts;
    }

    public void addAccount(BankAccount account){
        accounts.add(account);
    }

    public void writerAccountsToFile(){
      try{
          StringBuilder accountsToWrite = new StringBuilder();

          for (BankAccount account: accounts){
              accountsToWrite.append(account.getAccountNumber())
                      .append("|")
                      .append(account.getAccountName())
                      .append("|")
                      .append(account.getAccountAddress())
                      .append("|")
                      .append(account.getAccountBalance())
                      .append("\n");
          }
          Files.writeString(Path.of("accounts.txt"),
                  accountsToWrite.toString());
      } catch (IOException e){
          e.printStackTrace();
      }



    }

    public void readAccountsFromFile(){
        try{
            var lines = Files.readAllLines(Path.of("accounts.txt"));
            for (String line : lines){
                String [] accountDetails = line.split("\\|");
                int accountNumber = Integer.parseInt(accountDetails[0]);
                String accountName = accountDetails[1];
                String accountAddress = accountDetails[2];
                double accountBalance = Double.parseDouble(accountDetails[3]);

                BankAccount account = new BankAccount(accountNumber,accountName,accountAddress,accountBalance);
                accounts.add(account);
            }
        } catch (IOException e){
            e.printStackTrace();
        }
    }


    public static void main(String[] args) {
        Bank bank = new Bank();
        BankAccount bankAccount1 = new BankAccount(1, "Bazlur Rahman", "Chuadanga", 2000.00);
        BankAccount bankAccount2 = new BankAccount(2, "Shadikur Rahman", "Darshana", 3000.00);
        BankAccount bankAccount3 = new BankAccount(3, "Ashraful Rahman", "Chuadanga", 5000);
        BankAccount bankAccount4 = new BankAccount(4, "Shahin", "Chuadanga", 50000);
        BankAccount bankAccount5 = new BankAccount(5, "Hasan", "Chuadanga", 50000);

        bank.addAccount(bankAccount1);
        bank.addAccount(bankAccount2);
        bank.addAccount(bankAccount3);
        bank.addAccount(bankAccount4);
        bank.addAccount(bankAccount5); 

        bank.writerAccountsToFile();

        bank.readAccountsFromFile();
        List<BankAccount> accounts = bank.getAccounts();
        System.out.println("Total account read from the file : " + accounts.size());

    }
}
