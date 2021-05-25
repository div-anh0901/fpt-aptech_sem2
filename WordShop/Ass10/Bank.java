
import java.util.ArrayList;
import java.util.Iterator;

public class Bank {
    String bankID;
    String bankName;
    String branch;

    private ArrayList bankDetail = new ArrayList();

    public static final float interestRate = 3.5f;

    public Bank() {
        bankID = "Not specified";
        bankName = "Not Specited";
        branch = "Not Speited";
    }

    public Bank(String bankID, String bankName, String branch) {
        this.bankID = bankID;
        this.bankName = bankName;
        this.branch = branch;
    }

    public void addBankDetails(String[] details) {
        System.out.println("Adding Bank Details.Please vait ....");

        for (int i = 0; i < details.length; i++) {
            bankDetail.add(details[i]);
        }
    }

    public void displayBankDetails() {
        System.out.println("Bank Details of Customer");
        System.out.println("Bank ID.Bank Name \t bran interest(%)");
        System.out.println("-------------------------------------");
        Iterator iBank = bankDetail.iterator();
        while (iBank.hasNext()) {
            System.out.println(iBank.next() + "    ");
        }
        System.out.println(interestRate);
        System.out.println("");
    }

}
