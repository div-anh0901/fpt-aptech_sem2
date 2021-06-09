package ASS02;

import java.util.Scanner;

public class LoanPayment {
    static  public float roundOff(double value){
        value = value  * 100;
        float rnumedValue = (float) Math.round(value);
        rnumedValue = rnumedValue/100;
        return rnumedValue;
    }

    public static void main(String[] args) {
        double balance = 0.0;
        float annualFercentRate = 0.0f;
        float rate = 0.0f;
        int aonths = 0;
        double FNI =0;
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the originas toan amountt : ");
        balance = input.nextDouble();

        System.out.println("announlFercentRate");
        annualFercentRate = input.nextFloat();

        System.out.println("Conput _______________");
        System.out.println("*************************************");

        rate = (annualFercentRate /12) /100;

        FNI * (balance * rate * (Math.pow(i+rate), aonths));
    }

}
