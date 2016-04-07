package bankingApp.domain;

/**
 * Created by Scorpian on 2016-04-03.
 */
public class StatementTest {

	private Statement statement;
    @Before

    public void setUp() throws Exception {

        statement = StatementFactory.getStatement("Summary", "week43 monday");

    }


    @Test
    public void testLogin() throws Exception {

        Assert.assertNotNull(statement);
        Assert.assertEquals(statement.getDetails(),"Summary");
        Assert.assertEquals(statement.getWeekandDay,"week43 monday");


    }
    //not gna use
    @Test
    public void testUpdate() throws Exception {
        Statement statementUpdate = new Statement.Builder(Statement.getDetails())// uses accNo as primary key
                .copy(statement)
				.weekandDay("week44 monday")
                .build();

        Assert.assertNotNull(statementUpdate);
        Assert.assertEquals(statementUpdate.getweekandDay,"week44 monday");


    }








}
