import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

// ============================================================================
// PARTE 1: POLIMORFISMO DE SOBRECARGA (Method Overloading)
// Conceito: Mesma ação (nome do método), mas com parâmetros diferentes.
// ============================================================================
class CalculadoraDeArea {
    
    // 1. Área do Quadrado (1 parâmetro)
    public double calcularArea(double lado) {
        return lado * lado;
    }

    // 2. Área do Retângulo (2 parâmetros)
    public double calcularArea(double base, double altura) {
        return base * altura;
    }

    // 3. Área do Círculo (1 parâmetro, mas a fórmula muda)
    // Math.PI é uma ferramenta do Java que traz o valor de Pi (3.1415...)
    public double calcularArea(double raio) {
        return Math.PI * (raio * raio);
    }
}

// ============================================================================
// PARTE 2: HERANÇA E POLIMORFISMO DE SOBREPOSIÇÃO (Method Overriding)
// Conceito: Classes filhas herdam características do pai, mas reescrevem as regras.
// ============================================================================
class Funcionario {
    String nome;
    double salarioBase;

    // Construtor: Ensina como criar um funcionário rapidamente
    public Funcionario(String nome, double salarioBase) {
        this.nome = nome;
        this.salarioBase = salarioBase;
    }

    // Método original do Pai (Funcionário Regular)
    public double calcularSalario() {
        return salarioBase; 
    }
}

class Gerente extends Funcionario {
    
    // O construtor do filho precisa repassar as infos para o pai usando "super"
    public Gerente(String nome, double salarioBase) {
        super(nome, salarioBase);
    }

    // Polimorfismo de Sobreposição: Reescrevendo a regra do salário
    @Override
    public double calcularSalario() {
        return salarioBase * 1.20; // Salário base + 20% de bônus
    }
}

class Estagiario extends Funcionario {
    
    public Estagiario(String nome, double salarioBase) {
        super(nome, salarioBase);
    }

    @Override
    public double calcularSalario() {
        return salarioBase * 0.80; // Recebe 80% do salário base
    }
}

// ============================================================================
// CLASSE PRINCIPAL (Onde o programa roda)
// ============================================================================
public class GuiaDeEstudos {

    public static void main(String[] args) {
        
        System.out.println("====== TESTE 1: SOBRECARGA ======");
        CalculadoraDeArea calc = new CalculadoraDeArea();
        System.out.println("Area Quadrado: " + calc.calcularArea(5.0));
        System.out.println("Area Retangulo: " + calc.calcularArea(5.0, 10.0));
        System.out.println("Area Circulo: " + calc.calcularArea(3.0));

        System.out.println("\n====== TESTE 2: HERANCA E SOBREPOSICAO ======");
        // Criando uma lista que aceita qualquer tipo de Funcionario (Pai ou Filhos)
        ArrayList<Funcionario> listaFuncionarios = new ArrayList<>();
        
        listaFuncionarios.add(new Funcionario("Joao (Regular)", 2000.0));
        listaFuncionarios.add(new Gerente("Maria (Gerente)", 2000.0));
        listaFuncionarios.add(new Estagiario("Pedro (Estagiario)", 2000.0));

        // Laço for para percorrer a lista de objetos e calcular dinamicamente
        for (Funcionario f : listaFuncionarios) {
            System.out.println("Nome: " + f.nome + " | Salario Final: R$ " + f.calcularSalario());
        }

        System.out.println("\n====== TESTE 3: ARRAYLIST ======");
        revisaoArrayList();

        System.out.println("\n====== TESTE 4: HASHMAP ======");
        revisaoHashMap();
    }

    // ============================================================================
    // MÉTODOS DE REVISÃO (Listas e Mapas)
    // ============================================================================
    
    public static void revisaoArrayList() {
        // 1. Criar ArrayList e adicionar elementos
        ArrayList<String> frutas = new ArrayList<>();
        frutas.add("Maca");
        frutas.add("Banana");
        frutas.add("Laranja");

        // Imprimir tamanho e verificar se elemento existe (.contains)
        System.out.println("Tamanho da lista: " + frutas.size());
        System.out.println("Tem Banana? " + frutas.contains("Banana"));

        // 5. Remover pares de uma lista de números inteiros
        ArrayList<Integer> numeros = new ArrayList<>();
        numeros.add(10); numeros.add(15); numeros.add(20); numeros.add(25);
        numeros.removeIf(n -> n % 2 == 0); // Comando mágico para remover baseado em condição
        System.out.println("Numeros apos remover pares: " + numeros);

        // 6. Ordenar lista em ordem alfabética (Usamos a classe Collections)
        Collections.sort(frutas);
        System.out.println("Frutas em ordem alfabetica: " + frutas);

        // 8. Calcular a média dos números
        ArrayList<Double> notas = new ArrayList<>();
        notas.add(7.0); notas.add(8.5); notas.add(10.0);
        double soma = 0;
        for (Double nota : notas) {
            soma += nota; // Vai somando todas as notas
        }
        System.out.println("Media das notas: " + (soma / notas.size()));
    }

    public static void revisaoHashMap() {
        // 1. Criar um HashMap vazio (Chave, Valor)
        HashMap<String, String> myMap = new HashMap<>();

        // 2. Adicionar chave "nome" e valor "Joao" (Usamos o .put)
        myMap.put("nome", "Joao");

        // 3. Verificar se contem a chave (.containsKey)
        System.out.println("Contem a chave 'nome'? " + myMap.containsKey("nome"));

        // 4. Adicionar mais 3 pares
        myMap.put("idade", "25");
        myMap.put("cidade", "Sao Paulo");
        myMap.put("profissao", "Dev Java");

        // 5. Obter o valor associado à chave (.get)
        System.out.println("Idade do usuario: " + myMap.get("idade"));

        // 6. Remover a chave
        myMap.remove("nome");

        // 7 e 8. Verificar se esta vazio e obter tamanho
        System.out.println("O mapa esta vazio? " + myMap.isEmpty());
        System.out.println("Tamanho do mapa: " + myMap.size());

        // 9. Percorrer TODAS AS CHAVES (.keySet())
        System.out.println("- Lista de Chaves:");
        for (String chave : myMap.keySet()) {
            System.out.println(chave);
        }

        // 10. Percorrer TODOS OS VALORES (.values())
        System.out.println("- Lista de Valores:");
        for (String valor : myMap.values()) {
            System.out.println(valor);
        }
    }
}
