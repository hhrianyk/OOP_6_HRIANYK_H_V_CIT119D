package ua.khpi.oop.Hrianyk15;
 
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

 

 

 
 
public class Helper {
	
	private static Scanner in = new Scanner(System.in);
	private static final double DIVIDER = 1_000_000_000;
	
	public static ArrayList<PoliceFile> WaysToAddData(ArrayList<PoliceFile> A) throws InterruptedException   /// Спосiб додавання елементів
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
			Obshchak.Choice=2;
			new ProcessProcesses();
			for(;;)
			{
				Thread.sleep(10);
				if(Obshchak.stop==false)break;
			}
	        break;
			
		}
		return A;
	}
	////////////////////////////////////////////////////////
    private static ArrayList<PoliceFile>  add_from_keyboard(ArrayList<PoliceFile> A )
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
			A.add(0,add_from_keyboard);
			break;
		case 2:
			A.add(add_from_keyboard);
			break;
		 
		  }System.out.print("\n!записанo!\n");
		} System.out.print("\nВашi данi успiшно записанi\n");
		return A;
	}
    /////////////////////////////////////////////////////
	public static void ReadFile( )
	{
		FileReader fr=null;
		try {
			fr = new FileReader( "15.txt" );
			 Scanner scan = new Scanner(fr);
			 
		        while (scan.hasNextLine()) {
		        	String s=scan.nextLine();
		           if(Regex.LitePF(s))
		           {   
		        	 Obshchak.List.add(PoliceFile.Openf(new PoliceFile(),s) );
		           }
		        }
			
		} catch(FileNotFoundException e) {e.printStackTrace();}
        catch (IOException e) {e.printStackTrace();	}
		catch(Exception e)	{;}
		  finally { 
	    	//if(ois!=null) 
    		{try { fr.close(); } catch (IOException e) {e.printStackTrace();}}
            }
	 	
	}
    
    ///////////////////////////////////////////////////////	   
    public static  void  show(ArrayList<PoliceFile> List )
		{
 
			 PoliceFile PF=new PoliceFile();
			PF.printTableHead();
			
			for (var L:List) {
                   L.show();
		}
			 
	}
 
    //////////////////////////////////
  	public static void UpdateData(ArrayList<PoliceFile> List ){
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
		 PoliceFile PF=((ArrayList<PoliceFile>) List).get(index);
		 PF.show();
		  ((ArrayList<PoliceFile>) List).add( index,PF.EL(PF,true));
		  
	 }
	public static void romove( ) {/////видаленння ///thread ///time here
 		 if (Obshchak.List.size()==0) 
 		 {
 		 System.out.print("\n\n Список пустий\n\n");
 		Obshchak.stop=true;
		 return;
		 }
 		System.out.print("\nВведіть номер плануєе видалити?: ");	
		int n=in.nextInt();
		Obshchak.stop=true;
		long start = System.nanoTime();
		Thread.currentThread().setName("romove");
		Obshchak.stop=false;
		Obshchak.List.remove(n);
		System.out.print("\n"+Thread.currentThread().getName()+" - закінчив роботу; "+"Тривалість роботи: "+ (System.nanoTime() - start) / DIVIDER+"\n");
	}
 
