package ua.khpi.oop.Hrianyk04;
//import java.sql.Date;
/**
 * \brief L4-Help
 * 	\author Heorhii Hrianyk
 * 	\version 1.0
 * 	\date septemer 2020 года
 * 	\warning Данный класс создан тільки для начальних цілей да робти основного класу main
 *
 * Завдання класу:
 * Виконувати функції які потріні щоб виконувати основне завдання
 */ 
import java.util.Scanner;
import java.util.Date;

public class Helper///допоміжний клас що реалізовує допоміжні функції
	 {
	
	    public static boolean debug=false;///змінна яка вимикає та  режим дебаг
	    public static boolean help=false;///змінна яка вимикає та  режим help
         static Date date = new Date();  /// змінна яка зберегіє поточний час
		 public static Scanner in = new Scanner(System.in);///змвнна для вводу даних
	     public static  boolean  СonditionalСheck(char text)///перевіряє на на відповідність символ
	     { if (debug==true)System.out.println("\n(("+date.toString()+") Викликана фукція 'СonditionalСheck' "
	     +"вхідні данні :text-"+text+")");
	       if (debug==true)System.out.println("\n(("+date.toString()+") Функція 'СonditionalСheck' закінчила роботу )");
	         return ( text>64&&text<91)||( text>96&&text<=123)||text==32||text==44;
	        
	     }

	     public static void PrintLine(String text)/// виводе текст
	     {
	    	 if (debug==true)System.out.println("\n(("+date.toString()+") Викликана фукція 'PrintLine' "
	    			 +"\nвхідні данні :text-"+text+")");
	    	 System.out.println("\n\nВаш текст: "+text);
	    	 if (debug==true)System.out.println("\n(("+date.toString()+") Функція 'PrintLine' закінчила роботу )");
	     }

	     public static void PrintNewLine(String text)///виводе текст з надписом відредаговано
	     { if (debug==true)System.out.println("\n(("+date.toString()+") Викликана фукція 'PrintNewLine' )");
	    	 System.out.println("\n\nВаш текст(Відредагований): "+text);
	    	 if (debug==true)System.out.println("\n(("+date.toString()+") Функція 'PrintNewLine' закінчила роботу ");
	     }
	     
	     public static String Replacement(String text)///функція записує або перезаписує данні
	     { if (debug==true)System.out.println("\n(("+date.toString()+") Викликана фукція 'Replacement' )");
	    	 System.out.println("\n\nВведіть нові данні: ");
	    	 text=in.nextLine();
	    	 if (debug==true)System.out.println("\n(("+date.toString()+") Функція 'Replacement' закінчила роботу "
	    			 +"\nвихідні данні: text-"+text+")");
	    	 
	    	 return text;
	     }
	     public static void Help()///навігаційна функція яка виводе команди можливостей та информацію про програму
	     { if (debug==true)System.out.println("\n(("+date.toString()+") Викликана фукція 'Help' )");
	     if (help==true)
	     {
	    	 System.out.println("\n\nАвтор: Гряник Георгiй \n група КIT-119Д\n Завдання:\nВвести текст. З тексту видалити всi символи, крiм пропускiв, якi не є буквами."
	    	 		+ "\nПропуски, що повторюються, замiнити на одиночнi. "
	    	 		+ "\nМiж послiдовностями лiтер, де знаходяться роздiловi знаки, залишити хоча б один пропуск (\"a,b,c\" -> \"a, b, c\"). "
	    	 		+ "\nВивести початковий текст та результат.");
	     }
	    	 System.out.println("\n\nНавігація команд:"
	    			 + "\n*1(printI)-вивести поточнi записанi даннi"
	    			 + "\n*2 (printO)-вивести поточнi зультати роботи програми записанi даннi"
	    			 +"\n*3 (add)-записати/перезаписати даннi"
	    			 +"\n*4 (task) 6-виконати основне завдання"
	    			 +"\n*5 (help)-команди ta iнформацiя"
	    			// +"\n*cls-очистка консоли"
	    			 +"\n*6 (del)-очистити данi"
	    			 +"\n*7 (exit)-вийти");
	    	 if (debug==true)System.out.println("\n(("+date.toString()+") Функція 'Help' закінчила роботу )");
	     }
	     public static String Task6 (String  s)/// редагує текст
	     {
	    	 if (debug==true)System.out.println("(("+date.toString()+") Викликана фукція 'Task6' "
	     +"\nвхiднi данi :text-"+s+")");
	    	 String temp=new String();
			 int spaise=0;
			 for (int i=0;i<s.length();i++)
			 {
				 if (Helper.СonditionalСheck(s.charAt(i)))
				 {
					 if (s.charAt(i)==32) spaise++;//перевірка на пробіл
					 else 
					 {
						 if(s.charAt(i)==44)///перевірка на кому
					 {	 
				     temp=temp+s.charAt(i) ;
					 spaise++;
					 if (debug==true)System.out.println("\n(("+date.toString()+") s.charAt(i)-"+s.charAt(i)+"; temp-"+temp+"; spaise-"+spaise +"; i-"+i+")");
					 } 
					 else if(spaise!=0)///написати пробіл
						 
					 {  temp =temp+" "+s.charAt(i);
					 spaise=0;
					 if (debug==true)System.out.println("\n(("+date.toString()+") s.charAt(i)-"+s.charAt(i)+"; temp-"+temp+"; spaise-"+spaise+"; i-"+i+")" );
					    
					    }
					 else {
						 
						 temp =temp+s.charAt(i);///написати символ
						 if (debug==true)System.out.println("\n(("+date.toString()+") s.charAt(i)-"+s.charAt(i)+"; temp-"+temp+"; spaise-"+spaise +"; i-"+i+")");
					 }
					 }
				 }         
	        
			 }
			 if (debug==true)System.out.println("\n(("+date.toString()+") Функція 'Task6' закінчила роботу "
					 +"\n Вижідні данні:temp-"+temp+")");
	     return temp;
	     }
	 }

