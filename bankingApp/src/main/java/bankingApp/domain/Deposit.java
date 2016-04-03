package bankingApp.domain;

/**
 * Created by Scorpian on 2016-04-01.
 */
public class Deposit {
    //just values processes elsewhere==use same interface as debit

    private Account fromAccount;
    private Account toAccount;
    private double amount;
    private String depositNo;


    public Deposit(Builder builder) {

        depositNo = builder.depositNo;
        amount = builder.amount;
        toAccount = builder.toAccount;
        fromAccount = builder.fromAccount;

    }

    public String getDepositNo()
    {
        return depositNo;
    }
    public double getAmount() {
        return amount;
    }
    public Account getToAccount() {
        return toAccount;
    }
    public Account getFromAccount() {
        return fromAccount;
    }



    public static class Builder {

        private String depositNo;
        private Account fromAccount;
        private Account toAccount;
        private double amount;


        public Builder (String depositNo)
        {
            this.depositNo = depositNo; //compalsury
        }

        public Builder fromAccount(Account fromAccount) {
            this.fromAccount = fromAccount;
            return this;
        }
        public Builder toAccount(Account toAccount) {
            this.toAccount = toAccount;
            return this;
        }

        public Builder postalCode(Account fromAccount) {
            this.fromAccount = fromAccount;
            return this;
        }

        public Builder amount(double amount)
        {
            this.amount = amount;
            return this;
        }


        public Builder copy(Deposit deposit){
            this.depositNo =deposit.getDepositNo();
            this.amount = deposit.getAmount();
            this.fromAccount = deposit.getFromAccount();
            this.toAccount = deposit.getToAccount();
            return this;
        }



        public Deposit build()
        {
            return new Deposit(this);
        }
    }




}
