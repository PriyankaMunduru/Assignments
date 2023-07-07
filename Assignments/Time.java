class Time{
public static void main(String[] args){
Times t=new Times();
t.sethours(10);
t.setminutes(59);
t.setseconds(19);


System.out.println(t.showhours()+":"+t.showminutes()+":"+t.showseconds());


	
}
}	
class Times{
int hours;
int minutes;
int seconds;
public void sethours(int hours)
	{
	this.hours=validatehours(hours);
	}
public void setminutes(int minutes)
	{
	this.minutes=validateminutes(minutes);
	}
public void setseconds(int seconds)
	{
	this.seconds=validateseconds(seconds);
	}
private int validatehours(int hours)
	{
	return hours>0 & hours<=24? hours : 0;
	}
private int validateminutes(int minutes)
	{
	return minutes>=0 & minutes<=59? minutes : 0;
	}
private int validateseconds(int seconds)
	{
	return seconds>=0 & seconds<=59? seconds : 0;
	}
public int increamenthours()
	{if (hours==23 && minutes==59)
	{
		hours=0;
	}
	else
		{if (minutes==59 && seconds==59)
		{
		hours=hours+1;
		}

	
		
		
	}
	return hours;
	}
public int increamentminutes()
	{if(minutes==59 && seconds==59)
	{
		increamenthours();
		minutes=0;

		
	}
	else 
	{
		if(seconds==59)
		{
			minutes+=1;
		}
		else return minutes;
	}
	return minutes;
}
	
public int increamentseconds()
	{if(seconds==59)
		{
		seconds=0;
		increamentminutes();
		}
	else 
		{ seconds+=1;
		
		}
	return seconds;
	}
	
public int showhours(){
	return increamenthours();
	}
public int showminutes(){
	return increamentminutes();
	}
public int showseconds(){
	return increamentseconds();
	}
}




