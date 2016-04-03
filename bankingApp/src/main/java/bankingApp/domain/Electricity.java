package bankingApp.domain;

/**
 * Created by Scorpian on 2016-04-01.
 */
public class Electricity {

    private String meterNo;
    private String supplierName;



    public String getSupplierName() {
        return supplierName;
    }

    public String getMeterNo() {
        return meterNo;
    }


    public Electricity(Builder builder) {

        meterNo = builder.meterNo;
        supplierName = builder.supplierName;

    }



    public static class Builder {

        private String meterNo;
        private String supplierName;


        public Builder (String meterNo)
        {
            this.meterNo = meterNo; //compalsury
        }

        public Builder supplierName(String supplierName) {
            this.supplierName = supplierName;
            return this;
        }


        public Builder copy(Electricity electricity){

            this.supplierName = electricity.getSupplierName();
            this.meterNo = electricity.getMeterNo();
            return this;
        }


        public Electricity build()
        {
            return new Electricity(this);
        }
    }



}
