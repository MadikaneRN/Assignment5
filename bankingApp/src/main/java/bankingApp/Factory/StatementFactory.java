package bankingApp.Factory;

import bankingApp.domain.Statement;

import java.util.Date;

/**
 * Created by Scorpian on 2016-04-03.
 */
public class StatementFactory {

    public static Statement getStatement(String details, Date currentDate)
    {
        Statement myStatement = new Statement.Builder(details) // change name to conivinient name
                .currentDate(currentDate)
                .build();

        return myStatement;
    }

}
