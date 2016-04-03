package bankingApp.Factory;

import bankingApp.domain.Airtime;

/**
 * Created by Scorpian on 2016-04-03.
 */
public class AirtimeFactory {


    public static Airtime getAirtime(String cellphoneNo, String beneficiary, String serviceProvider)
    {
        Airtime myAirtime = new Airtime.Builder(cellphoneNo) // change name to conivinient name
                .beneficiary(beneficiary)
                .serviceProvider(serviceProvider)
                .build();
        return myAirtime;
    }



}
