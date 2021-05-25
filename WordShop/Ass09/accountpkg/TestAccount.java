

import java.util.Scanner;

public class TestAccount {
        public static void main(String[] args) {
            String[] accountDetails = new String[4];
            String[] bankDetails = new String[3];
            Scanner input = new Scanner(System.in);

            System.out.println("Enter Acount Number : ");
            accountDetails[0]= input.nextLine();
            System.out.println("Enter name");
            accountDetails[1] = input.nextLine();
            System.out.println("Enter Account Type : ");
            accountDetails[2] = input.nextLine();
            System.out.println("Enter Balace : ");
            accountDetails[3] = input.nextLine();


            System.out.println("Enter Bank ID");
            bankDetails[0] = input.nextLine();

            System.out.println("Enter Bank Name : ");
            bankDetails[1] = input.nextLine();

            System.out.println("Enter Branch : ");
            bankDetails[2] = input.nextLine(); 
            
            
            System.out.println(" ------------------------------");

            Account objAccount1 = new Account();

            objAccount1.addDetails(accountDetails);;

            objAccount1.displayDetails();

            System.out.println("-------------------------");

            Bank objBank1 = new Bank();

            objBank1.addBankDetails(bankDetails);

            objBank1.displayBankDetails();
            
        }

      

        
}

