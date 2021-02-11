package ua.khpi.oop.Hrianyk12;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Comparator;
import java.util.Scanner;

 

 
 
public class Helper {
	
	private static Scanner in = new Scanner(System.in);

	public static ContainerList<PoliceFile> WaysToAddData(ContainerList<PoliceFile> A) /// Спосб додавання елементів
	{
		
 		int  a;
		System.out.print("\n 1: З клавiатири\n 2: 3 Файлу\n Ваш вiбiр:   ");
		a=in.nextInt();
		switch (a)
		{
		case 1:
			add_from_keyboard(A);
			break;
		case 2:
			A=Console_program.serializator.deserializtionXML();
			break;
			
		}
		return A;
	}
	////////////////////////////////////////////////////////
    private static ContainerList<PoliceFile>  add_from_keyboard(ContainerList<PoliceFile> A )
		{
		  
    	int  a;
    	 
    	System.out.print("\n Скільки ви плануєте додати в'язнів: ");
		int n=in.nextInt();
		System.out.print("\n Додати:\n 1: В початок \n 2: В кінець \n 3: ? \nВаш вiбiр:   ");
		a=in.nextInt();
		for(int i=0;i<n;i++)
		{
			PoliceFile  add_from_keyboard=new PoliceFile();
			add_from_keyboard.EL(add_from_keyboard,false);
		  switch (a)
		  {
		case 1:
			A.addOnBack(add_from_keyboard);
			break;
		case 2:
			A.add(add_from_keyboard);
			break;
		 
		  }System.out.print("\n!записанo!\n");
		} System.out.print("\nВашi данi успiшно записанi\n");
		return A;
	}
    ///////////////////////////////////////////////////////	   
    public static void  show(ContainerList<PoliceFile> List)
		{
			 PoliceFile PF=new PoliceFile();
			PF.printTableHead();
			
			for (var L:List) {
                   L.show();
		}
	}
    ////////////////////////////////////////////////////////////////////////   
    public static void posuk(ContainerList<PoliceFile> List)////  пошуку
  	 {
  		 if (List.size()==0) {
  			 System.out.print("Список пустий");
  			 return ;	
  		 }
  		 String text=new String();
  		 System.out.print("Шукати:\n"+
  		                  "  1. Імя\n"+
  				          "  2. по-Батькові\n"+
  		                  "  3. Прізвище\n"+
  				          "  4. Index\n"+
  				          "in: ");
  		 int a=in.nextInt();
   		 int i=0;
                   switch(a)
                   {
                   case 1:
              		 System.out.print("Введіть Імя : ");
             			 text=in.next();
           			
             	 for (var L:List)
             	 { 
           	          if (L.getName().equals(text))    
           	        	  {
           	        	  System.out.print("Позиція вашаго елемента: "+i+"\n");
           	        	  L.printTableHead();
          	        	  L.show();
           	        	  return ;
           	        	  }i++;
                   }
           	        System.out.print("Ваш елемент незнайденo");
                  	 break;
                   case 2:
              		 System.out.print("Введіть по-Батькові : ");
           			 text=in.next();
           			
                 	 for (var L:List)
                 	 { 
               	          if (L.getSurname().equals(text))    
               	        	  {
               	        	  System.out.print("Позиція вашаго елемента: "+i+"\n");
               	        	  L.printTableHead();
              	        	  L.show();
               	        	  return ;
               	        	  }i++;
                       }
           	        System.out.print("Ваш елемент незнайденo");
                  	 break;
                   case 3:
              		 System.out.print("Введіть прізвище : ");
                		 text=in.next();
           			
                     	 for (var L:List)
                     	 { 
                   	          if (L.getLastname().equals(text))    
                   	        	  {
                   	        	  System.out.print("Позиція вашаго елемента: "+i+"\n");
                   	        	  L.printTableHead();
                  	        	  L.show();
                   	        	  return ;
                   	        	  }i++;
                           }
           	        System.out.print("Ваш елемент незнайденo");
                  	 break;
                   case 4:
              		 System.out.print("Введіть index : ");
                		 a=in.nextInt();
                	 try 
                   	  {              		 
                		 System.out.print("\n\n");
                  	     List.getNode(a).show();
                	  }
                		 catch(Exception e)	     {   System.out.print("Ваш елемент незнайденo");}
                  	 break;
                   }
  	        		
  	 }
       
