package bankingApp.Factory;

import bankingApp.domain.Account;
import bankingApp.domain.Debit;

/**
 * Created by Scorpian on 2016-04-03.
 */
public class DebitFactory {

    public static Debit getDebit(String accNo, double amount,Account account, Account transferAccount)
    {
        Debit myDebit = new Debit.Builder(accNo) // change name to conivinient name
                .amount(amount)
                .account(account)
                .transferAccount(transferAccount)
                .build();

        return myDebit;
    }



    /*
    public static Account getAccount(String accNo, double balance, String accountType)
    {
        Account myAccount = new Account.Builder(accNo) // change name to conivinient name
                .balance(balance)
                .accountType(accountType)
                .build();

        return myAccount;
    }
    */


}
