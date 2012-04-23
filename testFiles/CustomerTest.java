import junit.framework.TestCase;

/**
 * Created by IntelliJ IDEA.
 * User: Michael
 * Date: 21.04.12
 * Time: 16:37
 * Packagename: PACKAGE_NAME
 * To change this template use File | Settings | File Templates.
 */
public class CustomerTest extends TestCase{
  public void testRunningOneMovie(){
	Customer customer = new Customer();
	customer.rentMovie(1);
	assertTrue(customer.getTotalCharge() == 2);
  }
  public void testRentingTwoMovies(){
	Customer customer = new Customer();
	customer.rentMovie(1);
	customer.rentMovie(2);
	assertEquals(4, customer.getTotalCharge(), 0.001);
  }
  public void testRentingTreeMovies(){
	Customer customer = new Customer();
	customer.rentMovie(1);
	customer.rentMovie(2);
	customer.rentMovie(3);
	assertEquals(7.75,customer.getTotalCharge(), 0.001);
  }
}
