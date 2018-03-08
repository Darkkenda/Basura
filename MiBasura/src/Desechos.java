import java.util.Scanner;
/**
 * Desechos: clase que nos permite contar el numero de vocales y consonantes de una frase.
 * @author Adrián Izquierdo
 * @version 1.0
 * @since Java 8.0
 */
public class Desechos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				
				Scanner sc = new Scanner(System.in);
				
			
		 		String s = sc.nextLine();
		 		cuentavocales(s);
		 		cuentaconsonantes(s);
		 		
				}
		
	
	/**
	 * cuentaconsonantes: cuenta las consonantes que tenemos en nuestra frase
	 * @param s String es la frase que usamos para contar
	 * @param c los caracteres
	 * @return int numero de consonantes
	 */
	
	public static int cuentaconsonantes(String s) {
		// TODO Auto-generated method stub
		int res = 0;
		int consonante = 0;
		for(char c : s.toCharArray()) {
			if (c == 'q' || c == 'w' || c == 'r' || c == 't' || c == 'y' || c == 'p' || c == 's' || c == 'd' || c == 'f' || c == 'g' || c == 'h' || c == 'j' || c == 'k' || c == 'l' || c == 'ñ' || c == 'z' || c == 'x'
					|| c == 'c' || c == 'v' || c == 'b' || c == 'n' || c == 'm') {
				consonante++;			
			
			}
			res=consonante;
		}
		System.out.println("Consonantes "+res);
		return res;
		
	}

	/**
	 * cuentavocales: cuenta las vocales que tenemos en nuestra frase
	 * @param s String es la frase que usamos para contar
	 * @param c los caracteres
	 * @return int numero de vocales
	 */
	
	public static int cuentavocales(String s) {
		// TODO Auto-generated method stub
		int res = 0;
		int vocal = 0;
		for(char c : s.toCharArray()) {
			if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
				vocal++;
							
			}
			res=vocal;
		}
			System.out.println("Vocales "  + res);	
			return res;
		}
		

}
