package basket_mgmt;
import behaviours.*;

public class Clothes extends Product implements Buyable {

  private String size;

  public Clothes(String type) {
    super(type);
    this.size = size;
  }

  public String getSize() {
    return this.size;
  }

  // public int calculateSellPrice(int markup) {
  //   int sellPrice = clothes.getCostPrice() * markup;
  //   return sellPrice;
  // }

}