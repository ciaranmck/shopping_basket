package basket_mgmt;
import behaviours.*;

public class Clothes extends Product implements Buyable {

  private String size;

  public Clothes(String type, double costPrice, double sellPrice, String size) {
    super(type, costPrice, sellPrice);
    this.size = size;
  }

  public String getSize() {
    return this.size;
  }

  // public double calculateSellPrice(double percentage) {
  //   double markup = getCostPrice() / 100 * percentage;
  //   double sellingPrice = markup + getCostPrice();
  //   setSellPrice(sellingPrice);
  //   return sellingPrice; 
  // }

}