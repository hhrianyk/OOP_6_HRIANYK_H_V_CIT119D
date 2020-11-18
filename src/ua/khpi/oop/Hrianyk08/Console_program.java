 /**
 * \brief L8
 * 	\author Heorhii Hrianyk
 * 	\version 1.0
 * 	\date   2020 рік
 * 	\warning Данний класс створений для реалізації консольного меню
 *
 *  

 */ 


package ua.khpi.oop.Hrianyk08;
import java.util.Scanner;


public class Console_program {
	public static Scanner in = new Scanner(System.in);
	public static Serializator serializator=new Serializator();
	 public static int dialog()
	    {
	   	 System.out.print("\n\n Оберіть команду:"
				 +"\n*1 - Вивести поточнi записанi даннi"
				 +"\n*2 - Додати данні"
				 +"\n*3 - Оновити дані"
				 +"\n*4 - сортувати"
				 +"\n*5 - пошук"
				 +"\n*6 - Кількість злочинців у базі "
				 +"\n*7 - зберегти дані(save)"
				 +"\n*8 - завантажити дані(load *.xml)"
				 +"\n*9 (clear)-очистити данi"
				 +"\n*10 (exit)-вийти"
				 +"\n\n ваша команда: ");
	   	 
	   	 return in.nextInt();
	   	 
	    }

	    	public static void Menu() ///функціє проводить координування по можливостям програм
	    	{
	    		Сontainer List=new Сontainer();
	    		PoliceFile PL=new PoliceFile();
	    		while(true)///нескінченний цикл який дозволяє працювати програмі
	    		{
	            try {            
	    		int  k=dialog();
	    		
	    		switch(k)///пошук введеної команди
	    		{
	    		case 1:  List.Print_run(List, PL);;///////////
	    		break;
	    		case 2: List= List.dop_INFO(List, PL);///////////
	    		break;
	    		case 3:List.UpdateData(List,PL);
	    		break;
	    		case 4: List.Sort(List);
	    		break;
	    		case 5 : List.posuk(List);
	     		break;
	    		case 6 :System.out.println("Кількість злочинців у базі :"+List.size());
	    		break;
	    		case 7 : 
	            System.out.print("\n\nЗбереження даних:"+ serializator.serialization(List));
	    		break;
	    		case 8 : List=serializator.deserializtionXML();
	    		break;
	    		case 9 :List.clear();
	    		break;
	    		case 10 :return ;
	    		   		
	    		}   
	    		}catch(Exception e)	  {	for (int i=0;i<10;i++)System.out.println(" EROR EROR EROR EROR EROR EROR EROR EROR EROR EROR EROR EROR EROR EROR EROR EROR EROR EROR EROR EROR EROR EROR EROR EROR EROR EROR EROR EROR EROR EROR EROR EROR EROR EROR EROR EROR EROR EROR EROR EROR EROR EROR EROR EROR ");
	    			System.out.print("\n\n\nТрапилась помилка. Але тепер все добре!!\n\n");
	    			System.out.println(e);}
	   }
	        
	    }



	}



