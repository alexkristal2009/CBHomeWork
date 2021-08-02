package JavaEssential.HomeWork008.Task3;

public class Price implements Comparable<Price>{

    private String productName;
    private String shopName;
    private String price;

    public Price(String productName, String shopName, String price) {
        this.productName = productName;
        this.shopName = shopName;
        this.price = price;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product Name: " + productName + "\n" +
                "Store name: " + shopName + "\n" +
                "The price of the product: " + price + "\n";
    }

    @Override
    public int compareTo(Price price) {
        return this.productName.compareTo(price.productName);
    }
}
