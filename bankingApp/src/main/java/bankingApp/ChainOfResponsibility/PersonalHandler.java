package bankingApp.ChainOfResponsibility;

import bankingApp.domain.LoanStatus;

/**
 * Created by Scorpian on 2016-04-01.
 */
public class PersonalHandler extends LoanHandler {

    @Override
    public boolean handleRequest(LoanStatus request) {

        final double rate =  .1;
        if(request.getLoanType().equalsIgnoreCase("PERSONAL"))
        {
            System.out.println("PERSONAL LOAN.");
            if( request.getSalary() < (request.getLoanAmount() * rate)) {
                return false;
            }else {

                return true;
            }
        }
        else
        {
            System.out.println("Not handled by PERSONAL, next Department.");
            if(successor != null)
            {
                successor.handleRequest(request);
            }
        }
        return false;
    }
}
