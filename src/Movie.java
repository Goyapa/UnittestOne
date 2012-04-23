/**
 * Created by IntelliJ IDEA.
 * User: Michael
 * Date: 23.04.12
 * Time: 12:58
 * Packagename: PACKAGE_NAME
 * To change this template use File | Settings | File Templates.
 */
public class Movie {
  static final double BASE_PRICE = 2.00;
  static final double PRICE_PER_DAY = 1.75;
  static final int DAYS_DISCOUNTED = 2;

  public static double getCharge(int daysRented) {
	double result = BASE_PRICE;
	if (daysRented > DAYS_DISCOUNTED){
	  result += ( daysRented - DAYS_DISCOUNTED) * PRICE_PER_DAY;
	}
	return result;
  }
}
