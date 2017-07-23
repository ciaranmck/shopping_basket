package basket_mgmt;
import behaviours.*;
import java.util.ArrayList;


public class Basket {

  private ArrayList<Buyable> contents;

  public Basket() {
    this.contents = new ArrayList<Buyable>();
  }

  public int getSize() {
    return this.contents.size();
  }

  public void addProductToBasket(Buyable product) {
    this.contents.add(product);
  }

  public void removeProductFromBasket() {
    this.contents.remove(0);
  }

}