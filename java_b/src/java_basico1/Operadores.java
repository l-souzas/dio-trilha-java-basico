package java_basico1;

public class Operadores {

	public static void main(String[] args) {
		
		int a,b;
		a = 6;
		b = 6;
		
		//Operadores ternários em substituição ao if, o tipo da variável
		//deve ser também o mesmo tipo do retorno
		String resultado = a == b ? "verdadeiro" : "falso";
		
		System.out.println(resultado);
		
		int numero1 = 1;
		int numero2 = 2;
		
			boolean simNao = numero1 == numero2;
			System.out.println("numeroUM é igual a numeroDois? " +simNao);
	
			simNao = numero1 != numero2;
			System.out.println("numeroUm é diferente de numeroDois? " + simNao);
	
		boolean condicao1 = false;
		
		if(condicao1 && 7>5)
			System.out.println("Condição verdadeira");
		else
			System.out.println("Condição falsa");
		
	

	}

}
