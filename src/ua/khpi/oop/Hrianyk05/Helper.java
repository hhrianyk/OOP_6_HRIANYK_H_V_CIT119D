package ua.khpi.oop.Hrianyk05;
/**
 * \brief L3-Help
 * 	\author Heorhii Hrianyk
 * 	\version 1.0
 * 	\date septemer 2020 ����
 * 	\warning ������ ����� ������ ����� ��� ��������� ����� �� ����� ��������� ����� main
 *
 * �������� �����:
 * ���������� ������� �� ����� ��� ���������� ������� ��������
 */ 


public class Helper
{
    //static functions
    public static  boolean  �onditional�heck(char text)/// �������� ������ �� �����
    {
        return ( text>64&&text<91)||( text>96&&text<=123)||text==32||text==44;
    }

    public static void PrintLine(String text)///����� ������ �� �������
    {
   	 System.out.println("\n\n��� �����(���������): "+text);
    }

    public static void PrintNewLine(String text)///����� ������ �� ������� �� �������� �������������
    {
   	 System.out.println("\n\n��� �����(³������������): "+text);
    }
    public static �ontainer Task6 (�ontainer text)//////����������� ������
    {
   	 String temp=new String();
   	 String s=new String(text.toString());
		 boolean spaise=false;
		 for (int i=0;i<s.length();i++)
		 {
			 if (Helper.�onditional�heck(s.charAt(i)))
			 {
				 if (s.charAt(i)==32) spaise=true;//�������� �� �����
				 else 
				 {
					 if(s.charAt(i)==44)///�������� �� ����
				 {
			     temp=temp+s.charAt(i) ;
			     spaise=true;
				 } 
				 else if(spaise==true)///�������� �����
					 
				 {  temp =temp+" "+s.charAt(i);
				    spaise=false;
				    }
				 else temp =temp+s.charAt(i);///�������� ������
				 }
			 }         
       
		 } text.clear();
		 text.add(temp);
    return text;
    }

    }
    
