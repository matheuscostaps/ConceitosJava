import java.util.HashSet;

public class Princiapl {

	public static void main(String[] args) {
		
		HashSet<Integer> mySet = new HashSet<Integer>();
		
		mySet.add(1);
		mySet.add(2);
		mySet.add(3);
		mySet.add(4);
		mySet.add(5);
		
		mySet.contains(4);
		
		mySet.remove(2);
		
		if (mySet.isEmpty()) {
			System.out.println("O HashSet está vazio");
		} else {
			System.out.println("O HashSet não está vazio");
		}
		
		HashSet<Integer> otherSet = new HashSet<Integer>();
		
		otherSet.add(4);
		otherSet.add(5);
		otherSet.add(6);
		otherSet.add(7);
		
        mySet.retainAll(otherSet);
        System.out.println("mySet após retainAll: " + mySet);
        
        mySet.addAll(otherSet);
        
        int tamanho = mySet.size();
        System.out.println("O tamanho atual do mySet é: " + tamanho);
        
        System.out.println("Elementos finais do mySet:");
        for (Integer numero : mySet) {
            System.out.println(numero);
        }
    }
		
        
}

