package ua.khpi.oop.Hrianyk12;
public interface List<T> {
 
	    void addOnBack(T n);

	    void add(T n);

	    int size();

	    T getNode(int n);

	    void removeNode(int n);
	    
	    void Substitute(T el,int index);
	    
	    Object[]  �onverToArray();

		void clear();

	}

