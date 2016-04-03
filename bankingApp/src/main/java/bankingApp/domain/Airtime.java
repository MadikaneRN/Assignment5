package bankingApp.domain;

/**
 * Created by Scorpian on 2016-04-01.
 */
public class Airtime {

    private String cellphoneNo;
    private String beneficiary;
    private String serviceProvider;


    public Airtime(Builder builder) {

        cellphoneNo = builder.cellphoneNo;
        beneficiary = builder.beneficiary;
        serviceProvider = builder.serviceProvider;

    }

    public String getServiceProvider() {
        return serviceProvider;
    }

    public String getCellphoneNo() {
        return cellphoneNo;
    }

    public String getBeneficiary() {
        return beneficiary;
    }


    public static class Builder {

        private String cellphoneNo;
        private String beneficiary;
        private String serviceProvider;



        public Builder (String cellphoneNo)
        {
            this.cellphoneNo = cellphoneNo; //compalsury
        }

        public Builder beneficiary(String beneficiary) {
            this.beneficiary = beneficiary;
            return this;
        }

        public Builder serviceProvider(String serviceProvider) {
            this.serviceProvider = serviceProvider;
            return this;
        }




        public Builder copy(Airtime airtime){

            this.cellphoneNo = airtime.getCellphoneNo();
            this.beneficiary = airtime.getBeneficiary();
            this.serviceProvider = airtime.getServiceProvider();
            return this;
        }


        public Airtime build()
        {
            return new Airtime(this);
        }
    }



}
