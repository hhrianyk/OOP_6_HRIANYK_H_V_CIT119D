/**
 * @author <Георгiй>
 *
 */
package ua.khpi.oop.Hrianyk13;

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
		
	public void setName(String name)               {if(Regex.Name(name)) this.Name = name; }
    public void setLastname(String lastname)       {if(Regex.Name(lastname)) this.Lastname = lastname;}
	public void setSurname(String surname)         {if(Regex.Name(surname)) this.Surname = surname;}
	public void setDateOfBirth(Date dateOfBirth)   {if(Regex.Data(dateOfBirth.toString())) this.DateOfBirth = dateOfBirth;	}
	public void setDatesOfConvictions(Date datesOfConvictions,int a)         { this.DatesOfConvictions[a] = datesOfConvictions;}
	public void setDatesOfConvictions(Date[] datesOfConvictions )            { this.DatesOfConvictions = datesOfConvictions;}
	public void setDateOfLastImprisonment(Date dateOfLastImprisonment)       {if(Regex.Data(dateOfLastImprisonment.toString())) this.DateOfLastImprisonment = dateOfLastImprisonment;}
	public void setDateOfLastreLease(Date dateOfLastreLease)                 {if(Regex.Data(dateOfLastreLease.toString())) this.DateOfLastreLease = dateOfLastreLease;	}
	public void  setIndexDatesOfConvictions(int size) {this.IndexDatesOfConvictions=size-1;}
	/////////////////////////////////////////////////////

 
	public void show() {
		System.out.printf("|%11s|%17s|%15s|%15s|%15s|%21s|%13s|",this.Name,this.Surname,this.Lastname,
			  this.DateOfBirth.toString(),
			  this.DateOfLastImprisonment.toString(),
			   this.DateOfLastreLease.toString(),
			   this.DatesOfConvictions[0].toString());
			  for (int i=1;i<IndexDatesOfConvictions+1;i++)
			  {
			 System.out.printf("\n|           |                 |               |               |               |                     |%13s|" ,this.DatesOfConvictions[i].toString());
			  }
			  System.out.print( "\n+-----------+-----------------+---------------+---------------+---------------+---------------------+-------------+\n");
			  
	 }
	public void printTableHead()
	{
		System.out.print( "\n\n+-----------+-----------------+---------------+---------------+---------------+---------------------+-------------+\n" +
	                        "|   Ім'я    |   По-батькові   |  Прізвище     |     дата      |     дата      |        дата         |    дати     |\n" +
		                    "|           |                 |               |  народження   |     ОПВ       |останнього звільнення|  судимостей |\n"+
		                     "+-----------+-----------------+---------------+---------------+---------------+---------------------+-------------+\n");
	}

	
	
	
	public static PoliceFile Openf(PoliceFile  add,String openf){
		Date date =new Date();
		int  j=0,n=2;
		String value1=new String() , value2=new String(), value3=new String(), value4=new String();
    
 
/////////////////////////
		 for(;openf.charAt(j)!=58;j++) {}
         j++;
             for(;openf.charAt(j)!=59;j++)
			 value1+=openf.charAt(j);
		      add.setName(value1);
		      for(;openf.charAt(j)!=58;j++) {}
                j++;
                value1=new String();
/////////////////////
		 
             for(;openf.charAt(j)!=59;j++)
       	     value1+=openf.charAt(j);
             
   		     {add.setSurname(value1);}
             for(;openf.charAt(j)!=58;j++) {}
              j++;
              value1=new String();
//////////////////////////
		 
			  for(;openf.charAt(j)!=59;j++)
					 value1+=openf.charAt(j);
			  
	   		   {add.setLastname(value1);}
	        for(;openf.charAt(j)!=58;j++) {}
            j++;
            value1=new String();
/////////////////////////////
		  for(;openf.charAt(j)!=59;j++)
				 value1+=openf.charAt(j);
		 
		    
		  int i=0;
             n=2;
             if (Regex.Data(value1)==false) {System.out.println(value1+"Помилка вводу\n " ); ;}
              else{			 
			for(;i<n;i++)
				value2+=value1.charAt(i);
 			if(value1.charAt(i)<58&&value1.charAt(i)>48)n=4;
			else {i++ ; n=5;}
			for(;i<n;i++)
				value3+=value1.charAt(i);
			if(value1.charAt(i)<58&&value1.charAt(i)>48)n=8;
			else {i++ ; n=10;}
			for(;i<n;i++)
				value4+=value1.charAt(i);
		
			date.setDay(Integer.parseInt(value2));
			date.setMoon(Integer.parseInt(value3));
			date.setYear(Integer.parseInt(value4));
			add.setDateOfBirth((Date) date.clone());
		    }
		    for(;openf.charAt(j)!=58;j++) {}
            j++;
            value1=new String();

		 
/////////////////////////
			  for(;openf.charAt(j)!=59;j++)
					 value1+=openf.charAt(j);
		
		if (Regex.Data(value1)==false) {System.out.println(value1+"Помилка вводу\n " ); ;}
		     else{
			 i=0;n=2;
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
			add.setDateOfLastImprisonment((Date) date.clone());
		     }
	        for(;openf.charAt(j)!=58;j++) {}
            j++;
            value1=new String();
		/////////////////////////
		    for(;openf.charAt(j)!=59;j++)
				 value1+=openf.charAt(j);
		    if (Regex.Data(value1)==false) {System.out.println(value1+"Помилка вводу\n " ); ;}
  		     else{
		    i=0; n=2;
			 
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
  		     }
	        for(;openf.charAt(j)!=58;j++) {}
            j++;
            value1=new String();
		    
//////!//////////////////////////
				  int size=1,index=0;
            while (openf.length()>=j+1&&openf.charAt(j)!=59) 
	     {
					 
                   for(;openf.charAt(j)!=32 && openf.charAt(j)!=59;j++)
						 value1+=openf.charAt(j);
                   if (Regex.Data(value1)==false) {System.out.println(value1+"Помилка вводу\n " ); ;}
         		     else{
		            i=0;n=2;
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
					date.setYear(Integer.parseInt(value4));}
					add.setDatesOfConvictions((Date) date.clone(),index);
				     
				    add.setIndexDatesOfConvictions(size);
				    index++;size++;
         		     j++;
				    value1=new String();
					 
		 }
				  
				return add;
 }
		 
	 

   
	public  String  toString()
	{
		String s=new String();
		 s+="Name:"+ getName()+"; Surname:" +getSurname()+"; Lastname:"+getLastname()+
				  "; ДН:"+getDateOfBirth().getDay()+"."+getDateOfBirth().getMoon()+"."+getDateOfBirth().getYear()+
				  "; ОПВ:"+getDateOfLastImprisonment().getDay()+"."+getDateOfLastImprisonment().getMoon()+"."+getDateOfLastImprisonment().getYear()+
				   "; ОЗ:"+getDateOfLastreLease().getDay()+"."+getDateOfLastreLease().getMoon()+"."+getDateOfLastreLease().getYear()+
				   "; ДС:"+DatesOfConvictions[0].getDay()+"."+DatesOfConvictions[0].getMoon()+"."+DatesOfConvictions[0].getYear()+"  ";
				  for (int i=1;i<=getIndexDatesOfConvictions();i++)
				  {
				  s+=DatesOfConvictions[i].getDay()+"."+DatesOfConvictions[i].getMoon()+"."+DatesOfConvictions[i].getYear()+"  ";
				  }
				 s+=";";
					   
     	  	return s;
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
		     while (Regex.Name(value1)==false) {System.out.println("Помилка вводу\n Спробуйте ще раз" );value1=in.next();}
		     add.setName(value1);
		     System.out.println("додано" );
		      if(k!=8) break;
/////////////////////
		case 2:
			 System.out.print("Введiть по-батькові : ");
			 value1=in.next();
			 while (Regex.Name(value1)==false) {System.out.println("Помилка вводу\n Спробуйте ще раз" );value1=in.next();}
              add.setSurname(value1);
			 System.out.println( "додано");
			 if(k!=8) break;	
//////////////////////////
		case 3: 
			System.out.print("Введiть призвіще : ");
			value1=in.next();
			while (Regex.Name(value1)==false) {System.out.println("Помилка вводу\n Спробуйте ще раз" );value1=in.next();}
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
			while (Regex.Data(value1)==false) {System.out.println("Помилка вводу\n Спробуйте ще раз" );value1=in.next();}
			for(;i<n;i++)
				value2+=value1.charAt(i);
 			if(value1.charAt(i)<58&&value1.charAt(i)>48)n=4;
			else {i++ ; n=5;}
			for(;i<n;i++)
				value3+=value1.charAt(i);
			if(value1.charAt(i)<58&&value1.charAt(i)>48)n=8;
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
            int size;
			if(updata==false)
			{
			System.out.print( "Введiть кількість дат судимостей: "); 
			 size=in.nextInt();
			}
			else   size=DatesOfConvictions.length;
			System.out.print( "Введiть дати судимостей(dd.mm.yyyy): ");
			for (int idex=0 ;idex <size; idex++)
			{i=1;n=2;
			System.out.print( "Дата "+(idex+1)+":");
			value1=in.next();
			while (Regex.Data(value1)==false) {System.out.println("Помилка вводу\n Спробуйте ще раз" );value1=in.next();}
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
			add.setDatesOfConvictions((Date) date.clone(),idex);
		    System.out.println(  " додано" );
		    setIndexDatesOfConvictions(size);
			}
		if(k!=8) break;
/////////////////////////
		case 6:
		i=0;n=2;
		
			System.out.print( "Введiть дату останнього позбавлення волі(dd.mm.yyyy): ");
			value1=in.next();
			while (Regex.Data(value1)==false) {System.out.println("Помилка вводу\n Спробуйте ще раз" );value1=in.next();}
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
			add.setDateOfLastImprisonment((Date) date.clone());
		    System.out.println("додано" );
		    if(k!=8) break;
		/////////////////////////
		case 7:
		    i=0; n=2;
			System.out.print( "Введiть дату останнього звільнення(dd.mm.yyyy): ");
			value1=in.next();
			while (Regex.Data(value1)==false) {System.out.println("Помилка вводу\n Спробуйте ще раз" );value1=in.next();}
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

}
