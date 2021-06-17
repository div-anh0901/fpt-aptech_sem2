package MVC_CRUD.ui;

import MVC_CRUD.controller.ProduceService;
import MVC_CRUD.entity.Product;
import MVC_CRUD.model.ProductDaompl;

import java.util.ArrayList;
import java.util.Scanner;

public class ProductConsole {
    private  final Scanner sc;
   ProductDaompl pml = new ProductDaompl();

    public  ProductConsole(){
        this.sc = new Scanner(System.in);
    }

    private  int menu(){
        System.out.println("-----PRODCUT ---------");
        System.out.println("1. Add product");
        System.out.println("2 . Show all product");
        System.out.println("3 . Remove product");
        System.out.println("0 . Exit");
        int choice =readInt(0,3);
        return  choice;
    }

    public  void start(){
        while (true){
            int choice = menu();
            switch (choice){
                case 0:{
                    System.exit(0);
                    break; }
                case 1 :{
                        addProdcut();
                        break;
                }
                case 2 :{
                    showAll();
                    break;
                }
                case 3 : {
                    removeProduct();
                    break;
                }
                default:
                {
                    System.out.println("NOT INVALID");
                }
            }
        }
    }

    private  int readInt(int min, int max){
        int choice;
         while (true){
             try{
                 choice = sc.nextInt();
                 if(choice >min && choice <=max){
                     break;
                 }
             }catch (NumberFormatException e){

             }
         }
         return choice;
    }

    private double readDouble(int min , double max){

        double price;
        while (true){
            try{
                price = Double.parseDouble(sc.nextLine());
                if(price>=min && price<= max){
                    break;
                }
            }catch (NumberFormatException e){

            }
        }
        return  price;
    }

    public  void addProdcut(){
        System.out.println("Enter product name :");
        sc.nextLine();
        String name = sc.nextLine();
        System.out.println("Enter product desc : ");
        String desc = sc.nextLine();
        System.out.println("Enter products price : ");
        double price =readDouble(0,Double.MAX_VALUE);
        Product p = new Product(name,desc,price);
        pml.createProduct(p);
    }

    public  void showAll(){
        System.out.println("--All product----");
        System.out.println("ID\tName\tDesc\tPrice");
        ArrayList<Product> allProducts = pml.getAllProducts();

        allProducts.forEach((product -> {
            System.out.println(product.getProductId() + "\t" + product.getProductName() + "\t" +
                    product.getProductPrice() + "\t"  + product.getProductPrice());
        }));
    }

    public void removeProduct(){
        System.out.println("ENter Id of peoduct");
        int id = readInt(0 , Integer.MAX_VALUE);
        boolean result = pml.deleteProduct(id);
        if(result){
            System.out.println("Product was removes");
        }else {
            System.out.println("Product not found");
        }
    }
}
