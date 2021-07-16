import java.util.function.BiPredicate;

public class FuncoesPura {

	public static void main(String[] args) {
		
		BiPredicate<Integer, Integer> verificarSeEMaior = 
				(parametro, valorComparacao) -> parametro > valorComparacao;
		
	    System.out.println(verificarSeEMaior.test(13, 12));
	    System.out.println(verificarSeEMaior.test(1, 12));

	}

}
