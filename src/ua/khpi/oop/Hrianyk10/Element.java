package ua.khpi.oop.Hrianyk10;

import java.io.Serializable;
 

public class Element<T  extends  Serializable>    {
 
	private static final  long serialVersionUID = 10L;
	
   public T num;
   public Element next;

    public Element(T n) {
        num = n;
        next = null;
    }
    
    public Element() {}

 
}
