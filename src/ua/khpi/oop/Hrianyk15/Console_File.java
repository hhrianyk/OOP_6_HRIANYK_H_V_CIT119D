package ua.khpi.oop.Hrianyk15;


import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Console_File {
 
	public static Scanner in = new Scanner(System.in);
 

	public static int dialogOut() throws IOException, InterruptedException
	    {
		 //for (int i = 0; i < 50; ++i) System.out.println();
 
	   	 System.out.print("\n\n Оберіть команду:"
	   			 +"\n*1 - Місце знаходження"
				 +"\n*2 - Файли в директорії"
				 +"\n*3 - Вийти із директорії"
				 +"\n*4 - Вибрати файл"
				 +"\n*5 - Створити директорію "
				 +"\n*6 - Перейти за адресою: "
				 +"\n*7 - Save файл"
				 +"\n\n ваша команда: ");
	   	 
	   	 return in.nextInt();
	   	 
	    }
	
	public static File MenuFillOut() ///функціє проводить координування по можливостям програм
	{
		File file= new File("C:/Users/дом/Documents");
		while(true)///нескінченний цикл який дозволяє працювати програмі
		{
        try {            
		int  k=dialogOut();
		
		switch(k)///пошук введеної команди
		{
		case 1:for (int i = 0; i < 50; ++i) System.out.println();
			System.out.println("\n Шлях: "+file.getPath()); //getAbsolutePath
			break;
		case 2:  
		{
			int a=0;
		for (int i = 0; i < 50; ++i) System.out.println();
		System.out.print("Файли:"+file.getPath()+"\n");
			for (File file2 : file.listFiles())
		    {
			 if (a%5==0) System.out.print("\n");a++;
			 System.out.printf("%-25s  ",file2.getName());
			} ;///////////
		}
		break;
		case 3:for (int i = 0; i < 50; ++i) System.out.println();file=file.getParentFile();
		for (int i = 0; i < 50; ++i) System.out.println();
		break;
		case 4: 
			for (int i = 0; i < 50; ++i) System.out.println();
			{System.out.print("Ведіть назву файлу:");
			String s = in.nextLine();
			 file=new File(file.getAbsolutePath()+"/"+in.nextLine());
			}
			if (file.isFile()==true)return file;
			 if(file.isDirectory()==true);
			 else  {
				   System.out.print("незнайдено");
				   file=file.getParentFile();
				   }
		break;
		case 5:
		{for (int i = 0; i < 50; ++i) System.out.println();
			System.out.print("Ведіть назву директрії: ");
			String s = in.nextLine();
			 File dir=new File(file.getPath()+"/"+in.nextLine());
			 System.out.println("Створення директорії: "+dir.mkdirs());
			 
		}
	      break;
		case 6:
		{for (int i = 0; i < 50; ++i) System.out.println();
			{
				System.out.print("Ведіть адресу: ");
			    String s = in.nextLine();
			    s = in.nextLine();
			    String s2=new String();
			    for (int i=0;i<s.length();i++)
			    {
			    	if (s.charAt(i)=='\\') s2+="/";
					else s2+=s.charAt(i);
			    }
			    file=new File(s2);
			}
		}
	      break;  		
		   
		case 7:
		{for (int i = 0; i < 50; ++i) System.out.println();
			System.out.print("Ведіть назву файлу:");
		String s = in.nextLine();
		
		  return  new File(file.getAbsolutePath()+"/"+in.nextLine());
		
		}
			 
		}	
		}catch(Exception e)	  {	for (int i=0;i<10;i++)System.out.println(" EROR EROR EROR EROR EROR EROR EROR EROR EROR EROR EROR EROR EROR EROR EROR EROR EROR EROR EROR EROR EROR EROR EROR EROR EROR EROR EROR EROR EROR EROR EROR EROR EROR EROR EROR EROR EROR EROR EROR EROR EROR EROR EROR EROR ");
			System.out.print("\n\n\nТрапилась помилка. Але тепер все добре!!\n\n");
			System.out.println(e);}
     }
		
  }
 
 
	public static int dialogIn() throws IOException, InterruptedException
    {
	 //for (int i = 0; i < 50; ++i) System.out.println();

   	 System.out.print("\n\n Оберіть команду:"
   			 +"\n*1 - Місце знаходження"
			 +"\n*2 - Файли в директорії"
			 +"\n*3 - Перейти в директорію"
			 +"\n*4 - Вийти із директорії"
			 +"\n*5 - Відкрити файл"
			 +"\n*6 - Перейти за адресою: "
			 +"\n\n ваша команда: ");
   	 
   	 return in.nextInt();
   	 
    }

public static File MenuFillIn() ///функціє проводить координування по можливостям програм
{
	File file= new File("C:/Users/дом/Documents");
	while(true)///нескінченний цикл який дозволяє працювати програмі
	{
    try {            
	int  k=dialogIn();
	
	switch(k)///пошук введеної команди
	{
	case 1:
		for (int i = 0; i < 50; ++i) System.out.println();
		System.out.println("\n Шлях: "+file.getPath()); //getAbsolutePath
	break;
	case 2:  
	{   for (int i = 0; i < 50; ++i) System.out.println();
		int a=0;
	    System.out.print("Файли:"+file.getPath()+"\n");
		for (File file2 : file.listFiles())
	    {
			if (a%4==0) System.out.print("\n");a++;
		 	System.out.printf("%-25s  ",file2.getName());
		} ///////////
	}
	break;
	case 3:
	{for (int i = 0; i < 50; ++i) System.out.println();
		System.out.print("Ведіть назву файлу:");
		String s = in.nextLine();
		file=new File(file.getAbsolutePath()+"/"+in.nextLine());
	}
	   if (file.isDirectory()==false)
		   {
		   System.out.print("Дирикторія незнайдена");
		   file=file.getParentFile();
		   }
	break;
	case 4:
		for (int i = 0; i < 50; ++i) System.out.println();
		file=file.getParentFile();
	break;
	case 5: 
		{for (int i = 0; i < 50; ++i) System.out.println();
			System.out.print("Ведіть назву файлу:");
			String s = in.nextLine();
			file=new File(file.getAbsolutePath()+"/"+in.nextLine());
		}
		   if (file.isFile()==true)return file;
	break;
	case 6:
	{for (int i = 0; i < 50; ++i) System.out.println();
		{
			System.out.print("Ведіть адресу: ");
		    String s = in.nextLine();
		    s = in.nextLine();
		    String s2=new String();
		    for (int i=0;i<s.length();i++)
		    {
		    	if (s.charAt(i)=='\\') s2+="/";
				else s2+=s.charAt(i);
		    }
		    file=new File(s2);
		}
	}
      break;  		
	}   
	}catch(Exception e)	  {	for (int i=0;i<10;i++)System.out.println(" EROR EROR EROR EROR EROR EROR EROR EROR EROR EROR EROR EROR EROR EROR EROR EROR EROR EROR EROR EROR EROR EROR EROR EROR EROR EROR EROR EROR EROR EROR EROR EROR EROR EROR EROR EROR EROR EROR EROR EROR EROR EROR EROR EROR ");
		System.out.print("\n\n\nТрапилась помилка. Але тепер все добре!!\n\n");
		System.out.println(e);}
 }
	
}


}

 
