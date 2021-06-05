package com.Bank;

import  java.text.NumberFormat;
import  java.util.Scanner;

public class Bank {
    private  long soTK;
    private  String tenTk;
    private  double soTienTrongTk;

    Scanner sc = new Scanner(System.in);
    public Bank(){

    }

    public  Bank( long soTK , String tenTk,double soTienTrongTk){
        this.soTK = soTK;
        this.tenTk = tenTk;
        this.soTienTrongTk = soTienTrongTk;
    }

    public  long getSoTK(){
        return soTK;
    }
    public  void setSoTK(long soTK){
        this.soTK = soTK;
    }

    public  String getTenTk(){
        return tenTk;
    }

    public  void setTenTk(String tenTk){
        this.tenTk = tenTk;
    }

    public  double getSoTienTrongTk(){
        return soTienTrongTk;
    }

    public  void setSoTienTrongTk(double soTienTrongTk){
        this.soTienTrongTk= soTienTrongTk;
    }

    @Override

    public  String toString(){
        NumberFormat crrencyEn = NumberFormat.getCurrencyInstance();
        String str1 = crrencyEn.format(soTienTrongTk);
        return  soTK + " - " + tenTk + " - " + str1;
    }

    public double napTien(){
        double nap;
        System.out.println("Nhập số tiền bạn cần nạp : ");
        nap = sc.nextDouble();

        if(nap >0 ){
            soTienTrongTk = nap + soTienTrongTk;
            NumberFormat currencyEN = NumberFormat.getCurrencyInstance();
            String str1 = currencyEN.format(nap);

            System.out.println("Bạn vưa nạp " + str1 + " vào tài khoảng");
        }else{
            System.out.println("Số tiền nạp vào không hợp lệ");
        }
        return nap;
    }

    public double rutTien(){
        double phi = 5;
        double rut;

        System.out.println("Nhập số tiển bạn cần rút");
        rut = sc.nextDouble();
        if(rut <= (soTienTrongTk - phi)){
            soTienTrongTk = soTienTrongTk - (rut + phi);
            NumberFormat currencyEn = NumberFormat.getCurrencyInstance();
            String str1 = currencyEn.format(rut);
            System.out.println("Bạn vừa rút " + str1 + "Đ từ tài khoản . phí là 5");
        }else {
            System.out.println("Số tiền muốn rút không hợp lệ !");
            return rutTien();
        }
        return  rut;
    }

    void inTk(){
        NumberFormat currencyEn = NumberFormat.getCurrencyInstance();
        String str1 = currencyEn.format(soTienTrongTk);
        System.out.printf("%-10d %-20s %-20s \n",soTK,tenTk,str1);
    }
}
