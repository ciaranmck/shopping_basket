package basket_mgmt;
import behaviours.*;

public class Food extends Product implements Buyable {

  public Food(String type, double costPrice) {
    super(type, costPrice);
  }

  public double calculateSellPrice(double percentage) {
    double markup = getCostPrice() / 100 * percentage;
    return markup + getCostPrice();
  }

}