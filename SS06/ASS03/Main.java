package SS06.ASS03;

public class Main {
    public static void main(String[] args) {
        Company company = new Company();
        Employee employee = new Employee();
        FreeLand freeLand = new FreeLand();
        TaxManager taxManager = new TaxManager();
        taxManager.addTaxpayer(company);
        System.out.println(taxManager.getTax());
        taxManager.addTaxpayer(employee);
        System.out.println(taxManager.getTax());
        taxManager.addTaxpayer(freeLand);
        System.out.println(taxManager.getTax());
    }
}
