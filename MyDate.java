//JGore
//Hayden N. Walters

package g;

public class MyDate implements DateInterface
{
	static int yr;
	static int mo;
	static int day;
	static int wk;
	static String[] days = {"Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"};
	static String[] months = {"January","February","March","April","May","June","July","August","September","October","November","December"};

	public int getDay() 
	{
		return day;
	}
	
	public int getDow() 
	{
		return wk;
	}
	
	public int getMonth() 
	{
		return mo;
	}
	
	public int getYear() 
	{
		return yr;
	}

	public void set(int m, int d, int y, int dow) 
	{
		mo = m;
		day=d;
		yr=y;
		wk=dow;
	}
	
	public void tomorrow() 
	{
		day++;
		wk++;
		if(day>31) 
		{
			mo++;
			day=1;
		}
		if(mo>11)
		{
			yr++;
			mo=0;
		}
		if(wk>6)
		{
			wk=0;
		}
	}

	public void today() 
	{
		

	}
	
	public void yesterday() 
	{

	}
	
	public String toString()
	{
		return days[wk] + " " + months[mo] + " " + day + ", " + yr;
	}

}
