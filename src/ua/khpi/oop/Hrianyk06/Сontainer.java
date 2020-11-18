/**
 * @author <�����i�>
 * /**
 * \brief L6
 * 	\author Heorhii Hrianyk
 * 	\version 1.0
 * 	\date   2020 ��
 * 	\  ������ ���� ���������� ��� ���������� ����� � �����
 *
 *  

 */ 

package ua.khpi.oop.Hrianyk06;
import java.io.Serializable;
import java.util.Scanner;

public class �ontainer implements Serializable  {
	

	private static final long serialVersionUID = 1L;
	public static Scanner in = new Scanner(System.in);
	private   int size=0;
	 String[] m_data=new String[255];



	 public String toString() //������� ���� ���������� � ������ �����
	 {
		 if (size ==-1) {
			 System.out.print("\n����� ������. �������� ����. ��������� null");
			 return null;
		 }
		 String temp=new String();
		 for (int i=0;i<size;i++)
			 temp+=m_data[i];
		 return temp;
	 }
	 void add(String string) //���� �������� ������� �� ���� ����������;
	 {
	     if (size + 1 >= 255) return;
	     //m_data[size++]=string;
	     String temp=new String();
	     for (int i=0;i<string.length();i++)
	     {
	    	 if((char)string.charAt(i)!=32)
	    		 temp+=string.charAt(i);
	    	 else{
	    		 m_data[size++]=temp+" ";
	    		 temp=new String();
	    		 }
	    		 
	     }
	     m_data[size++]=temp+" ";
	 }
	 void clear()/// ������� �� �������� � ����������;
	 {
         while (size!=0)
        	 iterator().remove();
      
     }
	 boolean remove (String string)// ������� ������ ������� ��������� �������� � ����������;
	 {
		 if (size ==0) return false;
	        for (int i=0;i<size;i++)
	      if (m_data[i]==string)    
	      { for (; i < size-1; i++)
	    		  m_data[i]=m_data[i+1];
	             this.m_data[--size] = null;
	             return true;
	      }

	        return false;
	 }
	
	 int size()/// ������� ������� �������� � ���������;
	 {
		 return this.size;
	 }
	 boolean contains(String string)/// ������� true, ���� ��������� ������ �������� �������;
	 {
		 if (size ==0) return false;
	        for (int i=0;i<size;i++)
	          if (m_data[i]==string)    
	             return true;
	      
	        return false;
	 }
	 
	 Object[] toArray() ///������� �����, �� ������ �� �������� � ���������;
	 {
		 return m_data;
	 }
	 boolean containsAll(�ontainer container)/// ������� true, ���� ��������� ������ �� �������� � ����������� � ����������;
	 {
		 if(container.size==size) 
			 if(container.m_data==m_data)
				 return true;
			 return false;
		
				 
	 }
	 void posuk(�ontainer container)//// ������� ������
	 {
		 if (container.size==0) {
			 System.out.print("����� ������");
			 return ;	
		 }
		 System.out.print("������ ������ ��������: ");
			String text=new String();
			text=in.nextLine();
			
	        for (int i=0;i<size;i++)
	          if (container.m_data[i].equals(text))    
	        	  {
	        	  System.out.print("������� ������ ��������: "+i);
	        	  return ;
	        	  }
	        System.out.print("������� ������ ��������: ����������");
	        
		
	 }
	
		 
  public void Sort(�ontainer k) {
		boolean pr;			/// ��� �������� ������������ �� ������
		do
		{
			pr = false;		
			for (int i = 0; i < k.size()-1; i++)
	     if (comparison (k.m_data[i] , k.m_data[i + 1])==1)
	     {
	    	 String temp=k.m_data[i];
	    	 k.m_data[i]=k.m_data[i+1];
	    	 k.m_data[i+1]=temp;
	    	 pr = true;
	     } 
			
		} while (pr);
		    }
	
  public void d_comparison(�ontainer conteiner)
  {
	  int a,b;
	  while(true)
	  {
	  System.out.print("\n����� ������ ������� ��������: ");
	   a=in.nextInt();
	  if (a<0||a>size-1) System.out.print("\n�������� � ����� �������� �����. ��������� �� ���");
	  else break;
	  }
	  while(true)
	  {
	  System.out.print("\n����� ������ ������� ��������: ");
	   b=in.nextInt();
	  if (b<0||b>size-1) System.out.print("\n�������� � ����� �������� �����. ��������� �� ���");
	  else break;
	  }
	  int temp =�ontainer.comparison(conteiner.m_data[a],conteiner.m_data[b]);
	  if (temp==1)System.out.print("��������� ��������: a>b" );
	  else if (temp==-1)System.out.print("��������� ��������: a<b" );
	  else System.out.print("��������� ��������: a=b");
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
	  
	 public Iterator<String> iterator() ///������� �������� �������� �� Interface Iterable.
	 {
		 return new m_Iterator();
	 }
	 
	 public class m_Iterator implements Iterator<String>
	 {

		    int index = 0;
			public boolean hasNext() {
			if(index<size) 
				return true;
			    return false;
			}
			public String next()
			{
			return m_data [index++];	
			
			}
			public void remove()
			{
		         for (int i=index; i < size-1; i++)
		  	    		  m_data[i]=m_data[i+1];
		  	             m_data[--size] = null;
		  	            
		  	      
				//throw new UnsupportedOperationException("remove");
		    }
			public String begin()
			{
				return m_data[0];
			}
			public String end()
			{
				return m_data[size];
			}
			
		 
	 }
}
