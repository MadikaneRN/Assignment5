package bankingApp.singleton;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by Scorpian on 2016-04-03.
 */
public class TestSingleton {

    private SingletonClient singletonClient;
    private SingletonClient singletonClientCopy;

    @Before
    public void setUp() throws Exception {

        singletonClient = SingletonClient.getInstance();
        singletonClient.setName("James");
        singletonClient.setIdNo("35");
        singletonClient.setSurName("Damsel");

        singletonClientCopy = SingletonClient.getInstance();
        singletonClient.setName("Marks");
        singletonClient.setIdNo("30");
        singletonClient.setSurName("Dam");

    }


    @Test
    public void ObjectEquality() throws Exception {
        Assert.assertEquals(singletonClientCopy, singletonClient);
    }


    @Test
    public void DataEquality() throws Exception {
        Assert.assertEquals(singletonClientCopy.getName(), singletonClient.getName());
        Assert.assertEquals(singletonClientCopy.getSurName(), singletonClient.getSurName());
        Assert.assertEquals(singletonClientCopy.getIdNo(), singletonClient.getIdNo());

    }

}
