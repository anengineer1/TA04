

public class TA04_3App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int X = 1;
		int Y = 2;
		double N = 1.1; 
		double M =  1.2;
		System.out.println("Variable X = " + X);
		System.out.println("Variable Y = " + Y);
		System.out.println("Variable N = " + N);
		System.out.println("Variable M = " + M);
		// First pack of operations
		System.out.println(X + " + " + Y + " = " + (X + Y));
		System.out.println(X + " - " + Y + " = " + (X - Y));
		System.out.println(X + " * " + Y + " = " + (X * Y));
		System.out.println(X + " / " + Y + " = " + (X / Y));
		System.out.println(X + " % " + Y + " = " + (X % Y));
		// Second pack of operations
		System.out.println(N + " + " + M + " = " + (N + M));
		System.out.println(N + " - " + M + " = " + (N - M));
		System.out.println(N + " * " + M + " = " + (N * M));
		System.out.println(N + " / " + M + " = " + (N / M));
		System.out.println(N + " % " + M + " = " + (N % M));
		// Third pack of operations
		System.out.println(X + " + " + N + " = " + (X + N));
		System.out.println(Y + " / " + M + " = " + (Y / M));
		System.out.println(N + " % " + M + " = " + (Y % M));
		// Fourth Pack of operations
		System.out.println("El doble de " + X + " es: " + (2*X));
		System.out.println("El doble de " + Y + " es: " + (2*Y));
		System.out.println("El doble de " + N + " es: " + (2*N));
		System.out.println("El doble de " + M + " es: " + (2*M));
		// Fifth pack of operations
		System.out.println("La suma de todo es: " + (X + Y + N + M));
		System.out.println("El producto de todo es: " + (X * Y * N * M));

	}

}
