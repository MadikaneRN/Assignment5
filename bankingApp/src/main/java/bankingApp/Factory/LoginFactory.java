package bankingApp.Factory;

import bankingApp.domain.Login;

/**
 * Created by Scorpian on 2016-04-03.
 */
public class LoginFactory {

    public static Login getLogin(String userName, String passWord)
    {
        Login myLogin= new Login.Builder(userName) // change name to conivinient name
                .passWord(passWord)
                .build();

        return myLogin;
    }

}
