import java.util.HashSet;

public class Principal {

	public static void main(String[] args) {
		
		HashSet<String> carros = new HashSet<String>();
		
		carros.add("Fusca");
		carros.add("BYD");
		carros.add("Monza");
		carros.add("Chevette");
		carros.add("Fusca");
		
		System.out.println(carros);
		
		carros.remove("Monza");
		
		System.out.println(carros);
		
		for (String a : carros) {
			System.out.println(a);
		}
		
	}
}
