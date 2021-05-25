

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;

public class Account {
    private String accountNumber;
    private String accountHolderName;
    private String accountType;

    private double balance;
    private ArrayList accDetails = new ArrayList();

    public void displayDetails() {
        System.out.println("Bank Details of Customer");
        System.out.println("Bank ID.Bank Name \t bran interest(%)");
        System.out.println("-------------------------------------");
        Iterator iBank = accDetails.iterator();
        while (iBank.hasNext()) {
            System.out.println(iBank.next() + "    ");
        }
        System.out.println("");
    }

    @Override
    public void checkBanlce(String accountNumber)
    {
        //throw new UnsupportedOperationException("Not supported yet .");

        System.out.println("-------------------------------");
        System.out.println("Available bslance : $ " +super.getBalance());
        System.out.println("--------------------------------");
    }

    @Override

    public void depositCash(String accountNumber , double amount){
        //throw new UnsupportedOperationException("Not supported yet .");
        super.setBalance(super.getBalance() + amount);

        Calendar objNow = Calendar.getInstance();

        SimpleDateFormat objFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        System.out.println("Date-Time " + objFormat.format(objNow.getTime()));
    System.out.println("Amount deposited : %" + amount);
    System.out.println("Balance agter deposit : %"+  super.getBalance);
    System.out.println("----------------------------------");
    }

    @Override

    public void withdrawCash(String accountNumber,double amount){
        throw new UnsupportedOperationException("Not supported yet .");
    }

}