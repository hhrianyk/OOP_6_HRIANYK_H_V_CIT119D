/**
 *  /**
 * \brief L7
 * 	\author Heorhii Hrianyk
 * 	\version 1.0
 * 	\date   2020 рік
 * 	\warning Данний інтерфейс створений для ітераторів
 *
 *  

 */ 

 */
package ua.khpi.oop.Hrianyk07;

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

