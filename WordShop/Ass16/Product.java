public class Product {
    private Integer productId;
    private String productName;
    private String brandName;
    private Double productPrice;


    public Product(Integer productId , String productName,String brandName, Double productPrice){
        this.productId = productId;
        this.productName = productName;
        this.brandName = brandName;
        this.productPrice = productPrice;

    }

    public Integer getProductId (){
        return productId;
    }

    public void setProductId(Integer productId){
        this.productId = productId;
    }

    public String getProductName(){
        return productName;
    }

    public void setProductName(String productName){
        this.productName = productName;
    }

    public String getBrandName(){ 
        return brandName;
    }

    public void setBrandName(String brandName){
        this.brandName = brandName;
    }

    public double getProductPrice(){
        return productPrice;
    } 

    public void setProductPrice(double productPrice){
        this.productPrice= productPrice;
    }

    public Product(){

    }
}
