package bankingApp.ChainOfResponsibility;

import bankingApp.domain.LoanStatus;

/**
 * Created by Scorpian on 2016-04-01.
 */
public class BusinessLoanHandler extends LoanHandler {


    @Override
    public boolean handleRequest(LoanStatus request) {

        final double rate =  0.3;
        if(request.getLoanType().equalsIgnoreCase("BUSSINESS"))
        {
            System.out.println("BUSSINESS LOAN.");
            if( request.getSalary() < (request.getLoanAmount() * rate)) {
                return false;
            }else {

                return true;
            }
        }
        else
        {
            System.out.println("Not handled by BUSSINESS, next Department.");
            if(successor != null)
            {
                successor.handleRequest(request);
            }
        }
        return false;
    }
}
