package ua.khpi.oop.Hrianyk11;


import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Console_File {
 
	public static Scanner in = new Scanner(System.in);
 

	public static int dialogOut() throws IOException, InterruptedException
	    {
		 //for (int i = 0; i < 50; ++i) System.out.println();
 
	   	 System.out.print("\n\n ������ �������:"
	   			 +"\n*1 - ̳��� �����������"
				 +"\n*2 - ����� � ��������"
				 +"\n*3 - ����� �� ��������"
				 +"\n*4 - ������� ����"
				 +"\n*5 - �������� ��������� "
				 +"\n*6 - ������� �� �������: "
				 +"\n*7 - Save ����"
				 +"\n\n ���� �������: ");
	   	 
	   	 return in.nextInt();
	   	 
	    }
	
	public static File MenuFillOut() ///������� ��������� ������������� �� ����������� �������
	{
		File file= new File("C:/Users/���/Documents");
		while(true)///����������� ���� ���� �������� ��������� �������
		{
        try {            
		int  k=dialogOut();
		
		switch(k)///����� ������� �������
		{
		case 1:for (int i = 0; i < 50; ++i) System.out.println();
			System.out.println("\n ����: "+file.getPath()); //getAbsolutePath
			break;
		case 2:  
		{
			int a=0;
		for (int i = 0; i < 50; ++i) System.out.println();
		System.out.print("�����:"+file.getPath()+"\n");
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
			{System.out.print("����� ����� �����:");
			String s = in.nextLine();
			 file=new File(file.getAbsolutePath()+"/"+in.nextLine());
			}
			if (file.isFile()==true)return file;
			 if(file.isDirectory()==true);
			 else  {
				   System.out.print("����������");
				   file=file.getParentFile();
				   }
		break;
		case 5:
		{for (int i = 0; i < 50; ++i) System.out.println();
			System.out.print("����� ����� �������: ");
			String s = in.nextLine();
			 File dir=new File(file.getPath()+"/"+in.nextLine());
			 System.out.println("��������� ��������: "+dir.mkdirs());
			 
		}
	      break;
		case 6:
		{for (int i = 0; i < 50; ++i) System.out.println();
			{
				System.out.print("����� ������: ");
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
			System.out.print("����� ����� �����:");
		String s = in.nextLine();
		
		  return  new File(file.getAbsolutePath()+"/"+in.nextLine());
		
		}
			 
		}	
		}catch(Exception e)	  {	for (int i=0;i<10;i++)System.out.println(" EROR EROR EROR EROR EROR EROR EROR EROR EROR EROR EROR EROR EROR EROR EROR EROR EROR EROR EROR EROR EROR EROR EROR EROR EROR EROR EROR EROR EROR EROR EROR EROR EROR EROR EROR EROR EROR EROR EROR EROR EROR EROR EROR EROR ");
			System.out.print("\n\n\n��������� �������. ��� ����� ��� �����!!\n\n");
			System.out.println(e);}
     }
		
  }
 
 
	public static int dialogIn() throws IOException, InterruptedException
    {
	 //for (int i = 0; i < 50; ++i) System.out.println();

   	 System.out.print("\n\n ������ �������:"
   			 +"\n*1 - ̳��� �����������"
			 +"\n*2 - ����� � ��������"
			 +"\n*3 - ������� � ���������"
			 +"\n*4 - ����� �� ��������"
			 +"\n*5 - ³������ ����"
			 +"\n*6 - ������� �� �������: "
			 +"\n\n ���� �������: ");
   	 
   	 return in.nextInt();
   	 
    }

public static File MenuFillIn() ///������� ��������� ������������� �� ����������� �������
{
	File file= new File("C:/Users/���/Documents");
	while(true)///����������� ���� ���� �������� ��������� �������
	{
    try {            
	int  k=dialogIn();
	
	switch(k)///����� ������� �������
	{
	case 1:
		for (int i = 0; i < 50; ++i) System.out.println();
		System.out.println("\n ����: "+file.getPath()); //getAbsolutePath
	break;
	case 2:  
	{   for (int i = 0; i < 50; ++i) System.out.println();
		int a=0;
	    System.out.print("�����:"+file.getPath()+"\n");
		for (File file2 : file.listFiles())
	    {
			if (a%4==0) System.out.print("\n");a++;
		 	System.out.printf("%-25s  ",file2.getName());
		} ///////////
	}
	break;
	case 3:
	{for (int i = 0; i < 50; ++i) System.out.println();
		System.out.print("����� ����� �����:");
		String s = in.nextLine();
		file=new File(file.getAbsolutePath()+"/"+in.nextLine());
	}
	   if (file.isDirectory()==false)
		   {
		   System.out.print("��������� ����������");
		   file=file.getParentFile();
		   }
	break;
	case 4:
		for (int i = 0; i < 50; ++i) System.out.println();
		file=file.getParentFile();
	break;
	case 5: 
		{for (int i = 0; i < 50; ++i) System.out.println();
			System.out.print("����� ����� �����:");
			String s = in.nextLine();
			file=new File(file.getAbsolutePath()+"/"+in.nextLine());
		}
		   if (file.isFile()==true)return file;
	break;
	case 6:
	{for (int i = 0; i < 50; ++i) System.out.println();
		{
			System.out.print("����� ������: ");
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
		System.out.print("\n\n\n��������� �������. ��� ����� ��� �����!!\n\n");
		System.out.println(e);}
 }
	
}


}

 
