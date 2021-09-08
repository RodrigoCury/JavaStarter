
public class TestVariables {

	public static void main(String[] args) {
		TestVariables.charsAndStrings();
	}

	public static int soma(int a, int b ) {
		return (a + b);
	}
	
	public static void typesOfNumbers() {
		
		int idade ;
		idade = 12/5;
		System.out.println(idade);

		// Fração com pouca precisão
		float valorDaStock;
		valorDaStock = 1272.54f;
		System.out.println(valorDaStock);

		double salario;
		salario = 1272.90;
		System.out.println(salario);
		
		// Conversão
		int valor = (int) salario;
		System.out.println(valor);
		
		long valorGrande = 123122222222222224L;
		short valorPqno = 12344;
		byte b = 127;
		System.out.println(valorGrande);
		System.out.println(valorPqno);
		System.out.println(b);
		System.out.println(0.1 + 0.2);
		System.out.println(TestVariables.soma(2, 3));
	}
	
	public static void charsAndStrings() {
		char letra = 'a'; // Um único caractére
		System.out.println(letra);
		letra++;
		System.out.println(letra);
		
		char valor = 1;
		
		for (int i = 0; i < 150; i++) {
//			System.out.println(valor);
			valor = (char) (valor + 1);
		}
		
		String palavra = "Rodrigo Cury";
		System.out.println(palavra);
			
	}
}
