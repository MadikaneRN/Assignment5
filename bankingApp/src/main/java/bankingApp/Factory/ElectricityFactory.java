package bankingApp.Factory;

import bankingApp.domain.Electricity;

/**
 * Created by Scorpian on 2016-04-03.
 */
public class ElectricityFactory {


    public static Electricity getElectricity(String meterNo, String supplierName)
    {
        Electricity myElectric = new Electricity.Builder(meterNo) // change name to conivinient name
                .supplierName(supplierName)
                .build();
        return myElectric;
    }
}
