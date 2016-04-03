package bankingApp.domain;

/**
 * Created by Scorpian on 2016-04-01.
 */
public class Debit {


    private String accNo;
    private Account account;
    private Account transferAccount;
    private double amount;

    public Debit(Builder builder) {

        accNo = builder.accNo;
        account = builder.account;
        transferAccount = builder.transferAccount;
        amount = builder.amount;

    }

    public Account getAccount() {
        return account;
    }

    public String getAccno() {
        return accNo;
    }

    public Account getTransferAccount() {
        return transferAccount;
    }

    public double getAmount() {
        return amount;
    }

    public static class Builder {

        //Equivalent to setters
        private String accNo;
        private Account account;
        private Account transferAccount;
        private double amount;

        public Builder (String accNo)
        {
            this.accNo =accNo; //compalsury
        }

    public Builder account(Account account) {
        this.account = account;
        return this;
    }

    public Builder transferAccount(Account transferAccount) {
        this.transferAccount = transferAccount;
        return this;
    }

    public Builder amount(double amount)
    {
        this.amount = amount;
        return this;
    }

    public Builder copy(Debit debit){



        this.accNo = debit.getAccno();
        this.amount = debit.getAmount();
        this.transferAccount = debit.getTransferAccount();
        this.account = debit.getAccount();
        return this;
    }


    public Debit build()
    {
        return new Debit(this);
    }


}



}


