/**
 * 
 */
package ua.khpi.oop.Hrianyk12;

/**
 * @author Георгiй
 *
 */
public interface Iterator<E> {
	
	public boolean hasNext();
	public PoliceFile next();
	public void remove();
	public PoliceFile begin();
	public PoliceFile end();
}

