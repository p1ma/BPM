/**
 * 
 */
package CM1;

import java.io.Serializable;

/**
 * @author JUNGES Pierre-Marie - M2 SSSR 2017/2018
 *
 * Sep 22, 2017
 */
public class Date implements Serializable {

	/**
	 * serialVersionUID used to 
	 */
	private static final long serialVersionUID = 1L;
	
	// ATTRIBUTES
	private int day;
	private int month;
	private int year;
	
	/**
	 * Empty constructor
	 */
	public Date() {
		day = 0;
		month = 0;
		year = 0;
	}
	
	/**
	 * 
	 * Constructs a Date. with the given parameters:
	 * @param d - the day
	 * @param m - the month
	 * @param y - the year
	 */
	public Date(int d, int m, int y) {
		day = d;
		month = m;
		year = y;
	}

	/**
	 * @return the day
	 */
	public int getDay() {
		return day;
	}

	/**
	 * @param day the day to set
	 */
	public void setDay(int day) {
		this.day = day;
	}

	/**
	 * @return the month
	 */
	public int getMonth() {
		return month;
	}

	/**
	 * @param month the month to set
	 */
	public void setMonth(int month) {
		this.month = month;
	}

	/**
	 * @return the year
	 */
	public int getYear() {
		return year;
	}

	/**
	 * @param year the year to set
	 */
	public void setYear(int year) {
		this.year = year;
	}

	
}
