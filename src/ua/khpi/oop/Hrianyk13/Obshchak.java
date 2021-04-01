package ua.khpi.oop.Hrianyk13;
///клас для загального використанння
public class Obshchak {
	
	public static ContainerList<PoliceFile> List=new ContainerList<PoliceFile>();///container
	public static Boolean stop ; ///Flag status of interactive use of drinks (false - used; true- no)
	public static int TimeOut=0; ///TimeOut: if TimeOut=0 operating time is not limited otherwise limited by value
	public static int Choice=0; ///id process/thread

}
