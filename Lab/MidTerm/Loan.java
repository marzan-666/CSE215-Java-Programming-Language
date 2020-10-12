
package MidTerm;

public class Loan {
    private double annualInterestRate;
    private int year;
    private double loanAmount;
    public Loan(){
        this(2.5,1,100);
}
    public Loan(double annualInterestRate,int year,double loanAmount){
        this.annualInterestRate=annualInterestRate;
        this.year=year;
        this.loanAmount=loanAmount;
    }
    public double getAnnualInterestRate(){
        return annualInterestRate ;
    }
    public int getYear(){
        return year;
    }
    public double getLoanAmount(){
        return loanAmount;
    }
    public void setAnnualInterestRate(double annualInterestRate){
        this.annualInterestRate=annualInterestRate ;
    }
    public void setYear(int year){
        this.year=year;
    }
    public void setLoanAmount(double loanAmount){
        this.loanAmount=loanAmount;
    }
    public double getMonthlyPayment(){
        double monthlyInterestRate = annualInterestRate/1200;
        double monthlyPayment=loanAmount*monthlyInterestRate/(1-1/Math.pow(1+monthlyInterestRate,year*12));
        return monthlyPayment;
    }
    public double getTotalPayment(){
        double totalPayment=getMonthlyPayment()*year*12;
        return totalPayment;
    }
    
}

