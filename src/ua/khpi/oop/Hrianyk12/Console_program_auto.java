package ua.khpi.oop.Hrianyk12;

 import java.util.Comparator;
 
public class Console_program_auto {
	 
		 
		public static Serializator<ContainerList<PoliceFile>> serializator=new Serializator<ContainerList<PoliceFile>>();
 
		    	public static void Menu() ///������� ��������� ������������� �� ����������� �������
		    	{
		    		ContainerList<PoliceFile> List=new ContainerList<PoliceFile>();
		       		 		    		 
		            try {            
		    		  Helper.ReadFile(List);
		    		  //List=serializator.deserializtionAuto();
		    		  Helper.show(List);
		    		  System.out.println("\nʳ������ ��������� � ���: "+List.size());
		    		  
		    		  List.sort(new Comparator<PoliceFile>() { public int compare(PoliceFile o1, PoliceFile o2) {return  Helper.comparison(o1.getSurname(), o2.getSurname()) ;  }  });
	    	          System.out.println("\n���������� �� ������ ���������");
		    		  for (var PF : List.�onverToArray())
	    	           {
	    	        	  var PFD=(PoliceFile)PF;
	    	        	    PFD.show();
	    	           }
		    		  System.out.println("\nY�'������ �� ������� 20 ���� � ��������, �� ���������� � ������� �� ������ ��������� \"��\". ���������: ���������, ������, �������, ����������.");
		    		  System.out.println(Helper.AppliedTask(List));
		    		  List.clear();
		    		  System.out.print("\n\n������ �������");
		    		  Helper.show(List);
		    		  System.out.print("\n\n������ ���������. ������ ������");
		    	 
		    		 
		    		}catch(Exception e)	  {	 System.out.println(" EROR EROR EROR EROR EROR EROR EROR EROR EROR EROR EROR EROR EROR EROR EROR EROR EROR EROR EROR EROR EROR EROR EROR EROR EROR EROR EROR EROR EROR EROR EROR EROR EROR EROR EROR EROR EROR EROR EROR EROR EROR EROR EROR EROR ");
		    			System.out.print("\n\n\n��������� �������. ��� ����� ��� �����!!\n\n");
		    			System.out.println(e);}
		          
		        
		  }
 
	}
 
