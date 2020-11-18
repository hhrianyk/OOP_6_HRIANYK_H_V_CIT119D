package ua.khpi.oop.Hrianyk05;
/**
 * \brief L3-Help
 * 	\author Heorhii Hrianyk
 * 	\version 1.0
 * 	\date septemer 2020 года
 * 	\warning Данный класс создан тільки для начальних цілей да робти основного класу main
 *
 * Завдання класу:
 * Виконувати функції які потріні щоб виконувати основне завдання
 */ 


public class Helper
{
    //static functions
    public static  boolean  СonditionalСheck(char text)/// перевіряє символ на умову
    {
        return ( text>64&&text<91)||( text>96&&text<=123)||text==32||text==44;
    }

    public static void PrintLine(String text)///вивод тексту на консоль
    {
   	 System.out.println("\n\nВаш текст(дублювани): "+text);
    }

    public static void PrintNewLine(String text)///вивод тексту на консоль із надписом відредагований
    {
   	 System.out.println("\n\nВаш текст(Відредагований): "+text);
    }
    public static Сontainer Task6 (Сontainer text)//////редагування тексту
    {
   	 String temp=new String();
   	 String s=new String(text.toString());
		 boolean spaise=false;
		 for (int i=0;i<s.length();i++)
		 {
			 if (Helper.СonditionalСheck(s.charAt(i)))
			 {
				 if (s.charAt(i)==32) spaise=true;//перевірка на пробіл
				 else 
				 {
					 if(s.charAt(i)==44)///перевірка на кому
				 {
			     temp=temp+s.charAt(i) ;
			     spaise=true;
				 } 
				 else if(spaise==true)///написати пробіл
					 
				 {  temp =temp+" "+s.charAt(i);
				    spaise=false;
				    }
				 else temp =temp+s.charAt(i);///написати символ
				 }
			 }         
       
		 } text.clear();
		 text.add(temp);
    return text;
    }

    }
    
