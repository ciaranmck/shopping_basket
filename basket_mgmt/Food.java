package basket_mgmt;
import behaviours.*;

public class Food extends Product implements Buyable {

  public Food(String type, double costPrice, double sellPrice) {
    super(type, costPrice, sellPrice);
  }

  // public double calculateSellPrice(double percentage) {
  //   double markup = getCostPrice() / 100 * percentage;
  //   double sellingPrice = markup + getCostPrice();
  //   setSellPrice(sellingPrice);
  //   return sellingPrice; 
  // }

}