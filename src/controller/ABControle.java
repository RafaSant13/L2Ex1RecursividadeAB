package controller;

public class ABControle {
	
	public ABControle() {
		super();
	}
	
	public int Multiplica(int A, int B) {
		//Condi��o de Parada -> Quando B � igual a 0, pois qualquer n�mero multiplicado por 0 � 0
		if (B==0)
		{
			return 0;
		}
		else
		{
			//A fun��o � chamada atrav�s da vari�vel soma, na qual � somada com o valor de A
			int soma = A + Multiplica(A, (B-1));
			return soma;
		}
	}

}
