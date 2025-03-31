public class Product {
    String sku;
    double priceRetail;
    double priceCurrent;
    String productName;
    String category;

    public Product(String sku, double priceRetail, double priceCurrent, String productName, String category) {
        this.sku = sku;
        this.priceRetail = priceRetail;
        this.priceCurrent = priceCurrent;
        this.productName = productName;
        this.category = category;
    }

    @Override
    public String toString() {
        return "SKU: " + sku + ", Name: " + productName + ", Retail Price: " + priceRetail + ", Current Price: " + priceCurrent + ", Category: " + category;
    }
}
