package bankingApp.domain;

/**
 * Created by Scorpian on 2016-04-03.
 */
public class Bank {

    private String name;
    private String code;


    public String getName() {
        return name;
    }

    public String getCode() {
        return code;
    }


    public Bank(Builder builder) {

        name = builder.name;
        code = builder.code;

    }


    public static class Builder {

        //Equivalent to setters
        private String code;
        private String name;


        public Builder (String code)
        {
            this.code = code; //compalsury
        }


        public Builder name(String name) {
            this.name = name;
            return this;
        }


        public Builder copy(Bank bank){

            this.name =bank.getName();
            this.code = bank.getCode();

            return this;
        }

        public Bank build() {
            return new Bank(this);
        }
    }



}
