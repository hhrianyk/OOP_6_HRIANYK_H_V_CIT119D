package helper;

 
 
import java.util.Scanner;
import PoliceFile.Date;
 

 

 
 
public class Helper {
	
	private static Scanner in = new Scanner(System.in);
	private static final double DIVIDER = 1_000_000_000;
	
 
 
 
 
/////////////////////////////////////////////////////////////////////////
 
	public static int comparison(String a,String b)
	    {
	    	int len=0;
	    	if(a.length()<b.length())len=a.length();
	    	else len=b.length();
	    	for (int i=0;i<len;i++)
	    	{
	    		if (a.charAt(i)>b.charAt(i)) return 1;
	    		if (a.charAt(i)<b.charAt(i)) return -1;
	    	}
	    	if(a.length()<b.length())return -1;
	    	else if (a.length()>b.length()) return 1;
	    	else return 0;
	    }
	 
	public static int comparison(Date a,Date b)   //0 a=b  1 a>b 2 a<b
    {
    	 
    	if(a.getYear()==b.getYear())
    	{
    	 if(a.getMoon()==b.getMoon())
    	 {
    		 if(a.getDay()==a.getDay()) return 0;
    		 else if( a.getDay()>b.getDay()) return 1;
    	     else return -1;
    	 }
		 else if( a.getMoon()>b.getMoon()) return 1;
	     else return -1;
    	}
    	else if( a.getYear()>b.getYear()) return 1;
    	else return -1;
    	 
    }
//////////////////////////////////////////////////////////////////////
 
 
 
	
 
}
