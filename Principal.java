package hash;

import java.util.HashMap;

public class Principal {
	
	public static void main(String[] args) {
		
		HashMap<String, String> myMap = new HashMap<>();

		// Adicionando elementos
		myMap.put("nome", "sophia");
		myMap.put("idade", "25");
		myMap.put("profissão", "nutricionista");
		myMap.put("estado civil", "solteira");

		// Exibindo o HashMap
		System.out.println(myMap);

		// Verificando se contém a chave "nome"
		if (myMap.containsKey("nome")) {
			System.out.println("A chave existe no HashMap.");
		} else {
			System.out.println("A chave NÃO existe no HashMap.");
		}

		// Obtendo o valor da chave "idade"
		System.out.println("Idade: " + myMap.get("idade"));

		// Removendo a chave "nome"
		myMap.remove("nome");
		System.out.println("Após remover 'nome': " + myMap);

		// Verificando se está vazio
		if (myMap.isEmpty()) {
			System.out.println("O HashMap está vazio");
		} else {
			System.out.println("O HashMap não está vazio");
		}

		// Tamanho do HashMap
		System.out.println("Tamanho do HashMap: " + myMap.size());

		// Percorrendo as chaves
		System.out.println("\nChaves:");
		for (String chave : myMap.keySet()) {
			System.out.println(chave);
		}

		// Percorrendo os valores
		System.out.println("\nValores:");
		for (String valor : myMap.values()) {
			System.out.println(valor);
		}
	}
}