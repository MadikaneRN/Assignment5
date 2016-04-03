package bankingApp.ChainOfResponsibility;

/**
 * Created by Scorpian on 2016-04-01.
 */
public class Demo {

    public static void main(String[] args)
    {
        LoanHandler chain = setUpChain();

       /* chain.handleRequest(PlanetEnum.VENUS);
        chain.handleRequest(PlanetEnum.MERCURY);
        chain.handleRequest(PlanetEnum.EARTH);
        chain.handleRequest(PlanetEnum.JUPITER);*/

        //chain.handleRequest(PlanetEnum.NEPTUNE);

    }



    public static LoanHandler setUpChain()
    {
        /*LoanHandler mercuryHandler = new PersonalHandler();
        LoanHandler venusHandler = new StudentLoanHandler();
        LoanHandler earthHandler = new BusinessLoanHandler();

        mercuryHandler.setSuccessor(venusHandler);
        venusHandler.setSuccessor(earthHandler);

        return mercuryHandler;*/
        return null;
    }
}




