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
    Food food = new Food("Oranges", .20);

    basket.addProductToBasket(food);

    assertEquals(1, basket.getSize());
  }

  @Test
  public void testCanRemoveFirstProductFromBasket() {
    Food orange = new Food("Orange", .20);
    Food apple = new Food("Apple", .30);

    basket.addProductToBasket(orange);
    basket.addProductToBasket(apple);
    assertEquals(2, basket.getSize());

    basket.removeProductFromBasket(1);
    assertEquals(1, basket.getSize());
  }

  @Test
  public void testCanEmptyBasket() {
    Food orange = new Food("Orange", .20);
    basket.addProductToBasket(orange);
    Food apple = new Food("Apple", .30);
    basket.addProductToBasket(apple);
    Clothes shirt = new Clothes("Shirt", 20, "S");
    basket.addProductToBasket(shirt);

    assertEquals(3, basket.getSize());

    basket.emptyBasket();
    assertEquals(0, basket.getSize());
  }

}
