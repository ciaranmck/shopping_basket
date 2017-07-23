package basket_mgmt;
import behaviours.*;
import java.util.ArrayList;


public class Basket {

  private ArrayList<Product> contents;

  public Basket() {
    this.contents = new ArrayList<Product>();
  }

  public int getSize() {
    return this.contents.size();
  }

  public void addProductToBasket(Product product) {
    this.contents.add(product);
  }

  public void removeProductFromBasket(int index) {
    this.contents.remove(index);
  }

  public void emptyBasket() {
    int length = getSize();
    for (int i = 0; i < length; i++) {
      removeProductFromBasket(0);
    }
  }

  public double getTotalValueOfBasket() {
    double totalValue = 0;
    for (Product product : contents) {
      totalValue += product.getSellPrice() ;
    }
    return totalValue;
  }

  public double discountItems() {
    double totalValue = getTotalValueOfBasket();
    double discountedTotal = 0;

    if (totalValue >= 20) {
      discountedTotal = totalValue - (totalValue * .10);
      }
      return discountedTotal; 
    }

  }
