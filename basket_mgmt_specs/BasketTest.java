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

}
