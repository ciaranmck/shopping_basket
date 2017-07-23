import static org.junit.Assert.*;
import org.junit.*;
import basket_mgmt.*;

public class ClothesTest {

  Clothes clothes;

  @Before
  public void before() {
    clothes = new Clothes("Jeans", 50, 55, "M");
  }

  @Test
  public void testClothesHaveType() {
    assertEquals("Jeans", clothes.getType());
  }

  @Test
  public void testClothesHaveCostPrice() {
    assertEquals(50, clothes.getCostPrice(), .01);
  }

  @Test
  public void testClothesHaveSellPrice() {
    assertEquals(55, clothes.getSellPrice(), .01);
  }

  @Test 
  public void testClothesHaveSize() {
    assertEquals("M", clothes.getSize());
  }

}