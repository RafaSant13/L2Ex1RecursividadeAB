package view;
import controller.ABControle;

public class Principal {

	public static void main(String arqs[]) {
		ABControle abc = new ABControle();
		int A = 4;
		int B = 5;
		System.out.println("O valor da multiplicação é: "+abc.Multiplica(A, B));
	}
}
