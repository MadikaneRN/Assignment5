package bankingApp.domain;

/**
 * Created by Scorpian on 2016-03-28.
 */
public class Client {

    private String name;
    private String surName;
    private String idNo;


    public Client(Builder builder) {


        idNo = builder.idNo;
        surName = builder.surName;
        name = builder.name;

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


    public static class Builder {

        //Equivalent to setters
        private String name;
        private String surName;
        private String idNo;



        public Builder (String idNo) {
            this.idNo = idNo; //compalsury
        }

        public Builder surName(String Surname) {
            this.surName = Surname;
            return this;
        }

        public Builder name(String name) {
            this.name = name;
            return this;
        }



        public Builder copy(Client client){

            this.idNo = client.getIdNo();
            this.name = client.getName();
            this.surName = client.getSurName();
            return this;
        }



        public Client build() {
            return new Client(this);
        }
    }



}
