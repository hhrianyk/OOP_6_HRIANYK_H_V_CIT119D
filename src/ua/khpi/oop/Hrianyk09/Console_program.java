package ua.khpi.oop.Hrianyk09;
 import java.util.Scanner;

 

public class Console_program {
	public static Scanner in = new Scanner(System.in);
	public static Serializator<ContainerList<PoliceFile>> serializator=new Serializator<ContainerList<PoliceFile>>();
	 public static int dialog()
	    {
	   	 System.out.print("\n\n Оберіть команду:"
				 +"\n*1 - Вивести поточнi записанi даннi"
				 +"\n*2 - Додати данні"
				 +"\n*3 - Оновити дані"
				 +"\n*4 - пошук"
				 +"\n*5 - Кількість злочинців у базі "
				 +"\n*6 - зберегти дані(save)"
				 +"\n*7 - перетворення у масив, перетворення у рядок"
				 +"\n*8 - Видалити за номером"
				 +"\n*9 - очистити данi"
				 +"\n*10 (exit)-вийти"
				 +"\n\n ваша команда: ");
	   	 
	   	 return in.nextInt();
	   	 
	    }

	    	public static void Menu() ///функціє проводить координування по можливостям програм
	    	{
	    		ContainerList<PoliceFile> List=new ContainerList<PoliceFile>();
	    		
	    		Helper help=new Helper();
	    		while(true)///нескінченний цикл який дозволяє працювати програмі
	    		{
	            try {            
	    		int  k=dialog();
	    		
	    		switch(k)///пошук введеної команди
	    		{
	    		case 1:  help.show(List);
	         	break;
	    	 	case 2: List=help.WaysToAddData(List);
	    		break;
	    		case 3: help.UpdateData(List);
	    		break;
	    		case 4: help.posuk(List);
	    		break;
	    		case 5: System.out.println("Кількість злочинців у базі: "+List.size());
	    		break;
	    		case 6: System.out.print("\n\nЗбереження даних:"+ serializator.serialization(List));
	    		break;
	    		case 7:  
	    		System.out.println("Вивід перетворення у масив\n");
	    	           for (var PF : List.СonverToArray())
	    	           {
	    	        	  var PFD=(PoliceFile)PF;
	    	        	    PFD.show();
	    	           }
	    	           System.out.println("\n Вивід перетворення у рядок\n"+List.toString());
	    	           
	    	    break;
	    		case 8: help.romove(List);
	    		break;
	    		case 9: List.remove();
	    		break; 
	    		case 10:return ;
	    		   		
	    		}   
	    		}catch(Exception e)	  {	//for (int i=0;i<10;i++)System.out.println(" EROR EROR EROR EROR EROR EROR EROR EROR EROR EROR EROR EROR EROR EROR EROR EROR EROR EROR EROR EROR EROR EROR EROR EROR EROR EROR EROR EROR EROR EROR EROR EROR EROR EROR EROR EROR EROR EROR EROR EROR EROR EROR EROR EROR ");
	    			System.out.print("\n\n\nТрапилась помилка. Але тепер все добре!!\n\n");
	    			System.out.println(e);}
	   }
	        
	  }



}



