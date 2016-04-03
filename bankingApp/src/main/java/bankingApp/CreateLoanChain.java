package bankingApp;

import bankingApp.ChainOfResponsibility.*;
import bankingApp.domain.LoanStatus;

/**
 * Created by Scorpian on 2016-04-02.
 */
public class CreateLoanChain {

    public static void main( String args[]){

        LoanHandler businesshHandler = new BusinessLoanHandler();
        LoanHandler homeHandler = new HomeLoanHandler();
        LoanHandler personalLoanHandler = new PersonalHandler();
        LoanHandler studentHandler = new StudentLoanHandler();

        LoanStatus loan = new LoanStatus();

        loan.setLoanType("bussiness");
        loan.setLoanAmount(1000);
        loan.setSalary(50);

        businesshHandler.setSuccessor(personalLoanHandler);
        homeHandler.setSuccessor(personalLoanHandler);
        personalLoanHandler.setSuccessor(studentHandler);

        LoanHandler chain = businesshHandler;
        boolean status = chain.handleRequest(loan);
        System.out.println("Qualify for load: " + status);
    }

}
