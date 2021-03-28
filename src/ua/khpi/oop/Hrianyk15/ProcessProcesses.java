package ua.khpi.oop.Hrianyk15;

import java.util.ArrayList;

public class ProcessProcesses extends Thread {
	
	private static final double DIVIDER = 1_000_000_000;
	
	ProcessProcesses()
	{
 
		start();
	
		
	}
	
	@SuppressWarnings("deprecation")
	public void run() {
		long start = System.nanoTime();
		
		try {
			
		Serializator<ArrayList<PoliceFile>> serializator=new Serializator<ArrayList<PoliceFile>>();
		switch(Obshchak.Choice)///пошук введеної команди
		{
		  
		case 2:
			Thread d=new Thread(serializator::deserializtionXML) ;
			d.start();
			Obshchak.stop=true;
			for(;;)
			{
				Thread.sleep(10);
				if(Obshchak.stop==false)break;
			}
	        if(Obshchak.TimeOut!=0)
	        {
	        	Thread.sleep(Obshchak.TimeOut);
	        	d.stop();
	        	System.out.print("примусово зупинено");
	        }
	        break;
		
		
		case 6: //System.out.print("\n\nЗбереження даних:"+ serializator.serialization());
			Obshchak.stop = true;
			Thread t =new Thread ( serializator::serialization);
			 t.start();
			  
			for(;;)
			{
				Thread.sleep(10);
				if(Obshchak.stop==false)break;
			}
	        if(Obshchak.TimeOut!=0)
	        {
	        	Thread.sleep(Obshchak.TimeOut);
	        	t.stop();
	        	System.out.print("примусово зупинено");
	        }
		break;
		
		case 8:
			System.out.print("\n!!!SSS\n");
		Thread sort =  new Thread (Helper::Sort);
		Obshchak.stop=true;
		sort.start();
		 
		for(;;)
		{
			Thread.sleep(10);
			if(Obshchak.stop==false)break;
			
		}
        if(Obshchak.TimeOut!=0)
        {
        	sort.join(Obshchak.TimeOut);
        	sort.stop();
        	System.out.print("примусово зупинено");
        	
        }else sort.join();
 
        break;
        
		case 9:Thread reg=  new Thread (Helper::AppliedTask);///time here
		long startReg = System.nanoTime();
		reg.currentThread().setName("reg");
		 
		reg.start();
				 
        if(Obshchak.TimeOut!=0)
        {
        	Thread.sleep(Obshchak.TimeOut);
        	reg.stop();
        	System.out.print("примусово зупинено");
        }else reg.join();
		System.out.print("\n"+reg.currentThread().getName()+" - закінчив роботу; "+"Тривалість роботи: "+ (System.nanoTime() - startReg) / DIVIDER+"\n");
		
		break;
		
		case 10: 
			Thread r=new Thread(Helper::romove);
			
			Obshchak.stop=true;
			r.start();
			for(;;)
			{
				Thread.sleep(10);
				if(Obshchak.stop==false)break;
				
			}
	        if(Obshchak.TimeOut!=0)
	        {
	        	Thread.sleep(Obshchak.TimeOut);
	        	r.stop();
	        	System.out.print("примусово зупинено");
	        		
	        }
			
		
		case 11: Thread clear= new Thread( Obshchak.List::clear );///time here??
				clear.start();
		        if(Obshchak.TimeOut!=0)
		        {
		        	Thread.sleep(Obshchak.TimeOut);
		        	clear.stop();
		        	System.out.print("примусово зупинено");
		        	
		        }
		break; 
		

		   		
	        
		}   
		}catch(Exception e)	  {	//for (int i=0;i<10;i++)System.out.println(" EROR EROR EROR EROR EROR EROR EROR EROR EROR EROR EROR EROR EROR EROR EROR EROR EROR EROR EROR EROR EROR EROR EROR EROR EROR EROR EROR EROR EROR EROR EROR EROR EROR EROR EROR EROR EROR EROR EROR EROR EROR EROR EROR EROR ");
			System.out.print("\n\n\nТрапилась помилка. Але тепер все добре!!\n\n");
			System.out.println(e);}
		Thread.currentThread().setName("ProcessProcesses-"+Obshchak.Choice);
		System.out.print("\n"+Thread.currentThread().getName()+" - закінчив роботу; "+"Тривалість роботи: "+ (System.nanoTime() - start) / DIVIDER+"\n");
		
	}
	

}
