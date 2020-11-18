/**
 * @author <�����i�>
 * /**
 * \brief L8
 * 	\author Heorhii Hrianyk
 * 	\version 1.0
 * 	\date   2020 ��
 * 	\  ������ ���� ���������� ��� ���������� ����� � �����
 *
 *  

 */ 

package ua.khpi.oop.Hrianyk08;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;


public class �ontainer implements Serializable  {
	

	private static final long serialVersionUID = 1L;
	public static Scanner in = new Scanner(System.in);
	
	public   int index ;
	public   PoliceFile[] m_data ;
 
	/////////////////////////////////////////////////////////////////////////////////
	
    public   �ontainer()
    {
    	this.m_data=new PoliceFile[255];
    	 index=-1;
    }
    
    
      public PoliceFile setInPoliceFile(int index)
	{
		return m_data[index];
	}
	
     	
	 
      �ontainer( PoliceFile[] rhs)/// �����������
	{
    	  index=-1;
			m_data=rhs;
 
	}
      �ontainer(�ontainer rhs)/// �����������
	{
		for (int i = 0; i < rhs.index; i++) {
			m_data[i] = rhs.m_data[i];
		}
		this.index = rhs.index;
	}
	

      public  void add(PoliceFile File) //���� �������� ������� �� ���� ����������;
	 {
			if (index + 1 >= 255) return;
			m_data[++index] = (PoliceFile) File;
	    		 
	  }
      public void  add_from_keyboard(PoliceFile  add_from_ )
		{
		  PoliceFile  add_from_keyboard=new PoliceFile();

			add_from_keyboard.EL(add_from_keyboard,false);
			
			add( add_from_keyboard);
 
			System.out.print("\n���i ���i ���i��� �������i\n");
 
		}
      public void  clear()/// ������� �� �������� � ����������;
	 {
             while (index!=-1)
        	 iterator().remove();
      
     }

      public void Print_run(�ontainer A, PoliceFile pr) /// ������ �������  
 	{


 		int kol = A.size();
 		pr.printTableHead();
 		for (int i = 0; i < kol; i++)
 		 {
 			pr = A.setInPoliceFile(i);
 			pr.show();
 			
 		}

 	}
      public int size()/// ������� ������� �������� � ���������;
	 {
		 return this.index+1;
	 }
	 �ontainer dop_INFO(�ontainer A,PoliceFile h) /// ����� ��������� ��������
		{
			
			int  a;
			System.out.print("\n 1: � ����i�����\n 2: 3 �����\n ��� �i�i�:   ");
			a=in.nextInt();
			switch (a)
			{
			case 1:
				A.add_from_keyboard(h);
				break;
			case 2:
				A=Serializator.deserializtion();
				break;
				
			}
			return A;
		}
	
	 public void UpdateData(�ontainer A,PoliceFile h){
		 System.out.print("������ ������");
		 int index=in.nextInt();
		 if(index<0||index>this.index) 
		 {
			 System.out.print("������ ��������� ����������");
			 return;
		 }
		  h= m_data[index];
		  h.EL(m_data[index],true);
		  m_data[index]=h;
	 }
	 public Object[] toArray() ///������� �����, �� ������ �� �������� � ���������;
	 {
		 return m_data;
	 }
   
