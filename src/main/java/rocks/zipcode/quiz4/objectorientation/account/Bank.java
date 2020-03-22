package rocks.zipcode.quiz4.objectorientation.account;

import java.util.*;

/**
 * @author leon on 27/12/2018.
 */
public class Bank {

    private ArrayList<BankAccount> accounts;

    public Bank() {
        this.accounts = new ArrayList<>();
    }

    public BankAccount removeBankAccountByIndex(Integer indexNumber) {
        if (indexNumber < accounts.size()) {
            return this.accounts.remove((int)indexNumber);
        } else {
            return null;
        }
    }

    public void addBankAccount(BankAccount bankAccount) {
        this.accounts.add(bankAccount);
    }

    public Boolean containsBankAccount(BankAccount bankAccount) {
        return this.accounts.contains(bankAccount);
    }
}
