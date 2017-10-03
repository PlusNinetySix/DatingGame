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
		mo=m;
		day=d;
		yr=y;
		wk=dow;
	}
	
	public void tomorrow() 
	{
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
	
	public void yesterday() 
	{
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
	
	public String toString()
	{
		return days[wk] + " " + months[mo-1] + " " + day + ", " + yr;
	}

}
