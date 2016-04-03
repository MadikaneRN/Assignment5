package bankingApp.Factory;

import bankingApp.domain.Client;

/**
 * Created by Scorpian on 2016-03-28.
 */
public class ClientFactory {



    public static Client getClient(String idNo, String name, String surName)
    {
        Client myClient = new Client.Builder(idNo)
                .name(name)
                .surName(surName)
                .build();

        return myClient;

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


