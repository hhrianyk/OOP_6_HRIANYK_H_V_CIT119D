/**
 * 
 */
package ua.khpi.oop.Hrianyk11;

import java.io.Serializable;

/**
 * @author Георгiй
 *
 */
public class Date implements Serializable  {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int Day;
    private int Moon;
    private int Year;

	/**
	 * 
	 */
	public Date() {
		this.Day=01;
		this.Moon=01;
		this.Year=1900;
	}
	public Date(int Day,int Moon,int Year ) {
		if(Day<1)this.Day=1;
		else this.Day=Day%31;
		if(Moon<1)this.setMoon(1);
		this.setMoon(Moon%13);
		if(Year<1900)this.setYear(1900);
		else this.setYear(Year);
	}

	public int getDay()  {return Day;   }
	public int getMoon() {return Moon;	}
	public int getYear() {return Year;	}
	
	public void setDay (int day) { if(day<1)this.Day=1;	else if(day>31) this.Day=31; else this.Day=day; 	}
	public void setMoon(int moon) {if(moon<1)this.setMoon(1);else if(moon>12) this.Moon=12; else  this.Moon=moon;}
	public void setYear(int year) {	if(year<1900)this.setYear(1900); else this.Year=year;}

	 public Object clone() 
	 {
	   Date date=new Date();
	   date.Day=this.Day;
	   date.Moon=this.Moon;
	   date.Year=this.Year;
	   return date;
	 }
}
