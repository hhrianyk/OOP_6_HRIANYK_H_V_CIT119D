package ua.khpi.oop.Hrianyk14;
 import java.util.Scanner;
 

 

public class Console_program extends Thread {
	private static Scanner in = new Scanner(System.in);
	private static final double DIVIDER = 1_000_000_000;
	public static Serializator<ContainerList<PoliceFile>> serializator=new Serializator<ContainerList<PoliceFile>>();
    
	 public static int dialog()
	    {
	   	 System.out.print("\n\n ������ �������:"
				 +"\n*1 - ������� ������i �������i ����i"
				 +"\n*2 - ������ ����"
				 +"\n*3 - ������� ���"
				 +"\n*4 - ��������� ������������ �� ������� ������"
				 +"\n*5 - ʳ������ ��������� � ��� "
				 +"\n*6 - �������� ���(save)"
				 +"\n*7 - ������������ � �����, ������������ � �����"
				 +"\n*8 - ���������"
				 +"\n*9 - ������ ��� ��'������� �� ������� 20 ���� � ��������, �� ���������� � ������� �� ������ ��������� \"��\". ���������: ���������, ������, �������, ����������."
				 +"\n*10 - �������� �� �������"
				 +"\n*11 - �������� ���i"
				 +"\n*12 - ���������� Time out"
				 +"\n*13 (exit)-�����"
				 +"\n\n ���� �������: ");
	   	 
	   	 return in.nextInt();
	   	 
	    }

	    	@SuppressWarnings("deprecation")
			public static  void Menu() ///������� ��������� ������������� �� ����������� �������
	    	{
     
	    		
 
	    		while(true)///����������� ���� ���� �������� ��������� �������
	    		{
	            try {            
	    		int  k=dialog();
	    		
	    		switch(k)///����� ������� �������
	    		{
	    		case 1:  	    		  
               // new Thread (Helper::show).start();
                Helper.show(Obshchak.List);
	         	break;
	    	 	case 2: Obshchak.List=Helper.WaysToAddData(Obshchak.List);
	    		break;
	    		case 3: //new Thread(new  Helper::UpdateData).start();
	    		Helper.UpdateData(Obshchak.List);
	    		break;
	    		case 4: Helper.ComparisonOfParallelAndLinearSearch(Obshchak.List);
	    		break;
	    		case 5: System.out.println("ʳ������ ��������� � ���: "+Obshchak.List.size());
	    		break;
	    		case 6: //System.out.print("\n\n���������� �����:"+ serializator.serialization());
	    			Obshchak.Choice=k;
	    			new ProcessProcesses();
	    			for(;;)
	    			{
	    				Thread.sleep(10);
	    				if(Obshchak.stop==false)break;
	    			}
	    		break;
	    		case 7:  
	    		System.out.println("���� ������������ � �����\n");
	    	           for (var PF : Obshchak.List.�onverToArray())
	    	           {
	    	        	  var PFD=(PoliceFile)PF;
	    	        	    PFD.show();
	    	           }
	    	           System.out.println("\n ���� ������������ � �����\n"+Obshchak.List.toString());
	    	           
	    	    break;
	    		case 8: 	    		
	    		Obshchak.Choice=k;
    			new ProcessProcesses();
    			for(;;)
    			{
    				Thread.sleep(10);
    				if(Obshchak.stop==false)break;
    			}
	    		break;
	    		case 9:	    	
	    			Obshchak.Choice=k;
    			new ProcessProcesses();
 	    		break;
	    		case 10:
	    			Obshchak.Choice=k;
	    			new ProcessProcesses();
	    			for(;;)
	    			{
	    				Thread.sleep(10);
	    				if(Obshchak.stop==false)break;
	    				
	    			}
	    		break;
	    		case 11:	    
	    			Obshchak.Choice=k;
    			new ProcessProcesses();
	    		break; 
	    		case 12:  System.out.print("\n������ �������� Time out � ����������(0 - ������) : "); Obshchak.TimeOut=in.nextInt();break;
	    		case 13:System.out.print("\n\n������ ���������. ������ ������\n\n"); return ;
	    		   		
	    		}   
	    		}catch(Exception e)	  {	//for (int i=0;i<10;i++)System.out.println(" EROR EROR EROR EROR EROR EROR EROR EROR EROR EROR EROR EROR EROR EROR EROR EROR EROR EROR EROR EROR EROR EROR EROR EROR EROR EROR EROR EROR EROR EROR EROR EROR EROR EROR EROR EROR EROR EROR EROR EROR EROR EROR EROR EROR ");
	    			System.out.print("\n\n\n��������� �������. ��� ����� ��� �����!!\n\n");
	    			System.out.println(e);}
	   }
	 }

			  @Override
			  public void run() {
				  long start = System.currentTimeMillis();
			  Thread.currentThread().setName("Console_program");
			  System.out.print(Thread.currentThread().getName()+" - ����� ������\n");
			  Menu();
			  int minute=(int) (((System.nanoTime() - start) / DIVIDER)/60);
			  int second=(int) (((System.nanoTime() - start) / DIVIDER)%60);
			  System.out.print("\n"+Thread.currentThread().getName()+" - ������� ������; "+"��������� ������: "+minute  +":"+ second+"\n");
			}
}



