/**
 * Created by IntelliJ IDEA.
 * User: Michael
 * Date: 19.04.12
 * Time: 11:23
 * Packagename: PACKAGE_NAME
 * To change this template use File | Settings | File Templates.
 */
public class Euro {
  private final long cents;

  public Euro(double euro) {
	cents = Math.round(euro * 100);
  }

  public double getAmount() {
	return cents / 100.0;
  }

  private Euro(long cents) {
	this.cents = cents;
  }

  public Euro add(Euro other) {
	return new Euro(this.cents + other.cents);
  }
}