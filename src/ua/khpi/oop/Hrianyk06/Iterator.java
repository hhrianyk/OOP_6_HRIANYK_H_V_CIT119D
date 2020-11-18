 /**
 * \brief L6
 * 	\author Heorhii Hrianyk
 * 	\version 1.0
 * 	\date   2020 рік
 * 	\warning Данний інтерфейс створений для ітераторів
 *
 *  

 */ 


package ua.khpi.oop.Hrianyk06;

public interface Iterator<E> {
	
	public boolean hasNext();
	public String next();
	public void remove();
	public String begin();
	public String end();
}
