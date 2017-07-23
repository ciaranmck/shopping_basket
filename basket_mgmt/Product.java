package basket_mgmt;

public abstract class Product {

  private String type;
  private int costPrice;

  public Product(String type, int costPrice) {
    this.type = type;
    this.costPrice = costPrice;
  }

  public String getType() {
    return this.type;
  }

  public int getCostPrice() {
    return this.costPrice;
  }

}

