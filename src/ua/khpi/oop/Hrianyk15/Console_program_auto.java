package ua.khpi.oop.Hrianyk15;
 import java.util.ArrayList;
 import java.util.Comparator;
public class Console_program_auto extends Thread{
	 
		 
	Console_program_auto()
	{
		start();
	}
	
		public static Serializator<ArrayList<PoliceFile>> serializator=new Serializator<ArrayList<PoliceFile>>();
 
		    	public  void run() ///������� ��������� ������������� �� ����������� �������
		    	{
		    		///ArrayList<PoliceFile> List=new ArrayList<PoliceFile>();
		       		 		    		 
		            try {            
		    		  Helper.ReadFile();
		    		  //List=serializator.deserializtionAuto();
		    		  Helper.show(Obshchak.List);
		    		  System.out.println("\nʳ������ ��������� � ���: "+Obshchak.List.size());
		    		  
		    		  Obshchak.List.sort(new Comparator<PoliceFile>() { public int compare(PoliceFile o1, PoliceFile o2) {return  Helper.comparison(o1.getSurname(), o2.getSurname()) ;  }  });
	    	          System.out.println("\n���������� �� ������ ���������");
		    		  for (var PF : Obshchak.List.toArray())
	    	           {
	    	        	  var PFD=(PoliceFile)PF;
	    	        	    PFD.show();
	    	           }
		    		  System.out.println("\nY�'����� �� ������� 20 ���� � ��������, �� ���������� � ������� �� ������ ��������� \"��\". ���������: ���������, ������, �������, ����������.");
		    		  Helper.AppliedTask();
		    		  Obshchak.List.clear();
		    		  System.out.print("\n\n������ �������");
		    		  Helper.show(Obshchak.List);
		    		  System.out.print("\n\n������ ���������. ������ ������");
		    	 
		    		 
		    		}catch(Exception e)	  {	 System.out.println(" EROR EROR EROR EROR EROR EROR EROR EROR EROR EROR EROR EROR EROR EROR EROR EROR EROR EROR EROR EROR EROR EROR EROR EROR EROR EROR EROR EROR EROR EROR EROR EROR EROR EROR EROR EROR EROR EROR EROR EROR EROR EROR EROR EROR ");
		    			System.out.print("\n\n\n��������� �������. ��� ����� ��� �����!!\n\n");
		    			System.out.println(e);}
		          
		        
		  }
 
	}
 
