package bankingApp.ChainOfResponsibility;

import bankingApp.domain.LoanStatus;

/**
 * Created by Scorpian on 2016-04-01.
 */
public abstract class LoanHandler {
    LoanHandler successor;
    public void setSuccessor(LoanHandler successor)
    {
        this.successor = successor;
    }


    public abstract boolean handleRequest(LoanStatus loantype);
}
