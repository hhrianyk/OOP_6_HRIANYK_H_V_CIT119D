package ua.khpi.oop.Hrianyk05;
 /**
 * \brief L5
 * 	\author Heorhii Hrianyk
 * 	\version 1.0
 * 	\date septemer 2020 года
 * 	\warning Данный класс создан тільки для начальних цілей
 *
 * Завдання:
 *Ввести текст. З тексту видалити всі символи, крім пропусків, які не є буквами.
 * Пропуски, що повторюються, замінити на одиночні. Між послідовностями літер,
 *  де знаходяться розділові знаки, залишити хоча б один пропуск ("a,b,c" -> "a, b, c").
 *   Вивести початковий текст та результат.
 */ 
 import java.util.Scanner;
 
 public class Hrianyk_Heorhii_05 {
	 
	public static Scanner in = new Scanner(System.in);
	public static void main(final String[] args) {
    	 
		System.out.print("Введіть ваш текст: ");
		Сontainer s=new Сontainer();
		String s2=new String(in.nextLine());
		s.add(s2);
		Iterator<String> iterator=s.iterator(); 

		 Helper.PrintLine(s.toString());///вивод тексту
		s=Helper.Task6(s);///основне завдання

		 
		Helper.PrintNewLine(s.toString());///;вивод відредагованого текту
		System.out.print("\n Вивод через iтератор(while):");
        while (iterator.hasNext())
       {
   	    System.out.print(iterator.next().toString());
       }
       /* System.out.print("\n Вивод через iтератор(for each):");
        for ( var x: s.m_data)
        System.out.print(x);*/
    }
}
