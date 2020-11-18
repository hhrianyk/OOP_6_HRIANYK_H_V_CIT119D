package ua.khpi.oop.Hrianyk02;

/**
 * \brief Дочерний класс
 * 	\author Heorhii Hrianyk
 * 	\version 1.0
 * 	\date septemer 2020 года
 * 	\warning Данный класс создан тільки для начальних цілей
 *
 * Завдання:
 *1.Знайти найбільший спільний дільник двох цілих позитивних чисел.
 *2.Знайти суму цифр заданого цілого числа.
 *3.Знайти найбільшу цифру в десятковому запису цілочисельного значення.
 *4.Знайти позиції всіх найменших цифр в десятковому запису цілочисельного значення.
 *5.Перевірити, чи є задане число простим (тобто не ділиться без залишку на жодні числа, крім себе і 1).
 *6.!Перевірити чи дорівнює сума перших трьох цифр сумі останніх трьох цифр в десятковому запису 6-значного цілого числа.
 *7.Перевірити чи рівні значення першої та останньої, а також другої та передостанньої цифри в вісімковому запису 4-значного цілого числа.
 *8.Знайти суму всіх парних і суму всіх непарних цифр в десятковому запису 8-значного цілого числа.
 *9.Підрахувати кількість цифр, що відображаються за допомогою латинських букв в шістнадцятковому запису 10-значного цілого числа.
 *10.Знайти кількість комбінацій 01 та 10 в двійковому запису цілого числа.
 */
import java.util.Scanner;
//import java.util.Random;

public final class Hrianyk_Heorhii_02 {///основний клас
	public static Scanner in = new Scanner(System.in);///для вводу

    public static void main(final String[] args)///main функція
    {
         // GSD();///1.Знайти найбільший спільний дільник двох цілих позитивних чисел.
          //SumDigits();///*2.Знайти суму цифр заданого цілого числа.
          //LargestNumber();/// *3.Знайти найбільшу цифру в десятковому запису цілочисельного значення.
          ///Positions();///*4.Знайти позиції всіх найменших цифр в десятковому запису цілочисельного значення.
          ///IsPrime(); /// *5.Перевірити, чи є задане число простим (тобто не ділиться без залишку на жодні числа, крім себе і 1).
          TheSumOfThree();///*6.!Перевірити чи дорівнює сума перших трьох цифр сумі останніх трьох цифр в десятковому запису 6-значного цілого числа.
          ///TheSumOfTwoTwo();/// *7.Перевірити чи рівні значення першої та останньої, а також другої та передостанньої цифри в вісімковому запису 4-значного цілого числа.
        ///SumIsCouple();///*8.Знайти суму всіх парних і суму всіх непарних цифр в десятковому запису 8-значного цілого числа.
        ///LatinLetters();/// *9.Підрахувати кількість цифр, що відображаються за допомогою латинських букв в шістнадцятковому запису 10-значного цілого числа.
        ///Combinations();/// *10.Знайти кількість комбінацій 01 та 10 в двійковому запису цілого числа.

    }

