 /**
 * \brief L6
 * 	\author Heorhii Hrianyk
 * 	\version 1.0
 * 	\date   2020 ��
 * 	\warning ������ ����� ��������� ��� ��������� ����������� ����
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
	   	 System.out.println("\n\n ������ �������:"
				 +"\n*1-������� ������i �������i ����i"
				 +"\n*2 -������ ����"
				 +"\n*3 -�������� ������� ��������"
				 +"\n*4 - ���������"
				 +"\n*5 - �����"
				 +"\n*6 - ���������"
				 +"\n*7 - �������� ���(save)"
				 +"\n*8 - ����������� ���(load)"
				 +"\n*9 (del)-�������� ���i"
				 +"\n*10 (exit)-�����"
				 +"\n*11 - ������� ���� ( �� 3)"
				 +"\n*12 - ������ ���� ( �� 3) "
				 +"\n*13 - ���������� (�� 3)"
				 +"\n\n ���� �������: ");
	   	 
	   	 return in.nextInt();
	   	 
	    }

	    	public static void Menu() ///������� ��������� ������������� �� ����������� �������
	    	{
	    		�ontainer s=new �ontainer();
	    		
	    		while(true)///����������� ���� ���� �������� ��������� �������
	    		{
	                        
	    		int  k=dialog();
	    		try {
	    		switch(k)///����� ������� �������
	    		{
	    		case 1: My_Helper.PrintLine(s.toString());
	    		break;
	    		case 2:
	    			System.out.print("������ ��� �����: ");
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
	            System.out.print("\n\n���������� �����:"+ serializator.serialization(s));
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
    			System.out.print("\n\n\n���� ���� �� ���. ��� ����� ��� �����!!\n\n");}
	    	}
	    }

	}


