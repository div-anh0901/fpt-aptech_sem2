package MVC_CRUD.entity;

public class Product {
    private int productId;
    private  String productName;
    private  String productDesc;
    private  Double productPrice;

    public Product(){

    }

    public  Product(String productName,String productDesc,double productPrice){
        this.productName = productName;
        this.productDesc = productDesc;
        this.productPrice = productPrice;
    }

   public  int getProductId(){
        return  productId;
   }
   public  void setProductId(int productId ){
        this.productId = productId;
   }
    public String getProductName(){
        return  productName;
    }
    public  void setProductName(String productName ){
        this.productName = productName;
    }

    public  String getProductDesc(){
        return productDesc;
    }
    public void setProductDesc(String productDesc){
        this.productDesc = productDesc;
    }

    public double getProductPrice(){
        return  productPrice;
    }

    public  void setProductPrice(double productPrice){
        this.productPrice = productPrice;
    }

}