/////////////////////////////////////////////////////////////////////////
    @SuppressWarnings("unchecked")
	public static void Sort() //  ///thread  ///time here
	 {
    	
		 
		 if (Obshchak.List.size()==0) {
			 System.out.print("Cписок пустий");
			
			 Obshchak.stop=false;
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
 		Obshchak.stop=false;
 		long start = System.nanoTime();
	 

		          switch(a)
                 {
                 case 1:
                	 try {
						Thread.sleep(5);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
                	 Obshchak.List.sort(new Comparator<PoliceFile>() {
                		 
         	            public int compare(PoliceFile o1, PoliceFile o2) {
         	               return  comparison (o1.getName(), o2.getName());
         	            }
         	        });
                 	 break;
                 case 2:
                	 Obshchak.List.sort(new Comparator<PoliceFile>() {
         	            @Override
         	            public int compare(PoliceFile o1, PoliceFile o2) {
         	              
         	               return  comparison(o1.getSurname(), o2.getSurname()) ; 
         	                
         	            }
         	        });
            	 break;

                 case 3:
                	 Obshchak.List.sort(new Comparator<PoliceFile>() {
         	            @Override
         	            public int compare(PoliceFile o1, PoliceFile o2) {
         	                  return comparison(o1.getLastname(), o2.getLastname());
         	            }
         	        });
            	 break;
                 case 4:
                	 Obshchak.List.sort(new Comparator<PoliceFile>() {
         	            @Override
         	            public int compare(PoliceFile o1, PoliceFile o2) {
         	                  return comparison(o1.getDateOfBirth(), o2.getDateOfBirth());
         	            }
         	        });
            	 break;
                 case 5:
                	 Obshchak.List.sort(new Comparator<PoliceFile>() {
         	            @Override
         	            public int compare(PoliceFile o1, PoliceFile o2) {
         	                  return comparison(o1.getDateOfLastImprisonment(), o2.getDateOfLastImprisonment());
         	            }
         	        });
            	 break;
                 case 6:
                	 Obshchak.List.sort(new Comparator<PoliceFile>() {
         	            @Override
         	            public int compare(PoliceFile o1, PoliceFile o2) {
         	                  return comparison(o1.getDateOfLastreLease(), o2.getDateOfLastreLease());
         	            }
         	        });
            	 break;
                 }
			 

			System.out.print(" *сортування завершено ");
			Thread.currentThread().setName("Sort");
			System.out.print("\n"+Thread.currentThread().getName()+" - закінчив роботу; "+"Тривалість роботи: "+ (System.nanoTime() - start) / DIVIDER +"\n");
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
 
 
////////////////////////////////////////////////////////////////////
	public static void AppliedTask( )///thread
	{
		 
		
		Boolean flag =true;
		String s=new String();
		for (var PF : Obshchak.List)
		{
			
			if (Regex.KoNameNotYoung(PF.toString()))
			{
					 s+=PF.toString()+"\n";
					 flag=false;
			}
	    }if(flag)s="Незнайдено";
	    else System.out.print(s);
	 
 
	}
 
	
/////////////////////////////////////////////////////////////////////////////////	
	
    private static String Name;  ///Name
    private static String Surname;   /// По-батькові 
    private static String Lastname;  ///прізвище
    private static int  index;
	
	 public static void ComparisonOfParallelAndLinearSearch(ArrayList<PoliceFile> List)
	
	 {
 		 if (List.size()==0) {
 			 System.out.print("Список пустий");
 			 return ;	
 		 }
 		 int n=1;
 		 
 		 System.out.print("Введіть Імя : ");
 		Name=in.next();
		 
		 System.out.print("Введіть по-Батькові : ");
		 Surname=in.next();
		 
		 System.out.print("Введіть прізвище : ");
		 Lastname=in.next();
   		 
   		 System.out.print("Введіть index : ");
   		 index=in.nextInt();
   				
   		 System.out.print("Введіть кількість ітерацій : ");
   		 n=in.nextInt();		 
   				 ;
   		long startL = System.nanoTime();    
   		
   for (int j=0;j<n;j++)	
   {
	   NameSearch();
	   SurnameSearch();
	   LastnameSearch();
	   indexSearch();
   } 
   				double stopL=(System.nanoTime() - startL) / DIVIDER;
               	System.out.print("\n"+"Послідовний пошук завершнно :"+"Тривалість роботи: "+ stopL +"\n");     	
               	
          long 	startS = System.nanoTime();  
                Thread N = new Thread(Helper::NameSearch) ;
               	Thread S = new Thread(Helper::SurnameSearch) ;
               	Thread L = new Thread(Helper::LastnameSearch) ;
               	Thread I = new Thread(Helper::indexSearch) ;
      for (int j=0;j<n;j++)           	
          {       N = new Thread(Helper::NameSearch) ;
               	  S = new Thread(Helper::SurnameSearch) ;
               	  L = new Thread(Helper::LastnameSearch) ;
               	  I = new Thread(Helper::indexSearch) ;
 	
                 
	  
               	N.start();
               	S.start();
               	L.start();
               	I.start();
               	
        }
			 try {	N.join();
               	S.join();
               	L.join();
               	I.join();
               	} catch (InterruptedException e) {e.printStackTrace();}
              double stopP=(System.nanoTime() - startS) / DIVIDER;
            	System.out.print("\n"+"Паралельний пошук завершнно :"+"Тривалість роботи: "+ stopP +"\n");     
            	
            	System.out.print("\n\n маємо наступні результати :"+
            	        "\nПошуку елеменів у контейнері при "+n+" ітерацій отримали наступне"+
            			"\n\tПаралельний пошук: "+stopP+
            			"\n\tЛінійний пошук: "+stopL);
            	System.out.printf("\n\n Отже у даному алгоритмі при %d ітерацій швидшим обробником став %S у %f разів",
            			n,
            			(stopP<stopL)?"'Паралельний пошуk'":"'Послідовний пошуk'",
            					(stopP<stopL)? stopL/stopP:stopP/stopL);
               	 
     }
	          
	
	 
 
	 
	    public static void NameSearch()
	    {
	    	int i=0;
	    	try {	Thread.sleep(50);	} catch (InterruptedException e) {	e.printStackTrace();}     
	    	 for (var L:Obshchak.List)
        	 { 
      	          if (((PoliceFile) L).getName().equals(Name))    
      	        	  {
      	        	  System.out.print("Позиція вашаго елемента: "+i+"\n");
      	        	((PoliceFile) L).printTableHead();
      	        	((PoliceFile) L).show();
      	        	  return ;
      	        	  }i++;
              }
	    	// System.out.print("Ваш елемент незнайденo");
	    }
	    
	    public static void SurnameSearch()
	    {
	    	int i=0;
	    	try {	Thread.sleep(50);	} catch (InterruptedException e) {	e.printStackTrace();}     
	    	 for (var L:Obshchak.List)
        	 { 
      	          if (((PoliceFile) L).getSurname().equals(Surname))    
      	        	  {
      	        	  System.out.print("Позиція вашаго елемента: "+i+"\n");
      	        	  ((PoliceFile) L).printTableHead();
     	        	  ((PoliceFile) L).show();
      	        	  return ;
      	        	  }i++;
              } // System.out.print("Ваш елемент незнайденo");
	    }
	    
	    public static void LastnameSearch()
	    {
	    	int i=0;
	    	try {	Thread.sleep(50);	} catch (InterruptedException e) {	e.printStackTrace();}     
	    	 for (var L:Obshchak.List)
        	 { 
      	          if (((PoliceFile) L).getLastname().equals(Lastname))    
      	        	  {
      	        	  System.out.print("Позиція вашаго елемента: "+i+"\n");
      	        	  ((PoliceFile) L).printTableHead();
     	        	  ((PoliceFile) L).show();
      	        	  return ;
      	        	  }i++;
              } // System.out.print("Ваш елемент незнайденo");
	    }
	    
	    public static void indexSearch()
	    {
          	 try 
         	  {    Thread.sleep(50);           		 
      		 System.out.print("\n\n");
      		((ArrayList<PoliceFile>) Obshchak.List).get(index)/*.show()*/;
      	  }
      		 catch(Exception e)	     {   /*System.out.print("Ваш елемент незнайденo")*/;}
	    }
}
