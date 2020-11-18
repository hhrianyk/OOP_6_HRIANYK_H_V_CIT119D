/**
 * @author <Георгiй>
 * /**
 * \brief L8
 * 	\author Heorhii Hrianyk
 * 	\version 1.0
 * 	\date   2020 рік
 * 	\  Данний клас реалізовани для збереження даних у масив
 *
 *  

 */ 

package ua.khpi.oop.Hrianyk08;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;


public class Сontainer implements Serializable  {
	

	private static final long serialVersionUID = 1L;
	public static Scanner in = new Scanner(System.in);
	
	public   int index ;
	public   PoliceFile[] m_data ;
 
	/////////////////////////////////////////////////////////////////////////////////
	
    public   Сontainer()
    {
    	this.m_data=new PoliceFile[255];
    	 index=-1;
    }
    
    
      public PoliceFile setInPoliceFile(int index)
	{
		return m_data[index];
	}
	
     	
	 
      Сontainer( PoliceFile[] rhs)/// Конструктор
	{
    	  index=-1;
			m_data=rhs;
 
	}
      Сontainer(Сontainer rhs)/// Конструктор
	{
		for (int i = 0; i < rhs.index; i++) {
			m_data[i] = rhs.m_data[i];
		}
		this.index = rhs.index;
	}
	

      public  void add(PoliceFile File) //додає вказаний елемент до кінця контейнеру;
	 {
			if (index + 1 >= 255) return;
			m_data[++index] = (PoliceFile) File;
	    		 
	  }
      public void  add_from_keyboard(PoliceFile  add_from_ )
		{
		  PoliceFile  add_from_keyboard=new PoliceFile();

			add_from_keyboard.EL(add_from_keyboard,false);
			
			add( add_from_keyboard);
 
			System.out.print("\nВашi данi успiшно записанi\n");
 
		}
      public void  clear()/// видаляє всі елементи з контейнеру;
	 {
             while (index!=-1)
        	 iterator().remove();
      
     }

      public void Print_run(Сontainer A, PoliceFile pr) /// спадок вивести  
 	{


 		int kol = A.size();
 		pr.printTableHead();
 		for (int i = 0; i < kol; i++)
 		 {
 			pr = A.setInPoliceFile(i);
 			pr.show();
 			
 		}

 	}
      public int size()/// повертає кількість елементів у контейнері;
	 {
		 return this.index+1;
	 }
	 Сontainer dop_INFO(Сontainer A,PoliceFile h) /// Спосб додавання елементів
		{
			
			int  a;
			System.out.print("\n 1: З клавiатири\n 2: 3 Файлу\n Ваш вiбiр:   ");
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
	
	 public void UpdateData(Сontainer A,PoliceFile h){
		 System.out.print("Введть індекс");
		 int index=in.nextInt();
		 if(index<0||index>this.index) 
		 {
			 System.out.print("Такого злочиньця незнайдено");
			 return;
		 }
		  h= m_data[index];
		  h.EL(m_data[index],true);
		  m_data[index]=h;
	 }
	 public Object[] toArray() ///повертає масив, що містить всі елементи у контейнері;
	 {
		 return m_data;
	 }
   
	 public void posuk(Сontainer container)//// помилку пошуку
	 {
		 if (container.index==1) {
			 System.out.print("Масив пустий");
			 return ;	
		 }
		 String text=new String();
		 System.out.print("Шукати:\n"+
		                  "  1. Імя\n"+
				          "  2. по-Батькові\n"+
		                  "  3. Прізвище\n"+
				          "  4. Index\n"+
				          "in: ");
		 int a=in.nextInt();
                 switch(a)
                 {
                 case 1:
            		 System.out.print("Введіть Імя : ");
           			 text=in.next();
         			
         	        for (int i=0;i<index+1 ;i++)
         	          if (container.m_data[i].getName().equals(text))    
         	        	  {
         	        	  System.out.print("Позиція вашаго елемента: "+i+"\n");
         	        	  container.m_data[i].show();
         	        	  return ;
         	        	  }
         	        System.out.print("Ваш елемент незнайденo");
                	 break;
                 case 2:
            		 System.out.print("Введіть по-Батькові : ");
         			 text=in.next();
         			
         	        for (int i=0;i<index+1 ;i++)
         	          if (container.m_data[i].getSurname().equals(text))    
         	        	  {
         	        	  System.out.print("Позиція вашаго елемента: "+i+"\n");
         	        	  container.m_data[i].show();
         	        	  return ;
         	        	  }
         	        System.out.print("Ваш елемент незнайденo");
                	 break;
                 case 3:
            		 System.out.print("Введіть прізвище : ");
              		 text=in.next();
         			
         	        for (int i=0;i<index+1 ;i++)
         	          if (container.m_data[i].getLastname().equals(text))    
         	        	  {
         	        	  System.out.print("Позиція вашаго елемента: "+i+"\n");
         	        	  container.m_data[i].show();
         	        	  return ;
         	        	  }
         	        System.out.print("Ваш елемент незнайденo");
                	 break;
                 case 4:
            		 System.out.print("Введіть Ім'я : ");
              		 a=in.nextInt();
                	 if (a>-1||a<this.index+1)
                	 {
        	        	  System.out.print("Позиція вашаго елемента: "+a+"\n");
        	        	  container.m_data[a].show();
        	        	  return ;
                	 }
                	 System.out.print("Ваш елемент незнайденo");
                	 break;
                 }
	        		
	 }
	 public void Sort(Сontainer container)//// помилку пошуку
	 {
		 if (container.index==-1) {
			 System.out.print("Масив пустий");
			 return ;	
		 }
		 String text=new String();
		 System.out.print("Сортувати:\n"+
		                  "  1. Імя\n"+
				          "  2. по-Батькові\n"+
		                  "  3. Прізвище\n"+
				           "in: ");
		 
 		 int a=in.nextInt();
		 boolean pr;			/// для проверки отсортирован ли массив
			do
			{
				pr = false;
		          switch(a)
                 {
                 case 1:
                	 for (int i = 0; i < index; i++)	/// проходим слева направо
                		
   					if (comparison(m_data[i].getName() , m_data[i + 1].getName())==1) { swap(i); pr = true; }  
                 	 break;
                 case 2:
      				for (int i = 0; i < index; i++)	/// проходим слева направо
      					if (comparison(m_data[i].getSurname() , m_data[i + 1].getSurname())==1) { swap(i); pr = true; }
   					
            	 break;

                 case 3:
      				for (int i = 0; i < index; i++)	/// проходим слева направо
      					if (comparison(m_data[i].getLastname() , m_data[i + 1].getLastname())==1) { swap(i); pr = true; }
   					 
            	 break;
                 }
			} while (pr);

			System.out.print(" *сортування завершено ");
	 }

	 public    void swap(int i) /// Swap елемент
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
	 public Iterator<String> iterator() ///повертає ітератор відповідно до Interface Iterable.
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
