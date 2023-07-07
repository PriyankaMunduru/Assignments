class Date{
int date;
int month;
int year;
public void setdate(int date)
	{
	this.date=validatedate(date);
	}
public void setmonth(int month)
	{
	this.month=validatemonth(month);
	}
public void setyear(int year)
	{
	this.year=validateyear(year);
	}
private int validatedate(int date)
	{
	return date>0 & date<32? date : 0;
	}
private int validatemonth(int month)
	{
	return month>=0 & month<=12? month : 0;
	}
private int validateyear(int year)
	{
	return year>0? year:0;
	}
public int incrementyear()
	{
	if(month==12 && date==31)
		year=year+1;
	else
		year=year+0;
	return year;
}
public int incrementmonth()
	{
	if(date==31 && (month==1 or month==3 or month==5 or month==7 or month==8 or month==10))
	{
		month=month+1;
	}
	else if(date==30 && (month==4 or month==6 or month==9 or month==11))
	{	month=month+1;
	}
	else if(((year%4==0 && year%100!=0) or (year%400==0)) && ((month==2) && date==29))
	{	month=month+1;
	}
	if( month==12 && date==31 )
	{
		month=01;
		incrementyear();
	}
	else
		month=month+0;
	return month;
}
public int incrementdate()
{
	if(date==31 && (month==1 or month==3 or month==5 or month==7 or month==8 or month==10 or month==12))
		{
		date=01;
		incrementmonth();
		}
	else if(date==30 && (month==4 or month==6 or month==9 or month==11))
		{
		date=01;
		incrementmonth();
		}
	else if(((year%4==0 && year%100!=0) or (year%400==0)) && ((month==2) && (date==29)))
		{
		date=01;
		incrementmonth();
		}
	else
		date=date+1;
	return date;
}

public int showdate(){
	return incrementdate();
	}

public int showmonth(){
	return incrementmonth();
	}
public int showyear(){
	return incrementyear();
	}
}	
