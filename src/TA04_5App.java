
public class TA04_5App {

	public static void main(String[] args) {
		int A = 1;
		int B = 2;
		int C = 3;
		int D = 4;
		
		// Bloque por defecto
		System.out.println("Variables antes de que se intercambien el valor asigando:");
		System.out.println("Variable A = " + A);
		System.out.println("Variable B = " + B);
		System.out.println("Variable C = " + C);
		System.out.println("Variable D = " + D);
		
		// El enunciado indica que cada variable ha de tomar el valor de otra.
		// Usamos variables auxiliares para poder utilizar el valor original de la misma
		// Antes de que esta cambie
		int B_aux= B;
		B = C;
		C = A;
		A = D;
		D = B_aux;
		
		// Bloque de las varibables después de ser cambiadas
		System.out.println("Variables después de que se intercambien el valor asigando:");
		System.out.println("Variable A = " + A);
		System.out.println("Variable B = " + B);
		System.out.println("Variable C = " + C);
		System.out.println("Variable D = " + D);
	}

}
