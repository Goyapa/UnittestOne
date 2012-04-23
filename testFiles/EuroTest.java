import junit.framework.TestCase;

/**
 * Created by IntelliJ IDEA.
 * User: Michael
 * Date: 19.04.12
 * Time: 11:25
 * Packagename: PACKAGE_NAME
 * To change this template use File | Settings | File Templates.
 */
public class EuroTest extends TestCase {
	private Euro two;
  protected void setUp() {
	two = new Euro(2.00);
  }
  public void testAmount() {
	assertTrue(2.00 == two.getAmount());
  }

  public void testRounding() {
	Euro rounded = new Euro(1.995);
	assertEquals("amount not rounded", 2.00, rounded.getAmount(), 0.001);
  }

  public void testAdding() {
	Euro sum = two.add(two);
	assertEquals("sum", 4.00, sum.getAmount(), 0.001);
	assertEquals("two", 2.00, two.getAmount(), 0.001);
  }
}
