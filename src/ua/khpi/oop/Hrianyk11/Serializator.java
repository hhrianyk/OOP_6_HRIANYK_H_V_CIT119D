package ua.khpi.oop.Hrianyk11;
import java.beans.XMLDecoder;
import java.beans.XMLEncoder;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

 
import javax.swing.JFileChooser;
 
 
 

public class Serializator<T> {
 
	
	public boolean serialization(T container )
	{
		boolean flag=false;
		
		 /*JFileChooser fileopen = new JFileChooser(); 
		
		fileopen.setCurrentDirectory(new File("C:/Users/���/Documents/Java seve"));
		 		 fileopen.showDialog(null, "��������  ����");
		 	 
		File file =  fileopen.getSelectedFile() ;///pathname
		 */
		ObjectOutputStream oos=null;
		var pathname=Console_File.MenuFillOut();
		try {
			XMLEncoder encoder = new XMLEncoder(
					 new BufferedOutputStream(
					 new FileOutputStream( pathname+".xml")));
 
			 encoder.writeObject(container);
			 encoder.close(); 
			 FileOutputStream  fos = new FileOutputStream(pathname);
		 
		if(fos!=null) {
			oos= new ObjectOutputStream(fos);
			oos.writeObject(container.toString());
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
	///////////////////////////////////////////////////////////////////////////
    public T deserializtion() {
		T container=null;
	 
		JFileChooser fileopen = new JFileChooser(); 
		fileopen.setCurrentDirectory(new File("C:/Users/���/Documents/Java seve"));
	     fileopen.showDialog(null, "³������  ����");
      
       
		 ObjectInputStream ois=null;
		 try {
			FileInputStream fis=new FileInputStream(fileopen.getSelectedFile());
		
			if(fis!=null) {
				ois= new ObjectInputStream(fis);
				container=(T)ois.readObject();
				
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
	
	/////////////////////////////////////////////////////////////////////////
	
	public T deserializtionXML() {
		T container = null;
		/*
		JFileChooser fileopen = new JFileChooser(); 
		 FileNameExtensionFilter filter = new FileNameExtensionFilter(
	              "*.xml", "xml");
			fileopen.setCurrentDirectory(new File("C:/Users/���/Documents"));
			 fileopen.setFileSelectionMode(JFileChooser.FILES_ONLY);
			 fileopen.setFileFilter(filter);
 
	     fileopen.showDialog(null, "³������ *.xml ����");
      */
	  
		 try {
			 XMLDecoder decoder = new XMLDecoder(
					    new BufferedInputStream(
					    new FileInputStream(Console_File.MenuFillIn()+".xml")));

			var b = (T) decoder.readObject();
			 
			return b;
				 
			}	catch(FileNotFoundException e) {e.printStackTrace();}
		         
		        finally { System.out.print("GUT");;
				}
		 
		 return container;
	}
////////////////////////////////////////////////////////////////////////////
	 public T deserializtionAuto() {
			T container=null;
		 		 			  
			 try {
				 XMLDecoder decoder = new XMLDecoder(
						    new BufferedInputStream(
						    new FileInputStream("11.xml")));

				var b = (T) decoder.readObject();
				 
				return b;
					 
				}	catch(FileNotFoundException e) {e.printStackTrace();  System.out.println("���� ��������� �������");}
			         
			        finally { System.out.print("���� �������");;
					}
			 
			 return container;
		}
	 
	    
}
