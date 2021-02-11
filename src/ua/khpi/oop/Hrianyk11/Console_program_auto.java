package ua.khpi.oop.Hrianyk11;
 import java.util.Comparator;
 
public class Console_program_auto {
	 
		 
		public static Serializator<ContainerList<PoliceFile>> serializator=new Serializator<ContainerList<PoliceFile>>();
 
		    	public static void Menu() ///функціє проводить координування по можливостям програм
		    	{
		    		ContainerList<PoliceFile> List=new ContainerList<PoliceFile>();
		       		 		    		 
		            try {            
		    		  Helper.ReadFile(List);
		    		  //List=serializator.deserializtionAuto();
		    		  Helper.show(List);
		    		  System.out.println("\nКількість злочинців у базі: "+List.size());
		    		  
		    		  List.sort(new Comparator<PoliceFile>() { public int compare(PoliceFile o1, PoliceFile o2) {return  Helper.comparison(o1.getSurname(), o2.getSurname()) ;  }  });
	    	          System.out.println("\nСортування за іменем завершено");
		    		  for (var PF : List.СonverToArray())
	    	           {
	    	        	  var PFD=(PoliceFile)PF;
	    	        	    PFD.show();
	    	           }
		    		  List.clear();
		    		  System.out.print("\n\nСписок очищено");
		    		  Helper.show(List);
		    		  System.out.print("\n\nРоботу завершено. Будьте здорові");
		    	 
		    		 
		    		}catch(Exception e)	  {	 System.out.println(" EROR EROR EROR EROR EROR EROR EROR EROR EROR EROR EROR EROR EROR EROR EROR EROR EROR EROR EROR EROR EROR EROR EROR EROR EROR EROR EROR EROR EROR EROR EROR EROR EROR EROR EROR EROR EROR EROR EROR EROR EROR EROR EROR EROR ");
		    			System.out.print("\n\n\nТрапилась помилка. Але тепер все добре!!\n\n");
		    			System.out.println(e);}
		          
		        
		  }
 
	}
 
