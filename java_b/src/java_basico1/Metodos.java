package java_basico1;

public class Metodos {
	
	public static double somar(double num1, double num2) {
		return num1+num2;
	}
	
	public static void imprimir(String texto) {
		System.out.println(texto);
	}

	public static void main(String[] args) {
		double num1 = 5, num2 = 10;
		String text = "Método imprimir";
		
		System.out.println(somar(num1,num2));
		imprimir(text);
		
		
	}

}
