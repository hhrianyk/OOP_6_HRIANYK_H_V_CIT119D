package ua.khpi.oop.Hrianyk15;

 
 
import java.awt.Label;
import java.util.Scanner;
/**
* \brief L10
* 	\author Heorhii Hrianyk
* 	\version 1.0
* 	\date februar 2021 ����
* 	\warning ������ ����� ������ ����� ��� ��������� �����
*
 

*/ 
 

public class Hrianyk_Heorhii_15 {
	/** ʳ������ �������� � ���� ����������. */
	private static final double DIVIDER = 1_000_000_000;
	
	public static Scanner in = new Scanner(System.in);
	public static void main(final String[] args) {
		long start = System.nanoTime();
		 System.out.print(Thread.currentThread().getName()+" - ����� ������\n");
		
		   if  (args[0].equals("auto")||args[0].equals("-auto") )
			{	
				new Console_program_auto(); 
			}
			 else   
			 {
				 Console_program Menu=new Console_program();
				 Menu.start();
				 try {	 Menu.join();} catch (InterruptedException e) {	e.printStackTrace();}
			}
 
		  System.out.print("\n"+Thread.currentThread().getName()+" - ������� ������; "+"��������� ������: "+ (System.nanoTime() - start) / DIVIDER*1000+"\n");
		  
	 	
		 
 
			 
   }
}

