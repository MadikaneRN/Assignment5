package bankingApp.Factory;

import bankingApp.domain.Account;
import bankingApp.domain.Address;

/**
 * Created by Scorpian on 2016-04-03.
 */
public class AddressFactory {


    public static Address getAddress(String streetName, String city, String postalCode)
    {
        Address myAdress = new Address.Builder(streetName) // change name to conivinient name
                .city(city)
                .postalCode(postalCode)
                .build();

        return myAdress;
    }




}
