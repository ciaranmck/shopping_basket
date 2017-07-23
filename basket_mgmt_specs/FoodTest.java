import static org.junit.Assert.*;
import org.junit.*;
import basket_mgmt.*;

public class FoodTest {

  Food food;

  @Before
  public void before() {
    food = new Food("Pasta", .5);
  }

  @Test
  public void testFoodHasType() {
    assertEquals("Pasta", food.getType());
  }

  @Test
  public void testFoodHasCostPrice() {
    assertEquals(.5, food.getCostPrice(), .01);
  }

  @Test
  public void testFoodHaveSellPrice() {
    assertEquals(.6, food.calculateSellPrice(20), .01);
  }

}