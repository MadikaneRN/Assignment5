package bankingApp.domain;

/**
 * Created by Scorpian on 2016-04-01.
 */
public class Login {

    private String userName;
    private String passWord;


    public String getUserName() {
        return userName;
    }

    public String getPassWord() {
        return passWord;
    }


    public Login(Builder builder) {

        userName = builder.userName;
        passWord = builder.passWord;

    }


    public static class Builder {

        //Equivalent to setters
        private String passWord;
        private String userName;


        public Builder (String userName)
        {
            this.userName = userName; //compalsury
        }

        public Builder passWord(String passWord) {
            this.passWord = passWord;
            return this;
        }


        public Builder copy(Login login){

            this.userName =login.getUserName();
            this.passWord = login.getPassWord();

            return this;
        }

        public Login build() {
            return new Login(this);
        }
    }





}
