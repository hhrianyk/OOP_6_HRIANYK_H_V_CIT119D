/**
 * @author <Георгiй>
 *
 */
package PoliceFile;

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
    private int IndexDatesOfConvictions;///     index дати судимостей
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
	
	public String   getDatesOfConvictions()  {
		
		String s = DatesOfConvictions[0].toString()+"\n";
		for(int i=1;i<IndexDatesOfConvictions;i++)
		{
			s+=DatesOfConvictions[i]+"\n";
		}
		return s;
		}
		
	public void setName(String name)               {if(Regex.Name(name)) this.Name = name; }
    public void setLastname(String lastname)       {if(Regex.Name(lastname)) this.Lastname = lastname;}
	public void setSurname(String surname)         {if(Regex.Name(surname)) this.Surname = surname;}
	public void setDateOfBirth(Date dateOfBirth)   {if(Regex.Data(dateOfBirth.toString())) this.DateOfBirth = dateOfBirth;	}
	public void setDatesOfConvictions(Date datesOfConvictions,int a)         { this.DatesOfConvictions[a] = datesOfConvictions;}
	public void setDatesOfConvictions(Date[] datesOfConvictions, int maxIndex )            { this.DatesOfConvictions = datesOfConvictions;this.IndexDatesOfConvictions=maxIndex;}
	 
	public void setDateOfLastImprisonment(Date dateOfLastImprisonment)       {if(Regex.Data(dateOfLastImprisonment.toString())) this.DateOfLastImprisonment = dateOfLastImprisonment;}
	public void setDateOfLastreLease(Date dateOfLastreLease)                 {if(Regex.Data(dateOfLastreLease.toString())) this.DateOfLastreLease = dateOfLastreLease;	}
	public void  setIndexDatesOfConvictions(int size) {this.IndexDatesOfConvictions=size-1;}
	/////////////////////////////////////////////////////

 
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

	

}
