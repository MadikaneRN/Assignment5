package bankingApp.ChainOfResponsibility;

import bankingApp.domain.LoanStatus;

/**
 * Created by Scorpian on 2016-04-02.
 */
public class StudentLoanHandler extends LoanHandler{

    @Override
    public boolean handleRequest(LoanStatus request) {

        final double rate =  .05;
        if(request.getLoanType().equalsIgnoreCase("STUDENT"))
        {
            System.out.println("STUDENT LOAN.");
            if( request.getSalary() < (request.getLoanAmount() * rate)) {
                return false;
            }else {

                return true;
            }
        }
        else
        {
            System.out.println("Not handled by STUDENT, next Department.");
            if(successor != null)
            {
                successor.handleRequest(request);
            }
        }
        return false;
    }
}
