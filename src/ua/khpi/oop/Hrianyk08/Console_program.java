 /**
 * \brief L8
 * 	\author Heorhii Hrianyk
 * 	\version 1.0
 * 	\date   2020 ��
 * 	\warning ������ ����� ��������� ��� ��������� ����������� ����
 *
 *  

 */ 


package ua.khpi.oop.Hrianyk08;
import java.util.Scanner;


public class Console_program {
	public static Scanner in = new Scanner(System.in);
	public static Serializator serializator=new Serializator();
	 public static int dialog()
	    {
	   	 System.out.print("\n\n ������ �������:"
				 +"\n*1 - ������� ������i �������i ����i"
				 +"\n*2 - ������ ����"
				 +"\n*3 - ������� ���"
				 +"\n*4 - ���������"
				 +"\n*5 - �����"
				 +"\n*6 - ʳ������ ��������� � ��� "
				 +"\n*7 - �������� ���(save)"
				 +"\n*8 - ����������� ���(load *.xml)"
				 +"\n*9 (clear)-�������� ���i"
				 +"\n*10 (exit)-�����"
				 +"\n\n ���� �������: ");
	   	 
	   	 return in.nextInt();
	   	 
	    }

	    	public static void Menu() ///������� ��������� ������������� �� ����������� �������
	    	{
	    		�ontainer List=new �ontainer();
	    		PoliceFile PL=new PoliceFile();
	    		while(true)///����������� ���� ���� �������� ��������� �������
	    		{
	            try {            
	    		int  k=dialog();
	    		
	    		switch(k)///����� ������� �������
	    		{
	    		case 1:  List.Print_run(List, PL);;///////////
	    		break;
	    		case 2: List= List.dop_INFO(List, PL);///////////
	    		break;
	    		case 3:List.UpdateData(List,PL);
	    		break;
	    		case 4: List.Sort(List);
	    		break;
	    		case 5 : List.posuk(List);
	     		break;
	    		case 6 :System.out.println("ʳ������ ��������� � ��� :"+List.size());
	    		break;
	    		case 7 : 
	            System.out.print("\n\n���������� �����:"+ serializator.serialization(List));
	    		break;
	    		case 8 : List=serializator.deserializtionXML();
	    		break;
	    		case 9 :List.clear();
	    		break;
	    		case 10 :return ;
	    		   		
	    		}   
	    		}catch(Exception e)	  {	for (int i=0;i<10;i++)System.out.println(" EROR EROR EROR EROR EROR EROR EROR EROR EROR EROR EROR EROR EROR EROR EROR EROR EROR EROR EROR EROR EROR EROR EROR EROR EROR EROR EROR EROR EROR EROR EROR EROR EROR EROR EROR EROR EROR EROR EROR EROR EROR EROR EROR EROR ");
	    			System.out.print("\n\n\n��������� �������. ��� ����� ��� �����!!\n\n");
	    			System.out.println(e);}
	   }
	        
	    }



	}



