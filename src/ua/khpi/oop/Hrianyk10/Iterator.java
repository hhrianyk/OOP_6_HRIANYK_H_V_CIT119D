/**
 * 
 */
package ua.khpi.oop.Hrianyk10;

/**
 * @author �����i�
 *
 */
public interface Iterator<E> {
	
	public boolean hasNext();
	public PoliceFile next();
	public void remove();
	public PoliceFile begin();
	public PoliceFile end();
}

