package helper;
import java.beans.XMLDecoder;
import java.beans.XMLEncoder;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

import DataContainer.ContainerList;
import DataContainer.Obshchak;
import PoliceFile.PoliceFile;
 
 
 

public class Serializator<T> {
 
	private static final double DIVIDER = 1_000_000_000;
	public void serialization()   ///timer here
	{
		
		Thread.currentThread().setName("serialization" );
		  
		boolean flag=false;
		
 
		ObjectOutputStream oos=null;
         
		JFileChooser fileopen = new JFileChooser(); 
		fileopen.setCurrentDirectory(new File("C:/Users/дом/Documents/Java seve"));
		 		 fileopen.showDialog(null, "Зберегти  файл");
		 	 
		File file =  fileopen.getSelectedFile(); 
		
		//var pathname=Console_File.MenuFillOut();
 
		long start = System.nanoTime();
		try {
			XMLEncoder encoder = new XMLEncoder(
					 new BufferedOutputStream(
					 new FileOutputStream( file+".xml")));
 
			 encoder.writeObject(Obshchak.List);
			 encoder.close(); 
			 FileOutputStream  fos = new FileOutputStream(file);
			
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

    	
		 double stop = ((System.nanoTime() - start)/ DIVIDER);
	   	 System.out.print("\n"+Thread.currentThread().getName()+" - закінчив роботу; "+"Тривалість роботи: "+stop+"\n");
		 
	}
 
	
	/////////////////////////////////////////////////////////////////////////
	
	@SuppressWarnings("unchecked")
	public void deserializtionXML()  {///timer here
		 
		 
		Thread.currentThread().setName("deserializtionXML");
		 try {
				JFileChooser fileopen = new JFileChooser(); 
				
			   
			     fileopen.setAcceptAllFileFilterUsed(false);
			     FileNameExtensionFilter filter = new FileNameExtensionFilter("XML", "xml");
			     fileopen.addChoosableFileFilter(filter);
			        
		         fileopen.setCurrentDirectory(new File("C:/Users/дом/Documents/Java seve"));
			     fileopen.showDialog(null, "Відкрити  файл");
				// File file =  fileopen.getSelectedFile() ; ///pathname
			 
			 XMLDecoder decoder = new XMLDecoder(
					    new BufferedInputStream(
					    new FileInputStream(fileopen.getSelectedFile())));
 
			   
			Obshchak.List = (ContainerList<PoliceFile>) decoder.readObject();
			 
				 
			}	catch(FileNotFoundException e) {e.printStackTrace();}
		         
		        finally { 
		        	// try {	Thread.sleep(5000);	} catch (InterruptedException e) {e.printStackTrace();}
		        	System.out.print("\n deserializtionXML: true");;
		    
		 			}
		  
 
	}
////////////////////////////////////////////////////////////////////////////
 
	@SuppressWarnings("unchecked")
	public void deserializtionXMLAdd()  {///timer here
		 
		 
		Thread.currentThread().setName("deserializtionXML");
		 try {
				JFileChooser fileopen = new JFileChooser(); 
				
			   
			     fileopen.setAcceptAllFileFilterUsed(false);
			     FileNameExtensionFilter filter = new FileNameExtensionFilter("XML", "xml");
			     fileopen.addChoosableFileFilter(filter);
			        
		         fileopen.setCurrentDirectory(new File("C:/Users/дом/Documents/Java seve"));
			     fileopen.showDialog(null, "Відкрити  файл");
				// File file =  fileopen.getSelectedFile() ; ///pathname
			 
			 XMLDecoder decoder = new XMLDecoder(
					    new BufferedInputStream(
					    new FileInputStream(fileopen.getSelectedFile())));
 
			   
			 var F= (ContainerList<PoliceFile>) decoder.readObject();
			     for(var El:F)
				 Obshchak.List.add(El);
			     
			}	catch(FileNotFoundException e) {e.printStackTrace();}
		         
		        finally { 
		        	// try {	Thread.sleep(5000);	} catch (InterruptedException e) {e.printStackTrace();}
		        	System.out.print("\n deserializtionXML: true");;
		    
		 			}
		  
 
	}
	    
}