    public static void GSD()///.Знайти найбільший спільний дільник двох цілих позитивних чисел.
    {
        System.out.print("\nTask 01\n");
         int number1,number2,res;
        System.out.println("ПОПЕРЕДЖЕННЯ: Вводити лише додатні чила.\nУ разі введенне відємного числа воно буде перетворене у додоатнє");
        System.out.print("\nВведіть перше число: ");
        number1=in.nextInt();
        System.out.print("Введіть друге число: ");
        number2=in.nextInt();
        if(number1<0)number1*=-1;
        if(number2<0)number2*=-1;
        do {
            res = number1 % number2;
            number1 = number2;
            number2 = res;
        } while (res != 0);
        System.out.println("Найбільший спільний дільник: "+res);

    }
    public static void SumDigits()///2.Знайти суму цифр заданого цілого числа.
    {
        System.out.print("\n\nTask 02");
        System.out.print("\nВведіть ваше число: ");
        int num=in.nextInt();

        int sum = 0;
        while (num != 0) {
            sum += num % 10;
            num /= 10;
        }
        System.out.println("Cумa цифр: "+((sum < 0) ? -sum : sum));
    }
    public  static void LargestNumber()///3.Знайти найбільшу цифру в десятковому запису цілочисельного значення.
    {
        System.out.print("\n\nTask 03");
        System.out.print("\nВведіть ваше число: ");
        int num=in.nextInt();
         int larg= 0;
        while (num != 0) {
          if ( num % 10>larg) larg=num % 10;
            num /= 10;
        }
        System.out.println("Найбільша цифра: "+larg);
    }
    public static void Positions()///4.Знайти позиції всіх найменших цифр в десятковому запису цілочисельного значення.
    {
        System.out.print("\n\nTask 04");
        System.out.print("\nВведіть ваше число: ");
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
        System.out.print("Позиції всіх найменших цифр: "+pos);

    }
    public static void IsPrime()///5.Перевірити, чи є задане число простим (тобто не ділиться без залишку на жодні числа, крім себе і 1).
    {System.out.print("\n\nTask 05");
        System.out.print("\nВведіть ваше число: ");
        int num=in.nextInt();
        float k = 0 , l = 0;
        for (int i = 2; i < num - 1; i++) {
            k =(float) num / i;
            if (k == (int)(k))
            l = l + 1;

        }
        System.out.println("Задане число: "+(l >= 1? "не просте":"просте"));
    }
     public static void TheSumOfThree()///6.!Перевірити чи дорівнює сума перших трьох цифр сумі останніх трьох цифр в десятковому запису 6-значного
     {
     
         System.out.print("\n\nTask 06");
         System.out.print("\nВведене випадкове число у якому  6 знакі:");

         
         System.out.println("\n+---------+-----------+");
         System.out.println("|Число    |порівняння |");
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


         System.out.println("|"+a+"   |" + ( sum1 ==  sum2 ? "дорівнює" : "не дорівнює")+"|");
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

     
    public static void TheSumOfTwoTwo()///7.Перевірити чи рівні значення першої та останньої, а також другої та передостанньої цифри в вісімко
    {
        System.out.print("\n\nTask 07");
        System.out.print("\nВведіть ваше число: ");
        int num=in.nextInt();
        float a=0;
        a=B_R(num,0,8);
        num=(int)a/10;
        System.out.print("Восьмирічнe число: "+num);

        String s=new String (String.valueOf(num));


        if(s.charAt(0)==s.charAt(s.length()-1)) System.out.print("\nЗначення першої та останньої- рівні");
        else System.out.print("\nзначення першої та останньої- не рівні");

        if(s.charAt(1)==s.charAt(s.length()-2)) System.out.print("\nзначення другог та передостанього числа - рівні");
        else System.out.print("\nзначення другог та передостанього числа - не рівні");




    }
     public static float B_R(int N,float a,int b)///конвертування із однієї системи в іншу
    {
        if (N != 0)
      {
          a=B_R(N / b, a / 10 + (N % b), b);
        a = a * 10;
        return a;
       }
    else  return  a;
    }
    public static void SumIsCouple()///8.Знайти суму всіх парних і суму всіх непарних цифр в десятковому запису 8-значного цілого числа.
    {
        System.out.print("\n\nTask 08");
        System.out.print("\nВведіть ваше число у якому не менше 8 знакі: ");
        int num = in.nextInt();

        int sumP = 0,sumN=0;
        while (num != 0) {
            if(num%2==0)
            sumP += num % 10;
            else sumN += num % 10;
            num /= 10;
        }
        System.out.print("Cуму всіх парних: "+sumP + "\nCуму всіх непарних цифр: "+sumN);
    }
    public  static void LatinLetters()///9.Підрахувати кількість цифр, що відображаються за допомогою латинських букв в шістнадцятковому запису
    {
        System.out.print("\n\nTask 09");
        System.out.print("\nВведіть ваше число у якому не менше 10 знакі: ");
        int num=in.nextInt();

        String s=new String(Integer.toHexString((int)num));
        System.out.print("Шіснадцфтирічне число: "+s);

        int count=0;
        for(int i=0;i<s.length();i++)
            if((96<(char)s.charAt(i)&&(char)s.charAt(i)<102))
                count++;
        System.out.println("Kількість цифр, що відображаються за допомогою латинських букв : "+count);

    }
    public static void  Combinations()///10.Знайти кількість комбінацій 01 та 10 в двійковому запису цілого числа.
    {System.out.print("\n\nTask 10");
        System.out.print("\nВведіть ваше число : ");
        int num=in.nextInt();
        float a=0;
        a=B_R(num,0,2);
        num=(int)a/10;
        System.out.print("Двійкове число: "+num);
        int count=0;
        String s=new String (String.valueOf(num));
        for(int i=0;i<s.length()-1;i++)
        {
            if((s.charAt(i)=='0'&&s.charAt(i+1)=='1')||(s.charAt(i)=='1'&&s.charAt(i+1)=='0'))
                count++;

        }
        System.out.print("\nKількість комбінацій: "+count);

    }
    }
  
