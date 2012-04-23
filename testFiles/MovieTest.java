import junit.framework.TestCase;

/**
 * Created by IntelliJ IDEA.
 * User: Michael
 * Date: 23.04.12
 * Time: 12:54
 * Packagename: PACKAGE_NAME
 * To change this template use File | Settings | File Templates.
 */
public class MovieTest extends TestCase {
  public void testBasePrice() {
	assertEquals(2.00, Movie.getCharge(1), 0.001);
	assertEquals(2.00, Movie.getCharge(2), 0.001);
  }
  public void testPricePerDay() {
	assertEquals(3.75, Movie.getCharge(3), 0.001);
	assertEquals(5.50, Movie.getCharge(4), 0.001);
  }
}
