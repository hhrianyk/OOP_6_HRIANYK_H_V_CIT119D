package ua.khpi.oop.Hrianyk14;

 
 
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
 

public class Hrianyk_Heorhii_14 {
	/** ʳ������ �������� � ���� ����������. */
	private static final double DIVIDER = 1_000_000;
	
	public static Scanner in = new Scanner(System.in);
	public static void main(final String[] args) {
		long start = System.nanoTime();
		 System.out.print(Thread.currentThread().getName()+" - ����� ������\n");
		
 
		Console_program Menu=new Console_program();
		Menu.start();
		try {
			Menu.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 
      /* new Thread(new  PoliceFile()::printTableHead).start();
        new Thread(new  PoliceFile()::show).start();
        new Thread(new  PoliceFile()::printTableHead).start();
      */
		  System.out.print("\n"+Thread.currentThread().getName()+" - ������� ������; "+"��������� ������: "+ (System.nanoTime() - start) / DIVIDER*1000+"\n");
		  
	 	
		 
 
			 
   }
}

