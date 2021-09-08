
public class testaLaços {

	public static void main(String[] args) {
//		testaLaços.While();
//		testaLaços.WhileScope();
//		testaLaços.ForLoop();
//		testaLaços.LacosEncadeados();
		testaLaços.tabela();
	}

	public static void While() {
		int contador = 0;
		while (contador < 300) {
			if (contador == 150) {
				break;
			}
			contador += 1;
		}
		System.out.println(contador);
	}

	private static void WhileScope() {
		int contador = 0;
		while (contador < 10) {
			int total = 0;
			total = total + contador;

			System.out.println(total);
			contador++;
		}

		contador = 0;
		int soma = 0;

		while (contador < 10) {
			soma = soma + contador;

			System.out.println(soma);
			contador++;
		}
	}

	private static void ForLoop() {
		int soma = 0;
		for (int i = 0; i <= 10; i++) {
			soma += i;
			System.out.println(soma);
		}
		System.out.println("testaLaços.ForLoop()");
	}

	private static void LacosEncadeados() {
		for (int multiplicador = 1; multiplicador <= 10; multiplicador++) {
			System.out.println("Taboada de " + multiplicador);
			for (int num = 0; num <= 10; num++) {
				System.out.println(multiplicador + " X " + num + " = " + (num * multiplicador));
			}
		}
	}

	private static void tabela() {
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				if(j > i) {
					break;
				}
				System.out.print("*");
			}
			System.out.println();
		}
		
		for (int i = 1; i <= 10; i++) {
			for(int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		for (int i = 1; i <= 10; i++) {
			for(int j = 1; j <= i; j++) 
				System.out.print("*");
			System.out.println();
		}
	}
}
