package ua.khpi.oop.Hrianyk13;
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
 
	
	public void serialization()
	{
		boolean flag=false;
		
 
		ObjectOutputStream oos=null;
		var pathname=Console_File.MenuFillOut();
		Obshchak.stop=false;
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
		 System.out.print("\n* Збереження даних:"+flag); 
		 
	}
 
	
	/////////////////////////////////////////////////////////////////////////
	
	public void deserializtionXML() {
		 
 
		 try {
			 XMLDecoder decoder = new XMLDecoder(
					    new BufferedInputStream(
					    new FileInputStream(Console_File.MenuFillIn()+".xml")));
			 Obshchak.stop=false;
			Obshchak.List = (ContainerList<PoliceFile>) decoder.readObject();
			 
			//return b;
				 
			}	catch(FileNotFoundException e) {e.printStackTrace();}
		         
		        finally { System.out.print("\n deserializtionXML: true");;
 
				}
		  
 
	}
////////////////////////////////////////////////////////////////////////////
 
	 
	    
}
