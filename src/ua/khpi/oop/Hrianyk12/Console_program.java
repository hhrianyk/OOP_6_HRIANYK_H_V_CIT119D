package ua.khpi.oop.Hrianyk12;

 import java.util.Scanner;
 

 

public class Console_program {
	public static Scanner in = new Scanner(System.in);
	public static Serializator<ContainerList<PoliceFile>> serializator=new Serializator<ContainerList<PoliceFile>>();
	 public static int dialog()
	    {
	   	 System.out.print("\n\n ������ �������:"
				 +"\n*1 - ������� ������i �������i ����i"
				 +"\n*2 - ������ ����"
				 +"\n*3 - ������� ���"
				 +"\n*4 - �����"
				 +"\n*5 - ʳ������ ��������� � ��� "
				 +"\n*6 - �������� ���(save)"
				 +"\n*7 - ������������ � �����, ������������ � �����"
				 +"\n*8 - ���������"
				 +"\n*9 - ������ ��� ��'������� �� ������� 20 ���� � ��������, �� ���������� � ������� �� ������ ��������� \"��\". ���������: ���������, ������, �������, ����������."
				 +"\n*10 - �������� �� �������"
				 +"\n*11 - �������� ���i"
				 +"\n*12 (exit)-�����"
				 +"\n\n ���� �������: ");
	   	 
	   	 return in.nextInt();
	   	 
	    }

	    	public static void Menu() ///������� ��������� ������������� �� ����������� �������
	    	{
	    		ContainerList<PoliceFile> List=new ContainerList<PoliceFile>();
	    		
 
	    		while(true)///����������� ���� ���� �������� ��������� �������
	    		{
	            try {            
	    		int  k=dialog();
	    		
	    		switch(k)///����� ������� �������
	    		{
	    		case 1:  Helper.show(List);
	         	break;
	    	 	case 2: List=Helper.WaysToAddData(List);
	    		break;
	    		case 3: Helper.UpdateData(List);
	    		break;
	    		case 4: Helper.posuk(List);
	    		break;
	    		case 5: System.out.println("ʳ������ ��������� � ���: "+List.size());
	    		break;
	    		case 6: System.out.print("\n\n���������� �����:"+ serializator.serialization(List));
	    		break;
	    		case 7:  
	    		System.out.println("���� ������������ � �����\n");
	    	           for (var PF : List.�onverToArray())
	    	           {
	    	        	  var PFD=(PoliceFile)PF;
	    	        	    PFD.show();
	    	           }
	    	           System.out.println("\n ���� ������������ � �����\n"+List.toString());
	    	           
	    	    break;
	    		case 8: Helper.Sort(List);
	    		break;
	    		case 9: System.out.println(Helper.AppliedTask(List));
	    		break;
	    		case 10: Helper.romove(List);
	    		break;
	    		case 11: List.clear();
	    		break; 
	    		case 12:System.out.print("\n\n������ ���������. ������ ������"); return ;
	    		   		
	    		}   
	    		}catch(Exception e)	  {	//for (int i=0;i<10;i++)System.out.println(" EROR EROR EROR EROR EROR EROR EROR EROR EROR EROR EROR EROR EROR EROR EROR EROR EROR EROR EROR EROR EROR EROR EROR EROR EROR EROR EROR EROR EROR EROR EROR EROR EROR EROR EROR EROR EROR EROR EROR EROR EROR EROR EROR EROR ");
	    			System.out.print("\n\n\n��������� �������. ��� ����� ��� �����!!\n\n");
	    			System.out.println(e);}
	   }
	 }
}



