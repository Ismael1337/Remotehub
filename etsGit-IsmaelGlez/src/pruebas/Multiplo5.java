package pruebas;

public class Multiplo5 {

	public static void main(String[] args) {
		
		boolean repetir = true;
		int cont = 0;
		
		for (int i = 1; repetir; i++) {
			
			if (i % 5 == 0) {
				System.out.println((cont+1) + ": " + i + "  ");
			cont = cont + 1;
			}
			if (cont == 100)
				repetir = false;
		}
			
	}

}
