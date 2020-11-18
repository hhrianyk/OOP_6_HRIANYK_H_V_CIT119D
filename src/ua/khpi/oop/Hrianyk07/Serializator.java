/**
 * @author <�����i�>
 * /**
 * \brief L7
 * 	\author Heorhii Hrianyk
 * 	\version 1.0
 * 	\date   2020 ��
 * 	\  ������ ���� ���������� ��� ���������� �� ������������ �����
 *
 *  

 */ 
package ua.khpi.oop.Hrianyk07;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Serializator {

	public boolean serialization(�ontainer container )
	{
		boolean flag=false;
		
		
		File file = new File( "save.properties ");///pathname
		ObjectOutputStream oos=null;
		
		try {
		FileOutputStream fos=new FileOutputStream(file);
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
	public �ontainer deserializtion() {
		�ontainer container=null;
		File file = new File( "save.properties");///pathname
		 ObjectInputStream ois=null;
		 try {
			FileInputStream fis=new FileInputStream(file);
		
			if(fis!=null) {
				ois= new ObjectInputStream(fis);
				container=(�ontainer)ois.readObject();
				
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
}
