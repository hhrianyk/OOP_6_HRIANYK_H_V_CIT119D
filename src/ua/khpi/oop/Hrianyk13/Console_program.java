package ua.khpi.oop.Hrianyk13;
 import java.util.Scanner;
 

 

public class Console_program extends Thread {
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
				 +"\n*8 - Сортувати"
				 +"\n*9 - Знайти всіх ув'язнених не молодше 20 років з прізвищем, що починається з голосної та містить комбінацію \"ко\". Наприклад: Архипенко, Ішкова, Єрмаков, Янковський."
				 +"\n*10 - Видалити за номером"
				 +"\n*11 - очистити данi"
				 +"\n*12 - встановити Time out"
				 +"\n*13 (exit)-вийти"
				 +"\n\n ваша команда: ");
	   	 
	   	 return in.nextInt();
	   	 
	    }

	    	@SuppressWarnings("deprecation")
			public static  void Menu() ///функціє проводить координування по можливостям програм
	    	{
     
	    		
 
	    		while(true)///нескінченний цикл який дозволяє працювати програмі
	    		{
	            try {            
	    		int  k=dialog();
	    		
	    		switch(k)///пошук введеної команди
	    		{
	    		case 1:  	    		  
               // new Thread (Helper::show).start();
                Helper.show(Obshchak.List);
	         	break;
	    	 	case 2: Obshchak.List=Helper.WaysToAddData(Obshchak.List);
	    		break;
	    		case 3: //new Thread(new  Helper::UpdateData).start();
	    		Helper.UpdateData(Obshchak.List);
	    		break;
	    		case 4: Helper.posuk(Obshchak.List);
	    		break;
	    		case 5: System.out.println("Кількість злочинців у базі: "+Obshchak.List.size());
	    		break;
	    		case 6: //System.out.print("\n\nЗбереження даних:"+ serializator.serialization());
	    			Obshchak.Choice=k;
	    			new ProcessProcesses();
	    			for(;;)
	    			{
	    				Thread.sleep(10);
	    				if(Obshchak.stop==false)break;
	    			}
	    		break;
	    		case 7:  
	    		System.out.println("Вивід перетворення у масив\n");
	    	           for (var PF : Obshchak.List.СonverToArray())
	    	           {
	    	        	  var PFD=(PoliceFile)PF;
	    	        	    PFD.show();
	    	           }
	    	           System.out.println("\n Вивід перетворення у рядок\n"+Obshchak.List.toString());
	    	           
	    	    break;
	    		case 8: 	    		
	    		Obshchak.Choice=k;
    			new ProcessProcesses();
    			for(;;)
    			{
    				Thread.sleep(10);
    				if(Obshchak.stop==false)break;
    			}
	    		break;
	    		case 9:	    	
	    			Obshchak.Choice=k;
    			new ProcessProcesses();
 	    		break;
	    		case 10:
	    			Obshchak.Choice=k;
	    			new ProcessProcesses();
	    			for(;;)
	    			{
	    				Thread.sleep(10);
	    				if(Obshchak.stop==false)break;
	    				
	    			}
	    		break;
	    		case 11:	    
	    			Obshchak.Choice=k;
    			new ProcessProcesses();
	    		break; 
	    		case 12:  System.out.print("\nВведіть значення Time out в мілісекундах(0 - вимикає) : "); Obshchak.TimeOut=in.nextInt();break;
	    		case 13:System.out.print("\n\nРоботу завершено. Будьте здорові\n\n"); return ;
	    		   		
	    		}   
	    		}catch(Exception e)	  {	//for (int i=0;i<10;i++)System.out.println(" EROR EROR EROR EROR EROR EROR EROR EROR EROR EROR EROR EROR EROR EROR EROR EROR EROR EROR EROR EROR EROR EROR EROR EROR EROR EROR EROR EROR EROR EROR EROR EROR EROR EROR EROR EROR EROR EROR EROR EROR EROR EROR EROR EROR ");
	    			System.out.print("\n\n\nТрапилась помилка. Але тепер все добре!!\n\n");
	    			System.out.println(e);}
	   }
	 }

			  @Override
			  public void run() {
			  Thread.currentThread().setName("Console_program");
			  System.out.print(Thread.currentThread().getName()+" - почав роботу\n");
			  Menu();
			  System.out.print(Thread.currentThread().getName()+" - закінчив роботу\n");
			}
}



