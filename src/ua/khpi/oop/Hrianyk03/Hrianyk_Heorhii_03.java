package ua.khpi.oop.Hrianyk03;
/**
 
* \brief L3
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


 
 public class Hrianyk_Heorhii_03 {
	 public static Scanner in = new Scanner(System.in);
	public static void main(final String[] args) {
    	 
		System.out.print("������ ��� �����: ");
 
		 StringBuilder s= new StringBuilder(in.nextLine());///���� �����
		 Helper.PrintLine(s);///����� ������
		 s=Helper.Task6(s);///������� ��������

		 
		Helper.PrintNewLine(s);///;����� �������������� �����
    }
}
