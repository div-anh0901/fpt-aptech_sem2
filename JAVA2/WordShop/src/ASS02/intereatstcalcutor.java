package ASS02;

import java.util.Scanner;

public class intereatstcalcutor {
    public  intereatstcalcutor(){

    }

    public static void main(String[] args) {
            long prAmount = 0;
            float retef = 0.0f;
            int yr = 0;
            double simpleInterest = 0.0;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the Prinicpal Amount :");
        prAmount = input.nextLong();

        System.out.println("Enter the rate in percentage : ");
        retef = input.nextFloat();

        System.out.println("Enter the duration on year(s) : ");
        yr = input.nextInt();

        System.out.println("Processing...");
        System.out.println("**************************************");

        Integer year = new Integer(yr);

        Float rate = new Float(retef);

        Long prinecigal = new Long(prAmount);

        simpleInterest = (prinecigal * year * rate)/100;

        Double si = new Double(simpleInterest);

        System.out.println("The Proripal Amount entered : " + prinecigal);
        System.out.println("The datr of Interger entard : " + rate + "k");
        System.out.println("The dursfion enterft : " + year + "year(S)");
        System.out.println(si);

    }
}
