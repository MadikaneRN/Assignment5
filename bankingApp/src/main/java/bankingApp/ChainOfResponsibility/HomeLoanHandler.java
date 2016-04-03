package bankingApp.ChainOfResponsibility;

import bankingApp.domain.LoanStatus;

/**
 * Created by Scorpian on 2016-04-02.
 */
public class HomeLoanHandler extends LoanHandler{

    @Override
    public boolean handleRequest(LoanStatus request) {

        if(request.getLoanType().equalsIgnoreCase("HOME"))
        {
            System.out.println("HOME LOAN.\n");
            if( request.getSalary() < (request.getLoanAmount() * 0.25 )) {
                return false;
            }else {

                return true;
            }
        }
        else
        {
            System.out.println("Not handled by HOME Loan, next Department.");
            if(successor != null)
            {
                successor.handleRequest(request);
            }
        }
        return false;
    }

}
