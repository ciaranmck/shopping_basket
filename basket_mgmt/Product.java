package basket_mgmt;

public abstract class Product {

  private String type;
  private double costPrice;

  public Product(String type, double costPrice) {
    this.type = type;
    this.costPrice = costPrice;
  }

  public String getType() {
    return this.type;
  }

  public double getCostPrice() {
    return this.costPrice;
  }

}

