/**
 * @author <Георгiй>
 * /**
 * \brief L8
 * 	\author Heorhii Hrianyk
 * 	\version 1.0
 * 	\date   2020 рік
 * 	\  Данний клас реалізовани для серіалізації та десеріалізація даних
 *
 *  

 */ 
package ua.khpi.oop.Hrianyk08;
import java.beans.XMLDecoder;
import java.beans.XMLEncoder;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;
 
 

public class Serializator {
 
	
	public boolean serialization(Сontainer container )
	{
		boolean flag=false;
		
		/*JFileChooser fileopen = new JFileChooser(); 
		
		fileopen.setCurrentDirectory(new File("C:/Users/дом/Documents/Java seve"));
		 		 fileopen.showDialog(null, "Зберегти  файл");
		 	 
		File file =  fileopen.getSelectedFile() ;///pathname
		 */
		ObjectOutputStream oos=null;
		
		try {
			 XMLEncoder encoder = new XMLEncoder(
					 new BufferedOutputStream(
					 new FileOutputStream( Console_File.MenuFillOut()+".xml")));
 
			 encoder.writeObject(container);
			 encoder.close(); 
			 
		FileOutputStream fos=new FileOutputStream(Console_File.MenuFillOut());
		if(fos!=null) {
			oos= new ObjectOutputStream(fos);
			oos.writeObject(container);
			flag=true;
			}
		}	catch(FileNotFoundException e) {e.printStackTrace();}
			catch (IOException e) {e.printStackTrace();	}
		    finally { 
		    	if(oos!=null) 
		    		{try {oos.close();} catch (IOException e) {e.printStackTrace();}}
		    }
		return flag;
	}
	static public Сontainer deserializtion() {
		Сontainer container=null;
	 
		JFileChooser fileopen = new JFileChooser(); 
		fileopen.setCurrentDirectory(new File("C:/Users/дом/Documents/Java seve"));
	     fileopen.showDialog(null, "Відкрити  файл");
      
      
		 File file =  fileopen.getSelectedFile() ; ///pathname
		  
		 ObjectInputStream ois=null;
		 try {
			FileInputStream fis=new FileInputStream(fileopen.getSelectedFile());
		
			if(fis!=null) {
				ois= new ObjectInputStream(fis);
				container=(Сontainer)ois.readObject();
				
				}
			}	catch(FileNotFoundException e) {e.printStackTrace();}
		        catch (IOException e) {e.printStackTrace();	}
		        catch (ClassNotFoundException e) {e.printStackTrace();	}
		 finally { 
		    	//if(ois!=null) 
		    		{try {ois.close();} catch (IOException e) {e.printStackTrace();}}
		    }
		 return container;
	}
	
	public Сontainer deserializtionXML() {
		 Сontainer container = null;
		/*
		JFileChooser fileopen = new JFileChooser(); 
		 FileNameExtensionFilter filter = new FileNameExtensionFilter(
	              "*.xml", "xml");
			fileopen.setCurrentDirectory(new File("C:/Users/дом/Documents"));
			 fileopen.setFileSelectionMode(JFileChooser.FILES_ONLY);
			 fileopen.setFileFilter(filter);
 
	     fileopen.showDialog(null, "Відкрити *.xml файл");
      */
	  
		 try {
			 XMLDecoder decoder = new XMLDecoder(
					    new BufferedInputStream(
					    new FileInputStream(Console_File.MenuFillIn()+".xml")));

			var b = (Сontainer ) decoder.readObject();
			 
			return b;
				 
			}	catch(FileNotFoundException e) {e.printStackTrace();}
		         
		        finally { System.out.print("GUT");;
				}
		 
		 return container;
	}
}
