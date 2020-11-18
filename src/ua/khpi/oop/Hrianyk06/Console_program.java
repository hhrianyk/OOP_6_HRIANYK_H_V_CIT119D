 /**
 * \brief L6
 * 	\author Heorhii Hrianyk
 * 	\version 1.0
 * 	\date   2020 рік
 * 	\warning Данний класс створений для реалізації консольного меню
 *
 *  

 */ 


package ua.khpi.oop.Hrianyk06;
import java.util.Scanner;

import Laba3.Helper;
import ua.khpi.oop.kogutenko03.HelperClassWithString;

public class Console_program {
	public static Scanner in = new Scanner(System.in);
	public static Serializator serializator=new Serializator();
	 public static int dialog()
	    {
	   	 System.out.println("\n\n Оберіть команду:"
				 +"\n*1-вивести поточнi записанi даннi"
				 +"\n*2 -Додати данні"
				 +"\n*3 -виконати основне завдання"
				 +"\n*4 - сортувати"
				 +"\n*5 - пошук"
				 +"\n*6 - порівняння"
				 +"\n*7 - зберегти дані(save)"
				 +"\n*8 - завантажити дані(load)"
				 +"\n*9 (del)-очистити данi"
				 +"\n*10 (exit)-вийти"
				 +"\n*11 - Вивести данні ( ЛР 3)"
				 +"\n*12 - Додати данні ( ЛР 3) "
				 +"\n*13 - Сортування (ЛР 3)"
				 +"\n\n ваша команда: ");
	   	 
	   	 return in.nextInt();
	   	 
	    }

	    	public static void Menu() ///функціє проводить координування по можливостям програм
	    	{
	    		Сontainer s=new Сontainer();
	    		
	    		while(true)///нескінченний цикл який дозволяє працювати програмі
	    		{
	                        
	    		int  k=dialog();
	    		try {
	    		switch(k)///пошук введеної команди
	    		{
	    		case 1: My_Helper.PrintLine(s.toString());
	    		break;
	    		case 2:
	    			System.out.print("Введіть ваш текст: ");
	    			String text=new String();
	    			text=in.nextLine();
	    			s.add(in.nextLine());
	    		break;
	    		case 3:s=My_Helper.Task6(s);
	    		break;
	    		case 4:  s.Sort(s);
 
	    		break;
	    		case 5 :  s.posuk(s);
	     		break;
	    		case 6 :s.d_comparison(s);
	    		break;
	    		case 7 : 
	            System.out.print("\n\nЗбереження даних:"+ serializator.serialization(s));
	    		break;
	    		case 8 : s=serializator.deserializtion();
	    		break;
	    		case 9 :s.clear();
	    		break;
	    		case 10 :return ;
	    		case 11:Helper.PrintLineS(s.toString());
	    		break;
	    		case 12:
	    			String text2=Helper.AddText();
	    			 	    			s.add(text2);
	    		 break;
	    		case 13:Helper.SortLexicographically(s.m_data);
	    	
	    		break;
	    		
	    		   		
	    		}}catch(Exception e)	  {	
    			System.out.print("\n\n\nЩось пішло не так. Але тепер все добре!!\n\n");}
	    	}
	    }

	}


