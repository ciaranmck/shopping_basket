package basket_mgmt;
import behaviours.*;

public class Clothes extends Product implements Buyable {

  private String size;

  public Clothes(String type, double costPrice, String size) {
    super(type, costPrice);
    this.size = size;
  }

  public String getSize() {
    return this.size;
  }

  public double calculateSellPrice(double percentage) {
    double markup = getCostPrice() / 100 * percentage;
    return markup + getCostPrice();
  }

}