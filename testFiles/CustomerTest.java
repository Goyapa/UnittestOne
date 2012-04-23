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
  private Customer customer;
  protected void setUp() {
	customer = new Customer();
  }
  public void testRentingNoMovie() {
	assertEquals(0, customer.getTotalCharge(), 0.001);
  }
  public void testRentingOneMovie(){
	customer.rentMovie(1);
	assertEquals(2.00, customer.getTotalCharge(),0.001);
  }
  public void testRentingTreeMovies(){


	customer.rentMovie(2);
	customer.rentMovie(3);
	customer.rentMovie(4);
	assertEquals(11.25,customer.getTotalCharge(), 0.001);
  }
  /*public void testRentingFourMovies(){

	customer.rentMovie(1);
	customer.rentMovie(2);
	customer.rentMovie(3);
	customer.rentMovie(4);
	assertEquals(13.25,customer.getTotalCharge(), 0.001);
  }*/
}
