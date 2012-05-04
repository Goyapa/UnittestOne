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
	assertEquals("amount not rounded", two, rounded);
  }

  public void testAdding() {
	Euro sum = two.add(two);
	assertEquals("sum", new Euro(4.00), sum);
	assertEquals("two", new Euro(2.00), two);
  }
  public void testEquality(){
	assertEquals(two, two);
	assertEquals(two, new Euro(2.00));
	assertEquals(new Euro(2.00), two);

	assertFalse(two.equals(new Euro(7.00)));
	assertFalse(two.equals(null));
	assertFalse(two.equals(new Object()));
  }
  public void testNegativeAmount(){
	// Guard Clause
	try{
	  final double NEGATIVE_AMOUNT = -2.00;
	  new Euro(NEGATIVE_AMOUNT);
	  // fail-Method belongs to JUnits Assert-Class
	  fail("amount must not be negative");
	} catch (IllegalArgumentException expected){
  }
  }
}
