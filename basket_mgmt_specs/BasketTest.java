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

}
