public class DateTime {
	int h,m,s;
	int yyyy,mm,dd;
	DateTime(int h,int m,int s,int yyyy,int mm,int dd){
		this.h = h;
		this.m = m;
		this.s = s;
		this.dd = dd;
		this.mm = mm;
		this.yyyy = yyyy;
	}
	public int compareDateTime(DateTime datetime){
		if(this.yyyy == datetime.yyyy)
			return this.compareMonth(datetime);
		else if(this.yyyy > datetime.yyyy)
			return 1;
		else
			return -1;
	}
	private int compareMonth(DateTime datetime){
		if(this.mm == datetime.mm)
			return this.compareDay(datetime);
		else if(this.mm > datetime.mm)
			return 1;
		else
			return -1;
	}
	private int compareDay(DateTime datetime){
		if(this.dd == datetime.dd)
			return this.compareHour(datetime);
		else if(this.dd > datetime.dd)
			return 1;
		else
			return -1;
	}
	private int compareHour(DateTime datetime){
		if(this.h == datetime.h)
			return this.compareMinute(datetime);
		else if(this.h > datetime.h)
			return 1;
		else
			return -1;
	}
	private int compareMinute(DateTime datetime){
		if(this.m == datetime.m)
			return this.compareSecond(datetime);
		else if(this.m > datetime.m)
			return 1;
		else
			return -1;
	}
	private int compareSecond(DateTime datetime){
		if(this.s == datetime.s)
			return 0;
		else if(this.s > datetime.s)
			return 1;
		else
			return -1;
	}
}
