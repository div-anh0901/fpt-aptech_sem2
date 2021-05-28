
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import static java.util.Comparator.comparing;
import java.util.DoubleSummaryStatistics;
import java.util.Map;
import java.util.Optional;
import static java.util.stream.Collectors.*;
import java.util.stream.Collectors;

public class ProductMain {
    private static boolean flag = false;
    private static int size;
    private static String value;
    private static String productdata;

    public static void main(String[] args) {

        List<String> productId = new ArrayList<String>();

        List<String> productName = new ArrayList<String>();

        List<String> brandName = new ArrayList<String>();

        List<String> productPrice = new ArrayList<String>();
      BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

        List<Product> list = new ArrayList<Product>();
        do {
            System.out.println("Enter the number of Product(Only enter numeric values)");
            value = input.readLine();
        } while (value.matches("[a-zA-Z ]*\\d+.*") == false);
        size = Integer.parseInt(value);
        System.out.println(
                "Enter the details below using(,) seperator in the order of ProductId , ProductName. BrandName, ProductPrice");
        for (int i = 0; i < size; i++) {
            try {
                productdata = input.readLine();
                String[] data = productdata.split(",");

                productId.add(data[0]);
                productName.add(data[1]);
                brandName.add(data[2]);
                productPrice.add(data[3]);

            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        }

        for (int i = 0; i < productName.size(); i++) {
            list.add(new Product(Integer.parseInt(productId.get(i)), productName.get(i), brandName.get(i),
                    Double.parseDouble(productPrice.get(i)
                    )));
        }
        classifiedByPrice(list);
        classifiedByProduct(list);
        classifiedByBrand(list);
        filteringByProductName(input, productName, productId, brandName, productPrice);
    }

    public static void classifiedByPrice(List<Product> list) {
        List<Double> priceList;
        priceList = list.stream().map(Product::getProductPrice).collect(Collectors.toList());
        DoubleSummaryStatistics price = priceList.stream().mapToDouble((x) -> x).summaryStatistics();

        System.out.println("Maximum price in the List : " + price.getMax());
        System.out.println("Minimum price in the List : " + price.getMin());
        System.out.println("Sum of all products price : " + price.getAverage());

    }

    public static void classifiedByBrand(List<Product> list) {
        System.out.println("Dislay the average of price bt brand");

        Map<String, Double> brandByPriceToAverage = list.stream()
                .collect(groupingBy(Product::getBrandName, averagingDouble(Product::getProductPrice)));

        for (Map.Entry<String, Double> me : brandByPriceToAverage.entrySet()) {
            String pp = me.getKey();
            System.out.println(pp);
            System.out.println(me.getValue());
        }

        System.out.println("Dislay the sum of price Brand");
        Map<String, Double> brandToSum = list.stream().collect(groupingBy(Product::getBrandName, summingDouble(Product::getProductPrice)));
        System.out.println(brandToSum);

    }

    public static void classifiedByProduct(List<Product> list) {
        List<String> productname;
        List<Double> productcount;

        productname = list.stream().map(Product::getProductName).collect(Collectors.toList());
        productcount = list.stream().map(Product::getProductPrice).collect(Collectors.toList());

        DoubleSummaryStatistics productCount = productcount.stream().mapToDouble((x) -> x).summaryStatistics();

        System.out.println("The given Products name are : " + productname);
        System.out.println("Count of Products : " + productCount.getCount());
        System.out.println("Dispaly the Products names with maxinum price");

        Map<String, Optional<Product>> productToHighestPrice = list.stream()
                .collect(groupingBy(Product::getProductName, maxBy(comparing(Product::getProductPrice))));
        for (Map.Entry<String, Optional<Pruduct>> me : productToHighestPrice.entrySet()) {
            String pp = me.getKey();
            Optional<Product> p = me.getValue();
            System.out.println(pp);
            System.out.println(p.get().getProductPrice());
        }

    }

    public static void filteringByProductName(BufferedReader input, List<String> productName, List<String> productId,
            List<String> brandName, List<String> productPrice) throws IOException {
        System.out.println("Enter the Product Naem you want to serach : ");
        String search = input.readLine();
        for (int i = 0; i < productName.size(); i++) {
            String ourVal = productName.get(i);
            if (ourVal.contains(search)) {
                System.out.println(productId.get(i) + " " + productName.get(i) + "" + brandName.get(i) + " "
                        + productPrice.get(i));
                flag = false;
            }
        }

        if (flag == true) {
            System.out.println("the Proctuce Name is not avalable");
        }

    }

}
