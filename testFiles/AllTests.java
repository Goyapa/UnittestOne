import junit.framework.Test;
import junit.framework.TestSuite;

/**
 * Created by IntelliJ IDEA.
 * User: Michael
 * Date: 21.04.12
 * Time: 16:14
 * Packagename: PACKAGE_NAME
 * To change this template use File | Settings | File Templates.
 */
public class AllTests {
  public static Test suite() {
	TestSuite suite = new TestSuite();
	suite.addTestSuite(CustomerTest.class);
	suite.addTestSuite(EuroTest.class);
	suite.addTestSuite(MovieTest.class);
	suite.addTestSuite(RegularPriceTest.class);
	return  suite;
  }
}
