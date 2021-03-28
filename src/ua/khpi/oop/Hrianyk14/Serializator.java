package ua.khpi.oop.Hrianyk14;
import java.beans.XMLDecoder;
import java.beans.XMLEncoder;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
 
 
 

public class Serializator<T> {
 
	private static final double DIVIDER = 1_000_000_000;
	public void serialization()   ///timer here
	{
		
		Thread.currentThread().setName("serialization" );
		 
	 
		boolean flag=false;
		
 
		ObjectOutputStream oos=null;
		var pathname=Console_File.MenuFillOut();
		Obshchak.stop=false;
		long start = System.nanoTime();
		try {
			XMLEncoder encoder = new XMLEncoder(
					 new BufferedOutputStream(
					 new FileOutputStream( pathname+".xml")));
 
			 encoder.writeObject(Obshchak.List);
			 encoder.close(); 
			 FileOutputStream  fos = new FileOutputStream(pathname);
			
		if(fos!=null) {
			 
			oos= new ObjectOutputStream(fos);
			oos.writeObject(Obshchak.List.toString());
			flag=true;
			}
		}	catch(FileNotFoundException e) {e.printStackTrace();}
			catch (IOException e) {e.printStackTrace();	}
		    finally { 
		    	if(oos!=null) 
		    		{try {oos.close();} catch (IOException e) {e.printStackTrace();}}
		    	
		    }
		// try {	Thread.sleep(5000);	} catch (InterruptedException e) {e.printStackTrace();}
		 System.out.print("\n* Збереження даних:"+flag); 

    	
		 double stop = ((System.nanoTime() - start)/ DIVIDER);
	   	 System.out.print("\n"+Thread.currentThread().getName()+" - закінчив роботу; "+"Тривалість роботи: "+stop+"\n");
		 
	}
 
	
	/////////////////////////////////////////////////////////////////////////
	
	@SuppressWarnings("unchecked")
	public void deserializtionXML()  {///timer here
		 
		long start=0 ;
		Thread.currentThread().setName("deserializtionXML");
		 try {
			 XMLDecoder decoder = new XMLDecoder(
					    new BufferedInputStream(
					    new FileInputStream(Console_File.MenuFillIn()+".xml")));
			 Obshchak.stop=false;
			  start = System.nanoTime();
			Obshchak.List = (ContainerList<PoliceFile>) decoder.readObject();
			 
				 
			}	catch(FileNotFoundException e) {e.printStackTrace();}
		         
		        finally { 
		        	// try {	Thread.sleep(5000);	} catch (InterruptedException e) {e.printStackTrace();}
		        	System.out.print("\n deserializtionXML: true");;
		    
		           double stop=   ((System.nanoTime() - start)/ DIVIDER); 
		   	       System.out.print("\n"+Thread.currentThread().getName()+" - закінчив роботу; "+"Тривалість роботи: "+stop+"\n");
				}
		  
 
	}
////////////////////////////////////////////////////////////////////////////
 
	 
	    
}
