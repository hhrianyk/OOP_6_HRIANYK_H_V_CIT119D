package ua.khpi.oop.Hrianyk09;
public interface List<T> {
	 
	     

	    void addOnBack(T n);

	    void add(T n);

	    int size();

	    T getNode(int n);

	    void removeNode(int n);
	    
	    void remove();

	    void Substitute(T el,int index);
	    
	    Object[]  �onverToArray();

	}

