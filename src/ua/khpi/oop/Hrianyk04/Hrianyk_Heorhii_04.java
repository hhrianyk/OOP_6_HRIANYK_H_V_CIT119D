package ua.khpi.oop.Hrianyk04;
/**
a * \brief L4
 * 	\author Heorhii Hrianyk
 * 	\version 1.0
 * 	\date septemer 2020 года
 * 	\warning Данный класс создан тільки для начальних цілей
 *
 * Завдання:
*Використовуючи програму рішення завдання лабораторної роботи №3, 
*відповідно до прикладної задачі забезпечити обробку команд користувача у вигляді 
*текстового меню:
*
* *введення даних;
* *перегляд даних;
* *виконання обчислень;
* *відображення результату;
* *завершення програми і т.д.
*    Забезпечити обробку параметрів командного рядка для визначення режиму роботи програми:
*
*параметр "-h" чи "-help": відображається інформація про автора програми, призначення 
*(індивідуальне завдання), детальний опис режимів роботи (пунктів меню та параметрів командного рядка);
*параметр "-d" чи "-debug": в процесі роботи програми відображаються додаткові дані, 
*що полегшують налагодження та перевірку працездатності програми: діагностичні повідомлення,
* проміжні значення змінних, значення тимчасових змінних та ін.
 */ 

 import java.util.Scanner;


 public class Hrianyk_Heorhii_04 { ///основний клсаа
	 
	 public static String text=new String("NULL");///змінна в якій зберігаються початкові данні 
	 public static String res=new String("NULL");
     public static Scanner in = new Scanner(System.in);///змінна в якій зберігаються віжредагований текст

     
	public static void main(final String[] args) {	
			 Menu(args[0]);/// виклик функцї меню   
    }
	public static void Menu(String operating_mode) ///функціє проводить координування по можливостям програм
	{
	if (operating_mode.equals("-debug")||operating_mode.equals("-d") )
	{	Helper.debug=true;	}
	else if (operating_mode.equals("-help")||operating_mode.equals("-h") ) 
	{ Helper.help=true;}
	
		if (Helper.debug==true)System.out.println("\n("+Helper.date.toString()+") Викликана фукція 'Menu' )");
		
		Helper.Help();
		
		while(true)///нескінченний цикл який дозволяє працювати програмі
		{
			if (Helper.debug==true)System.out.println("\n("+Helper.date.toString()+")  фукція 'Menu' )");
			if (Helper.debug==true)System.out.println("\n(("+Helper.date.toString()+") text-"+text+"; res-"+res+")");
			System.out.print("\nВведіть команду: ");
		String  s=in.nextLine();
		
		switch(s)///пошук введеної команди
		{
		case "1": Helper.PrintLine(text);
		break;
		case "2": Helper.PrintLine(res);
		break;
		case "3":text=Helper.Replacement(text);
		break;
		case "4": res=Helper.Task6(text);
		break;
		case "5" :Helper.Help();
		break;
	//	case "cls" :              
      //break;
		case "6" :
			text="Eror";
			res="Eror";
		break;
		case "7":
			if (Helper.debug==true)System.out.println("\n(("+Helper.date.toString()+") Програма завершує роботу)");
			return;
		default : Helper.Help();
		break;
		}
			
		}
	}

	
}
