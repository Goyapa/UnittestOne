/**
 * Created by IntelliJ IDEA.
 * User: Michael
 * Date: 21.04.12
 * Time: 16:43
 * Packagename: PACKAGE_NAME
 * To change this template use File | Settings | File Templates.
 */
public class Customer {

  private double totalCharge = 0;

  public void rentMovie(int daysRented) {
	totalCharge += Movie.getCharge(daysRented);
	}


  public double getTotalCharge() {
	return totalCharge;
  }
}
