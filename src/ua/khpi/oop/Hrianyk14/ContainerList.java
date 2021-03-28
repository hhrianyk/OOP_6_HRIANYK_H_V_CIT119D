package ua.khpi.oop.Hrianyk14;
import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.Optional;
import java.util.Scanner;
import java.util.Arrays;
import java.util.Comparator;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;
 
import java.util.AbstractList;
import java.util.ArrayList;

public class ContainerList<T  extends  Serializable >
             implements List<T>,Iterable<T>   {
	private static final long serialVersionUID = 1L;
	
	public Element<T> head = null ;//head
	public Element<T> current = null;
	public Element<T> last = null;
	public Element<T> previous = null;

 
	 
	 
	
	
///////////////////////////////////////////////////////	
	    public ContainerList() {  }
///////////////////////////////////////////////////
	    public ContainerList(T tab[]) {
	        for (T a : tab) {
	             
	            this.add(a);
	        }
	    }
////////////////////////////////////////////////////    
 
	@Override
	public void addOnBack(T n) {
		Optional<T> optional = Optional.empty();
		 optional = Optional.ofNullable(n);
	        if (optional.isPresent()) {

	            current = new Element<>(n);
	            current.next = head;

	            head = current;
	         
	        }
	}
///////////////////////////////////////////////////////
	@Override
	public void add(T n) {
		Optional<T> optional = Optional.empty();
		optional = Optional.ofNullable(n);
        while (optional.isPresent()) {
            current = new Element<>(n);
            if (head == null) {
            	head = current;
            } else {
                last.next = current;
            }
            last = current;
            
            break;
        }
		 
	}
////////////////////////////////////////////////////////
	 
	@Override
	public int size() {
 
	int size=0;
		{  current = head;
	        while (current != null) {
	        	 size++;
	            current = current.next;
	        }
		}  
 
        return size;
	}
/////////////////////////////////////////////////////////
	@Override
	public T getNode(int n) {
		    
	        Element<T> searchingNumber = head;
	        Element<T> target = null;
	        T t = null;
	        if (n <= size() && searchingNumber != null) {
	            for (int a = 0; a < n; a++) {
	                target = searchingNumber;
	                searchingNumber = searchingNumber.next;
	            }
	        } else {
	            System.out.println("indexOut");
	        }
	        if (target != null) {
	            t = target.num;
	        } else {
	            System.out.println("null");
	        }

	        return t;
	}
//////////////////////////////////////////////////////////
	@Override
	public void removeNode(int n) {
		 if (n <= 0 || n > size()) {
	            System.out.println("Список пустий");
	        } else {
	            if (n == 1) {
	            	head = head.next;
	            }
	            current = null;
	            current = head;

	            if (current != null) {
	                for (int a = 1; a < n; a++) {
	                    previous = current;
	                    current = current.next;
	                }
	            }

	            if (n > 1) {
	                previous.next = current.next;
	            }
	        }

		
	}
///////////////////////////////////////////////////////////
	@Override
	public void clear() 
	{
		Thread.currentThread().setName("clear");
		 System.out.print(Thread.currentThread().getName()+" - почав роботу\n");
		//int size=size();
		head=null;
		/*for (int i = 0; i < size; i++)
			{
			head = head.next;
			} */  
		 System.out.print(Thread.currentThread().getName()+" - закінчив роботу\n");
	}
 ////////////////////////////////
	public String toString()
	{
		String s=new String();
		current=head;
	        while (current != null) {
	           s+=current.num.toString();
	            current = current.next;
	        }
		return  s;
		
	}
 

////////////////////////////////	
	
	public void Substitute(T el,int index)
	{
		current=head;
		for (int i=1;i<index;i++)
		{
			current=current.next;
		}
		 current.num=el;
	}
	
////////////////////////////////
 

	
	@SuppressWarnings({"unchecked"})
	public  Object[]  СonverToArray()
	{
		int size=size();
	 Object mas[]=new Object[size];
		 
		 current=head;
		for(int i=0;i<size;i++)
		{
			mas[i]=(T)current.num;
			current=current.next;
		}
		return mas;
	}
	
 //////////////////////////////////////
	 
	public void sort (Comparator<PoliceFile> c )
	{
		ArrayList<T> list=new ArrayList<>();
		
		 current = head;
	        while (current != null) {
	        	list.add( current.num);  
	            current = current.next;
	        }
		 
      list.sort((Comparator<? super T>) c);
	  clear();
 
	  for(var a:list)
	  {
		 add(a);
	  }
 
	}
 
/////////////////////////////////	 
	    // Iterator

	    public  Iterator<T> iterator() {
	        return new MyLinkedListIterator();
	    }

	    private class MyLinkedListIterator implements Iterator<T> {

	        private Element<T> curr;

	        public MyLinkedListIterator() {
	            this.curr = head; // голова списка
	        }

	        public boolean hasNext() {
	            return this.curr != null;
	        }

	        public T next() {
	            if (!this.hasNext()) {
	                throw new NoSuchElementException();
	            }
	            T value = curr.num; // значение в текущем узле
	            curr = curr.next;     // следующий узел
	            return value;
	        }

	        public void remove() {
	            throw new UnsupportedOperationException();
	        }
	    }
	 ////////////////////////////////////////////


 

 
 
 
}
