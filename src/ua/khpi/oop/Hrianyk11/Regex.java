package ua.khpi.oop.Hrianyk11;

import java.util.regex.*;

public class Regex {
	
	 public static boolean Name(String name){  
	        Pattern p = Pattern.compile("^[A-ZА-ЯЁЇІ][a-zа-яёїі]{1,15}$");  
	        Matcher m = p.matcher(name);  
	        return m.matches();  
	}

	 public static boolean Data(String data){  
	        Pattern p = Pattern.compile("^([0-2]\\d|3[0-1])[\\,\\.]?(0\\d|1[0-2])[\\,\\.]?(20\\d{2}|19\\d{2})$");  
	        Matcher m = p.matcher(data);  
	        return m.matches();  
	}
	 public static boolean SupperPF(String supper){  
	        Pattern p = Pattern.compile("^Name:[A-ZА-ЯЁЇІ][a-zа-яёїі]{1,15}; Surname:[A-ZА-ЯЁЇІ][a-zа-яёїі]{1,15}; Lastname:[A-ZА-ЯЁЇІ][a-zа-яёїі]{1,15}"
	        		+ "; ДН:([0-2]\\d|3[0-1])[\\,\\.]?(0\\d|1[0-2])[\\,\\.]?(20\\d{2}|19\\d{2})"
	        		+ "; ОПВ:([0-2]\\d|3[0-1])[\\,\\.]?(0\\d|1[0-2])[\\,\\.]?(20\\d{2}|19\\d{2})"
	        		+ "; ОЗ:([0-2]\\d|3[0-1])[\\,\\.]?(0\\d|1[0-2])[\\,\\.]?(20\\d{2}|19\\d{2})"
	        		+ "; ДС:(([0-2]\\d|3[0-1])[\\,\\.]?(0\\d|1[0-2])[\\,\\.]?(20\\d{2}|19\\d{2})( )?){1,};$");  
	        Matcher m = p.matcher(supper);  
	        return m.matches();  
	}
	 public static boolean LitePF(String supper){  
	        Pattern p = Pattern.compile("^Name:[A-ZА-ЯЁЇІa-zа-яёїі]{1,15}; Surname:[A-ZА-ЯЁЇІa-zа-яёїі]{1,15}; Lastname:[A-ZА-ЯЁЇІa-zа-яёїі]{1,15}"
	        		+ "; ДН:([0-9\\,\\.]){8,10}"
	        		+ "; ОПВ:([0-9\\,\\.]){8,10}"
	        		+ "; ОЗ:([0-9\\,\\.]){8,10}"
	        		+ "; ДС:(([0-9\\,\\.]){8,10}( )?){1,};$");   
	        Matcher m = p.matcher(supper);  
	        return m.matches();  
	}
	
}
