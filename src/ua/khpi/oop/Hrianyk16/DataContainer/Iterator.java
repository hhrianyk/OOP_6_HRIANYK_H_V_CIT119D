/**
 * 
 */
package DataContainer;

 

/**
 * @author Георгiй
 *
 */
public interface Iterator<E> {
	
	public boolean hasNext();
	public E next();
	public void remove();
	public E begin();
	public E end();
}

