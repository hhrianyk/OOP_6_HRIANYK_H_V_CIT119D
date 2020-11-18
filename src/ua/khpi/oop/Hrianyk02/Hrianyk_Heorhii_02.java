package ua.khpi.oop.Hrianyk02;

/**
 * \brief �������� �����
 * 	\author Heorhii Hrianyk
 * 	\version 1.0
 * 	\date septemer 2020 ����
 * 	\warning ������ ����� ������ ����� ��� ��������� �����
 *
 * ��������:
 *1.������ ��������� ������� ������ ���� ����� ���������� �����.
 *2.������ ���� ���� �������� ������ �����.
 *3.������ �������� ����� � ����������� ������ �������������� ��������.
 *4.������ ������� ��� ��������� ���� � ����������� ������ �������������� ��������.
 *5.���������, �� � ������ ����� ������� (����� �� ������� ��� ������� �� ���� �����, ��� ���� � 1).
 *6.!��������� �� ������� ���� ������ ����� ���� ��� ������� ����� ���� � ����������� ������ 6-�������� ������ �����.
 *7.��������� �� ��� �������� ����� �� ��������, � ����� ����� �� ������������� ����� � ��������� ������ 4-�������� ������ �����.
 *8.������ ���� ��� ������ � ���� ��� �������� ���� � ����������� ������ 8-�������� ������ �����.
 *9.ϳ��������� ������� ����, �� ������������� �� ��������� ���������� ���� � ���������������� ������ 10-�������� ������ �����.
 *10.������ ������� ��������� 01 �� 10 � ��������� ������ ������ �����.
 */
import java.util.Scanner;
//import java.util.Random;

public final class Hrianyk_Heorhii_02 {///�������� ����
	public static Scanner in = new Scanner(System.in);///��� �����

    public static void main(final String[] args)///main �������
    {
         // GSD();///1.������ ��������� ������� ������ ���� ����� ���������� �����.
          //SumDigits();///*2.������ ���� ���� �������� ������ �����.
          //LargestNumber();/// *3.������ �������� ����� � ����������� ������ �������������� ��������.
          ///Positions();///*4.������ ������� ��� ��������� ���� � ����������� ������ �������������� ��������.
          ///IsPrime(); /// *5.���������, �� � ������ ����� ������� (����� �� ������� ��� ������� �� ���� �����, ��� ���� � 1).
          TheSumOfThree();///*6.!��������� �� ������� ���� ������ ����� ���� ��� ������� ����� ���� � ����������� ������ 6-�������� ������ �����.
          ///TheSumOfTwoTwo();/// *7.��������� �� ��� �������� ����� �� ��������, � ����� ����� �� ������������� ����� � ��������� ������ 4-�������� ������ �����.
        ///SumIsCouple();///*8.������ ���� ��� ������ � ���� ��� �������� ���� � ����������� ������ 8-�������� ������ �����.
        ///LatinLetters();/// *9.ϳ��������� ������� ����, �� ������������� �� ��������� ���������� ���� � ���������������� ������ 10-�������� ������ �����.
        ///Combinations();/// *10.������ ������� ��������� 01 �� 10 � ��������� ������ ������ �����.

    }

