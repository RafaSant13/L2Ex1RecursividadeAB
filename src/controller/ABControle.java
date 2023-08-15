package controller;

public class ABControle {
	
	public ABControle() {
		super();
	}
	
	public int Multiplica(int A, int B) {
		//Condição de Parada -> Quando B é igual a 0, pois qualquer número multiplicado por 0 é 0
		if (B==0)
		{
			return 0;
		}
		else
		{
			//A função é chamada através da variável soma, na qual é somada com o valor de A
			int soma = A + Multiplica(A, (B-1));
			return soma;
		}
	}

}
