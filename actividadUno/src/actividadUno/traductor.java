package actividadUno;

import java.util.ArrayList;

public class traductor {

	public String traduceA (String text){
        ArrayList<Character> vocales = new ArrayList<>();
        vocales.add('a');
        vocales.add('e');
        vocales.add('i');
        vocales.add('o');
        vocales.add('u');
        
        vocales.add('A');
        vocales.add('E');
        vocales.add('I');
        vocales.add('O');
        vocales.add('U');
        
        String salida = ""; 
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (vocales.contains(ch)) {
                salida += "@";
            }
            else
                salida +=  ch;
        }
        return salida;
    }
	
	public String TraduceNum(String text) {
		String salida = "";
		
		for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (ch == 'a' || ch == 'A' ) {
                salida += "4";
            } 
            else if (ch == 's' || ch == 'S' ) {
                salida += "5";
            }
            else if (ch == 'i' || ch == 'I' ) {
                salida += "1";
            }
            else if (ch == 'o' || ch == 'O' ) {
                salida += "0";
            }
            else if (ch == 'b' || ch == 'B' ) {
                salida += "8";
            }
            else 
            	salida += ch;
		}
		
		return salida;
		
	}

		
}