    public static void GSD()///.������ ��������� ������� ������ ���� ����� ���������� �����.
    {
        System.out.print("\nTask 01\n");
         int number1,number2,res;
        System.out.println("������������: ������� ���� ������ ����.\n� ��� �������� ������� ����� ���� ���� ����������� � �������");
        System.out.print("\n������ ����� �����: ");
        number1=in.nextInt();
        System.out.print("������ ����� �����: ");
        number2=in.nextInt();
        if(number1<0)number1*=-1;
        if(number2<0)number2*=-1;
        do {
            res = number1 % number2;
            number1 = number2;
            number2 = res;
        } while (res != 0);
        System.out.println("��������� ������� ������: "+res);

    }
    public static void SumDigits()///2.������ ���� ���� �������� ������ �����.
    {
        System.out.print("\n\nTask 02");
        System.out.print("\n������ ���� �����: ");
        int num=in.nextInt();

        int sum = 0;
        while (num != 0) {
            sum += num % 10;
            num /= 10;
        }
        System.out.println("C��a ����: "+((sum < 0) ? -sum : sum));
    }
    public  static void LargestNumber()///3.������ �������� ����� � ����������� ������ �������������� ��������.
    {
        System.out.print("\n\nTask 03");
        System.out.print("\n������ ���� �����: ");
        int num=in.nextInt();
         int larg= 0;
        while (num != 0) {
          if ( num % 10>larg) larg=num % 10;
            num /= 10;
        }
        System.out.println("�������� �����: "+larg);
    }
    public static void Positions()///4.������ ������� ��� ��������� ���� � ����������� ������ �������������� ��������.
    {
        System.out.print("\n\nTask 04");
        System.out.print("\n������ ���� �����: ");
        int num;
        num = in.nextInt();

        int k=0;
        String s=new String( Integer.toString(num));
        k=s.charAt(0);
        String pos=new String();
        for (int i=0 ;i<s.length();i++)
        {
            if (k>s.charAt(i)){
                k = s.charAt(i);
                pos=Integer.toString(i);
            }

            else if(k==s.charAt(i))  pos=pos+" "+i;

        }
        System.out.print("������� ��� ��������� ����: "+pos);

    }
    public static void IsPrime()///5.���������, �� � ������ ����� ������� (����� �� ������� ��� ������� �� ���� �����, ��� ���� � 1).
    {System.out.print("\n\nTask 05");
        System.out.print("\n������ ���� �����: ");
        int num=in.nextInt();
        float k = 0 , l = 0;
        for (int i = 2; i < num - 1; i++) {
            k =(float) num / i;
            if (k == (int)(k))
            l = l + 1;

        }
        System.out.println("������ �����: "+(l >= 1? "�� ������":"������"));
    }
     public static void TheSumOfThree()///6.!��������� �� ������� ���� ������ ����� ���� ��� ������� ����� ���� � ����������� ������ 6-��������
     {
     
         System.out.print("\n\nTask 06");
         System.out.print("\n������� ��������� ����� � �����  6 ����:");

         
         System.out.println("\n+---------+-----------+");
         System.out.println("|�����    |��������� |");
         System.out.println("+---------+-----------+");
      for (int i=0;i<10;i++)
      {
    	 int num = (int)(Math.random()*1000000);
    	 int a=num;
         int sum1 = 0;
         int sum2 =0;
         sum1= sumThree1(num,sum1);
         num/=1000;
         sum2= sumThree1(num,sum2);


         System.out.println("|"+a+"   |" + ( sum1 ==  sum2 ? "�������" : "�� �������")+"|");
         System.out.println("+---------+-----------+");

     }
     }
         public static int sumThree1(int  num,int  sum)
         {
        	 for (int i = 0; i < 3; i++) {
                 sum += num % 10;
                 num /= 10;
             }
        	 return sum;
         }

     
    public static void TheSumOfTwoTwo()///7.��������� �� ��� �������� ����� �� ��������, � ����� ����� �� ������������� ����� � �����
    {
        System.out.print("\n\nTask 07");
        System.out.print("\n������ ���� �����: ");
        int num=in.nextInt();
        float a=0;
        a=B_R(num,0,8);
        num=(int)a/10;
        System.out.print("���������e �����: "+num);

        String s=new String (String.valueOf(num));


        if(s.charAt(0)==s.charAt(s.length()-1)) System.out.print("\n�������� ����� �� ��������- ���");
        else System.out.print("\n�������� ����� �� ��������- �� ���");

        if(s.charAt(1)==s.charAt(s.length()-2)) System.out.print("\n�������� ������ �� �������������� ����� - ���");
        else System.out.print("\n�������� ������ �� �������������� ����� - �� ���");




    }
     public static float B_R(int N,float a,int b)///������������� �� ���� ������� � ����
    {
        if (N != 0)
      {
          a=B_R(N / b, a / 10 + (N % b), b);
        a = a * 10;
        return a;
       }
    else  return  a;
    }
    public static void SumIsCouple()///8.������ ���� ��� ������ � ���� ��� �������� ���� � ����������� ������ 8-�������� ������ �����.
    {
        System.out.print("\n\nTask 08");
        System.out.print("\n������ ���� ����� � ����� �� ����� 8 ����: ");
        int num = in.nextInt();

        int sumP = 0,sumN=0;
        while (num != 0) {
            if(num%2==0)
            sumP += num % 10;
            else sumN += num % 10;
            num /= 10;
        }
        System.out.print("C��� ��� ������: "+sumP + "\nC��� ��� �������� ����: "+sumN);
    }
    public  static void LatinLetters()///9.ϳ��������� ������� ����, �� ������������� �� ��������� ���������� ���� � ���������������� ������
    {
        System.out.print("\n\nTask 09");
        System.out.print("\n������ ���� ����� � ����� �� ����� 10 ����: ");
        int num=in.nextInt();

        String s=new String(Integer.toHexString((int)num));
        System.out.print("س������������ �����: "+s);

        int count=0;
        for(int i=0;i<s.length();i++)
            if((96<(char)s.charAt(i)&&(char)s.charAt(i)<102))
                count++;
        System.out.println("K������� ����, �� ������������� �� ��������� ���������� ���� : "+count);

    }
    public static void  Combinations()///10.������ ������� ��������� 01 �� 10 � ��������� ������ ������ �����.
    {System.out.print("\n\nTask 10");
        System.out.print("\n������ ���� ����� : ");
        int num=in.nextInt();
        float a=0;
        a=B_R(num,0,2);
        num=(int)a/10;
        System.out.print("������� �����: "+num);
        int count=0;
        String s=new String (String.valueOf(num));
        for(int i=0;i<s.length()-1;i++)
        {
            if((s.charAt(i)=='0'&&s.charAt(i+1)=='1')||(s.charAt(i)=='1'&&s.charAt(i+1)=='0'))
                count++;

        }
        System.out.print("\nK������� ���������: "+count);

    }
    }
  
