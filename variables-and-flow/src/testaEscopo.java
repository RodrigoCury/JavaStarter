import com.sun.jdi.Type;

public class testaEscopo {
	public static void main(String[] args) {
		int idade = 20;
		int quantidadeDePessoas = 5;
		
		boolean acompanhado;
		
//		if (quantidadeDePessoas >= 2) {
//			acompanhado = true;
//		} else {
//			acompanhado = false;
//		}
		
		acompanhado = (quantidadeDePessoas >= 2);
		System.out.println(acompanhado);
		
		
		if (idade >= 18 || acompanhado) {
			System.out.println("Você pode Entrar");
		} else {
			System.out.println("Você fica de fora");
		}
	}
}
