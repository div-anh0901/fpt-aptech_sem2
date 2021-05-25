import java.text.DecimalFormat;

public class SavingsAcount extends Account  {
    private double dailyInterest;
    private int daysOfYear;

    public SavingsAcount(String accountNumber,String accountHolderName, String accountType,double dailyInterest,double balance,int daysOfYear ){
        super(accountNumber,accountHolderName,accountType,balance);
        
        this.dailyInterest = dailyInterest;
        this.daysOfYear = daysOfYear;
    }

    public double calculateInterest(){
        dailyInterest = (super.getBalane() * Bank.interestRate/100)/daysOfYear;
   DecimalFormat twoForm = new DecimalFormat();

   return Double.valueOf(twoForm.format(dailyInterest));
   
   
    }
}
