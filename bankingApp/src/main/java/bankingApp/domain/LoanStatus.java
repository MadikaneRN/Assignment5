package bankingApp.domain;

import java.util.Date;

/**
 * Created by Scorpian on 2016-04-01.
 */
public class LoanStatus {
    //Check your credit score if you qualify for loan or not
    //payslip is proof of ur details


    private double monthlyExpenses;
    private double salary;
    private double loanAmount;
    private Date currentDate;
    private String loanType;
    private Account loanUser;

    public double getMonthlyExpenses() {
        return monthlyExpenses;
    }

    public void setMonthlyExpenses(double monthlyExpenses) {
        this.monthlyExpenses = monthlyExpenses;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getLoanAmount() {
        return loanAmount;
    }

    public void setLoanAmount(double loanAmount) {
        this.loanAmount = loanAmount;
    }

    public Date getCurrentDate() {
        return currentDate;
    }

    public void setCurrentDate(Date currentDate) {
        this.currentDate = currentDate;
    }

    public String getLoanType() {
        return loanType;
    }

    public void setLoanType(String loanType) {
        this.loanType = loanType;
    }

    public Account getLoanUser() {
        return loanUser;
    }

    public void setLoanUser(Account loanUser) {
        this.loanUser = loanUser;
    }








}
