import java.util.Scanner;

public class AccountTransation{
    String accountNumber;
    double balance = 25000;

    public static void main(String[] args) {
        double amountIn;
        int choice;


        IBankingValidation validationDeposit, validationWithdraw;
        IBankingOperation canWithDrawMoney, canDepositMoney;

        Scanner input = new Scanner(System.in);

        AccountTransation objAccountTrans = new AccountTransation();

        validationWithdraw =(bal) -> bal <= 200;
        validationDeposit = (bal) -> bal > 10000;

        canWithDrawMoney = (aa, amount) -> {return objAccountTrans.balance - amount;};
        canDepositMoney = (aa,amount) -> {return objAccountTrans.balance + amount;};

        System.out.println("Enter the account number");
        objAccountTrans.accountNumber=input.nextLine();

        System.out.println("Enter the option");
        System.out.println("1: Deposit Money");
        System.out.println("2 : Withdraw Money");

        choice= input.nextInt();

        if(choice ==1){
            System.out.println("Enter the amount to be depsited");
            amountIn = input.nextDouble();
            if(validationDeposit.validate(amountIn)){
                System.out.println("Unable to perform operation deposit is more tan 10000");
                
            }else{
                System.out.println("Account Number : " + objAccountTrans.accountNumber +
                    " Balance after Deposit :" + objAccountTrans.transaction(canDepositMoney,amountIn,objAccountTrans) );
            }
        }else if(choice ==2){
            System.out.println("Your available balance id : " + objAccountTrans.balance);
            
            System.out.println("Enter the amount to be withdraw");
            amountIn = input.nextDouble();
            double bal = objAccountTrans.transaction(canWithDrawMoney,amountIn,objAccountTrans);
            if(validationWithdraw.validate(bal)){
                System.out.println("Unanle to perform operation as after withsraq balance would bt class than 200 and your current balance is :  " +bal);
            }
            else{
                System.out.println("Account Number : " + objAccountTrans.accountNumber+
                "Balance after withdrawal" + objAccountTrans.transaction(canWithDrawMoney,amountIn,objAccountTrans));
            }
        }   
        else{
            System.out.println("Invalid Choise");
        }
    }

    @FunctionalInterface

    interface IBankingOperation{
        double operate(AccountTransation aa, double amount);
    }

    @FunctionalInterface
    interface IBankingValidation{
        boolean validate(double amount);


    }

    public double transaction(IBankingOperation operation , double amount ,
    AccountTransation a){
        return operation.operate(a, amount);
    }
}