    //////////////////////////////////
  	public static void UpdateData(ContainerList<PoliceFile> List ){
  		 int size=List.size();
  		 if (size==0) 
  		 {
  		 System.out.print("\n\n Список пустий\n\n");
		 return;
		 }
  		 
  		 System.out.print("Введть індекс: ");
		 int index=in.nextInt();
 		 if(index<1||index>size) 
		 {
			 System.out.print("\nТакого злочинця незнайдено\n");
			 return;
		 }
		 PoliceFile PF=List.getNode(index);
		 PF.show();
		  List.Substitute(PF.EL(PF,true), index);
		  
	 }
	public static void romove(ContainerList<PoliceFile> List) {
 		 if (List.size()==0) 
 		 {
 		 System.out.print("\n\n Список пустий\n\n");
		 return;
		 }
 		System.out.print("\nВведіть номер плануєе видалити?: ");
		int n=in.nextInt();
         List.removeNode(n);
		
	}
 
/////////////////////////////////////////////////////////////////////////
    public static void Sort(ContainerList<PoliceFile> List)//// помилку пошуку
	 {
		 int size=List.size();
		 if (size==0) {
			 System.out.print("Cписок пустий");
			 return ;	
		 }
		 System.out.print("Сортувати:\n"+
		                  "  1. Ім`я\n"+
				          "  2. по-Батькові\n"+
		                  "  3. Прізвище\n"+
				          "  4. датою народження\n"+
		                  "  5. датою останнього позбавлення волі\n"+
				          "  6. датою останнього звільнення\n"+
				           "in: ");
		 
 		 int a=in.nextInt();
 
 
		          switch(a)
                 {
                 case 1:
                	 List.sort(new Comparator<PoliceFile>() {
         	            
         	            public int compare(PoliceFile o1, PoliceFile o2) {
         	               return  comparison (o1.getName(), o2.getName());
         	            }
         	        });
                 	 break;
                 case 2:
                	 List.sort(new Comparator<PoliceFile>() {
         	            @Override
         	            public int compare(PoliceFile o1, PoliceFile o2) {
         	              
         	               return  comparison(o1.getSurname(), o2.getSurname()) ; 
         	                
         	            }
         	        });
            	 break;

                 case 3:
                	 List.sort(new Comparator<PoliceFile>() {
         	            @Override
         	            public int compare(PoliceFile o1, PoliceFile o2) {
         	                  return comparison(o1.getLastname(), o2.getLastname());
         	            }
         	        });
            	 break;
                 case 4:
                	 List.sort(new Comparator<PoliceFile>() {
         	            @Override
         	            public int compare(PoliceFile o1, PoliceFile o2) {
         	                  return comparison(o1.getDateOfBirth(), o2.getDateOfBirth());
         	            }
         	        });
            	 break;
                 case 5:
                	 List.sort(new Comparator<PoliceFile>() {
         	            @Override
         	            public int compare(PoliceFile o1, PoliceFile o2) {
         	                  return comparison(o1.getDateOfLastImprisonment(), o2.getDateOfLastImprisonment());
         	            }
         	        });
            	 break;
                 case 6:
                	 List.sort(new Comparator<PoliceFile>() {
         	            @Override
         	            public int compare(PoliceFile o1, PoliceFile o2) {
         	                  return comparison(o1.getDateOfLastreLease(), o2.getDateOfLastreLease());
         	            }
         	        });
            	 break;
                 }
			 

			System.out.print(" *сортування завершено ");
	 }
	///////////////////////////////////////////////////////////////// 
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
	public static ContainerList<PoliceFile> ReadFile(ContainerList<PoliceFile> List)
	{
		FileReader fr=null;
		try {
			fr = new FileReader( "12.txt" );
			 Scanner scan = new Scanner(fr);
			 
		        while (scan.hasNextLine()) {
		        	String s=scan.nextLine();
		           if(Regex.LitePF(s))
		           {   
		        	   List.add(PoliceFile.Openf(new PoliceFile(),s) );
		           }
		        }
			
		} catch(FileNotFoundException e) {e.printStackTrace();}
        catch (IOException e) {e.printStackTrace();	}
		catch(Exception e)	{;}
		  finally { 
	    	//if(ois!=null) 
    		{try { fr.close(); } catch (IOException e) {e.printStackTrace();}}
    }
		return List;
       
		
	}
////////////////////////////////////////////////////////////////////
	public static String AppliedTask(ContainerList<PoliceFile> List)
	{
		Boolean flag =true;
		String s=new String();
		for (var PF : List)
		{
			
			if (Regex.KoNameNotYoung(PF.toString()))
			{
					 s+=PF.toString()+"\n";
					 flag=false;
			}
	    }if(flag)s="Незнайдено";
		return s;
 
	}
	public static ContainerList<PoliceFile> AppliedTaskC (ContainerList<PoliceFile> List)
	{ 
		ContainerList<PoliceFile> CPF=new ContainerList<PoliceFile>();
		String s=new String();
		for (var PF : List)
		{
			if (Regex.KoNameNotYoung(PF.toString()))
				CPF.add(PF);
	    }
		return CPF;
 
	}
	
}
