//JGore
//Hayden N. Walters

package g;

public class MyDate implements DateInterface
{
	/**
	 * @author JGore and Hayden N. Walters
	 * This program is used to calculate the day of the week for a certain date.
	 * @param day This is for setting the day of the week.
	 * @param wk This is for setting the week number.
	 * @param yr This is for setting the year number.
	 * @param mo This is for setting the month number.
	 * @param days This is a string array containing the days of the week.
	 * @param months This is a string array containing the months.
	 * 
	 */
	static int yr;
	static int mo;
	static int day;
	static int wk;
	static String[] days = {"Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"};
	static String[] months = {"January","February","March","April","May","June","July","August","September","October","November","December"};
	/**
	 * Gives the specific day.
	 * @return the day.
	 */
	public int getDay() 
	{//Returns the day.
		return day;
	}
	/**
	 * Gives the day (Saturday-Sunday).
	 * @return the day of the week
	 */
	public int getDow() 
	{//Returns the day of the week.
		return wk;
	}
	/**
	 * Gives the month (January-December).
	 * @return the month.
	 */
	public int getMonth() 
	{//Returns the month.
		return mo;
	}
	/**
	 * Gives the year.
	 * @return the year
	 */
	public int getYear() 
	{//Returns the year.
		return yr;
	}
	/**
	 * Sets the variables.
	 */
	public void set(int m, int d, int y, int dow) 
	{//Sets the variables.
		mo=m;
		day=d;
		yr=y;
		wk=dow;
	}
	/**
	 * Checks which month it is, then if it is a leap year and sets the days to 28 or 29 if February. Accounts for days with 30 or 31 days. 
	 */
	public void tomorrow() 
	{//Calculates if its a leap year or not, checks the month if it has 30 or 31 days.
		day++;
		wk++;

		if(mo==2)
		{
			if((yr % 4 == 0) && (yr % 100 != 0) || (yr % 400 == 0))
			{
				if(day>29)
				{
					mo++;
					day=1;
				}
			}
			else
			{
				if(day>28)
				{
					mo++;
					day=1;
				}
			}
		}
		if(mo==1||mo==3||mo==5||mo==7||mo==8||mo==10||mo==12)
		{
			if(day>31)
			{
				mo++;
				if(mo>12)
				{
					yr++;
					mo=1;
				}
				day=1;
			}
		}
		if(mo==4||mo==6||mo==9||mo==11)
		{
			if(day>30)
			{
				mo++;
				day=1;
			}
		}
		if(wk>6)
		{
			wk=0;
		}
	}

	public void today() 
	{
		
	}
	/**
	 * Calculates the the day for the day prior.
	 */
	public void yesterday() 
	{//Calculates the day for the previous day.
		day--;
		wk--;
		if(day<1)
		{
			mo--;
			day=31;
		}
		if(mo<0) 
		{
			yr--;
			mo=12;
		}
		if(wk<0)
		{
			wk=6;
		}
	}
	/**
	 * Outputs the day of the week, day, month and year.
	 */
	public String toString()
	{//Prints out the day, day of the week, month and the year
		return days[wk] + " " + months[mo-1] + " " + day + ", " + yr;
	}

}
