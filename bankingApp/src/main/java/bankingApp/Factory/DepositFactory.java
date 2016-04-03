package bankingApp.Factory;

import bankingApp.domain.Account;
import bankingApp.domain.Address;
import bankingApp.domain.Deposit;

/**
 * Created by Scorpian on 2016-04-03.
 */
public class DepositFactory {


    private String depositNo;
    private Account fromAccount;
    private Account toAccount;
    private double amount;


    public static Deposit getDeposit(String depositNo, Account fromAccount,  Account toAccount,double amount)
    {
        Deposit myDeposit = new Deposit.Builder(depositNo) // change name to conivinient name
                .fromAccount(fromAccount)
                .toAccount(toAccount)
                .amount(amount)
                .build();
        return myDeposit;
    }





}
