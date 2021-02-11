/**
 * @author <Георгiй>
 *
 */
package ua.khpi.oop.Hrianyk09;

import java.io.Serializable;
import java.util.Scanner;

 

public class PoliceFile implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public static Scanner in = new Scanner(System.in);
	
    private String Name;  ///Name
    private String Surname;   /// По-батькові 
    private String Lastname;  ///прізвище
    private Date DateOfBirth;/// dd.mm.yyyy              дата народження;
    public Date DatesOfConvictions[];/// dd.mm.yyyy       дати судимостей 
    private int IndexDatesOfConvictions;/// dd.mm.yyyy       index дати судимостей
    private Date DateOfLastImprisonment;/// dd.mm.yyyy   дата останнього позбавлення волі;
    private Date DateOfLastreLease;/// dd.mm.yyyy        дата останнього звільнення.
    
	public PoliceFile(String Name,String Surname,String Lastname,Date DateOfBirth,Date DatesOfConvictions,Date DateOfLastImprisonment,Date DateOfLastreLease) {
		this.Name=Name;	
		this.Surname=Surname;
		this.Lastname=Lastname;
		this.DateOfBirth=DateOfBirth;
		this.DatesOfConvictions[0]=DatesOfConvictions;
		this.IndexDatesOfConvictions=0;
		this.DateOfLastImprisonment=DateOfLastImprisonment;
		this.DateOfLastreLease=DateOfLastreLease;
	}
	public PoliceFile() {
		this.Name="EROR";
		this.Lastname="EROR";
		this.Surname="EROR";
		this.DateOfBirth=new Date(); 
		this.DatesOfConvictions=new Date[255];
		this.IndexDatesOfConvictions=-1;
		this.DateOfLastImprisonment=new Date();
		this.DateOfLastreLease=new Date();
	}
	public PoliceFile(PoliceFile h) {
 
	}

	public String   getName()                   {return Name;}
    public String   getLastname()               {return Lastname;}
    public String   getSurname()                {return Surname;}
    public Date   getDateOfBirth()              {return DateOfBirth;}
	public Date   getDatesOfConvictions(int a)  {return DatesOfConvictions[a];	}
	public Date   getDateOfLastImprisonment()   {return DateOfLastImprisonment;}
	public Date   getDateOfLastreLease()        {return DateOfLastreLease;	}
	public int    getIndexDatesOfConvictions()	{return IndexDatesOfConvictions;}
		
	public void setName(String name)               {this.Name = name;}
    public void setLastname(String lastname)       {this.Lastname = lastname;}
	public void setSurname(String surname)         {this.Surname = surname;}
	public void setDateOfBirth(Date dateOfBirth)   {this.DateOfBirth = dateOfBirth;	}
	public void setDatesOfConvictions(Date datesOfConvictions,int a)         {this.DatesOfConvictions[a] = datesOfConvictions;}
	public void setDatesOfConvictions(Date[] datesOfConvictions )            {this.DatesOfConvictions = datesOfConvictions;}
	public void setDateOfLastImprisonment(Date dateOfLastImprisonment)       {this.DateOfLastImprisonment = dateOfLastImprisonment;}
	public void setDateOfLastreLease(Date dateOfLastreLease)                 {this.DateOfLastreLease = dateOfLastreLease;	}
	public void  setIndexDatesOfConvictions(int size) {this.IndexDatesOfConvictions=size;}
	/////////////////////////////////////////////////////

 
	public void show() {
		System.out.printf("|%11s|%17s|%13s|%7d.%d.%d|%7d.%d.%d|%13d.%d.%d|%6d.%d.%d|",this.Name,this.Surname,this.Lastname,
			  this.DateOfBirth.getDay(),this.DateOfBirth.getMoon(),this.DateOfBirth.getYear(),
			  this.DateOfLastImprisonment.getDay(),this.DateOfLastImprisonment.getMoon(),this.DateOfLastImprisonment.getYear(),
			   this.DateOfLastreLease.getDay(),this.DateOfLastreLease.getMoon(),this.DateOfLastreLease.getYear(),
			   this.DatesOfConvictions[0].getDay(),this.DatesOfConvictions[0].getMoon(),this.DatesOfConvictions[0].getYear());
			  for (int i=1;i<=IndexDatesOfConvictions;i++)
			  {
			 System.out.printf("\n|           |                 |             |               |               |                     |%6d.%d.%d|" ,this.DatesOfConvictions[i].getDay(),this.DatesOfConvictions[i].getMoon(),this.DatesOfConvictions[i].getYear());
			  }
			  System.out.print( "\n----------------------------------------------------------------------------------------------------------------------\n");
			  
	 }
	public void printTableHead()
	{
		System.out.print( "\n\n---------------------------------------------------------------------------------------------------------------------\n" +
	                        "|   Ім'я    |   По-батькові   |  Прізвище   |     дата      |     дата      |        дата         |     дати     |\n" +
		                    "|           |                 |             |  народження   |     ОПВ       |останнього звільнення|   судимостей |\n"+
		                     "----------------------------------------------------------------------------------------------------------------------\n");
	}

	PoliceFile EL(PoliceFile  add,boolean updata){
		Date date =new Date();
		int  i=0,n=2;
		String value1=new String() , value2=new String(), value3=new String(), value4=new String();
 int a=1,k=8;
 if(updata==true) {
          System.out.print( "1. Імя\n"+
                           "2. по-Батькові\n"+
        		           "3. Прізвищеn\n"+
                           "4. Дата народження\n"+
        		           "5. Дати судимостей\n"+
                           "6. Дата останнього позбавлення волі\n"+
        		           "7. Дата останнього звільнення\n"+
                           "8. Все\n"+
        		           "Ваш вибір\n") ;
        		  k=in.nextInt();
 if (k!=8)a=k; else a=1; 
 } 
		switch(a) {
/////////////////////////
		case 1:
			 System.out.print( "Введiть ім'я злочинця : ");
			 value1=in.next();
             System.out.println("додано" );
		     add.setName(value1);
		     if(k!=8) break;
/////////////////////
		case 2:
			 System.out.print("Введiть по-батькові : ");
			 value1=in.next();
              add.setSurname(value1);
			 System.out.println( "додано");
			 if(k!=8) break;	
//////////////////////////
		case 3: 
			System.out.print("Введiть призвіще : ");
			value1=in.next();
			add.setLastname(value1);
			System.out.println( "додано");
			if(k!=8) break;
/////////////////////////////
		case 4:
             i=0;
             n=2;
             value1=null;
			System.out.print( "Введiть дату народження(dd.mm.yyyy) : ");
			value1=in.next();
			for(;i<n;i++)
				value2+=value1.charAt(i);
 			if(value1.charAt(i)>58&&value1.charAt(i)>48)n=4;
			else {i++ ; n=5;}
			for(;i<n;i++)
				value3+=value1.charAt(i);
			if(value1.charAt(i)>58&&value1.charAt(i)>48)n=8;
			else {i++ ; n=10;}
			for(;i<n;i++)
				value4+=value1.charAt(i);
		
			date.setDay(Integer.parseInt(value2));
			date.setMoon(Integer.parseInt(value3));
			date.setYear(Integer.parseInt(value4));
			add.setDateOfBirth((Date) date.clone());
		    System.out.println(  " додано" );
		    if(k!=8) break;
////////////////////////////////
		case 5:
 
			System.out.print( "Введiть кількість дат судимостей: ");
			 
			int size=in.nextInt();
			
			System.out.print( "Введiть дати судимостей(dd.mm.yyyy): ");
			for (int idex=0 ;idex <size; idex++)
			{i=1;n=2;
			System.out.print( "Дата "+(idex+1)+":");
			value1=in.next();
			value2=Character.toString(value1.charAt(i++));
			for(;i<n;i++)
				value2+=value1.charAt(i);
 			if(value1.charAt(i)>58&&value1.charAt(i)>48)n=4;
			else {i++ ; n=5;}
 			value3=Character.toString(value1.charAt(i++));
			for(;i<n;i++)
				value3+=value1.charAt(i);
			if(value1.charAt(i)>58&&value1.charAt(i)>48)n=8;
			else {i++ ; n=10;}
			value4=Character.toString(value1.charAt(i++));
			for(;i<n;i++)
				value4+=value1.charAt(i);
			date.setDay(Integer.parseInt(value2));
			date.setMoon(Integer.parseInt(value3));
			date.setYear(Integer.parseInt(value4));
			add.setDatesOfConvictions((Date) date.clone(),idex);
		    System.out.println(  " додано" );
		    setIndexDatesOfConvictions(idex);
			}
		if(k!=8) break;
/////////////////////////
		case 6:
		i=0;n=2;
		
			System.out.print( "Введiть дату останнього позбавлення волі(dd.mm.yyyy): ");
			value1=in.next();
			value2=Character.toString(value1.charAt(i++));
			for(;i<n;i++)
				value2+=value1.charAt(i);
 			if(value1.charAt(i)>58&&value1.charAt(i)>48)n=4;
			else {i++ ; n=5;}
 			value3=Character.toString(value1.charAt(i++));
			for(;i<n;i++)
				value3+=value1.charAt(i);
			if(value1.charAt(i)>58&&value1.charAt(i)>48)n=8;
			else {i++ ; n=10;}
			value4=Character.toString(value1.charAt(i++));
			for(;i<n;i++)
				value4+=value1.charAt(i);	
			date.setDay(Integer.parseInt(value2));
			date.setMoon(Integer.parseInt(value3));
			date.setYear(Integer.parseInt(value4));
			add.setDateOfLastImprisonment((Date) date.clone());
		    System.out.println("додано" );
		    if(k!=8) break;
		/////////////////////////
		case 7:
		    i=0; n=2;
			System.out.print( "Введiть дату останнього звільнення(dd.mm.yyyy): ");
			value1=in.next();
			 
			value2=Character.toString(value1.charAt(i++));
			for(;i<n;i++)
				value2+=value1.charAt(i);
 			if(value1.charAt(i)<58&&value1.charAt(i)>48)n=4;
			else {i++ ; n=5;}
 			value3=Character.toString(value1.charAt(i++));
			for(;i<n;i++)
				value3+=value1.charAt(i);
			if(value1.charAt(i)<58&&value1.charAt(i)>48)n=8;
			else {i++ ; n=10;}
			value4=Character.toString(value1.charAt(i++));
			for(;i<n;i++)
				value4+=value1.charAt(i);	
			date.setDay(Integer.parseInt(value2));
			date.setMoon(Integer.parseInt(value3));
			date.setYear(Integer.parseInt(value4));
			add.setDateOfLastreLease((Date) date.clone());
		    System.out.println("додано" );
             if(k!=8) break;
	        }
		return add;
	}

   
	public  String  toString()
	{
		String s=new String();
		 
		   
		 
			 s+="Name: "+ getName()+"; Surname: " +getSurname()+"; Lastname: "+getLastname()+
					  "; ДН: "+getDateOfBirth().getDay()+"."+getDateOfBirth().getMoon()+"."+getDateOfBirth().getYear()+
					  "; ОПВ: "+getDateOfLastImprisonment().getDay()+"."+getDateOfLastImprisonment().getMoon()+"."+getDateOfLastImprisonment().getYear()+
					   "; ОЗ: "+getDateOfLastreLease().getDay()+"."+getDateOfLastreLease().getMoon()+"."+getDateOfLastreLease().getYear()+
					   "; ДС:"+DatesOfConvictions[0].getDay()+"."+DatesOfConvictions[0].getMoon()+"."+DatesOfConvictions[0].getYear()+"  ";
					  for (int i=1;i<=getIndexDatesOfConvictions();i++)
					  {
					  s+=DatesOfConvictions[i].getDay()+"."+DatesOfConvictions[i].getMoon()+"."+DatesOfConvictions[i].getYear()+"  ";
					  }
					 s+=( "\n----------------------------------------------------------------------------------------------------------------------\n");
					   
     	  	return s;
	}
	
}
