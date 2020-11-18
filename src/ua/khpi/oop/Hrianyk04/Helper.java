package ua.khpi.oop.Hrianyk04;
//import java.sql.Date;
/**
 * \brief L4-Help
 * 	\author Heorhii Hrianyk
 * 	\version 1.0
 * 	\date septemer 2020 ����
 * 	\warning ������ ����� ������ ����� ��� ��������� ����� �� ����� ��������� ����� main
 *
 * �������� �����:
 * ���������� ������� �� ����� ��� ���������� ������� ��������
 */ 
import java.util.Scanner;
import java.util.Date;

public class Helper///��������� ���� �� �������� ������� �������
	 {
	
	    public static boolean debug=false;///����� ��� ������ ��  ����� �����
	    public static boolean help=false;///����� ��� ������ ��  ����� help
         static Date date = new Date();  /// ����� ��� �����㳺 �������� ���
		 public static Scanner in = new Scanner(System.in);///������ ��� ����� �����
	     public static  boolean  �onditional�heck(char text)///�������� �� �� ���������� ������
	     { if (debug==true)System.out.println("\n(("+date.toString()+") ��������� ������ '�onditional�heck' "
	     +"����� ���� :text-"+text+")");
	       if (debug==true)System.out.println("\n(("+date.toString()+") ������� '�onditional�heck' �������� ������ )");
	         return ( text>64&&text<91)||( text>96&&text<=123)||text==32||text==44;
	        
	     }

	     public static void PrintLine(String text)/// ������ �����
	     {
	    	 if (debug==true)System.out.println("\n(("+date.toString()+") ��������� ������ 'PrintLine' "
	    			 +"\n����� ���� :text-"+text+")");
	    	 System.out.println("\n\n��� �����: "+text);
	    	 if (debug==true)System.out.println("\n(("+date.toString()+") ������� 'PrintLine' �������� ������ )");
	     }

	     public static void PrintNewLine(String text)///������ ����� � �������� ������������
	     { if (debug==true)System.out.println("\n(("+date.toString()+") ��������� ������ 'PrintNewLine' )");
	    	 System.out.println("\n\n��� �����(³������������): "+text);
	    	 if (debug==true)System.out.println("\n(("+date.toString()+") ������� 'PrintNewLine' �������� ������ ");
	     }
	     
	     public static String Replacement(String text)///������� ������ ��� ���������� ����
	     { if (debug==true)System.out.println("\n(("+date.toString()+") ��������� ������ 'Replacement' )");
	    	 System.out.println("\n\n������ ��� ����: ");
	    	 text=in.nextLine();
	    	 if (debug==true)System.out.println("\n(("+date.toString()+") ������� 'Replacement' �������� ������ "
	    			 +"\n������ ����: text-"+text+")");
	    	 
	    	 return text;
	     }
	     public static void Help()///���������� ������� ��� ������ ������� ����������� �� ���������� ��� ��������
	     { if (debug==true)System.out.println("\n(("+date.toString()+") ��������� ������ 'Help' )");
	     if (help==true)
	     {
	    	 System.out.println("\n\n�����: ������ �����i� \n ����� �IT-119�\n ��������:\n������ �����. � ������ �������� ��i �������, ��i� �������i�, ��i �� � �������."
	    	 		+ "\n��������, �� ������������, ���i���� �� �������i. "
	    	 		+ "\n�i� ����i���������� �i���, �� ����������� ����i���i �����, �������� ���� � ���� ������� (\"a,b,c\" -> \"a, b, c\"). "
	    	 		+ "\n������� ���������� ����� �� ���������.");
	     }
	    	 System.out.println("\n\n�������� ������:"
	    			 + "\n*1(printI)-������� ������i �������i ����i"
	    			 + "\n*2 (printO)-������� ������i �������� ������ �������� �������i ����i"
	    			 +"\n*3 (add)-��������/������������ ����i"
	    			 +"\n*4 (task) 6-�������� ������� ��������"
	    			 +"\n*5 (help)-������� ta i�������i�"
	    			// +"\n*cls-������� �������"
	    			 +"\n*6 (del)-�������� ���i"
	    			 +"\n*7 (exit)-�����");
	    	 if (debug==true)System.out.println("\n(("+date.toString()+") ������� 'Help' �������� ������ )");
	     }
	     public static String Task6 (String  s)/// ������ �����
	     {
	    	 if (debug==true)System.out.println("(("+date.toString()+") ��������� ������ 'Task6' "
	     +"\n��i��i ���i :text-"+s+")");
	    	 String temp=new String();
			 int spaise=0;
			 for (int i=0;i<s.length();i++)
			 {
				 if (Helper.�onditional�heck(s.charAt(i)))
				 {
					 if (s.charAt(i)==32) spaise++;//�������� �� �����
					 else 
					 {
						 if(s.charAt(i)==44)///�������� �� ����
					 {	 
				     temp=temp+s.charAt(i) ;
					 spaise++;
					 if (debug==true)System.out.println("\n(("+date.toString()+") s.charAt(i)-"+s.charAt(i)+"; temp-"+temp+"; spaise-"+spaise +"; i-"+i+")");
					 } 
					 else if(spaise!=0)///�������� �����
						 
					 {  temp =temp+" "+s.charAt(i);
					 spaise=0;
					 if (debug==true)System.out.println("\n(("+date.toString()+") s.charAt(i)-"+s.charAt(i)+"; temp-"+temp+"; spaise-"+spaise+"; i-"+i+")" );
					    
					    }
					 else {
						 
						 temp =temp+s.charAt(i);///�������� ������
						 if (debug==true)System.out.println("\n(("+date.toString()+") s.charAt(i)-"+s.charAt(i)+"; temp-"+temp+"; spaise-"+spaise +"; i-"+i+")");
					 }
					 }
				 }         
	        
			 }
			 if (debug==true)System.out.println("\n(("+date.toString()+") ������� 'Task6' �������� ������ "
					 +"\n ����� ����:temp-"+temp+")");
	     return temp;
	     }
	 }

