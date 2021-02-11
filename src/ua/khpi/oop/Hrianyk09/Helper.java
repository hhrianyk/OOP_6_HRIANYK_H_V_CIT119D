package ua.khpi.oop.Hrianyk09;

import java.util.Scanner;
 




public class Helper {
	
	private static Scanner in = new Scanner(System.in);

	public ContainerList<PoliceFile> WaysToAddData(ContainerList<PoliceFile> A) /// Спосб додавання елементів
	{
		
 		int  a;
		System.out.print("\n 1: З клавiатири\n 2: 3 Файлу\n Ваш вiбiр:   ");
		a=in.nextInt();
		switch (a)
		{
		case 1:
			add_from_keyboard(A);
			break;
		case 2:
			A=Console_program.serializator.deserializtionXML();
			break;
			
		}
		return A;
	}
	////////////////////////////////////////////////////////
    private ContainerList<PoliceFile>  add_from_keyboard(ContainerList<PoliceFile> A )
		{
		  
    	int  a;
    	 
    	System.out.print("\n Скільки ви плануєте додати в'язнів: ");
		int n=in.nextInt();
		System.out.print("\n Додати:\n 1: В початок \n 2: В кінець \nВаш вiбiр:   ");
		a=in.nextInt();
		for(int i=0;i<n;i++)
		{
			PoliceFile  add_from_keyboard=new PoliceFile();
			add_from_keyboard.EL(add_from_keyboard,false);
		  switch (a)
		  {
		case 1:
			A.addOnBack(add_from_keyboard);
			break;
		case 2:
			A.add(add_from_keyboard);
			break;
		  }System.out.print("\n!записанo!\n");
		} System.out.print("\nВашi данi успiшно записанi\n");
		return A;
	}
    ///////////////////////////////////////////////////////	   
       void show(ContainerList<PoliceFile> List)
		{
			 PoliceFile PF=new Laba9.PoliceFile();
			PF.printTableHead();
			
			for (var L:List) {
                   L.show();
		}
	}
    ////////////////////////////////////////////////////////////////////////   
       public void posuk(ContainerList<PoliceFile> List)////  пошуку
  	 {
  		 if (List.size()==0) {
  			 System.out.print("Список пустий");
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
   		 int i=0;
                   switch(a)
                   {
                   case 1:
              		 System.out.print("Введіть Імя : ");
             			 text=in.next();
           			
             	 for (var L:List)
             	 { 
           	          if (L.getName().equals(text))    
           	        	  {
           	        	  System.out.print("Позиція вашаго елемента: "+i+"\n");
           	        	  L.printTableHead();
          	        	  L.show();
           	        	  return ;
           	        	  }i++;
                   }
           	        System.out.print("Ваш елемент незнайденo");
                  	 break;
                   case 2:
              		 System.out.print("Введіть по-Батькові : ");
           			 text=in.next();
           			
                 	 for (var L:List)
                 	 { 
               	          if (L.getSurname().equals(text))    
               	        	  {
               	        	  System.out.print("Позиція вашаго елемента: "+i+"\n");
               	        	  L.printTableHead();
              	        	  L.show();
               	        	  return ;
               	        	  }i++;
                       }
           	        System.out.print("Ваш елемент незнайденo");
                  	 break;
                   case 3:
              		 System.out.print("Введіть прізвище : ");
                		 text=in.next();
           			
                     	 for (var L:List)
                     	 { 
                   	          if (L.getLastname().equals(text))    
                   	        	  {
                   	        	  System.out.print("Позиція вашаго елемента: "+i+"\n");
                   	        	  L.printTableHead();
                  	        	  L.show();
                   	        	  return ;
                   	        	  }i++;
                           }
           	        System.out.print("Ваш елемент незнайденo");
                  	 break;
                   case 4:
              		 System.out.print("Введіть index : ");
                		 a=in.nextInt();
                	 try 
                   	  {              		 
                		 System.out.print("\n\n");
                  	     List.getNode(a).show();
                	  }
                		 catch(Exception e)	     {   System.out.print("Ваш елемент незнайденo");}
                  	 break;
                   }
  	        		
  	 }
       
       //////////////////////////////////
  	 public void UpdateData(ContainerList<PoliceFile> List ){
  		 int size=List.size();
  		 if (size==0) 
  		 {
  		 System.out.print("\n\n Список пустий\n\n");
		 return;
		 }
  		 
  		 System.out.print("Введть індекс: ");
		 int index=in.nextInt();
 		 if(index<1||index>size) 
		 {
			 System.out.print("\nТакого злочинця незнайдено\n");
			 return;
		 }
		 PoliceFile PF=List.getNode(index);
		 PF.show();
		  List.Substitute(PF.EL(PF,true), index);
		  
	 }
	public void romove(ContainerList<PoliceFile> List) {
 		 if (List.size()==0) 
 		 {
 		 System.out.print("\n\n Список пустий\n\n");
		 return;
		 }
 		System.out.print("\nВведіть номер плануєе видалити?: ");
		int n=in.nextInt();
         List.removeNode(n);
		
	}
	/////////////////////////////
	
	 
	 
}
