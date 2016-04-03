package bankingApp.singleton;

/**
 * Created by Scorpian on 2016-04-03.
 */
public class SingletonClient implements Cloneable {

    private static volatile SingletonClient soleInstance = null;


    private String name;
    private String surName;
    private String idNo;


    private SingletonClient() {
        System.out.println("Creating..");

    }

    public String getName() {
        return name;
    }

    public String getSurName() {
        return surName;
    }

    public String getIdNo() {
        return idNo;
    }


    public void setName(String name) {
        this.name = name;
    }

   public void setSurName(String surName)
   {
       this.surName = surName;
   }

   public void setIdNo(String idNo)
   {
       this.idNo = idNo;
   }



    public static SingletonClient getInstance() {
        //Double checked locking
        if (soleInstance == null) {//Check1
            synchronized(SingletonClient.class) {
                if (soleInstance == null) {//check2
                    soleInstance = new SingletonClient();
                }
            }
        }
        return soleInstance;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
















}
