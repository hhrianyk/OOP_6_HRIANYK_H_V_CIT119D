package ua.khpi.oop.Hrianyk13;

import java.util.Date;
import java.util.regex.*;

public class Regex {
	
	 public static boolean Name(String name){  
	        Pattern p = Pattern.compile("^[A-Z�-ߨ��][a-z�-����]{1,15}$");  
	        Matcher m = p.matcher(name);  
	        return m.matches();  
	}

	 public static boolean Data(String data){  
	        Pattern p = Pattern.compile("^([0-2]\\d|3[0-1])[\\,\\.]((0\\d)|(1[0-2]))[\\,\\.](20\\d{2}|19\\d{2})$");  
	        Matcher m = p.matcher(data);  
	        return m.matches();  
	}
	 public static boolean SupperPF(String supper){  
	        Pattern p = Pattern.compile("^Name:[A-Z�-ߨ��][a-z�-����]{1,15}; Surname:[A-Z�-ߨ��][a-z�-����]{1,15}; Lastname:[A-Z�-ߨ��][a-z�-����]{1,15}"
	        		+ "; ��:([0-2]\\d|3[0-1])[\\,\\.](0?\\d|1[0-2])[\\,\\.](200[0-1]|19\\d{2})"
	        		+ "; ���:([0-2]\\d|3[0-1])[\\,\\.](0?\\d|1[0-2])[\\,\\.](20\\d{2}|19\\d{2})"
	        		+ "; ��:([0-2]\\d|3[0-1])[\\,\\.](0?\\d|1[0-2])[\\,\\.](20\\d{2}|19\\d{2})"
	        		+ "; ��:(([0-2]\\d|3[0-1])[\\,\\.]?(0\\d|1[0-2])[\\,\\.]?(20\\d{2}|19\\d{2})( )?){1,};$");  
	        Matcher m = p.matcher(supper);  
	        return m.matches();  
	}
	 public static boolean LitePF(String supper){  
	        Pattern p = Pattern.compile("^Name:[A-Z�-ߨ��a-z�-����]{1,15}; Surname:[A-Z�-ߨ��a-z�-����]{1,15}; Lastname:[A-Z�-ߨ��a-z�-����]{1,15}"
	        		+ "; ��:([0-9\\,\\.]){8,10}"
	        		+ "; ���:([0-9\\,\\.]){8,10}"
	        		+ "; ��:([0-9\\,\\.]){8,10}"
	        		+ "; ��:(([0-9\\,\\.]){8,10}( )?){1,};.*$");    
	        Matcher m = p.matcher(supper);  
	        return m.matches();  
	}
	 
	 public static boolean NotYoung(String supper){  
		    Date date = new Date();

		    Pattern p = Pattern.compile("^([0-2]\\d|3[0-1])[\\,\\.]?(0\\d|1[0-2])[\\,\\.]?(200[0-1]|19\\d{2})$");  	 
	        
	        Matcher m = p.matcher(supper);  
	        return m.matches();  
	}
	 public static boolean KoName(String KoName){  
		    Pattern p = Pattern.compile("^.*([Kk��][Oo��]).*$");   
	        Matcher m = p.matcher(KoName);  
	        return m.matches();  
	}
	 
	 public static boolean KoNameNotYoung(String KoName){  
		    
	        Pattern p = Pattern.compile("^.*Lastname:[A������Ũ�޲��].*([Kk��][Oo��]).*;.*��:(\\d|[1-2]\\d|3[0-1])[\\,\\.](0?\\d|1[0-2])[\\,\\.](200[0-1]|19\\d{2});.*$"); 
	        Matcher m = p.matcher(KoName);  
	        return m.matches();  
	}
	 
	 
	 
	 public static boolean SupperData(String supper){  
	        Pattern p = Pattern.compile("^(?:(?:31(\\/|-|\\.)(?:0?[13578]|1[02]))\\1|(?:(?:29|30)(\\/|-|\\.)"
	        		+ "(?:0?[1,3-9]|1[0-2])\\2))(?:(?:1[6-9]|[2-9]\\d)?\\d{2})$|^(?:29(\\/|-|\\.)0?2"
	        		+ "\\3(?:(?:(?:1[6-9]|[2-9]\\d)?(?:0[48]|[2468][048]|[13579][26])|(?:(?:16|[2468][048]|[3579][26]"
	        		+ ")00))))$|^(?:0?[1-9]|1\\d|2[0-8])(\\/|-|\\.)(?:(?:0?[1-9])|(?:1[0-2]))\\4(?:(?:1[6-9]|[2-9]\\"
	        		+ "d)?\\d{2})$");    
	        Matcher m = p.matcher(supper);  
	        return m.matches();  
	}
}
