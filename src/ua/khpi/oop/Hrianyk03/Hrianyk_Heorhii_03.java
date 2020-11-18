package ua.khpi.oop.Hrianyk03;
/**
 
* \brief L3
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


 
 public class Hrianyk_Heorhii_03 {
	 public static Scanner in = new Scanner(System.in);
	public static void main(final String[] args) {
    	 
		System.out.print("Введіть ваш текст: ");
 
		 StringBuilder s= new StringBuilder(in.nextLine());///ввод даний
		 Helper.PrintLine(s);///вивод тексту
		 s=Helper.Task6(s);///основне завдання

		 
		Helper.PrintNewLine(s);///;вивод відредагованого текту
    }
}
