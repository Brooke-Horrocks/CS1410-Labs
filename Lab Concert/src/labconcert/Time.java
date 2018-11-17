/**
* Assignment Lab Concert
* Program: Time
* Programmer: Brooke Horrocks
* Date: May 17, 2018
*/


package labconcert;

/**
 * @author Brooke
 *
 */
public class Time
{
	private int hours;
	private int minutes;
	private int seconds;

	/* 
	 * Time Constructor
	 * @param h
	 * @param m
	 * @param s
	 */
	public Time(int h, int m, int s)
	{
		setTime(h, m, s);
	}

	/* 
	 * No arg Time Constructor
	 */
	public Time()
	{
	}

	public void setHours(int h)
	{
		hours = ((h >= 0 && h < 24) ? h : 0);
	}

	public void setMinutes(int m)
	{
		minutes = ((m >= 0 && m < 60) ? m : 0);
	}

	public void setSeconds(int s)
	{
		seconds = ((s >= 0 && s < 60) ? s : 0);
	}

	public void setTime(int h, int m, int s)
	{
		setHours(h);
		setMinutes(m);
		setSeconds(s);
	}

	public String toMilitary()
	{
		return String.format("%02d:%02d:%02d", hours, minutes, seconds);
	}

	@Override
	public String toString()
	{
		return String.format("%d:%02d:%02d %s",
				(hours == 0 || hours == 12) ? 12 : hours % 12, minutes,
				seconds, (hours < 12) ? "AM" : "PM");
	}

}
