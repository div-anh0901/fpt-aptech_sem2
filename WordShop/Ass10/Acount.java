
import java.util.ArrayList;
import java.util.Iterator;

public class Account {
    private String accountNumber;
    private String accountHolderName;
    private String accountType;

    private double balance;
    private ArrayList accDetails = new ArrayList<>();

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

}