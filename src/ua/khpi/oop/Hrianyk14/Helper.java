package ua.khpi.oop.Hrianyk14;

 
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Comparator;
import java.util.Scanner;

 

 
 
public class Helper {
	
	private static Scanner in = new Scanner(System.in);
	private static final double DIVIDER = 1_000_000_000;
	
	public static ContainerList<PoliceFile> WaysToAddData(ContainerList<PoliceFile> A) throws InterruptedException   /// ����i� ��������� ��������
	{
		
 		int  a;
		System.out.print("\n 1: � ����i�����\n 2: 3 �����\n ��� �i�i�:   ");
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
    private static ContainerList<PoliceFile>  add_from_keyboard(ContainerList<PoliceFile> A )
		{
		  
    	int  a;
    	 
    	System.out.print("\n ������ �� ������� ������ �'����: ");
		int n=in.nextInt();
		System.out.print("\n ������:\n 1: � ������� \n 2: � ����� \n 3: ? \n��� �i�i�:   ");
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
		 
		  }System.out.print("\n!�������o!\n");
		} System.out.print("\n���i ���i ���i��� �������i\n");
		return A;
	}
    ///////////////////////////////////////////////////////	   
    public static  void  show(ContainerList<PoliceFile> List )
		{
 
			 PoliceFile PF=new PoliceFile();
			PF.printTableHead();
			
			for (var L:List) {
                   L.show();
		}
			 
	}
 
    //////////////////////////////////
  	public static void UpdateData(ContainerList<PoliceFile> List ){
  		 int size=List.size();
  		 if (size==0) 
  		 {
  		 System.out.print("\n\n ������ ������\n\n");
		 return;
		 }
  		 
  		 System.out.print("������ ������: ");
		 int index=in.nextInt();
 		 if(index<1||index>size) 
		 {
			 System.out.print("\n������ �������� ����������\n");
			 return;
		 }
		 PoliceFile PF=List.getNode(index);
		 PF.show();
		  List.Substitute(PF.EL(PF,true), index);
		  
	 }
	public static void romove( ) {/////���������� ///thread ///time here
 		 if (Obshchak.List.size()==0) 
 		 {
 		 System.out.print("\n\n ������ ������\n\n");
		 return;
		 }
 		System.out.print("\n������ ����� ������ ��������?: ");	
		int n=in.nextInt();
		long start = System.nanoTime();
		Thread.currentThread().setName("romove");
		 Obshchak.stop=false;
		Obshchak.List.removeNode(n);
		System.out.print("\n"+Thread.currentThread().getName()+" - ������� ������; "+"��������� ������: "+ (System.nanoTime() - start) / DIVIDER+"\n");
	}
 
/////////////////////////////////////////////////////////////////////////
    public static void Sort() //  ///thread  ///time here
	 {
    	
		 
		 if (Obshchak.List.size()==0) {
			 System.out.print("C����� ������");
			
			 Obshchak.stop=false;
			 return ;	
		 }
		 System.out.print("���������:\n"+
		                  "  1. ��`�\n"+
				          "  2. ��-�������\n"+
		                  "  3. �������\n"+
				          "  4. ����� ����������\n"+
		                  "  5. ����� ���������� ����������� ���\n"+
				          "  6. ����� ���������� ���������\n"+
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
			 

			System.out.print(" *���������� ��������� ");
			Thread.currentThread().setName("Sort");
			System.out.print("\n"+Thread.currentThread().getName()+" - ������� ������; "+"��������� ������: "+ (System.nanoTime() - start) / DIVIDER +"\n");
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
	    }if(flag)s="����������";
	    else System.out.print(s);
	 
 
	}
 
	
/////////////////////////////////////////////////////////////////////////////////	
	
    private static String Name;  ///Name
    private static String Surname;   /// ��-������� 
    private static String Lastname;  ///�������
    private static int  index;
	
	 public static void ComparisonOfParallelAndLinearSearch(ContainerList<PoliceFile> List)
	
	 {
 		 if (List.size()==0) {
 			 System.out.print("������ ������");
 			 return ;	
 		 }
 		 int n=1;
 		 
 		 System.out.print("������ ��� : ");
 		Name=in.next();
		 
		 System.out.print("������ ��-������� : ");
		 Surname=in.next();
		 
		 System.out.print("������ ������� : ");
		 Lastname=in.next();
   		 
   		 System.out.print("������ index : ");
   		 index=in.nextInt();
   				
   		 System.out.print("������ ������� �������� : ");
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
               	System.out.print("\n"+"���������� ����� ��������� :"+"��������� ������: "+ stopL +"\n");     	
               	
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
            	System.out.print("\n"+"����������� ����� ��������� :"+"��������� ������: "+ stopP +"\n");     
            	
            	System.out.print("\n\n ���� ������� ���������� :"+
            	        "\n������ ������� � ��������� ��� "+n+" �������� �������� ��������"+
            			"\n\t����������� �����: "+stopP+
            			"\n\t˳����� �����: "+stopL);
            	System.out.printf("\n\n ���� � ������ �������� ��� %d �������� ������� ���������� ���� %S � %f ����",
            			n,
            			(stopP<stopL)?"'����������� ����k'":"'���������� ����k'",
            					(stopP<stopL)? stopL/stopP:stopP/stopL);
               	 
     }
	          
	
	 
 
	 
	    public static void NameSearch()
	    {
	    	int i=0;
	    	try {	Thread.sleep(50);	} catch (InterruptedException e) {	e.printStackTrace();}     
	    	 for (var L:Obshchak.List)
        	 { 
      	          if (L.getName().equals(Name))    
      	        	  {
      	        	  System.out.print("������� ������ ��������: "+i+"\n");
      	        	  L.printTableHead();
     	        	  L.show();
      	        	  return ;
      	        	  }i++;
              }
	    	// System.out.print("��� ������� ���������o");
	    }
	    
	    public static void SurnameSearch()
	    {
	    	int i=0;
	    	try {	Thread.sleep(50);	} catch (InterruptedException e) {	e.printStackTrace();}     
	    	 for (var L:Obshchak.List)
        	 { 
      	          if (L.getSurname().equals(Surname))    
      	        	  {
      	        	  System.out.print("������� ������ ��������: "+i+"\n");
      	        	  L.printTableHead();
     	        	  L.show();
      	        	  return ;
      	        	  }i++;
              } // System.out.print("��� ������� ���������o");
	    }
	    
	    public static void LastnameSearch()
	    {
	    	int i=0;
	    	try {	Thread.sleep(50);	} catch (InterruptedException e) {	e.printStackTrace();}     
	    	 for (var L:Obshchak.List)
        	 { 
      	          if (L.getLastname().equals(Lastname))    
      	        	  {
      	        	  System.out.print("������� ������ ��������: "+i+"\n");
      	        	  L.printTableHead();
     	        	  L.show();
      	        	  return ;
      	        	  }i++;
              } // System.out.print("��� ������� ���������o");
	    }
	    
	    public static void indexSearch()
	    {
          	 try 
         	  {    Thread.sleep(50);           		 
      		 System.out.print("\n\n");
      		Obshchak.List.getNode(index)/*.show()*/;
      	  }
      		 catch(Exception e)	     {   /*System.out.print("��� ������� ���������o")*/;}
	    }
}
