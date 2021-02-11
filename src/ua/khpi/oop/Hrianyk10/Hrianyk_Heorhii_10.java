package ua.khpi.oop.Hrianyk10;

 
import java.util.Scanner;
/**
* \brief L10
* 	\author Heorhii Hrianyk
* 	\version 1.0
* 	\date februar 2021 года
* 	\warning Данный класс создан тільки для начальних цілей
*
 

*/ 
 

public class Hrianyk_Heorhii_10 {

	public static Scanner in = new Scanner(System.in);
	public static void main(final String[] args) {
   	 
		 
		if  (args[0].equals("auto")||args[0].equals("-auto") )
		{	
			  Console_program_auto.Menu();			
		}
		 else  
		  Console_program.Menu();


			 
   }
}

