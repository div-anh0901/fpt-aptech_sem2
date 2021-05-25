
import java.util.Scanner;

public class TestAccount{
    public static void main(String[] args) {
        String[] accountDetails = new String[5];

        String[] bankDetals = new String[3];

        Scanner input = new Scanner(System.in);

        System.out.println("Enter Account Number : ");
        accountDetails[0] = input.nextLine();
        System.out.println("Enter Name : ");
        accountDetails[1] = input.nextLine();
        System.out.println("Enter Acount Type :");
        accountDetails[2] = input.nextLine();

        System.out.println("Enter Balace : ");
        accountDetails[3] = input.nextLine();
        System.out.println("Enter Number of Days");
        accountDetails[4] = input.nextLine();

        System.out.println("Enter Bank Id : ");
        bankDetals[0] = input.nextLine();
        System.out.println("Enter Bank Nam : ");
        bankDetals[1] = input.nextLine();
        System.out.println("Enter Branch : ");
        bankDetals[2] = input.nextLine();

        System.out.println("---------------------------");
        SafeVarargs objAcount = new SafeVarargs(accountDetails[0],
        accountDetails[1],accountDetails[2],accountDetails[3],accountDetails[4]);

        objAcount.displayDetails();

        System.out.println("---------------------------");

        Bank objBank1 = new Bank();

        objBank1.addBankDetails(bankDetals);
        objBank1.displayBankDetails();

        System.out.println("Enter Deposit Amout : ");
        double deposit = Double.parseDouble(input.nextLine());

        objAcount.withdrawCash(accountDetails[0], withdraw);


    }
}