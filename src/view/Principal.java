package view;

import controller.OperacaoController;
import br.com.leandrocolevati.pilhaint.*;

public class Principal {

	public static void main(String[] args) throws Exception {
		int valor = 0;
		OperacaoController op = new OperacaoController();
		Pilha p = new Pilha();
		
		for (int i=0;i<15;i++) {
			valor = (int) (Math.random() * 50 + 1);
			p.push(valor);
			System.out.print(valor);
			System.out.print(" ");
		}
		System.out.println(" ");
		System.out.println("Maior valor = "+op.maiorValor(p));
		
	}

}
