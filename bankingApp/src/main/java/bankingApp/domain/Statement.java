package bankingApp.domain;

import java.util.Date;

/**
 * Created by Scorpian on 2016-04-01.
 */
public class Statement {
    private Date currentDate;
    private String details;

    public Statement(Builder builder) {

        details = builder.details;
        currentDate = builder.currentDate;

    }

    public Date getCurrentDate() {
        return currentDate;
    }

    public String getDetails() {
        return details;
    }
    public static class Builder {

        //Equivalent to setters
        private Date currentDate;
        private String details;



        public Builder (String details)
        {
            this.details = details; //compalsury
        }

        public Builder currentDate(Date currentDate) {
            this.currentDate = currentDate;
            return this;
        }



        public Builder copy(Statement statement){

            this.details = statement.getDetails();
            this.currentDate = statement.getCurrentDate();
            return this;
        }




        public Statement build()
        {
            return new Statement(this);
        }
    }

}