	 public void posuk(�ontainer container)//// ������� ������
	 {
		 if (container.index==1) {
			 System.out.print("����� ������");
			 return ;	
		 }
		 String text=new String();
		 System.out.print("������:\n"+
		                  "  1. ���\n"+
				          "  2. ��-�������\n"+
		                  "  3. �������\n"+
				          "  4. Index\n"+
				          "in: ");
		 int a=in.nextInt();
                 switch(a)
                 {
                 case 1:
            		 System.out.print("������ ��� : ");
           			 text=in.next();
         			
         	        for (int i=0;i<index+1 ;i++)
         	          if (container.m_data[i].getName().equals(text))    
         	        	  {
         	        	  System.out.print("������� ������ ��������: "+i+"\n");
         	        	  container.m_data[i].show();
         	        	  return ;
         	        	  }
         	        System.out.print("��� ������� ���������o");
                	 break;
                 case 2:
            		 System.out.print("������ ��-������� : ");
         			 text=in.next();
         			
         	        for (int i=0;i<index+1 ;i++)
         	          if (container.m_data[i].getSurname().equals(text))    
         	        	  {
         	        	  System.out.print("������� ������ ��������: "+i+"\n");
         	        	  container.m_data[i].show();
         	        	  return ;
         	        	  }
         	        System.out.print("��� ������� ���������o");
                	 break;
                 case 3:
            		 System.out.print("������ ������� : ");
              		 text=in.next();
         			
         	        for (int i=0;i<index+1 ;i++)
         	          if (container.m_data[i].getLastname().equals(text))    
         	        	  {
         	        	  System.out.print("������� ������ ��������: "+i+"\n");
         	        	  container.m_data[i].show();
         	        	  return ;
         	        	  }
         	        System.out.print("��� ������� ���������o");
                	 break;
                 case 4:
            		 System.out.print("������ ��'� : ");
              		 a=in.nextInt();
                	 if (a>-1||a<this.index+1)
                	 {
        	        	  System.out.print("������� ������ ��������: "+a+"\n");
        	        	  container.m_data[a].show();
        	        	  return ;
                	 }
                	 System.out.print("��� ������� ���������o");
                	 break;
                 }
	        		
	 }
	 public void Sort(�ontainer container)//// ������� ������
	 {
		 if (container.index==-1) {
			 System.out.print("����� ������");
			 return ;	
		 }
		 String text=new String();
		 System.out.print("���������:\n"+
		                  "  1. ���\n"+
				          "  2. ��-�������\n"+
		                  "  3. �������\n"+
				           "in: ");
		 
 		 int a=in.nextInt();
		 boolean pr;			/// ��� �������� ������������ �� ������
			do
			{
				pr = false;
		          switch(a)
                 {
                 case 1:
                	 for (int i = 0; i < index; i++)	/// �������� ����� �������
                		
   					if (comparison(m_data[i].getName() , m_data[i + 1].getName())==1) { swap(i); pr = true; }  
                 	 break;
                 case 2:
      				for (int i = 0; i < index; i++)	/// �������� ����� �������
      					if (comparison(m_data[i].getSurname() , m_data[i + 1].getSurname())==1) { swap(i); pr = true; }
   					
            	 break;

                 case 3:
      				for (int i = 0; i < index; i++)	/// �������� ����� �������
      					if (comparison(m_data[i].getLastname() , m_data[i + 1].getLastname())==1) { swap(i); pr = true; }
   					 
            	 break;
                 }
			} while (pr);

			System.out.print(" *���������� ��������� ");
	 }

	 public    void swap(int i) /// Swap �������
	  {
	     PoliceFile temp;
	     temp = m_data[i];
	     m_data[i] = m_data[i + 1];
	     m_data[i + 1] = temp;
	 }

		   //@SuppressWarnings("unused")
	public static int comparison(String a,String b)
		    {
		    	int len=0;
		    	if(a.length()<b.length())len=a.length();
		    	else len=b.length();
		    	for (int i=0;i<len;i++)
		    	{
		    		if (a.charAt(i)>b.charAt(i)) return 1;
		    		if (a.charAt(i)<b.charAt(i)) return -1;
		    	}
		    	if(a.length()<b.length())return -1;
		    	else if (a.length()>b.length()) return 1;
		    	return 0;
		    }
////////////////////////////////////////////////////////////////////////////////////////////////////	  
	 public Iterator<String> iterator() ///������� �������� �������� �� Interface Iterable.
	 {
		 return new m_Iterator();
	 }
	 
	 public class m_Iterator implements Iterator<String>
	 {

		    int ix = 0;
			public boolean hasNext() {
			if(ix<this.ix+1) 
				return true;
			    return false;
			}
			public PoliceFile next()
			{
			return m_data [ix++];	
			
			}
			public void remove()
			{
				 
		          for (int i=ix; i < index-1; i++)
		  	    		  m_data[i]=m_data[i+1];
		  	             m_data[index--] = null;
		          
		  	            
		  	      
				//throw new UnsupportedOperationException("remove");
		    }
			public PoliceFile begin()
			{
				return m_data[0];
			}
			public PoliceFile end()
			{
				return m_data[index];
			}
			
		 
	 }
}
