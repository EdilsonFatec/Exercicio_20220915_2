package controller;

import br.com.leandrocolevati.pilhaint.*;

public class OperacaoController {

	public  OperacaoController() {
		super();
	}
	
	public int maiorValor(Pilha p) throws Exception {
		int i = 0;
		int j = 0;
		int maior = 0;
		Pilha pCopia = p;
		
		do {
			i = pCopia.pop();
			j = pCopia.pop();
			if  (i>j) {
				pCopia.push(i);
			} else {
				pCopia.push(j);
			}
		} while (pCopia.size()>1);
	maior = pCopia.pop();	
	return maior;	
	}

}
