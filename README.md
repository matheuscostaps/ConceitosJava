# 📚 Revisão de Java (POO, Listas e Mapas)

Este repositório contém um resumo prático e direto dos principais conceitos de **Programação Orientada a Objetos (POO)** e **Estruturas de Dados** em Java, focado na resolução de exercícios de fixação.

---

## 📌 Índice
1. [Polimorfismo de Sobrecarga (Calculadora de Área)](#1-polimorfismo-de-sobrecarga)
2. [Polimorfismo de Sobreposição (Sistema de Funcionários)](#2-herança-e-polimorfismo-de-sobreposição)
3. [Listas Dinâmicas (ArrayList e seus métodos)](#3-listas-dinâmicas-arraylist)
4. [Mapas (HashMap: O Dicionário do Java)](#4-mapas-hashmap)

---

## 1. Polimorfismo de Sobrecarga
**Regra do Exercício:** Criar uma classe `CalculadoraDeArea` com o mesmo método `calcularArea()` para Quadrado, Retângulo e Círculo, diferenciando apenas pelos parâmetros.

```java
public class CalculadoraDeArea {
    
    // 1. Quadrado (1 parâmetro: lado)
    public double calcularArea(double lado) {
        return lado * lado;
    }

    // 2. Retângulo (2 parâmetros: base e altura)
    public double calcularArea(double base, double altura) {
        return base * altura;
    }

    // 3. Círculo (1 parâmetro: raio) - Usa Math.PI
    public double calcularArea(double raio) {
        return Math.PI * (raio * raio);
    }

    // TESTANDO NO MAIN
    public static void main(String[] args) {
        CalculadoraDeArea calc = new CalculadoraDeArea();
        System.out.println("Área Quadrado: " + calc.calcularArea(5.0));
        System.out.println("Área Retângulo: " + calc.calcularArea(5.0, 10.0));
        System.out.println("Área Círculo: " + calc.calcularArea(3.0));
    }
}
```

---

## 2. Herança e Polimorfismo de Sobreposição
**Regra do Exercício:** Criar um sistema onde `Gerente` ganha +20% e `Estagiario` ganha 80% do salário base do `Funcionario`. Todos devem ir para uma lista e ter seus salários impressos.

```java
// CLASSE PAI
class Funcionario {
    String nome;
    double salarioBase;

    public Funcionario(String nome, double salarioBase) {
        this.nome = nome;
        this.salarioBase = salarioBase;
    }

    public double calcularSalario() {
        return salarioBase; // Funcionário Regular
    }
}

// CLASSES FILHAS
class Gerente extends Funcionario {
    public Gerente(String nome, double salarioBase) { super(nome, salarioBase); }

    @Override
    public double calcularSalario() { return salarioBase * 1.20; } // +20%
}

class Estagiario extends Funcionario {
    public Estagiario(String nome, double salarioBase) { super(nome, salarioBase); }

    @Override
    public double calcularSalario() { return salarioBase * 0.80; } // 80%
}

// TESTANDO NO MAIN
import java.util.ArrayList;

public class SistemaFuncionarios {
    public static void main(String[] args) {
        // Criando a lista que aceita qualquer Funcionário
        ArrayList<Funcionario> lista = new ArrayList<>();
        
        lista.add(new Funcionario("João (Regular)", 2000.0));
        lista.add(new Gerente("Maria (Gerente)", 2000.0));
        lista.add(new Estagiario("Pedro (Estagiário)", 2000.0));

        // Percorrendo a lista e acionando o polimorfismo
        for (Funcionario f : lista) {
            System.out.println("Nome: " + f.nome + " | Salário Final: R$ " + f.calcularSalario());
        }
    }
}
```

---

## 3. Listas Dinâmicas (ArrayList)
**Regra do Exercício:** Utilizar os principais métodos do ArrayList (Adicionar, checar tamanho, conter, remover com condição, ordenar e calcular média).

```java
import java.util.ArrayList;
import java.util.Collections;

public class ExemploLista {
    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<>();

        // Adicionando elementos
        numeros.add(10);
        numeros.add(5);
        numeros.add(20);
        numeros.add(15);

        // Imprimir tamanho e verificar se existe
        System.out.println("Tamanho da lista: " + numeros.size());
        System.out.println("Contém o número 20? " + numeros.contains(20));

        // Ordenar a lista
        Collections.sort(numeros);
        System.out.println("Lista Ordenada: " + numeros);

        // Remover todos os números pares da lista
        numeros.removeIf(n -> n % 2 == 0); 
        System.out.println("Sem números pares: " + numeros);

        // Calcular a média
        double soma = 0;
        for (Integer num : numeros) {
            soma += num;
        }
        System.out.println("Média final: " + (soma / numeros.size()));
    }
}
```

---

## 4. Mapas (HashMap)
**Regra do Exercício:** Passo a passo completo das 10 requisições do exercício prático sobre HashMap (myMap).

```java
import java.util.HashMap;

public class ExemploMapa {
    public static void main(String[] args) {
        
        // 1. Crie um HashMap vazio chamado "myMap"
        HashMap<String, String> myMap = new HashMap<>();

        // 2. Adicione a chave "nome" e o valor "João"
        myMap.put("nome", "João");

        // 3. Verifique se contém a chave "nome"
        System.out.println("Tem a chave 'nome'? " + myMap.containsKey("nome"));

        // 4. Adicione mais três pares chave-valor
        myMap.put("idade", "25");
        myMap.put("cidade", "São Paulo");
        myMap.put("curso", "Java");

        // 5. Obtenha o valor associado à chave "idade"
        System.out.println("Idade: " + myMap.get("idade"));

        // 6. Remova a chave "nome"
        myMap.remove("nome");

        // 7. Verifique se está vazio
        System.out.println("Está vazio? " + myMap.isEmpty());

        // 8. Obtenha o tamanho atual
        System.out.println("Tamanho atual: " + myMap.size());

        // 9. Percorra e imprima todas as CHAVES
        System.out.println("--- CHAVES ---");
        for (String chave : myMap.keySet()) {
            System.out.println(chave);
        }

        // 10. Percorra e imprima todos os VALORES
        System.out.println("--- VALORES ---");
        for (String valor : myMap.values()) {
            System.out.println(valor);
        }
    }
}

---

## 🧠 Glossário de Conceitos Teóricos

Para além da prática, aqui estão os conceitos fundamentais (baseados nos slides das aulas) para garantires a nota máxima na teoria:

* **Classe vs Objeto:** A **Classe** é o molde ou a planta de construção (ex: a planta em papel de uma casa). O **Objeto** é a instância real e física criada a partir desse molde (ex: a casa construída com tijolos). 

* **Encapsulamento:** É a proteção dos dados. Escondemos as variáveis da classe (usando a palavra `private`) para que não sejam alteradas indevidamente por quem está de fora, permitindo o acesso apenas através de "portas seguras" (os métodos `get` e `set`). 

* **Herança (`extends`):** É o pilar que permite que uma classe "Filha" herde características e ações (atributos e métodos) de uma classe "Pai". O seu maior benefício é a **reutilização de código**, evitando repetir as mesmas linhas várias vezes. 

* **Polimorfismo de Sobrecarga (Overloading):** Consiste em ter vários métodos com o **mesmo nome** dentro da mesma classe, mas que recebem **parâmetros diferentes** (diferente quantidade ou tipo de variáveis). O Java sabe qual usar pela quantidade de itens que enviamos.

* **Polimorfismo de Sobreposição (Overriding):** Acontece quando uma classe Filha herda um método da classe Pai, mas decide **reescrever (sobrepor)** as regras desse método para adaptar ao seu próprio comportamento (identificado pela anotação `@Override`). 

* **Array vs ArrayList:** O Array tradicional (`[]`) tem um **tamanho fixo** (se tem 5 espaços, será assim para sempre). O **ArrayList** é uma lista de **tamanho dinâmico**, que cresce e encolhe magicamente e automaticamente à medida que adicionamos (`.add()`) ou removemos itens. 

* **HashMap:** É uma estrutura de dados de busca super rápida que não guarda os itens por ordem numérica, mas sim em pares de **Chave e Valor** (como um dicionário real: procuras a palavra-chave e recebes o seu significado/valor).
```
