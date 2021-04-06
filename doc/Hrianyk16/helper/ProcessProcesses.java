package helper;

import DataContainer.ContainerList;
import PoliceFile.PoliceFile;


public class ProcessProcesses extends Thread {
	
	private static final double DIVIDER = 1_000_000_000;
	
	private int Choice=0;
	public ProcessProcesses(int Choice)
	{
 
		this.Choice=Choice;
		start();
	
		
	}
	
 
	public void run() {
		long start = System.nanoTime();
		
		try {
			
		 Serializator<ContainerList<PoliceFile>> serializator=new Serializator<ContainerList<PoliceFile>>();
		switch(Choice)///пошук введеної команди
		{
		  
		case 2:
			Thread add=new Thread(serializator::deserializtionXMLAdd) ;
			add.start();
			 
	        break;
		
		case 3:
			Thread d=new Thread(serializator::deserializtionXML) ;
			d.start();
 
	        break;
	        
		
		case 4: //System.out.print("\n\nЗбереження даних:"+ serializator.serialization());
 
			Thread t =new Thread ( serializator::serialization);
			 t.start();
 
		break;
   
		}   
		}catch(Exception e)	  {	//for (int i=0;i<10;i++)System.out.println(" EROR EROR EROR EROR EROR EROR EROR EROR EROR EROR EROR EROR EROR EROR EROR EROR EROR EROR EROR EROR EROR EROR EROR EROR EROR EROR EROR EROR EROR EROR EROR EROR EROR EROR EROR EROR EROR EROR EROR EROR EROR EROR EROR EROR ");
			System.out.print("\n\n\nТрапилась помилка. Але тепер все добре!!\n\n");
			System.out.println(e);}
 
		System.out.print("\n"+Thread.currentThread().getName()+" - закінчив роботу; "+"Тривалість роботи: "+ (System.nanoTime() - start) / DIVIDER+"\n");
		
	}
	

}
