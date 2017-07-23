import static org.junit.Assert.*;
import org.junit.*;
import basket_mgmt.*;

public class ClothesTest {

  Clothes clothes;

  @Before
  public void before() {
    clothes = new Clothes("Jeans", 50);
  }

  @Test
  public void testClothesHaveType() {
    assertEquals("Jeans", clothes.getType());
  }

  @Test
  public void testClothesHaveCostPrice() {
    assertEquals(50, clothes.getCostPrice());
  }

  // @Test
  // public void testClothesHaveSellPrice() {
  //   assertEquals(110, jeans.calculateSellPrice());
  // }

}