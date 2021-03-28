package ua.khpi.oop.Hrianyk15;
 import java.util.ArrayList;
 import java.util.Comparator;
public class Console_program_auto extends Thread{
	 
		 
	Console_program_auto()
	{
		start();
	}
	
		public static Serializator<ArrayList<PoliceFile>> serializator=new Serializator<ArrayList<PoliceFile>>();
 
		    	public  void run() ///функціє проводить координування по можливостям програм
		    	{
		    		///ArrayList<PoliceFile> List=new ArrayList<PoliceFile>();
		       		 		    		 
		            try {            
		    		  Helper.ReadFile();
		    		  //List=serializator.deserializtionAuto();
		    		  Helper.show(Obshchak.List);
		    		  System.out.println("\nКількість злочинців у базі: "+Obshchak.List.size());
		    		  
		    		  Obshchak.List.sort(new Comparator<PoliceFile>() { public int compare(PoliceFile o1, PoliceFile o2) {return  Helper.comparison(o1.getSurname(), o2.getSurname()) ;  }  });
	    	          System.out.println("\nСортування за іменем завершено");
		    		  for (var PF : Obshchak.List.toArray())
	    	           {
	    	        	  var PFD=(PoliceFile)PF;
	    	        	    PFD.show();
	    	           }
		    		  System.out.println("\nYв'язнені не молодше 20 років з прізвищем, що починається з голосної та містить комбінацію \"ко\". Наприклад: Архипенко, Ішкова, Єрмаков, Янковський.");
		    		  Helper.AppliedTask();
		    		  Obshchak.List.clear();
		    		  System.out.print("\n\nСписок очищено");
		    		  Helper.show(Obshchak.List);
		    		  System.out.print("\n\nРоботу завершено. Будьте здорові");
		    	 
		    		 
		    		}catch(Exception e)	  {	 System.out.println(" EROR EROR EROR EROR EROR EROR EROR EROR EROR EROR EROR EROR EROR EROR EROR EROR EROR EROR EROR EROR EROR EROR EROR EROR EROR EROR EROR EROR EROR EROR EROR EROR EROR EROR EROR EROR EROR EROR EROR EROR EROR EROR EROR EROR ");
		    			System.out.print("\n\n\nТрапилась помилка. Але тепер все добре!!\n\n");
		    			System.out.println(e);}
		          
		        
		  }
 
	}
 
