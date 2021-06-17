package MVC_CRUD.model;

import MVC_CRUD.dao.DBConnection;
import MVC_CRUD.entity.Product;

import java.sql.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ProductDaompl implements ProductDao {
    private  final Connection conn = DBConnection.createConnection();
    private  final String SQL_CREATE_PRODUCT = "INSERT INTO products(ProName,ProDesc, Price) VALUES (?,?,?)";
    private  final  String SQL_GET_PRODUCT_BY_ID = "SELECT * FROM products WHERE id = ?";
    private  final  String SQL_GET_ALL_PRODUCTS = "SELECT * FROM products";
    private  final  String SQL_UPDATE_PRODUCT = "UPDATE products SET ProName = ?, ProDesc= ? , Price = ? WHERE id = ?";
    private final  String SQL_DETELE_PRODUCT = "DELETE FORM products WHERE id =?";
@Override
    public  void createProduct(Product product){
        try {
            PreparedStatement pt = conn.prepareStatement(SQL_CREATE_PRODUCT, Statement.RETURN_GENERATED_KEYS);
            pt.setString(1,product.getProductName());
            pt.setString(2, product.getProductDesc());
            pt.setDouble(3,product.getProductPrice());
            pt.executeUpdate();
            try(ResultSet generaedKeys = pt.getGeneratedKeys()){
                if(generaedKeys.next()){
                    product.setProductId(generaedKeys.getInt(1));
                }
            }catch (Exception e){
                Logger.getLogger(ProductDaompl.class.getName()).log(Level.SEVERE,null,e);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    @Override
    public Product getProductById(int productId) {
        Product p = new Product();
        try(PreparedStatement pt = conn.prepareStatement(SQL_GET_PRODUCT_BY_ID)){
            pt.setInt(1,productId);
            try(ResultSet rs = pt.executeQuery()){
                    while (rs.next()){
                        p.setProductId(rs.getInt(1));
                        p.setProductName(rs.getString(2));
                        p.setProductDesc(rs.getString(3));
                        p.setProductPrice(rs.getDouble(4));
                    }
            }catch (Exception e){
                Logger.getLogger(ProductDaompl.class.getName()).log(Level.SEVERE,null,e);
            }
        }catch (Exception e){
            Logger.getLogger(ProductDaompl.class.getName()).log(Level.SEVERE,null,e);
        }
        return null;
    }

    @Override
    public ArrayList<Product> getAllProducts() {
    ArrayList<Product> allProducts = new ArrayList();
        PreparedStatement pt = null;
        try{
            pt = conn.prepareStatement(SQL_GET_ALL_PRODUCTS);
        ResultSet rs = pt.executeQuery();
        while (rs.next()){

            Product p = new Product();
            p.getProductId();
            p.setProductName(rs.getString(2));
            p.setProductDesc(rs.getString(3));
            p.setProductPrice(rs.getDouble(4));
        }
    }catch (Exception e){
            Logger.getLogger(ProductDaompl.class.getName()).log(Level.SEVERE,null,e);

    }
        return null;
    }

    @Override
    public void updateProduct(Product product) {
        try(PreparedStatement pt = conn.prepareStatement(SQL_UPDATE_PRODUCT)){
            pt.setString(1,product.getProductName());
            pt.setString(2 , product.getProductDesc());
            pt.setDouble(3 , product.getProductPrice());
            pt.setInt(4 , product.getProductId());
        }catch (Exception e){
            Logger.getLogger(ProductDaompl.class.getName()).log(Level.SEVERE,null,e);

        }
    }

    @Override
    public boolean deleteProduct(int productId) {
    try (PreparedStatement pt = conn.prepareStatement(SQL_DETELE_PRODUCT)){
        pt.setInt(1,productId);
        pt.executeUpdate();
        return  true;
    }catch (SQLException e){
        Logger.getLogger(ProductDaompl.class.getName()).log(Level.SEVERE,null,e);

    }
        return false;
    }


}
