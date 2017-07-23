package basket_mgmt;

public abstract class Product {

  private String type;
  private double costPrice;
  private double sellPrice;

  public Product(String type, double costPrice, double sellPrice) {
    this.type = type;
    this.costPrice = costPrice;
    this.sellPrice = sellPrice;
  }

  public String getType() {
    return this.type;
  }

  public double getCostPrice() {
    return this.costPrice;
  }

  public double getSellPrice() {
    return this.sellPrice;
  }

  public void setSellPrice(double price) {
    this.sellPrice = price;
  }

}

