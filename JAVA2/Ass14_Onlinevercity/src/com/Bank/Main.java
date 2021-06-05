package com.Bank;

import  java.util.Scanner;

public class Main {
    static  Scanner sc = new Scanner(System.in);
    static void nhapTk(Bank tk){
        System.out.println("Nhập số tài khoản : ");
        tk.setSoTK(sc.nextInt());
        sc.nextLine();
        System.out.println("Nhập tên tài khoản : ");
        tk.setTenTk(sc.nextLine());
        tk.getSoTienTrongTk();
    }

    public static void main(String[] args) {
        Bank a[] = null;
        int k, b,n =0;
        long s,d,c,f;
        boolean flag =true;
        do{
            System.out.println("Bạn chọn làm j");
            System.out.println("1. Nhập thông tin khách hàng");
            System.out.println("2 . Xuât danh sách thông tin của các khách hàng");
            System.out.println("3 . Nạp tiền");
            System.out.println("4 . Rút tiền");
            System.out.println("Số khác để thoát");
            b = sc.nextInt();
            switch (b){
                case 1 :{
                    System.out.println("Nhập số lượng khách hàng muốn bạn nhập : ");
                    n= sc.nextInt();
                    a = new Bank[n];
                    for(int i = 0 ; i<n ; i++){
                        System.out.println("Khach hàng số : " + (i+1));
                        a[i] = new Bank();
                        nhapTk(a[i]);
                    }
                    break;
                }
                case 2:{
                    System.out.printf("%-10s %-20s %-20s \n", "Số TK" , "Tên TK" , " Số Tiền trong tài khoản");
                    for(int i =0 ; i< n ;i++){
                        a[i].inTk();
                    }
                    break;
                }
                case 3 : {
                    System.out.println("Nhập số tài khoản khách cần nạp tiền : ");
                    s = sc.nextLong();
                    for(int i = 0; i< n ;i++){
                        d = a[i].getSoTK();
                        if(s==d){
                            System.out.println("Bạn chọn tài khoản : " + d);
                            a[i].napTien();
                        }else{
                            System.out.println("");
                        }
                    }
                    break;
                }
                case 4:{
                    System.out.println("Nhập số tài khoản khách hàng cần rút tiền :");
                    s =sc.nextLong();
                    for(int i = 0 ; i < n ; i++){
                        d = a[i].getSoTK();
                        if(s==d){
                            System.out.println("Ban chọn tài khoản : " + d);
                            a[i].rutTien();
                        }
                    }
                    break;
                }
                default:
                    System.out.println("BYE!!");
                    flag = false;
                    break;
            }
        }while (flag);
    }


}
