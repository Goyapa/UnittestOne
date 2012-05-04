import junit.framework.TestCase;

/**
 * Created by IntelliJ IDEA.
 * User: Michael
 * Date: 27.04.12
 * Time: 08:22
 * Packagename: PACKAGE_NAME
 * To change this template use File | Settings | File Templates.
 */
public class RegularPriceTest extends TestCase {
  public void testChargingOneDayRental() {
	RegularPrice price = new RegularPrice();
	assertEquals(new Euro(1.50), price.getCharge(1));
  }
}
