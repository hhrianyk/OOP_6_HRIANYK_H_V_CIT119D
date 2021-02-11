package ua.khpi.oop.Hrianyk09;
import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.Optional;
import java.util.Scanner;
import java.util.Arrays;
import java.util.Iterator;
import java.util.NoSuchElementException;
 


public class ContainerList<T  extends  Serializable> implements List<T>,Iterable<T> {
	private static final long serialVersionUID = 1L;
	
	public Element<T> top = null ;
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
	            current.next = top;

	            top = current;
	           
	        }
	}
///////////////////////////////////////////////////////
	@Override
	public void add(T n) {
		Optional<T> optional = Optional.empty();
		optional = Optional.ofNullable(n);
        while (optional.isPresent()) {
            current = new Element<>(n);
            if (top == null) {
                top = current;
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
		int size = 0;
        current = top;
        while (current != null) {
            size++;
            current = current.next;
        }
        return size;
	}
/////////////////////////////////////////////////////////
	@Override
	public T getNode(int n) {
		    int size = this.size();
	        Element<T> searchingNumber = top;
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
	                top = top.next;
	            }
	            current = null;
	            current = top;

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
	public void remove() 
	{
		 if ( size()== 0)
		 {
	            System.out.println("Список пустий");
	            return;
	      } 
		 top=null;

	             
	  
	}
 
////////////////////////////////
	public String toString()
	{
		String s=new String();
		current=top;
	        while (current != null) {
	           s+=current.num.toString();
	            current = current.next;
	        }
		return  s;
		
	}

////////////////////////////////	
	
	public void Substitute(T el,int index)
	{
		current=top;
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
		
		int size=this.size();
	 Object mas[]=new Object[size];
		 
		 current=top;
		for(int i=0;i<size;i++)
		{
			mas[i]=(T)current.num;
			current=current.next;
		}
		return mas;
	}
	
 
	
/////////////////////////////////	 
	    // Iterator

	    public  Iterator<T> iterator() {
	        return new MyLinkedListIterator();
	    }

	    private class MyLinkedListIterator implements Iterator<T> {

	        private Element<T> curr;

	        public MyLinkedListIterator() {
	            this.curr = top; // голова списка
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
	 
}
