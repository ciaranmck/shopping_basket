import static org.junit.Assert.*;
import org.junit.*;
import basket_mgmt.*;

public class BasketTest {

  Basket basket;

  @Before
  public void before() {
    basket = new Basket();
  }

  @Test
  public void testBasketHasSize() {
    assertEquals(0, basket.getSize());
  }

  @Test
  public void testCanAddProductToBasket() {
    Food food = new Food("Oranges", .20, .30);

    basket.addProductToBasket(food);

    assertEquals(1, basket.getSize());
  }

  @Test
  public void testCanRemoveFirstProductFromBasket() {
    Food orange = new Food("Orange", .2, .3);
    Food apple = new Food("Apple", .3, .4);

    basket.addProductToBasket(orange);
    basket.addProductToBasket(apple);
    assertEquals(2, basket.getSize());

    basket.removeProductFromBasket(1);
    assertEquals(1, basket.getSize());
  }

  @Test
  public void testCanEmptyBasket() {
    Food orange = new Food("Orange", .20, .30);
    basket.addProductToBasket(orange);
    Food apple = new Food("Apple", .30, .40);
    basket.addProductToBasket(apple);
    Clothes shirt = new Clothes("Shirt", 20, 40, "S");
    basket.addProductToBasket(shirt);

    assertEquals(3, basket.getSize());

    basket.emptyBasket();
    assertEquals(0, basket.getSize());
  }

  @Test
  public void testCanGetTotalValueOfBasket() {
    Food orange = new Food("Orange", .20, .30);
    basket.addProductToBasket(orange);
    Food apple = new Food("Apple", .30, .40);
    basket.addProductToBasket(apple);
    Clothes shirt = new Clothes("Shirt", 20, 40, "S");
    basket.addProductToBasket(shirt);

    assertEquals(40.70, basket.getTotalValueOfBasket(), .01); 
  }

  @Test
  public void testCanDiscountBasket() {
    Food orange = new Food("Orange", .20, .30);
    basket.addProductToBasket(orange);
    Food apple = new Food("Apple", .30, .40);
    basket.addProductToBasket(apple);
    Clothes shirt = new Clothes("Shirt", 20, 40, "S");
    basket.addProductToBasket(shirt);

    assertEquals(36.63, basket.discountItems(), .01);
  }

}
