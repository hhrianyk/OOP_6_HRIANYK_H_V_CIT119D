package ua.khpi.oop.Hrianyk05;
 /**
 * \brief L5
 * 	\author Heorhii Hrianyk
 * 	\version 1.0
 * 	\date septemer 2020 ����
 * 	\warning ������ ����� ������ ����� ��� ��������� �����
 *
 * ��������:
 *������ �����. � ������ �������� �� �������, ��� ��������, �� �� � �������.
 * ��������, �� ������������, ������� �� �������. ̳� �������������� ����,
 *  �� ����������� ������� �����, �������� ���� � ���� ������� ("a,b,c" -> "a, b, c").
 *   ������� ���������� ����� �� ���������.
 */ 
 import java.util.Scanner;
 
 public class Hrianyk_Heorhii_05 {
	 
	public static Scanner in = new Scanner(System.in);
	public static void main(final String[] args) {
    	 
		System.out.print("������ ��� �����: ");
		�ontainer s=new �ontainer();
		String s2=new String(in.nextLine());
		s.add(s2);
		Iterator<String> iterator=s.iterator(); 

		 Helper.PrintLine(s.toString());///����� ������
		s=Helper.Task6(s);///������� ��������

		 
		Helper.PrintNewLine(s.toString());///;����� �������������� �����
		System.out.print("\n ����� ����� i�������(while):");
        while (iterator.hasNext())
       {
   	    System.out.print(iterator.next().toString());
       }
       /* System.out.print("\n ����� ����� i�������(for each):");
        for ( var x: s.m_data)
        System.out.print(x);*/
    }
}
